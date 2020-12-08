package com.example.samsung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.ContactsContract.Intents.Insert.ACTION;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText_a = (EditText) findViewById(R.id.a);
        EditText editText_b = (EditText) findViewById(R.id.b);
        EditText editText_c = (EditText) findViewById(R.id.c);
        Button button = (Button) findViewById(R.id.result);;
        TextView textView_1 = (TextView) findViewById(R.id.X_1);
        TextView textView_2 = (TextView) findViewById(R.id.X_2);

        /*editText_a.addTextChangedListener(new TextWatcher() {

            public void afterTextChanged(Editable s) {

            }

            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText(s);
            }
        });*/
        button.setOnClickListener((View.OnClickListener) v -> {
            int a = Integer.parseInt(editText_a.getText().toString());
            int b = Integer.parseInt(editText_b.getText().toString());
            int c = Integer.parseInt(editText_c.getText().toString());
            double discr = ((b*b) - (4*a*c));
            double x_1 = (((-b) + Math.sqrt(discr)) / (2*a));
            double x_2 = (((-b) - Math.sqrt(discr)) / (2*a));
            String x1 = String.valueOf(x_1);
            String x2 = String.valueOf(x_2);
            // Обработка нажатия
            if(a == 0 && b == 0) {
                textView_1.setText("(-беск;беск)");
                textView_2.setText("(-беск;беск)");
            } else if((a == 0 && b != 0 && c == 0) || (a != 0 && b == 0 && c == 0)){
                textView_1.setText("0");
                textView_2.setText("0");
            } else {
                textView_1.setText(x1);
                textView_2.setText(x2);
            }
        });
    }
}