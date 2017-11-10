package fr.utt.if26.wang_tp04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class ResultActivity extends AppCompatActivity {
    private EditText okButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String nom = getIntent().getStringExtra("Nom");
        String prenom = getIntent().getStringExtra("Prenom");

        okButton = (EditText) findViewById(R.id.editTextOk);

        okButton.setText(nom + " " + prenom);
    }
}
