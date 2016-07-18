package com.example.abcon.cafe2014069;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Pedido extends AppCompatActivity {
    private TextView txtPedido,txtTotal;
    private Button btnRegresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);
        txtPedido = (TextView) findViewById(R.id.txtPedido);
        txtTotal = (TextView) findViewById(R.id.txtTotal);
        btnRegresar = (Button) findViewById(R.id.btnRegresar);
        Bundle bundle =this.getIntent().getExtras();
        txtPedido.setText(bundle.getString("pedido").toString());
        Double total =Double.parseDouble(bundle.getString("pedido"))*7.50;
        txtTotal.setText(total.toString());
        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    startActivity(new Intent(Pedido.this,Principal.class));
            }
        });
    }
}
