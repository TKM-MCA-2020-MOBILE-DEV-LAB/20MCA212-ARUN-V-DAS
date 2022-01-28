<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#009688"
    tools:context=".MainActivity">

    <TextView
        android:layout_width="170dp"
        android:layout_height="60dp"
        android:background="#009688"
        android:shadowColor="#636262"
        android:text="Hello World!"
        android:textAlignment="center"
        android:textColor="#E1DADA"
        android:textColorHighlight="#F4FAF9"
        android:textColorHint="#E8E0E0"
        android:textSize="24sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintLeft_toLeftOf="parent"
        app:layout_constraintRight_toRightOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

</androidx.constraintlayout.widget.ConstraintLayout>
package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Log.d("lifecycle","onCreate invoked");
        }
        @Override
        protected void onStart() {
            super.onStart();
            Log.d("lifecycle","onStart invoked");
        }
        @Override
        protected void onResume() {
            super.onResume();
            Log.d("lifecycle","onResume invoked");
        }
        @Override
        protected void onPause() {
            super.onPause();
            Log.d("lifecycle","onPause invoked");
        }
        @Override
        protected void onStop() {
            super.onStop();
            Log.d("lifecycle","onStop invoked");
        }
        @Override
        protected void onRestart() {
            super.onRestart();
            Log.d("lifecycle","onRestart invoked");
        }
        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.d("lifecycle","onDestroy invoked");
        }
    }
