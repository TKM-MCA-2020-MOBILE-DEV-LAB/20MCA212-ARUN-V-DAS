package com.example.regvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    EditText name, add, phn, em,pass;
    Button bts1;
    Pattern patterns;
    Matcher matches;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.name);
        add = (EditText) findViewById(R.id.add);
        phn = (EditText) findViewById(R.id.add);
        em = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.pass);
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        bts1 = (Button) findViewById(R.id.button);
        bts1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
                Intent i = new Intent(getApplicationContext(),explicit.class);
                startActivity(i);
            }
        });
    }

    public void login() {
        String email = em.getText().toString().trim();
        String nm = name.getText().toString();
        if (name.getText().toString().length() == 0) {
            name.requestFocus();
            name.setError("Enter valid name");
            return;
        }
        String namePattern = "[0-9!@#$%^&*]";
        if (name.getText().toString().matches(namePattern)) {
            name.requestFocus();
            name.setError("Enter valid name");
            return;

        }
        if (add.getText().toString().length() == 0) {
            add.requestFocus();
            add.setError("Enter valid address");
            return;
        }
        if (phn.getText().toString().length() == 0) {
            phn.requestFocus();
            phn.setError("Enter valid Number");
            return;
        }
        if (em.getText().toString().length() == 0) {
            Toast.makeText(getApplicationContext(), "Invalid Email Address", Toast.LENGTH_SHORT).show();
            em.requestFocus();
            em.setError("Enter valid email");
            return;
        }
        if (!email.matches(emailPattern)) {
            em.requestFocus();
            em.setError("Invalid email");

        } else {
            Toast.makeText(getApplicationContext(), "valid Email Address", Toast.LENGTH_SHORT).show();
        }
        if (pass.getText().toString().length() == 0) {
            pass.requestFocus();
            pass.setError("Enter valid password");
            return;
        }
        if (pass.getText().toString().length() < 8) {
            pass.requestFocus();
            pass.setError("Enter minimum 8 digit password");
            return;
        }
    }
}
