package com.example.multi_screens_exampls;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class word extends ArrayAdapter<model>{


    public word(@NonNull Context context, int resource) {
        super(context, resource);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }

    public word(@NonNull Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public word(@NonNull Context context, int resource, @NonNull model[] objects) {
        super(context, resource, objects);
    }

    public word(@NonNull Context context, int resource, int textViewResourceId, @NonNull model[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public word(@NonNull Context context, int resource, @NonNull List<model> objects) {
        super(context, resource, objects);
    }

    public word(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<model> objects) {
        super(context, resource, textViewResourceId, objects);
    }
}
