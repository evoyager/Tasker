package ru.startandroid.tasker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by igusar on 11/4/15.
 */
public class NewTaskActivity extends Activity implements View.OnClickListener {

    EditText et;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_task_activity);

        et = (EditText) findViewById(R.id.editText);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch(v.getId()) {
            case R.id.btnOk:
                intent = new Intent(this, MainActivity.class);
                intent.putExtra("message", et.getText().toString());
                this.startActivity(intent);
                break;
            case R.id.btnCancel:
                intent = new Intent(this, MainActivity.class);
                this.startActivity(intent);
                break;
        }
    }
}
