package com.example.abir;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CartViewHolder extends RecyclerView.Adapter<CartViewHolder.MyViewHolder> {

    List<Cart> myListCart;
    Context context;

    public CartViewHolder(List<Cart> myList, Context context) {
        this.myListCart = myList;
        this.context = context;
    }



    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

     View view =    LayoutInflater.from(parent.getContext()).inflate(R.layout.cartlist_layout,parent,false);

        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {



        final Cart cart = myListCart.get(position);
        holder.cname.setText(cart.getName());
        holder.cdescrip.setText(cart.getDescirption());
        holder.cimageView.setImageDrawable(context.getResources().getDrawable(cart.getImage()));


    }

    @Override
    public int getItemCount() {
        return myListCart.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {


        ImageView cimageView;
        TextView cname,cdescrip;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            cimageView = itemView.findViewById(R.id.imageCartid);
            cname = itemView.findViewById(R.id.cartTextid);
            cdescrip = itemView.findViewById(R.id.cartPriceid);
        }
    }
}
