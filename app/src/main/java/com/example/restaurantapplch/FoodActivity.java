package com.example.restaurantapplch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FoodActivity extends AppCompatActivity {

    int image;
    Button orderK;
    Intent welcomeOrderK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        orderK = (Button)findViewById(R.id.orderI);


    orderK.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            welcomeOrderK = new Intent(FoodActivity.this, OrderActivity.class);
            welcomeOrderK.putExtra("Image", image);
            startActivity(welcomeOrderK);
        }
    });

    }
}