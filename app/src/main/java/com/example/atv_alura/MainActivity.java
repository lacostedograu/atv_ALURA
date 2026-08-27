package com.example.atv_alura;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnContinuarCurso;
    private Button btnIrParaCatalogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vincular componentes
        btnContinuarCurso = findViewById(R.id.btnContinuarCurso);
        btnIrParaCatalogo = findViewById(R.id.btnIrParaCatalogo);

        // Configurar clique para continuar curso (abre tela3)
        btnContinuarCurso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, tela3.class);
                intent.putExtra("NOME_CURSO", "Android com Java: Fundamentos");
                startActivity(intent);
            }
        });

        // Configurar clique para explorar catálogo (abre tela2)
        btnIrParaCatalogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, tela2.class);
                startActivity(intent);
            }
        });
    }
}
