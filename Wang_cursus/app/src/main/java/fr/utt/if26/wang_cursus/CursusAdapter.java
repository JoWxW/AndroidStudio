package fr.utt.if26.wang_cursus;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

/**
 * Created by wxw on 2017/10/25.
 */

public class CursusAdapter extends ArrayAdapter {
    public CursusAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }
}
