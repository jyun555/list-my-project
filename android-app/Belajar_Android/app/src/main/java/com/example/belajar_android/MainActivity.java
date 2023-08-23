package com.example.belajar_android;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addNameOnEditText();
    }
    @SuppressLint("SetTextI18n")
    protected void addNameOnEditText(){
        TextView txtView = findViewById(R.id.name);
        EditText editText = findViewById(R.id.addName);
        Button btnText = findViewById(R.id.button);
        btnText.setOnClickListener(view -> {
            String getInput = editText.getText().toString();
            txtView.setText("Your Name : " + getInput);
        });
    }
}