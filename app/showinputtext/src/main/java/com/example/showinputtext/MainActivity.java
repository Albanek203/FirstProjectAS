package com.example.showinputtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BtnShowText(View view) {
        EditText text = findViewById(R.id.EditText);
        TextView result = findViewById(R.id.TxtText);
        result.setText(text.getText().toString());
    }
}