package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView a = findViewById(R.id.name);
        final TextView b = findViewById(R.id.age);
        Button c = findViewById(R.id.nextPage);

         c.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String name= a.getText().toString();
                 String age= b.getText().toString();
                 Intent as = new Intent(MainActivity.this, MainActivity2.class);
                 as.putExtra( "info", name);
                 as.putExtra( "infro", age);
                 startActivity(as);

             }
         });
    }
}