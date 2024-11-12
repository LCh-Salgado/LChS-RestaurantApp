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

//    int typeInfoInt;
    int howMany;
    Button pMenosBTN;
    Button pMasBTN;
    Intent typeInfoIntent;
    Spinner spinnerFillings;
//    Spinner spinnerF;
    TextView howMuchTV;
    Button orderMoreBTN;
    Button orderLessBTN;
    Button typeIBTN;
    int cuantasPupusas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        howMany = 0;
        setContentView(R.layout.activity_food_order);
        pMenosBTN = (Button)findViewById(R.id.orderMenosBTN);
        pMasBTN = (Button)findViewById(R.id.orderMasBTN);
        howMuchTV = (TextView)findViewById(R.id.howMuchTV);
        spinnerFillings = (Spinner) findViewById(R.id.fillings);
        orderMoreBTN = (Button)findViewById(R.id.ordenarMasBTN);
        orderLessBTN = (Button)findViewById(R.id.ordenarMenosBTN);
        typeIBTN = (Button)findViewById(R.id.typeInBTN);

//        spinnerF = (Spinner)findViewById(R.id.filling);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.fillings_array,
                android.R.layout.simple_spinner_item
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFillings.setAdapter(adapter);

        pMenosBTN.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             howMany --;
             String sMenos=Integer.toString(howMany);
             howMuchTV.setText(sMenos);


            }
        });
        pMasBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                howMany ++;
                String sMas=Integer.toString(howMany);
                howMuchTV.setText(sMas);


            }
        });
        orderMoreBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cuantasPupusas ++;
                String sMore=Integer.toString(cuantasPupusas);

            }
        });
        typeIBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                typeInfoIntent = new Intent(FoodOrderActivity.this, OrderActivity.class);
//                typeInfoIntent.putExtra(typeInfoInt);
                startActivity(typeInfoIntent);
            }
        });

    }

    private class SpinnerActivity extends Activity implements AdapterView.OnItemSelectedListener{
        public <view> void onItemSelected(AdapterView<?> parent, int pos, long id){

                }

                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                }

                public  void  onNothingSelected(AdapterView<?> parent) {

                }

                Spinner spinner = (Spinner) findViewById(R.id.fillings);
            }
}