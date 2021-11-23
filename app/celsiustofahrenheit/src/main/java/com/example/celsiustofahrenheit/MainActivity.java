package com.example.celsiustofahrenheit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.SpinnerTemperatures);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, new String[]{"Fahrenheit", "Kelvin"});
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    @SuppressLint("SetTextI18n")
    public void BtnConvert_OnClick(View view) {
        EditText temperature = findViewById(R.id.EditTemperature);
        Spinner spinner = findViewById(R.id.SpinnerTemperatures);
        TextView txtResult = findViewById(R.id.TxtResult);
        if (temperature.getText().toString().isEmpty()) {
            txtResult.setText("Enter temperature !!!");
            return;
        }
        switch ((int) spinner.getSelectedItemId()) {
            case 0:
                double resultF = Integer.parseInt(temperature.getText().toString()) * 1.8 + 32;
                txtResult.setText(Double.toString(resultF));
                break;
            case 1:
                double resultK = Integer.parseInt(temperature.getText().toString()) + 273.15;
                txtResult.setText(Double.toString(resultK));
                break;
        }

    }
}