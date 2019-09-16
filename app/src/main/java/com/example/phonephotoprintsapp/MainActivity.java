package com.example.phonephotoprintsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    int printsOrdered;
    double total;
    double price4x6 = .19;
    double price5x7 = .49;
    double price8x10 = .79;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        final EditText prints = (EditText) findViewById(R.id.numPrints);
        final RadioButton rad4x6 = (RadioButton) findViewById(R.id.rad4x6);
        final RadioButton rad5x7 = (RadioButton) findViewById(R.id.rad5x7);
        final RadioButton rad8x10 = (RadioButton) findViewById(R.id.rad8x10);
        final TextView result = (TextView) findViewById(R.id.results);
        Button order = (Button) findViewById(R.id.btnOrder);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                printsOrdered = Integer.parseInt(prints.getText().toString());
                DecimalFormat cent = new DecimalFormat("$###,###.##");
                if(rad4x6.isChecked()){
                    if(printsOrdered <= 50){
                        total = printsOrdered * price4x6;
                        result.setText("The order cost " + cent.format(total));
                    } else {
                        Toast.makeText(MainActivity.this, "Number of prints must be less than 50.", Toast.LENGTH_LONG).show();
                    }
                }
                if(rad5x7.isChecked()){
                    if(printsOrdered <= 50){
                        total = printsOrdered * price5x7;
                        result.setText("The order cost " + cent.format(total));
                    } else {
                        Toast.makeText(MainActivity.this, "Number of prints must be less than 50.", Toast.LENGTH_LONG).show();
                    }
                }
                if(rad8x10.isChecked()){
                    if(printsOrdered <= 50){
                        total = printsOrdered * price8x10;
                        result.setText("The order cost " + cent.format(total));
                    } else {
                        Toast.makeText(MainActivity.this, "Number of prints must be less than 50.", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
