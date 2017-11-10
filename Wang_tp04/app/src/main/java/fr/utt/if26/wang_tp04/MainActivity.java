package fr.utt.if26.wang_tp04;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.graphics.Color.RED;

public class MainActivity extends AppCompatActivity {
    private Button b01;
    private Button b02;

    private EditText familyName;
    private EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView nom = (TextView)findViewById(R.id.nomLabel);
        //TextView prenom = (TextView)findViewById(R.id.prenomLabel);


        b01 = (Button)findViewById(R.id.b01);
        b02 = (Button)findViewById(R.id.b02);

        b01.setBackgroundColor(Color.RED);
        b02.setBackgroundColor(Color.RED);



        b01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                ColorDrawable buttonBackground = (ColorDrawable) b01.getBackground();
                if (buttonBackground.getColor()== RED ) {
                    b01.setBackgroundColor(Color.GREEN);
                }else {
                    b01.setBackgroundColor(Color.RED);
                }

            }
        });

        b02.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                ColorDrawable buttonBackground = (ColorDrawable)b02.getBackground();
                if(buttonBackground.getColor() == RED){
                    b02.setBackgroundColor(Color.GREEN);
                }else{
                    b02.setBackgroundColor(RED);
                }
            }
        });

        familyName = (EditText)findViewById(R.id.nomSaisie);
        name = (EditText)findViewById(R.id.prenomSaisie);

        b01.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                Intent intent = new Intent(MainActivity.this, ResultActivity.class);
                intent.putExtra("Nom", familyName.getText().toString());
                intent.putExtra("Prenom", name.getText().toString());
                startActivity(intent);
                return true;
            }
        });

        b02.setOnLongClickListener(new View.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                Intent intent = new Intent(MainActivity.this, GridActivity.class);
                intent.putExtra("Nom", familyName.getText().toString());
                intent.putExtra("Prenom", name.getText().toString());
                startActivity(intent);
                return true;
            }
        });

    }
}
