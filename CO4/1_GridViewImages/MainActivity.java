package com.example.gridview_image;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gd;
    int logos[] = {R.drawable.bm,R.drawable.dp,R.drawable.jk,R.drawable.profile};
    String[] names ={"Batman.jpg","Deadpool.jpg","Joker.jpg","Groot.jpg"};
    final Context context = this;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gv = (GridView) findViewById(R.id.gridView);
        gv.setAdapter(new ImageAdapter(this));
        builder = new AlertDialog.Builder(this);

        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                builder.setMessage(String.valueOf(names[position])+" ,File not supported!")
                        .setCancelable(false)
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                            }
                        });

                AlertDialog alert = builder.create();
                alert.setTitle("Alert Box");
                alert.show();
            }
        });
    }
}