package com.example.atv_alura;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class tela3 extends AppCompatActivity {

    private TextView tvTituloCurso;
    private CheckBox chkAula1, chkAula2, chkAula3;
    private Button btnConcluirAula, btnVoltarTela3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);

        // Vincular Botão Voltar
        btnVoltarTela3 = findViewById(R.id.btnVoltarTela3);
        btnVoltarTela3.setOnClickListener(v -> finish());

        // Vincular componentes
        tvTituloCurso = findViewById(R.id.tvTituloCurso);
        chkAula1 = findViewById(R.id.chkAula1);
        chkAula2 = findViewById(R.id.chkAula2);
        chkAula3 = findViewById(R.id.chkAula3);
        btnConcluirAula = findViewById(R.id.btnConcluirAula);

        // Receber dados da Intent
        String nomeCurso = getIntent().getStringExtra("NOME_CURSO");
        if (nomeCurso != null) {
            tvTituloCurso.setText(nomeCurso);
        }

        // Lógica para concluir próxima aula
        btnConcluirAula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!chkAula1.isChecked()) {
                    chkAula1.setChecked(true);
                    mostrarSucesso();
                } else if (!chkAula2.isChecked()) {
                    chkAula2.setChecked(true);
                    mostrarSucesso();
                } else if (!chkAula3.isChecked()) {
                    chkAula3.setChecked(true);
                    mostrarSucesso();
                } else {
                    Toast.makeText(tela3.this, "Todas as aulas concluídas!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void mostrarSucesso() {
        Toast.makeText(this, "Aula concluída com sucesso!", Toast.LENGTH_SHORT).show();
    }
}
