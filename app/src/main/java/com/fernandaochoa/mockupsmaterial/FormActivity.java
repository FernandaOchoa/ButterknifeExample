package com.fernandaochoa.mockupsmaterial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.support.v7.widget.Toolbar;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class FormActivity extends AppCompatActivity {
    Toolbar toolbar;
    //Injectar Vistas o elementos a usar
    @Bind(R.id.edt_first)
    EditText Nombre;

    @Bind(R.id.edt_last)
    EditText Apellido;

    @Bind(R.id.edt_pass1)
    EditText Password;

    @Bind(R.id.edt_confpass)
    EditText ConfPassword;

    @Bind(R.id.edt_telefono)
    EditText Telefono;

    @Bind(R.id.edt_correo)
    EditText Email;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form_activity);
        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_registrar)
    public void OnClick(View view) {
        Intent intent = new Intent(this, Home.class);
        //Creo un string para guardar lo que tiene el edit text y le digo dame el texto y pasalo a cadena

        String nombre = Nombre.getText().toString();
        String apellido = Apellido.getText().toString();
        String password = Password.getText().toString();
        String confpassword = ConfPassword.getText().toString();
        String telefono = Telefono.getText().toString();
        String email = Email.getText().toString();
        //Cargo los elementos a un zip para mandarlo
        intent.putExtra("Nombre", nombre);
        intent.putExtra("Apellido", apellido);
        intent.putExtra("Telefono", telefono);
        intent.putExtra("Email", email);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_form_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
