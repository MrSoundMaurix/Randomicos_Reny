package com.example.reny.randomicos_reny;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnNum;
    TextView tvRespuesta,tvGanador;
    EditText txtCantidad;
    int n,cont=1,cantidad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCantidad=(EditText)findViewById(R.id.txtCant);
        btnNum=(Button)findViewById(R.id.btnHacer);
        tvRespuesta=(TextView)findViewById(R.id.tvNumero);
        tvGanador=(TextView)findViewById(R.id.tvGanador);
        System.out.println(cantidad+"   canridadadsdasfasfsdfsf");
        btnNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cantidad=Integer.parseInt(txtCantidad.getText().toString());
                n=(int)(Math.random()*(cantidad)+1);
               // System.out.println(n+"111111111111111111111111111");
                tvRespuesta.setText("su numero randomico es "+n);
                if (cont%5==0) {
                    tvRespuesta.setText("su número randomico es " + n);
                    tvGanador.setText("-- Ganador -- ");
                }else{
                    tvRespuesta.setText("su número randomico es " + n);
                    tvGanador.setText(" ");
                }
               // System.out.println(cont+"contador");
           cont++;
            }
        });
    }
}
