package ru.startandroid.tasker;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class SampleAdapter extends BaseAdapter {

    private List<TextView> list;
    private Context context;

    public SampleAdapter(Context context, List<TextView> list) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public View getItem(int position) {
        return list.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            switch (getItemViewType(position)) {
                case 0:
                    convertView = new TextView(context);
                    break;
            }
        // Output here shows that you can lay on getItemViewType(position) as indicator of convertView type or structure
        Log.e("test", getItemViewType(position) + ": " + convertView.getClass().getSimpleName());
        return convertView;
    }

    @Override
    public int getViewTypeCount() {
        return 2;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
}