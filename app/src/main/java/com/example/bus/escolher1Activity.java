package com.example.bus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class escolher1Activity extends AppCompatActivity {

private Button botao1;
private Button botao2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolher1);
        botao1 = (Button) findViewById(R.id.button);
        botao2 = (Button) findViewById(R.id.button2);

        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(escolher1Activity.this, MorasActivity.class));
            }
        });
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(escolher1Activity.this, SabadoMorasActivity.class));
            }
        });
    }
}
