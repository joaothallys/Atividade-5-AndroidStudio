package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.text.TextWatcher;
import android.text.Editable;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.lista);

        ArrayList<String> listaItens = new ArrayList<>();
        listaItens.add("Alice");
        listaItens.add("Bruno");
        listaItens.add("Camila");
        listaItens.add("Diego");
        listaItens.add("Eduarda");
        listaItens.add("Fernando");
        listaItens.add("Gabriela");
        listaItens.add("Henrique");
        listaItens.add("Isabela");
        listaItens.add("João");
        listaItens.add("Kátia");
        listaItens.add("Leandro");
        listaItens.add("Mariana");
        listaItens.add("Natália");
        listaItens.add("Otávio");
        listaItens.add("Patrícia");
        listaItens.add("Quintino");
        listaItens.add("Rafaela");
        listaItens.add("Sandra");
        listaItens.add("Tiago");
        listaItens.add("Ursula");
        listaItens.add("Valdir");
        listaItens.add("Wanda");
        listaItens.add("Xavier");
        listaItens.add("Yara");
        listaItens.add("Zélio");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaItens);
        listView.setAdapter(adapter);

        EditText editTextFiltro = findViewById(R.id.edit_text_filtro);
        editTextFiltro.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                adapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });


        listView.setOnItemClickListener((parent, view, position, id) -> {
            String itemSelecionado = listaItens.get(position);
            Intent intent = new Intent(MainActivity.this, NovaTela.class);
            intent.putExtra("chave_dado", itemSelecionado); // Aqui, usamos o item selecionado como dado
            startActivity(intent);
        });
    }
}
