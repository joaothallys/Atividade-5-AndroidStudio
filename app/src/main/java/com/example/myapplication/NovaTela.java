package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NovaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_tela);

        // Recuperar os dados extras da Intent
        String dadoRecebido = getIntent().getStringExtra("chave_dado");

        // Atualizar o TextView com o dado recebido
        TextView textoNovaTela = findViewById(R.id.texto_nova_tela);
        textoNovaTela.setText(dadoRecebido);
    }
}
