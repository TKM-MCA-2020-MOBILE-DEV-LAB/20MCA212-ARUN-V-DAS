package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] item = new String[]{"-Select-", "MCA", "MSC", "MBA", "MTECH", "MA", "MCOM", "MSW", "OTHERS"};
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, item);

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner = findViewById(R.id.spinner);
        spinner.setAdapter(myAdapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String str = String.valueOf(adapterView.getItemAtPosition(i));
        Toast toast = Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG);
        toast.show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
