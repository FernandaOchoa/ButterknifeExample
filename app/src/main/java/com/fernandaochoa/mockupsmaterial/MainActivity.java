package com.fernandaochoa.mockupsmaterial;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;


public class MainActivity extends Activity {

    //Injecto mis vistas para cada view
    @InjectView(R.id.edt_correo)
    EditText email;
    @InjectView(R.id.edt_contrasena)
    EditText pass;
    @InjectView(R.id.tv_forgot)
    TextView forgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.inject(this);

    }


    @OnClick({R.id.btn_acount, R.id.btn_iniciar})
    public void OnClick(View v) {
        switch (v.getId()) {
            case R.id.btn_acount:
                Intent intentar = new Intent(this, FormActivity.class);
                startActivity(intentar);
                break;
            case R.id.btn_iniciar:
                Intent intent = new Intent(this, Home.class);
                startActivity(intent);
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

            Toast.makeText(this, "search", Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
