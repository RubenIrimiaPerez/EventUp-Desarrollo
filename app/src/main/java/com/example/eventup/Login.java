package com.example.eventup;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
    public void AlertDialog(View view){
        androidx.appcompat.app.AlertDialog.Builder builder = new AlertDialog.Builder(this);

        EditText nuevaContraeña = new EditText(this);
        nuevaContraeña.setInputType(InputType.TYPE_CLASS_TEXT);
        nuevaContraeña.setHint("nuevamail@example.com");

        builder.setView(nuevaContraeña);
        builder.setTitle("Ingrese el e-mail para poder reestablecer contraseña");

        builder.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(Login.this, "Enviado", Toast.LENGTH_SHORT).show();
            }
        });
        builder.create().show();
    }
}