package fr.utt.if26.wang_cursus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ListActivity;
import android.widget.ArrayAdapter;

import java.util.List;


public class ModuleSigleListActivity extends ListActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_sigle_list);
        Cursus cursus = new Cursus();
        cursus.triParCredit();
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, (List) cursus.getResumes());
        setListAdapter(adapter);
    }
}
