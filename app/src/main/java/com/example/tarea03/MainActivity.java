package com.example.tarea03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText edt1, edt2, edt11,edt22;
Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = findViewById(R.id.usuario);
        edt11= findViewById(R.id.usuario);
        edt2 = findViewById(R.id.password);
        edt22 = findViewById(R.id.password);
        boton = findViewById(R.id.Ingresar);

    }
    public void login(View view){
        String user = edt1.getText().toString();
        String pass = edt2.getText().toString();
        String User = edt11.getText().toString();
        String Pass = edt22.getText().toString();
        if (user.equals("ADMIN") && pass.equals("admin")){
            String usuario =null;
            Intent intet = new Intent(this,Principal.class);
            intet.putExtra("usuario",user);
            startActivity(intet);
        }else{
            Toast.makeText( this,  "Datos incorrectos", Toast.LENGTH_LONG).show();
        }

        if (User.equals("jose") && Pass.equals("admin")){
            String Usuario =null;
            Intent intet = new Intent(this,Principal.class);
            intet.putExtra("Usuario",user);
            startActivity(intet);
        }else{
            Toast.makeText( this,  "Datos incorrectos", Toast.LENGTH_LONG).show();
        }
    }


}
