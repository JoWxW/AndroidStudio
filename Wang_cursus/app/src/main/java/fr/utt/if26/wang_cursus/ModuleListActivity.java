package fr.utt.if26.wang_cursus;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import java.util.List;

public class ModuleListActivity extends Activity {
    ListView l;
    Cursus c;
    CursusAdapter ca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_list);

        l = (ListView)findViewById(R.id.listeModule);
        c = new Cursus();
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, (List) c.getModules());
        l.setAdapter(adapter);

    }
}
