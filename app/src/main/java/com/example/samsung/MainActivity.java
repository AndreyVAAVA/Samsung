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
    static String true_login = "randommail@samsung.com";
    static String true_password = "Random1234";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText_log = (EditText) findViewById(R.id.editText_log);
        EditText editText_pswd = (EditText) findViewById(R.id.editText_pswd);
        Button button = (Button) findViewById(R.id.btn);;
        TextView result = (TextView) findViewById(R.id.result);

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
            String login = editText_log.getText().toString().toLowerCase();
            String password = editText_pswd.getText().toString();
            if((login.equals(true_login)) && (password.equals(true_password))){
                result.setText("Верно");
                result.setBackgroundResource(R.color.green);
            } else{
                result.setText("Вы ошиблись в логине или пароле");
                result.setBackgroundResource(R.color.red);
                editText_log.setText("");
                editText_pswd.setText("");
            }
        });
    }
}