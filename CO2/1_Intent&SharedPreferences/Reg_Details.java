package com.example.intentsharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Reg_Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_details);

        TextView name = (TextView) findViewById(R.id.name);
        TextView add = (TextView) findViewById(R.id.add);
        TextView mobile = (TextView) findViewById(R.id.mob);
        TextView email = (TextView) findViewById(R.id.email);
        Bundle extras = getIntent().getExtras();
        String name2 = extras.getString("Name");
        String add2 = extras.getString("Address");
        String phone2 = extras.getString("Phone");
        String email2 = extras.getString("Email");
        name.setText(name2);
        add.setText(add2);
        mobile.setText(phone2);
        email.setText(email2);
    }

}