package com.supriya.bankingsystem.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.supriya.bankingsystem.R;

public class MainActivity extends AppCompatActivity {

    Button btn_view_customer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_view_customer = findViewById(R.id.btnViewCustomer);

        btn_view_customer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CustomerList.class));
            }
        });

    }
}