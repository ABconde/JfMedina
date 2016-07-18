package com.example.abcon.cafe2014069;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v4.app.DialogFragment;


public class Principal extends AppCompatActivity {
    private EditText txtNumero;
    private Button btnPedido;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtNumero = (EditText) findViewById(R.id.txtNumero);
        btnPedido = (Button) findViewById(R.id.btnPedido);

        btnPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(v.getContext(),"",Toast.LENGTH_LONG);
                if(txtNumero.getText().toString().equals("")){
                    Snackbar.make(v,"Datos no ingresados", Snackbar.LENGTH_SHORT)
                    .setActionTextColor(Color.CYAN)
                    .setAction("Informacion", new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    FragmentManager fragmentManager = getSupportFragmentManager();
                                    DialogoAlerta dialogo = new DialogoAlerta();
                                    dialogo.show(fragmentManager, "tagAlerta");
                                }
                            }).show();


                    //Toast toast= Toast.makeText(getApplication(), "Ingrese una cantidad", Toast.LENGTH_LONG);
                    //toast.setGravity(Gravity.CENTER| Gravity.CENTER,0,0);


                    //toast.show();

                }else {
                    Intent intent = new Intent(Principal.this, Pedido.class);
                    intent.putExtra("pedido", txtNumero.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }


}
