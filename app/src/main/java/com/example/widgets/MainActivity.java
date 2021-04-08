package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Mountain> mountains = new ArrayList<Mountain>();
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mountains.add(new Mountain("Matterhorn"));
        mountains.add(new Mountain("Mont Blanc"));
        mountains.add(new Mountain("Denali"));
        final ArrayAdapter<Mountain> adapter = new ArrayAdapter<Mountain>(this, R.layout.list_item_textview,
                R.id.list_item_textView,mountains);
        final ListView my_listView = (ListView) findViewById(R.id.my_listView);
        my_listView.setAdapter(adapter);
        my_listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Bla bla", Toast.LENGTH_SHORT).show();
            }
        });

        editText = findViewById(R.id.editText);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Hej","Du har tryck på knappen!");
                if(editText.getText().length() != 0){
                    mountains.add(new Mountain(editText.getText().toString()));
                    adapter.notifyDataSetChanged();
                    Toast.makeText(getApplicationContext(), "Added new Mountain", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "Field can not be empty", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
