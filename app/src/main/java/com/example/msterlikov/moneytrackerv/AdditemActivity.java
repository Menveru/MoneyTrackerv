package com.example.msterlikov.moneytrackerv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class AdditemActivity extends AppCompatActivity {

    private static final String TAG = "AdditemActivity";

    private EditText name;
    private EditText prace;
    private ImageButton addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additem);

        name = findViewById(R.id.name);
        prace = findViewById(R.id.prace);
        addBtn = findViewById(R.id.add_btn);

        name.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                Log.i(TAG, "afterTextChanged: " + s);

            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itemName = name.getText().toString();
                String itemPrace = prace.getText().toString();
            }
        });
    }
}
