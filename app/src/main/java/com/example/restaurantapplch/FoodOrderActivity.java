package com.example.restaurantapplch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FoodOrderActivity extends AppCompatActivity {

    int howMany;
    int image;
    Button orderK;
    Button orderM;
    Intent welcomeOrderK;
    Spinner spinnerFillings;

    TextView howMuchBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        howMany = 0;
        setContentView(R.layout.activity_food_order);
        orderK = (Button)findViewById(R.id.orderMenosBTN);
        orderM = (Button)findViewById(R.id.orderMasBTN);
        howMuchBTN = (TextView)findViewById(R.id.howMuchBTN);
        spinnerFillings = (Spinner) findViewById(R.id.fillings);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.fillings_array,
                android.R.layout.simple_spinner_item
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFillings.setAdapter(adapter);

        public class SpinnerActivity extends Activity implements AdapterView.OnItemSelectedListener{

            public <view> void onItemSelected(AdapterView<?> parent, View, view, int pos, long id){

            }

            public  void  onNothingSelected(AdapterView<?> parent) {

            }

            Spinner spinner = (Spinner) findViewById(R.id.fillings);
spinner.setOnItemSelectedListener(this);
        }




        orderK.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             howMany ++;
             String s=Integer.toString(howMany);
             howMuchBTN.setText(s);
             welcomeOrderK = new Intent(FoodOrderActivity.this, OrderActivity.class);
             welcomeOrderK.putExtra("Image", image);
             startActivity(welcomeOrderK);
            }
        });



    }
}