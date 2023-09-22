package com.cs407.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import android.content.Intent;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void addFunction(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.textField1);
        EditText myTextField2 = (EditText) findViewById(R.id.textField2);

    }

    public void subtractFunction(View view) {
        EditText myTextField1 = (EditText) findViewById(R.id.textField1);
        EditText myTextField2 = (EditText) findViewById(R.id.textField2);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*public void goToActivity(String s) {
        Intent intent
    }*/
}