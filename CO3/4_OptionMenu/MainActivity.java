package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.share) {
            Intent i = new Intent(MainActivity.this, share.class);
            startActivity(i);
            return true;

        }
        else if (id == R.id.setting) {
            Intent i = new Intent(MainActivity.this, Setting.class);
            startActivity(i);
            return true;

        }
        else if (id == R.id.help) {
            Intent i = new Intent(MainActivity.this, Help.class);
            startActivity(i);
            return true;

        }
        else if (id == R.id.contact) {
            Intent i = new Intent(MainActivity.this, ContactUs.class);
            startActivity(i);
            return true;

        }

       return super.onOptionsItemSelected(item);
    }
}
