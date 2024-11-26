package com.example.restaurantapplch;

import android.content.Intent;
import android.net.Uri;
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
    Button addBTN;
    Intent goToM;
    Intent mapA;
    public static final String ADDRESS ="Baltimore"; //"geo:0,0?q=4707+Eastern+Ave%2C+Baltimore%2C+MD+21224";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewM = (Button)findViewById(R.id.viewF);
        addBTN = (Button)findViewById(R.id.addressBTN);


    viewM.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            goToM = new Intent(MainActivity.this, FoodOrderActivity.class);
            goToM.putExtra("Image", image);
            startActivity(goToM);

        }
    });
    addBTN.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            showMap(Uri.parse(ADDRESS));

        }
    });

    }
    public void showMap(Uri geoLocation) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(geoLocation);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}