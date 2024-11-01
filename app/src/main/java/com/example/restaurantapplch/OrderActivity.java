package com.example.restaurantapplch;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class OrderActivity extends AppCompatActivity {

    EditText typeN, typePh, typeA, typeF;
    Button tankiuBTN;
    FloatingActionButton mAddFab;
    String toastMsg;
    int duration;
    Toast myToast;
    Intent finishO;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        tankiuBTN = (Button)findViewById(R.id.tanksBTN);
        typeN = (EditText)findViewById(R.id.TypeName);
        typePh = (EditText)findViewById(R.id.TypePhone);
        typeA = (EditText)findViewById(R.id.TypeAddress);
        mAddFab = (FloatingActionButton)findViewById(R.id.add_fab);

        tankiuBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toastMsg ="Tankiu For Choosing Us Your Food Is In Their Way.";
                duration = Toast.LENGTH_SHORT;
                myToast = Toast.makeText(OrderActivity.this, toastMsg, duration);
                myToast.show();
                finishO = new Intent(OrderActivity.this, FoodOrderActivity.class);
                startActivity(finishO);

            }
        });
        mAddFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Your problem has been reported.", Snackbar.LENGTH_SHORT)
                        .setAction("Action", null).show();


            }
        });

    }




}