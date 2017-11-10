package fr.utt.if26.wang_cursus;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.add:
                addModule();
                return true;
            case R.id.del:
                delModule();
                return true;
            case R.id.sigle:
                listSigle();
                return true;
            case R.id.module:
                listModule();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void addModule(){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "Je veux ajouter un module";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    private void delModule(){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "Je veux supprimer un module";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    private void listSigle(){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "Je veux lister les sigles";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Intent intent = new Intent(MainActivity.this, ModuleSigleListActivity.class);
        startActivity(intent);
    }

    private void listModule(){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "Je veux lister les modules";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Intent intent = new Intent(MainActivity.this, ModuleListActivity.class);
        startActivity(intent);
    }

}
