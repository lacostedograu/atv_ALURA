package com.example.atv_alura;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.card.MaterialCardView;

public class tela2 extends AppCompatActivity {

    private MaterialCardView btnCursoMobile, btnCursoIA, btnCursoFrontend;
    private Button btnVoltarTela2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        // Vincular Botão Voltar
        btnVoltarTela2 = findViewById(R.id.btnVoltarTela2);
        btnVoltarTela2.setOnClickListener(v -> finish());

        // Vincular Cards
        btnCursoMobile = findViewById(R.id.btnCursoMobile);
        btnCursoIA = findViewById(R.id.btnCursoIA);
        btnCursoFrontend = findViewById(R.id.btnCursoFrontend);

        // Ações de clique para cada curso
        btnCursoMobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirDetalhesCurso("Mobile: Kotlin e Java");
            }
        });

        btnCursoIA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirDetalhesCurso("Inteligência Artificial: ChatGPT e Prompts");
            }
        });

        btnCursoFrontend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirDetalhesCurso("Front-End: React e JavaScript");
            }
        });
    }

    private void abrirDetalhesCurso(String nomeCurso) {
        Intent intent = new Intent(tela2.this, tela3.class);
        intent.putExtra("NOME_CURSO", nomeCurso);
        startActivity(intent);
    }
}
