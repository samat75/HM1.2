package com.example.hm12;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    public static final String KEY = "key";
    public String s = "key";
    private EditText edittext, editText2, editText3;
    private Button button;
    private double res;
    double edit1;
    double edit2;
    double edit3;
    private String edt1;
    private String edt2;
    private String edt3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        edittext = findViewById(R.id.edtTxt);
        editText2 = findViewById(R.id.edtTxt2);
        editText3 = findViewById(R.id.edtTxt3);
        button = findViewById(R.id.btn);

 ;

        edittext.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() != 0) {
                    edit1 = Double.parseDouble(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() != 0) {
                    edit2 = Double.parseDouble(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        editText3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() != 0) {
                    edit3 = Double.parseDouble(s.toString());
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        textView = findViewById(R.id.txtView);
        if (!edt1.equals("") && !edt2.equals("") && !edt3.equals("")) {
            edit1 = Double.parseDouble(edt1);
            edit2 = Double.parseDouble(edt2);
            edit3 = Double.parseDouble(edt3);
        } else {
            Toast.makeText(this, "впольнит все поля!!!", Toast.LENGTH_SHORT).show();
            return;
        }
    }
    protected void  onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        res = edit1 + edit2 + edit3;
        outState.putDouble(KEY, res);
    }
    protected void  onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        textView.setText(String.valueOf(savedInstanceState.getDouble(KEY)));
    }
}

