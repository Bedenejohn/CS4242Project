package edu.valdosta.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list_view;
    EditText edit_text;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list_view = findViewById(R.id.listView);
        edit_text = findViewById(R.id.editText);
        adapter = new ArrayAdapter<>(this, R.layout.activity_main);
        list_view.setAdapter(adapter);
    }

    public void onClick(View view){
        String text = edit_text.getText().toString();
        adapter.add(text);
        adapter.notifyDataSetChanged();
        edit_text.setText("");

    }
}
