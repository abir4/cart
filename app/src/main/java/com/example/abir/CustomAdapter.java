package com.example.abir;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    List<Model> myList;
    Context context;

    public CustomAdapter(List<Model> myList, Context context) {
        this.myList = myList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_list_item,parent,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder holder, int position) {

        final Model model = myList.get(position);
        holder.name.setText(model.getName());
        holder.descrip.setText(model.getDescription());
        holder.imageView.setImageDrawable(context.getResources().getDrawable(model.getImage()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context,DetailsActivity.class);

                context.startActivity(intent);

            }
        });



        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(context,DetailsActivity.class);
                intent.putExtra("image",model.getImage());
                intent.putExtra("name",model.getName());
                intent.putExtra("role",model.getDescription());
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
             context.   startActivity(intent);



            }
        });






    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {


        ImageView imageView;
        TextView name,descrip;
        CardView cardView;


        MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.productImageId);
            name = itemView.findViewById(R.id.productNameId);
            descrip = itemView.findViewById(R.id.productPriceId);
            cardView = itemView.findViewById(R.id.cardViewId);





        }
    }
}
