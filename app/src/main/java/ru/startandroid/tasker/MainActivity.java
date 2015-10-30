package ru.startandroid.tasker;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    FloatingActionButton fb;
    EditText et;
    LinearLayout llMain;
    float x;
    float y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        if (toolbar != null) {
//            setSupportActionBar(toolbar);
//            toolbar.setTitle("Tasker");
//        }



        llMain = (LinearLayout)findViewById(R.id.llMain);
        FloatingActionButton fb = (FloatingActionButton)findViewById(R.id.fab);
        fb.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        et = new EditText(this);
        llMain.addView(et);
    }
}
