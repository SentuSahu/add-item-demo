package com.online.additem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView t1,t3;
    Button proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        t1 = (TextView)findViewById(R.id.t1);
        t3 = (TextView)findViewById(R.id.t3);

        proceed = (Button)findViewById(R.id.proceed);

        Intent intent1 = getIntent();

        String item1 = intent1.getStringExtra("Item1");
        String item2 = intent1.getStringExtra("Item2");

        t1.setText(item1);
        t3.setText(item1);

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent11 = new Intent(Main2Activity.this,Main3Activity.class);
                startActivity(intent11);

            }
        });

    }


}
