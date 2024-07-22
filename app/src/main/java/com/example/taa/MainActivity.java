package com.example.taa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements NotasInteractionListener {
      Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin=findViewById(R.id.button);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,NotaActivity.class );
                startActivity(i);
            }
        });
    }

    @Override
    public void voideditNotaClick(Nota nota) {

    }

    @Override
    public void voideliminaNotaClick(Nota nota) {

    }

    @Override
    public void voidfavoritaNotaClick(Nota nota) {

    }
}