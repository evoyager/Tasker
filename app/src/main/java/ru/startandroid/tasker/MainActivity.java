package ru.startandroid.tasker;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    FloatingActionButton fb;
    TextView tv;
    static ListView llMain1;
    static ListView llMain2;
    static int tasksNumber = 0;
    int doneTasksNumber = 0;
    private Toolbar toolbar;
    MenuItem item;
    boolean first = true;
    static List<String> list1 = new ArrayList<>();
    static List<String> list2 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            toolbar.setTitle("Tasker");
        }

        llMain1 = (ListView)findViewById(R.id.llMain1);
        llMain2 = (ListView)findViewById(R.id.llMain2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, list1);
        llMain1.setAdapter(adapter);

        FloatingActionButton fb = (FloatingActionButton)findViewById(R.id.fab);
        fb.setOnClickListener(this);

        Intent intent = getIntent();
        String message = intent.getStringExtra("message");

        if (intent.hasExtra("message")) {
            tasksNumber++;
            list1.add(message);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        item = menu.findItem(R.id.notes_number);
        item.setEnabled(false);
        item.setTitle(Integer.toString(tasksNumber));
        return true;
    }

    @Override
    public void onClick(View v) {

//        et = new EditText(this);
//        if (first) {
//            tasksNumber++;
//            list1.add(et);
////            llMain1.addView(et);
//            first = false;
//        }
//        else {
//            doneTasksNumber++;
//            list2.add(et);
////            llMain2.addView(et);
//            first = true;
//        }
//        item.setTitle(Integer.toString(tasksNumber) + " / " + Integer.toString(doneTasksNumber));
        Intent intent = new Intent(MainActivity.this, NewTaskActivity.class);
        startActivity(intent);
    }
}
