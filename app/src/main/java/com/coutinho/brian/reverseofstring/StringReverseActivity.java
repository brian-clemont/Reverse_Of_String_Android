package com.coutinho.brian.reverseofstring;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StringReverseActivity extends AppCompatActivity implements View.OnClickListener {
private Button reverse;
    private EditText input_string;
    private TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_reverse);

        input_string = (EditText)findViewById(R.id.input_string);
        reverse = (Button) findViewById(R.id.reverse_button);
        output =(TextView)findViewById(R.id.output);
        reverse.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String original = input_string.getText().toString().trim();
        String reverse="";
            int length = original.length();
        for(int i=length-1;i>=0;i--){
            reverse = reverse+original.charAt(i);
        }
        output.setText(reverse);

    }
}
