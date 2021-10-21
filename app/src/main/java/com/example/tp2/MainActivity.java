package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 =findViewById(R.id.btn1);
        final EditText name =findViewById(R.id.name);
        TextView txtlist =findViewById(R.id.txtlist);
        ListView listv=findViewById(R.id.listv);
        final List<String> data =new ArrayList<>();
        final ArrayAdapter<String>  stringArrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1 , data);
        listv.setAdapter(stringArrayAdapter);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1=  name.getText().toString();
                data.add(name1);
                name.setText("");
                stringArrayAdapter.notifyDataSetChanged();


            }
        });


    }
}