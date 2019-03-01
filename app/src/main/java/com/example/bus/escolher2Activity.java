package com.example.bus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class escolher2Activity extends AppCompatActivity {
private Button botao1;
private Button botao2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolher2);
        botao1 = (Button) findViewById(R.id.button3);
        botao2 = (Button) findViewById(R.id.button4);

        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(escolher2Activity.this, UnicampActivity.class));
            }
        });
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(escolher2Activity.this, SabadoUnicampActivity.class));
            }
        });
    }
}
