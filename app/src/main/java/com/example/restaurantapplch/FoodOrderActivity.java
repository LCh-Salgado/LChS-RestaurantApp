package com.example.restaurantapplch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

    double subTotal;
    double tax;
    double total;
    final static double TAX_RATE =0.06;

    TextView subTotalTV;

    Pupusas deliciuosP;

    String fillings;

    Button pMenosBTN;

    Button pMasBTN;

    Intent addToCardIntent;
    Intent typeInfooIntent;
    Spinner spinnerFillings;
//    Spinner spinnerFillingsPT;
    TextView howMuchTV;

   Button orderMorePTBTN;
   Button orderLessPTBTN;

   Button addToCadBTN;
   Button typeInfoBTN;

   TextView taxTV;
   TextView totalTv;

//   String fillingsPT;
//   int cuantasPasteless;
//   TextView cuantassTV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        howMany = 0;
//        cuantasPasteless = 0;
//        fillingsPT = "";
        fillings = "";
        subTotal = 0.0;
        tax = TAX_RATE * subTotal;
        total = subTotal + tax;

        setContentView(R.layout.activity_food_order);

        subTotalTV = (TextView)findViewById(R.id.subTotalTv);
        taxTV = (TextView)findViewById(R.id.taxesTotalTV);
        totalTv = (TextView)findViewById(R.id.totalTV);

        pMenosBTN = (Button)findViewById(R.id.orderMenosPBTN);
        pMasBTN = (Button)findViewById(R.id.orderMasBTN);
        howMuchTV = (TextView)findViewById(R.id.howMuchTV);

        spinnerFillings = (Spinner) findViewById(R.id.fillings);
//        spinnerFillingsPT = (Spinner)findViewById(R.id.fillingsPasteles);

//        orderMorePTBTN = (Button)findViewById(R.id.ordenarMasPTBTN);
//       orderLessPTBTN = (Button)findViewById(R.id.ordenarMenosPTBTN);

        addToCadBTN = (Button)findViewById(R.id.addToTheCardBTN);
        typeInfoBTN = (Button)findViewById(R.id.typeInfoBTN);

//        spinnerFillingsPT = (Spinner)findViewById(R.id.fillingsPasteles);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.fillings_array, android.R.layout.simple_spinner_item
        );
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.fillingsPasteles_array,
                android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerFillings.setAdapter(adapter);

//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinnerFillingsPT.setAdapter(adapter);

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
//        orderMorePTBTN.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                cuantasPasteless ++;
//                String sMore=Integer.toString(cuantasPasteless);
//                cuantassTV.setText(sMore);
//            }
//
//           }
//        );
//        orderLessPTBTN.setOnClickListener(new View.OnClickListener() {
//           @Override
//            public void onClick(View view) {
//                cuantasPasteless --;
//                String sLess=Integer.toString(cuantasPasteless);
//                cuantassTV.setText(sLess);
//
//
//            }
//        });
        addToCadBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fillings=spinnerFillings.getSelectedItem().toString();
                Log.d("Filling", fillings);
                deliciuosP = new Pupusas(fillings, howMany);
                subTotal += deliciuosP.calcPrice();
                subTotalTV.setText("SubTotal : "+ subTotal);
                tax = TAX_RATE * subTotal;
                taxTV.setText("Taxes : "+ tax);
                total = subTotal + tax;
                totalTv.setText("Total : "+ total);

            }

        });
        typeInfoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                typeInfooIntent = new Intent(FoodOrderActivity.this, OrderActivity.class);
                startActivity(typeInfooIntent);

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