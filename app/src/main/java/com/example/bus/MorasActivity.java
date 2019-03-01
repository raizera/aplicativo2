package com.example.bus;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MorasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moras);

        Button ok201 = (Button) findViewById(R.id.button201);
        ok201.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a201  = new AlertDialog.Builder(MorasActivity.this);
                a201.setTitle("Itinerário");
                a201.setIcon(R.mipmap.ic_launcher);
                a201.setMessage("(P) – Realiza parada na R. Maria Ferreira Antunes");
                a201.setCancelable(true);
                AlertDialog alertaDialog = a201.create();
                alertaDialog.show();
            }
        });
        Button ok204 = (Button) findViewById(R.id.button204);
        ok204.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a204  = new AlertDialog.Builder(MorasActivity.this);
                a204.setTitle("Itinerário");
                a204.setIcon(R.mipmap.ic_launcher);
                a204.setMessage("(P) – Realiza parada na R. Maria Ferreira Antunes");
                a204.setCancelable(true);
                AlertDialog alertaDialog = a204.create();
                alertaDialog.show();
            }
        });
        Button ok210 = (Button) findViewById(R.id.button210);
        ok210.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a210  = new AlertDialog.Builder(MorasActivity.this);
                a210.setTitle("Itinerário");
                a210.setIcon(R.mipmap.ic_launcher);
                a210.setMessage("(P) – Realiza parada na R. Maria Ferreira Antunes");
                a210.setCancelable(true);
                AlertDialog alertaDialog = a210.create();
                alertaDialog.show();
            }
        });
        Button ok212 = (Button) findViewById(R.id.button212);
        ok212.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a212  = new AlertDialog.Builder(MorasActivity.this);
                a212.setTitle("Itinerário");
                a212.setIcon(R.mipmap.ic_launcher);
                a212.setMessage("(P) – Realiza parada na R. Maria Ferreira Antunes");
                a212.setCancelable(true);
                AlertDialog alertaDialog = a212.create();
                alertaDialog.show();
            }
        });
        Button ok213 = (Button) findViewById(R.id.button213);
        ok213.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a213  = new AlertDialog.Builder(MorasActivity.this);
                a213.setTitle("Itinerário");
                a213.setIcon(R.mipmap.ic_launcher);
                a213.setMessage("(P) – Realiza parada na R. Maria Ferreira Antunes");
                a213.setCancelable(true);
                AlertDialog alertaDialog = a213.create();
                alertaDialog.show();
            }
        });
        Button ok215 = (Button) findViewById(R.id.button215);
        ok215.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a215  = new AlertDialog.Builder(MorasActivity.this);
                a215.setTitle("Itinerário");
                a215.setIcon(R.mipmap.ic_launcher);
                a215.setMessage("(P) – Realiza parada na R. Maria Ferreira Antunes");
                a215.setCancelable(true);
                AlertDialog alertaDialog = a215.create();
                alertaDialog.show();
            }
        });
        Button ok218 = (Button) findViewById(R.id.button218);
        ok218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a218  = new AlertDialog.Builder(MorasActivity.this);
                a218.setTitle("Itinerário");
                a218.setIcon(R.mipmap.ic_launcher);
                a218.setMessage("(P) – Realiza parada na R. Maria Ferreira Antunes");
                a218.setCancelable(true);
                AlertDialog alertaDialog = a218.create();
                alertaDialog.show();
            }
        });
        Button ok225 = (Button) findViewById(R.id.button225);
        ok225.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a225  = new AlertDialog.Builder(MorasActivity.this);
                a225.setTitle("Itinerário");
                a225.setIcon(R.mipmap.ic_launcher);
                a225.setMessage("(P) – Realiza parada na R. Maria Ferreira Antunes");
                a225.setCancelable(true);
                AlertDialog alertaDialog = a225.create();
                alertaDialog.show();
            }
        });
        Button ok226 = (Button) findViewById(R.id.button226);
        ok226.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a226  = new AlertDialog.Builder(MorasActivity.this);
                a226.setTitle("Itinerário");
                a226.setIcon(R.mipmap.ic_launcher);
                a226.setMessage("# - Saída às 17h20min na Av. Pref.José R.Magalhães Teixeira(Escola Sérgio Porto - BOX 17), atendendo posteriormente Área da Saúde, Creche (Praça da Paz) e o RU (às 17h40min).");
                a226.setCancelable(true);
                AlertDialog alertaDialog = a226.create();
                alertaDialog.show();
            }
        });
        Button ok228 = (Button) findViewById(R.id.button228);
        ok228.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a228  = new AlertDialog.Builder(MorasActivity.this);
                a228.setTitle("Itinerário");
                a228.setIcon(R.mipmap.ic_launcher);
                a228.setMessage("# - Saída às 17h50min na Av. Pref.José R.Magalhães Teixeira(Escola Sérgio Porto - BOX 17), atendendo posteriormente Área da Saúde, Creche (Praça da Paz) e o RU (às 18h05min);\n\n(D) - Após deixar a Universidade, pode\n" +
                        "realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a228.setCancelable(true);
                AlertDialog alertaDialog = a228.create();
                alertaDialog.show();
            }
        });

        Button ok227 = (Button) findViewById(R.id.button227);
        ok227.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a227  = new AlertDialog.Builder(MorasActivity.this);
                a227.setTitle("Itinerário");
                a227.setIcon(R.mipmap.ic_launcher);
                a227.setMessage("(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a227.setCancelable(true);
                AlertDialog alertaDialog = a227.create();
                alertaDialog.show();
            }
        });
        Button ok229 = (Button) findViewById(R.id.button229);
        ok229.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a229  = new AlertDialog.Builder(MorasActivity.this);
                a229.setTitle("Itinerário");
                a229.setIcon(R.mipmap.ic_launcher);
                a229.setMessage("(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a229.setCancelable(true);
                AlertDialog alertaDialog = a229.create();
                alertaDialog.show();
            }
        });
        Button ok230 = (Button) findViewById(R.id.button230);
        ok230.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a230  = new AlertDialog.Builder(MorasActivity.this);
                a230.setTitle("Itinerário");
                a230.setIcon(R.mipmap.ic_launcher);
                a230.setMessage("(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a230.setCancelable(true);
                AlertDialog alertaDialog = a230.create();
                alertaDialog.show();
            }
        });
        Button ok231 = (Button) findViewById(R.id.button231);
        ok231.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a231  = new AlertDialog.Builder(MorasActivity.this);
                a231.setTitle("Itinerário");
                a231.setIcon(R.mipmap.ic_launcher);
                a231.setMessage("(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a231.setCancelable(true);
                AlertDialog alertaDialog = a231.create();
                alertaDialog.show();
            }
        });
        Button ok232 = (Button) findViewById(R.id.button232);
        ok232.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a232  = new AlertDialog.Builder(MorasActivity.this);
                a232.setTitle("Itinerário");
                a232.setIcon(R.mipmap.ic_launcher);
                a232.setMessage("(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a232.setCancelable(true);
                AlertDialog alertaDialog = a232.create();
                alertaDialog.show();
            }
        });
        Button ok234 = (Button) findViewById(R.id.button234);
        ok234.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a234  = new AlertDialog.Builder(MorasActivity.this);
                a234.setTitle("Itinerário");
                a234.setIcon(R.mipmap.ic_launcher);
                a234.setMessage("(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a234.setCancelable(true);
                AlertDialog alertaDialog = a234.create();
                alertaDialog.show();
            }
        });
        Button ok236 = (Button) findViewById(R.id.button236);
        ok236.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a236  = new AlertDialog.Builder(MorasActivity.this);
                a236.setTitle("Itinerário");
                a236.setIcon(R.mipmap.ic_launcher);
                a236.setMessage("(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a236.setCancelable(true);
                AlertDialog alertaDialog = a236.create();
                alertaDialog.show();
            }
        });
        Button ok244 = (Button) findViewById(R.id.button244);
        ok244.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a244  = new AlertDialog.Builder(MorasActivity.this);
                a244.setTitle("Itinerário");
                a244.setIcon(R.mipmap.ic_launcher);
                a244.setMessage("(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a244.setCancelable(true);
                AlertDialog alertaDialog = a244.create();
                alertaDialog.show();
            }
        });
        Button ok258 = (Button) findViewById(R.id.button258);
        ok258.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a258  = new AlertDialog.Builder(MorasActivity.this);
                a258.setTitle("Itinerário");
                a258.setIcon(R.mipmap.ic_launcher);
                a258.setMessage("(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a258.setCancelable(true);
                AlertDialog alertaDialog = a258.create();
                alertaDialog.show();
            }
        });
        Button ok235 = (Button) findViewById(R.id.button235);
        ok235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a235  = new AlertDialog.Builder(MorasActivity.this);
                a235.setTitle("Itinerário");
                a235.setIcon(R.mipmap.ic_launcher);
                a235.setMessage("* - Ônibus circula pelo Campus (via Creche): Av. Érico Veríssimo, Av. Bertrand Russel, Rua Monteiro Lobato - Portaria 2 - e segue para Moradia via Av. Prof. Atílio Martini (Av. 2);\n\n(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a235.setCancelable(true);
                AlertDialog alertaDialog = a235.create();
                alertaDialog.show();
            }
        });
        Button ok238 = (Button) findViewById(R.id.button238);
        ok238.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a238  = new AlertDialog.Builder(MorasActivity.this);
                a238.setTitle("Itinerário");
                a238.setIcon(R.mipmap.ic_launcher);
                a238.setMessage("* - Ônibus circula pelo Campus (via Creche): Av. Érico Veríssimo, Av. Bertrand Russel, Rua Monteiro Lobato - Portaria 2 - e segue para Moradia via Av. Prof. Atílio Martini (Av. 2);\n\n(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a238.setCancelable(true);
                AlertDialog alertaDialog = a238.create();
                alertaDialog.show();
            }
        });
        Button ok240 = (Button) findViewById(R.id.button240);
        ok240.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a240  = new AlertDialog.Builder(MorasActivity.this);
                a240.setTitle("Itinerário");
                a240.setIcon(R.mipmap.ic_launcher);
                a240.setMessage("* - Ônibus circula pelo Campus (via Creche): Av. Érico Veríssimo, Av. Bertrand Russel, Rua Monteiro Lobato - Portaria 2 - e segue para Moradia via Av. Prof. Atílio Martini (Av. 2);\n\n(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a240.setCancelable(true);
                AlertDialog alertaDialog = a240.create();
                alertaDialog.show();
            }
        });
        Button ok241 = (Button) findViewById(R.id.button241);
        ok241.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a241  = new AlertDialog.Builder(MorasActivity.this);
                a241.setTitle("Itinerário");
                a241.setIcon(R.mipmap.ic_launcher);
                a241.setMessage("* - Ônibus circula pelo Campus (via Creche): Av. Érico Veríssimo, Av. Bertrand Russel, Rua Monteiro Lobato - Portaria 2 - e segue para Moradia via Av. Prof. Atílio Martini (Av. 2);\n\n(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a241.setCancelable(true);
                AlertDialog alertaDialog = a241.create();
                alertaDialog.show();
            }
        });
        Button ok243 = (Button) findViewById(R.id.button243);
        ok243.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a243  = new AlertDialog.Builder(MorasActivity.this);
                a243.setTitle("Itinerário");
                a243.setIcon(R.mipmap.ic_launcher);
                a243.setMessage("* - Ônibus circula pelo Campus (via Creche): Av. Érico Veríssimo, Av. Bertrand Russel, Rua Monteiro Lobato - Portaria 2 - e segue para Moradia via Av. Prof. Atílio Martini (Av. 2);\n\n(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a243.setCancelable(true);
                AlertDialog alertaDialog = a243.create();
                alertaDialog.show();
            }
        });
        Button ok246 = (Button) findViewById(R.id.button246);
        ok246.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a246  = new AlertDialog.Builder(MorasActivity.this);
                a246.setTitle("Itinerário");
                a246.setIcon(R.mipmap.ic_launcher);
                a246.setMessage("* - Ônibus circula pelo Campus (via Creche): Av. Érico Veríssimo, Av. Bertrand Russel, Rua Monteiro Lobato - Portaria 2 - e segue para Moradia via Av. Prof. Atílio Martini (Av. 2);\n\n(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a246.setCancelable(true);
                AlertDialog alertaDialog = a246.create();
                alertaDialog.show();
            }
        });
        Button ok248 = (Button) findViewById(R.id.button248);
        ok248.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a248  = new AlertDialog.Builder(MorasActivity.this);
                a248.setTitle("Itinerário");
                a248.setIcon(R.mipmap.ic_launcher);
                a248.setMessage("* - Ônibus circula pelo Campus (via Creche): Av. Érico Veríssimo, Av. Bertrand Russel, Rua Monteiro Lobato - Portaria 2 - e segue para Moradia via Av. Prof. Atílio Martini (Av. 2);\n\n(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a248.setCancelable(true);
                AlertDialog alertaDialog = a248.create();
                alertaDialog.show();
            }
        });
        Button ok250 = (Button) findViewById(R.id.button250);
        ok250.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a250  = new AlertDialog.Builder(MorasActivity.this);
                a250.setTitle("Itinerário");
                a250.setIcon(R.mipmap.ic_launcher);
                a250.setMessage("* - Ônibus circula pelo Campus (via Creche): Av. Érico Veríssimo, Av. Bertrand Russel, Rua Monteiro Lobato - Portaria 2 - e segue para Moradia via Av. Prof. Atílio Martini (Av. 2);\n\n(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a250.setCancelable(true);
                AlertDialog alertaDialog = a250.create();
                alertaDialog.show();
            }
        });
        Button ok251 = (Button) findViewById(R.id.button251);
        ok251.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a251  = new AlertDialog.Builder(MorasActivity.this);
                a251.setTitle("Itinerário");
                a251.setIcon(R.mipmap.ic_launcher);
                a251.setMessage("* - Ônibus circula pelo Campus (via Creche): Av. Érico Veríssimo, Av. Bertrand Russel, Rua Monteiro Lobato - Portaria 2 - e segue para Moradia via Av. Prof. Atílio Martini (Av. 2);\n\n(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a251.setCancelable(true);
                AlertDialog alertaDialog = a251.create();
                alertaDialog.show();
            }
        });
        Button ok253 = (Button) findViewById(R.id.button253);
        ok253.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a253  = new AlertDialog.Builder(MorasActivity.this);
                a253.setTitle("Itinerário");
                a253.setIcon(R.mipmap.ic_launcher);
                a253.setMessage("* - Ônibus circula pelo Campus (via Creche): Av. Érico Veríssimo, Av. Bertrand Russel, Rua Monteiro Lobato - Portaria 2 - e segue para Moradia via Av. Prof. Atílio Martini (Av. 2);\n\n(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a253.setCancelable(true);
                AlertDialog alertaDialog = a253.create();
                alertaDialog.show();
            }
        });
        Button ok254 = (Button) findViewById(R.id.button254);
        ok254.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a254  = new AlertDialog.Builder(MorasActivity.this);
                a254.setTitle("Itinerário");
                a254.setIcon(R.mipmap.ic_launcher);
                a254.setMessage("* - Ônibus circula pelo Campus (via Creche): Av. Érico Veríssimo, Av. Bertrand Russel, Rua Monteiro Lobato - Portaria 2 - e segue para Moradia via Av. Prof. Atílio Martini (Av. 2);\n\n(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a254.setCancelable(true);
                AlertDialog alertaDialog = a254.create();
                alertaDialog.show();
            }
        });
        Button ok255 = (Button) findViewById(R.id.button255);
        ok255.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a255  = new AlertDialog.Builder(MorasActivity.this);
                a255.setTitle("Itinerário");
                a255.setIcon(R.mipmap.ic_launcher);
                a255.setMessage("* - Ônibus circula pelo Campus (via Creche): Av. Érico Veríssimo, Av. Bertrand Russel, Rua Monteiro Lobato - Portaria 2 - e segue para Moradia via Av. Prof. Atílio Martini (Av. 2);\n\n(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a255.setCancelable(true);
                AlertDialog alertaDialog = a255.create();
                alertaDialog.show();
            }
        });
        Button ok256 = (Button) findViewById(R.id.button256);
        ok256.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a256  = new AlertDialog.Builder(MorasActivity.this);
                a256.setTitle("Itinerário");
                a256.setIcon(R.mipmap.ic_launcher);
                a256.setMessage("* - Ônibus circula pelo Campus (via Creche): Av. Érico Veríssimo, Av. Bertrand Russel, Rua Monteiro Lobato - Portaria 2 - e segue para Moradia via Av. Prof. Atílio Martini (Av. 2);\n\n(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a256.setCancelable(true);
                AlertDialog alertaDialog = a256.create();
                alertaDialog.show();
            }
        });
        Button ok259 = (Button) findViewById(R.id.button259);
        ok259.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a259  = new AlertDialog.Builder(MorasActivity.this);
                a259.setTitle("Itinerário");
                a259.setIcon(R.mipmap.ic_launcher);
                a259.setMessage("* - Ônibus circula pelo Campus (via Creche): Av. Érico Veríssimo, Av. Bertrand Russel, Rua Monteiro Lobato - Portaria 2 - e segue para Moradia via Av. Prof. Atílio Martini (Av. 2);\n\n(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a259.setCancelable(true);
                AlertDialog alertaDialog = a259.create();
                alertaDialog.show();
            }
        });
        Button ok237 = (Button) findViewById(R.id.button237);
        ok237.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a237  = new AlertDialog.Builder(MorasActivity.this);
                a237.setTitle("Itinerário");
                a237.setIcon(R.mipmap.ic_launcher);
                a237.setMessage("(B) – VIA TERM. BARÃO GERALDO: Após deixar a Universidade (Portaria 1), segue pela Av. Dr. Romeu Tórtima (Av. 1), Av. Albino J.B. de Oliveira e Av. Sta. Isabel, até a Moradia;\n\n(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a237.setCancelable(true);
                AlertDialog alertaDialog = a237.create();
                alertaDialog.show();
            }
        });
        Button ok242 = (Button) findViewById(R.id.button242);
        ok242.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a242  = new AlertDialog.Builder(MorasActivity.this);
                a242.setTitle("Itinerário");
                a242.setIcon(R.mipmap.ic_launcher);
                a242.setMessage("(B) – VIA TERM. BARÃO GERALDO: Após deixar a Universidade (Portaria 1), segue pela Av. Dr. Romeu Tórtima (Av. 1), Av. Albino J.B. de Oliveira e Av. Sta. Isabel, até a Moradia;\n\n(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a242.setCancelable(true);
                AlertDialog alertaDialog = a242.create();
                alertaDialog.show();
            }
        });
        Button ok247 = (Button) findViewById(R.id.button247);
        ok247.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a247  = new AlertDialog.Builder(MorasActivity.this);
                a247.setTitle("Itinerário");
                a247.setIcon(R.mipmap.ic_launcher);
                a247.setMessage("(B) – VIA TERM. BARÃO GERALDO: Após deixar a Universidade (Portaria 1), segue pela Av. Dr. Romeu Tórtima (Av. 1), Av. Albino J.B. de Oliveira e Av. Sta. Isabel, até a Moradia;\n\n(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a247.setCancelable(true);
                AlertDialog alertaDialog = a247.create();
                alertaDialog.show();
            }
        });
        Button ok252 = (Button) findViewById(R.id.button252);
        ok252.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a252  = new AlertDialog.Builder(MorasActivity.this);
                a252.setTitle("Itinerário");
                a252.setIcon(R.mipmap.ic_launcher);
                a252.setMessage("(B) – VIA TERM. BARÃO GERALDO: Após deixar a Universidade (Portaria 1), segue pela Av. Dr. Romeu Tórtima (Av. 1), Av. Albino J.B. de Oliveira e Av. Sta. Isabel, até a Moradia;\n\n(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a252.setCancelable(true);
                AlertDialog alertaDialog = a252.create();
                alertaDialog.show();
            }
        });
        Button ok260 = (Button) findViewById(R.id.button260);
        ok260.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a260  = new AlertDialog.Builder(MorasActivity.this);
                a260.setTitle("Itinerário");
                a260.setIcon(R.mipmap.ic_launcher);
                a260.setMessage("(B) – VIA TERM. BARÃO GERALDO: Após deixar a Universidade (Portaria 1), segue pela Av. Dr. Romeu Tórtima (Av. 1), Av. Albino J.B. de Oliveira e Av. Sta. Isabel, até a Moradia;\n\n(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a260.setCancelable(true);
                AlertDialog alertaDialog = a260.create();
                alertaDialog.show();
            }
        });
        Button ok233 = (Button) findViewById(R.id.button233);
        ok233.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a233 = new AlertDialog.Builder(MorasActivity.this);
                a233.setTitle("Itinerário");
                a233.setIcon(R.mipmap.ic_launcher);
                a233.setMessage("(C) – VIA CENTRO MÉDICO: Após deixar a Universidade (Portaria 1), segue pela R. Francisco de Toledo (Av. 3), R. Oscar Pedroso Horta, R. Dr. Plínio do Amaral, R. Dr. Edilberto Pereira da Silva, R. Monsenhor Loshi, Av. Luiz De Tella, Estrada da Rhodia, Av. Albino J.B. de Oliveira, R. Agostinho Pátaro e Av. Sta. Isabel, até a Moradia;\n\n(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a233.setCancelable(true);
                AlertDialog alertaDialog = a233.create();
                alertaDialog.show();
            }
        });
        Button ok239 = (Button) findViewById(R.id.button239);
        ok239.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a239 = new AlertDialog.Builder(MorasActivity.this);
                a239.setTitle("Itinerário");
                a239.setIcon(R.mipmap.ic_launcher);
                a239.setMessage("(C) – VIA CENTRO MÉDICO: Após deixar a Universidade (Portaria 1), segue pela R. Francisco de Toledo (Av. 3), R. Oscar Pedroso Horta, R. Dr. Plínio do Amaral, R. Dr. Edilberto Pereira da Silva, R. Monsenhor Loshi, Av. Luiz De Tella, Estrada da Rhodia, Av. Albino J.B. de Oliveira, R. Agostinho Pátaro e Av. Sta. Isabel, até a Moradia;\n\n(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a239.setCancelable(true);
                AlertDialog alertaDialog = a239.create();
                alertaDialog.show();
            }
        });
        Button ok245 = (Button) findViewById(R.id.button245);
        ok245.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a245 = new AlertDialog.Builder(MorasActivity.this);
                a245.setTitle("Itinerário");
                a245.setIcon(R.mipmap.ic_launcher);
                a245.setMessage("(C) – VIA CENTRO MÉDICO: Após deixar a Universidade (Portaria 1), segue pela R. Francisco de Toledo (Av. 3), R. Oscar Pedroso Horta, R. Dr. Plínio do Amaral, R. Dr. Edilberto Pereira da Silva, R. Monsenhor Loshi, Av. Luiz De Tella, Estrada da Rhodia, Av. Albino J.B. de Oliveira, R. Agostinho Pátaro e Av. Sta. Isabel, até a Moradia;\n\n(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a245.setCancelable(true);
                AlertDialog alertaDialog = a245.create();
                alertaDialog.show();
            }
        });
        Button ok249 = (Button) findViewById(R.id.button249);
        ok249.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a249 = new AlertDialog.Builder(MorasActivity.this);
                a249.setTitle("Itinerário");
                a249.setIcon(R.mipmap.ic_launcher);
                a249.setMessage("(C) – VIA CENTRO MÉDICO: Após deixar a Universidade (Portaria 1), segue pela R. Francisco de Toledo (Av. 3), R. Oscar Pedroso Horta, R. Dr. Plínio do Amaral, R. Dr. Edilberto Pereira da Silva, R. Monsenhor Loshi, Av. Luiz De Tella, Estrada da Rhodia, Av. Albino J.B. de Oliveira, R. Agostinho Pátaro e Av. Sta. Isabel, até a Moradia;\n\n(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a249.setCancelable(true);
                AlertDialog alertaDialog = a249.create();
                alertaDialog.show();
            }
        });
        Button ok257 = (Button) findViewById(R.id.button257);
        ok257.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a257 = new AlertDialog.Builder(MorasActivity.this);
                a257.setTitle("Itinerário");
                a257.setIcon(R.mipmap.ic_launcher);
                a257.setMessage("(C) – VIA CENTRO MÉDICO: Após deixar a Universidade (Portaria 1), segue pela R. Francisco de Toledo (Av. 3), R. Oscar Pedroso Horta, R. Dr. Plínio do Amaral, R. Dr. Edilberto Pereira da Silva, R. Monsenhor Loshi, Av. Luiz De Tella, Estrada da Rhodia, Av. Albino J.B. de Oliveira, R. Agostinho Pátaro e Av. Sta. Isabel, até a Moradia;\n\n(D) - Após deixar a Universidade, pode realizar desembarque nos pontos de ônibus do transporte coletivo no percurso e, na ausência destes, nas proximidades das Repúblicas.");
                a257.setCancelable(true);
                AlertDialog alertaDialog = a257.create();
                alertaDialog.show();
            }
        });
        Button ok202 = (Button) findViewById(R.id.button202);
        ok202.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a202 = new AlertDialog.Builder(MorasActivity.this);
                a202.setTitle("Itinerário");
                a202.setIcon(R.mipmap.ic_launcher);
                a202.setMessage("Não realiza paradas.\n\nTrajeto sem detalhes.");
                a202.setCancelable(true);
                AlertDialog alertaDialog = a202.create();
                alertaDialog.show();
            }
        });
        Button ok203 = (Button) findViewById(R.id.button203);
        ok203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a203 = new AlertDialog.Builder(MorasActivity.this);
                a203.setTitle("Itinerário");
                a203.setIcon(R.mipmap.ic_launcher);
                a203.setMessage("Não realiza paradas.\n\nTrajeto sem detalhes.");
                a203.setCancelable(true);
                AlertDialog alertaDialog = a203.create();
                alertaDialog.show();
            }
        });
        Button ok205 = (Button) findViewById(R.id.button205);
        ok205.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a205 = new AlertDialog.Builder(MorasActivity.this);
                a205.setTitle("Itinerário");
                a205.setIcon(R.mipmap.ic_launcher);
                a205.setMessage("Não realiza paradas.\n\nTrajeto sem detalhes.");
                a205.setCancelable(true);
                AlertDialog alertaDialog = a205.create();
                alertaDialog.show();
            }
        });
        Button ok206 = (Button) findViewById(R.id.button206);
        ok206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a206 = new AlertDialog.Builder(MorasActivity.this);
                a206.setTitle("Itinerário");
                a206.setIcon(R.mipmap.ic_launcher);
                a206.setMessage("Não realiza paradas.\n\nTrajeto sem detalhes.");
                a206.setCancelable(true);
                AlertDialog alertaDialog = a206.create();
                alertaDialog.show();
            }
        });
        Button ok207 = (Button) findViewById(R.id.button207);
        ok207.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a207 = new AlertDialog.Builder(MorasActivity.this);
                a207.setTitle("Itinerário");
                a207.setIcon(R.mipmap.ic_launcher);
                a207.setMessage("Não realiza paradas.\n\nTrajeto sem detalhes.");
                a207.setCancelable(true);
                AlertDialog alertaDialog = a207.create();
                alertaDialog.show();
            }
        });
        Button ok208 = (Button) findViewById(R.id.button208);
        ok208.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a208 = new AlertDialog.Builder(MorasActivity.this);
                a208.setTitle("Itinerário");
                a208.setIcon(R.mipmap.ic_launcher);
                a208.setMessage("Não realiza paradas.\n\nTrajeto sem detalhes.");
                a208.setCancelable(true);
                AlertDialog alertaDialog = a208.create();
                alertaDialog.show();
            }
        });
        Button ok209 = (Button) findViewById(R.id.button209);
        ok209.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a209 = new AlertDialog.Builder(MorasActivity.this);
                a209.setTitle("Itinerário");
                a209.setIcon(R.mipmap.ic_launcher);
                a209.setMessage("Não realiza paradas.\n\nTrajeto sem detalhes.");
                a209.setCancelable(true);
                AlertDialog alertaDialog = a209.create();
                alertaDialog.show();
            }
        });
        Button ok211 = (Button) findViewById(R.id.button211);
        ok211.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a211 = new AlertDialog.Builder(MorasActivity.this);
                a211.setTitle("Itinerário");
                a211.setIcon(R.mipmap.ic_launcher);
                a211.setMessage("Não realiza paradas.\n\nTrajeto sem detalhes.");
                a211.setCancelable(true);
                AlertDialog alertaDialog = a211.create();
                alertaDialog.show();
            }
        });
        Button ok214 = (Button) findViewById(R.id.button214);
        ok214.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a214 = new AlertDialog.Builder(MorasActivity.this);
                a214.setTitle("Itinerário");
                a214.setIcon(R.mipmap.ic_launcher);
                a214.setMessage("Não realiza paradas.\n\nTrajeto sem detalhes.");
                a214.setCancelable(true);
                AlertDialog alertaDialog = a214.create();
                alertaDialog.show();
            }
        });
        Button ok216 = (Button) findViewById(R.id.button216);
        ok216.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a216 = new AlertDialog.Builder(MorasActivity.this);
                a216.setTitle("Itinerário");
                a216.setIcon(R.mipmap.ic_launcher);
                a216.setMessage("Não realiza paradas.\n\nTrajeto sem detalhes.");
                a216.setCancelable(true);
                AlertDialog alertaDialog = a216.create();
                alertaDialog.show();
            }
        });
        Button ok217 = (Button) findViewById(R.id.button217);
        ok217.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a217 = new AlertDialog.Builder(MorasActivity.this);
                a217.setTitle("Itinerário");
                a217.setIcon(R.mipmap.ic_launcher);
                a217.setMessage("Não realiza paradas.\n\nTrajeto sem detalhes.");
                a217.setCancelable(true);
                AlertDialog alertaDialog = a217.create();
                alertaDialog.show();
            }
        });
        Button ok219 = (Button) findViewById(R.id.button219);
        ok219.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a219 = new AlertDialog.Builder(MorasActivity.this);
                a219.setTitle("Itinerário");
                a219.setIcon(R.mipmap.ic_launcher);
                a219.setMessage("Não realiza paradas.\n\nTrajeto sem detalhes.");
                a219.setCancelable(true);
                AlertDialog alertaDialog = a219.create();
                alertaDialog.show();
            }
        });
        Button ok220 = (Button) findViewById(R.id.button220);
        ok220.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a220 = new AlertDialog.Builder(MorasActivity.this);
                a220.setTitle("Itinerário");
                a220.setIcon(R.mipmap.ic_launcher);
                a220.setMessage("Não realiza paradas.\n\nTrajeto sem detalhes.");
                a220.setCancelable(true);
                AlertDialog alertaDialog = a220.create();
                alertaDialog.show();
            }
        });
        Button ok221 = (Button) findViewById(R.id.button221);
        ok221.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a221 = new AlertDialog.Builder(MorasActivity.this);
                a221.setTitle("Itinerário");
                a221.setIcon(R.mipmap.ic_launcher);
                a221.setMessage("Não realiza paradas.\n\nTrajeto sem detalhes.");
                a221.setCancelable(true);
                AlertDialog alertaDialog = a221.create();
                alertaDialog.show();
            }
        });
        Button ok222 = (Button) findViewById(R.id.button222);
        ok222.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a222 = new AlertDialog.Builder(MorasActivity.this);
                a222.setTitle("Itinerário");
                a222.setIcon(R.mipmap.ic_launcher);
                a222.setMessage("Não realiza paradas.\n\nTrajeto sem detalhes.");
                a222.setCancelable(true);
                AlertDialog alertaDialog = a222.create();
                alertaDialog.show();
            }
        });
        Button ok223 = (Button) findViewById(R.id.button223);
        ok223.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a223 = new AlertDialog.Builder(MorasActivity.this);
                a223.setTitle("Itinerário");
                a223.setIcon(R.mipmap.ic_launcher);
                a223.setMessage("Não realiza paradas.\n\nTrajeto sem detalhes.");
                a223.setCancelable(true);
                AlertDialog alertaDialog = a223.create();
                alertaDialog.show();
            }
        });
        Button ok224 = (Button) findViewById(R.id.button224);
        ok224.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder a224 = new AlertDialog.Builder(MorasActivity.this);
                a224.setTitle("Itinerário");
                a224.setIcon(R.mipmap.ic_launcher);
                a224.setMessage("Não realiza paradas.\n\nTrajeto sem detalhes.");
                a224.setCancelable(true);
                AlertDialog alertaDialog = a224.create();
                alertaDialog.show();
            }
        });
               }
        }