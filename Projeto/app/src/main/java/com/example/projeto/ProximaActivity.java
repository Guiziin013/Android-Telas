package com.example.projeto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ProximaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proxima);
        TextView txt = (TextView) findViewById(R.id.texto2);
        Intent it2 = getIntent();
        String msg = it2.getStringExtra(MainActivity.MENSAGEM);
    }
}