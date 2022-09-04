package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ConvertCurrency(View view){

        EditText editText = findViewById(R.id.editText);

        String amountInRM = editText.getText().toString();

        double amountInRM_Double = Double.parseDouble(amountInRM);

        double amountInDollar_Double = amountInRM_Double * 0.24;

        String amountInDollar_String = String.format("%.2f", amountInDollar_Double);

        Toast.makeText(this, "RM" + amountInRM + " is $" + amountInDollar_String, 	Toast.LENGTH_LONG).show();
    }

}
