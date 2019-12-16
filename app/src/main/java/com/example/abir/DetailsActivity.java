package com.example.abir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

import java.util.ArrayList;
import java.util.List;

public class DetailsActivity extends AppCompatActivity {


    ImageView detailima;
    TextView detailt1,detilt2;
    ElegantNumberButton elegantNumberButton;
    Button cartButton;

    String playerName,playerDescription;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);









        cartButton = findViewById(R.id.cartButtonId);

        elegantNumberButton = findViewById(R.id.elegenTNyumberButton);

        detailima = findViewById(R.id.detailsImageId);
        detailt1 = findViewById(R.id.detailsNameId);
        detilt2 = findViewById(R.id.detailsPriceId);

        playerName = getIntent().getStringExtra("name");
        playerDescription = getIntent().getStringExtra("role");
        image = getIntent().getIntExtra("image",0);


        detailt1.setText(playerName);
        detilt2.setText(playerDescription);
        detailima.setImageResource(image);




        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailsActivity.this,CartActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

                startActivity(intent);
            }
        });








    }
}
