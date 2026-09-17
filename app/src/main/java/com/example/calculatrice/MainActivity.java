package com.example.calculatrice;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String nombreActuel = "";
    private TextView tvEcran;

    private double premierNombre = 0;
    private String operationChoisie = "";
    private boolean nouveauNombre = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvEcran = findViewById(R.id.tvEcran);

        Button btn0 = findViewById(R.id.btn0);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);
        Button btn7 = findViewById(R.id.btn7);
        Button btn8 = findViewById(R.id.btn8);
        Button btn9 = findViewById(R.id.btn9);

        Button btnAdditionner = findViewById(R.id.btnAdditionner);
        Button btnSoustraire = findViewById(R.id.btnSoustraire);
        Button btnMultiplier = findViewById(R.id.btnMultiplier);
        Button btnDiviser = findViewById(R.id.btnDiviser);
        Button btnEgal = findViewById(R.id.btnEgal);
        Button btnC = findViewById(R.id.btnC);

        btn0.setOnClickListener(v -> ajouterChiffre("0"));
        btn1.setOnClickListener(v -> ajouterChiffre("1"));
        btn2.setOnClickListener(v -> ajouterChiffre("2"));
        btn3.setOnClickListener(v -> ajouterChiffre("3"));
        btn4.setOnClickListener(v -> ajouterChiffre("4"));
        btn5.setOnClickListener(v -> ajouterChiffre("5"));
        btn6.setOnClickListener(v -> ajouterChiffre("6"));
        btn7.setOnClickListener(v -> ajouterChiffre("7"));
        btn8.setOnClickListener(v -> ajouterChiffre("8"));
        btn9.setOnClickListener(v -> ajouterChiffre("9"));

        btnAdditionner.setOnClickListener(v -> choisirOperation("+"));
        btnSoustraire.setOnClickListener(v -> choisirOperation("−"));
        btnMultiplier.setOnClickListener(v -> choisirOperation("×"));
        btnDiviser.setOnClickListener(v -> choisirOperation("÷"));

        // Bloc 6 : calcul du résultat
        btnEgal.setOnClickListener(v -> {
            double deuxiemeNombre = Double.parseDouble(nombreActuel);
            double resultat = 0;

            switch (operationChoisie) {
                case "+":
                    resultat = premierNombre + deuxiemeNombre;
                    break;
                case "−":
                    resultat = premierNombre - deuxiemeNombre;
                    break;
                case "×":
                    resultat = premierNombre * deuxiemeNombre;
                    break;
                case "÷":
                    if (deuxiemeNombre == 0) {
                        tvEcran.setText("Erreur");
                        return;
                    }
                    resultat = premierNombre / deuxiemeNombre;
                    break;
            }

            nombreActuel = String.valueOf(resultat);
            tvEcran.setText(nombreActuel);
            nouveauNombre = true;
        });

        // Bloc 7 : bouton Clear
        btnC.setOnClickListener(v -> {
            nombreActuel = "";
            premierNombre = 0;
            operationChoisie = "";
            nouveauNombre = true;
            tvEcran.setText("0");
        });
    }

    private void ajouterChiffre(String chiffre) {
        if (nouveauNombre) {
            nombreActuel = chiffre;
            nouveauNombre = false;
        } else {
            nombreActuel = nombreActuel + chiffre;
        }
        tvEcran.setText(nombreActuel);
    }

    private void choisirOperation(String operation) {
        premierNombre = Double.parseDouble(nombreActuel);
        operationChoisie = operation;
        nouveauNombre = true;
    }
}