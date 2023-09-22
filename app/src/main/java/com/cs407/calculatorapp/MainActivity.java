package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import android.content.Intent;

import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void addFunction(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.textField1);
        EditText myTextField2 = (EditText) findViewById(R.id.textField2);
        String value1 = myTextField1.getText().toString();
        String value2 = myTextField2.getText().toString();
        int c = Integer.parseInt(value1);
        int d = Integer.parseInt(value2);

        int result = c + d;
        String resultText = String.valueOf(result);
        goToActivity(resultText);
    }

    public void subtractFunction(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.textField1);
        EditText myTextField2 = (EditText) findViewById(R.id.textField2);
        goToActivity(myTextField1.getText().toString());
        String value1 = myTextField1.getText().toString();
        String value2 = myTextField2.getText().toString();
        int c = Integer.parseInt(value1);
        int d = Integer.parseInt(value2);
        int result = c - d;
        String resultText = String.valueOf(result);
        goToActivity(resultText);
    }

    public void multiplyFunction(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.textField1);
        EditText myTextField2 = (EditText) findViewById(R.id.textField2);
        String value1 = myTextField1.getText().toString();
        String value2 = myTextField2.getText().toString();
        int c = Integer.parseInt(value1);
        int d = Integer.parseInt(value2);
        int result = c * d;
        String resultText = String.valueOf(result);
        goToActivity(resultText);
    }

    public void divideFunction(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.textField1);
        EditText myTextField2 = (EditText) findViewById(R.id.textField2);
        String value1 = myTextField1.getText().toString();
        String value2 = myTextField2.getText().toString();
        int c = Integer.parseInt(value1);
        int d = Integer.parseInt(value2);
        try {
            int result = c / d;
            String resultText = String.valueOf(result);
            goToActivity(resultText);
        } catch(Exception DivideByZero) {
            Log.i("INFO", "Output undefined");
            Toast.makeText(MainActivity.this, "Output is undefined", Toast.LENGTH_SHORT).show();
            goToActivity("Output is undefined");
        }
    }
    public void goToActivity(String s) {
        Intent intent = new Intent(this, Calculation2.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}