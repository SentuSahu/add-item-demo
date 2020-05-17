package com.online.additem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Main3Activity extends AppCompatActivity {

    RadioButton r1;
    Button cod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        r1 = (RadioButton)findViewById(R.id.r1);
        cod = (Button)findViewById(R.id.cod);


        cod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent1 = new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(intent1);

            }
        });

    }
}
