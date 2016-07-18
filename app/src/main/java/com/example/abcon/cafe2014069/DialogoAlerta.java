package com.example.abcon.cafe2014069;

import android.app.AlertDialog;
import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;


/**
 * Created by abcon on 23/05/2016.
 */
public class DialogoAlerta extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle saveInstanceState){

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        builder.setMessage("Por Favor introduzca el numero de tazas que desea para poder completar la orden.")
                .setTitle("Aviso")
                .setPositiveButton("Entendido", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        return builder.create();
    }



}
