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

public class MainActivity extends AppCompatActivity {

    int image;
    Button viewM;
    Intent goToM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewM = (Button)findViewById(R.id.viewF);

    viewM.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            goToM = new Intent(MainActivity.this, FoodActivity.class);
            goToM.putExtra("Image", image);
            startActivity(goToM);

        }
    });




    }
}