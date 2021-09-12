package com.example.android.birthcard_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void WishHere(View view) {
        Toast.makeText(this, "Happy BirthDay My lovely Friend", Toast.LENGTH_SHORT).show();
    }

}