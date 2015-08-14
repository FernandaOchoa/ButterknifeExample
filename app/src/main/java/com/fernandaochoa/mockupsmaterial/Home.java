package com.fernandaochoa.mockupsmaterial;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.support.v7.widget.Toolbar;

public class Home extends AppCompatActivity {

    Toolbar toolbar;
    EditText edt_nom;
    EditText edt_las;
    EditText edt_email;
    EditText edt_num;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        edt_nom = (EditText) findViewById(R.id.etd_nom);
        edt_las = (EditText) findViewById(R.id.edt_las);
        edt_email = (EditText) findViewById(R.id.edt_email);
        edt_num = (EditText) findViewById(R.id.edt_num);

        //Aqui voy a cachar los extra con el bundle zip
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if (bundle != null) {
            String fn = (String) bundle.get("Nombre");
            edt_nom.setText(fn);

            String ln = (String) bundle.get("Apellido");
            edt_las.setText(ln);

            String em = (String) bundle.get("Email");
            edt_email.setText(em);

            String no = (String) bundle.get("Telefono");
            edt_num.setText(no);
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
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
