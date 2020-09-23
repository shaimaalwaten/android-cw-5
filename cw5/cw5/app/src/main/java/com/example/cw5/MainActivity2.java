package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView na = findViewById(R.id.textView2);
        Button y = findViewById(R.id.button);

        Bundle ar =getIntent().getExtras();
     String a = ar.getString("info");
     String B = ar.getString("infro");

    na.setText( a + B);

      y.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent yas = new Intent(MainActivity2. this , MainActivity.class);
              startActivity(yas);
          }
      });
    }
}