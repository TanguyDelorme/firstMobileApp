package com.example.tanguy.firstmobilapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditActivity extends AppCompatActivity {

    Button buttonValidate;
    EditText editTextName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        editTextName = findViewById(R.id.activity_main_plaintext_edit_name);
        buttonValidate = findViewById(R.id.activity_main_button_validate);
        buttonValidate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
    }

    private void saveData()
    {
        String name = editTextName.getText().toString();
        if (!name.isEmpty()){
            DataManager.getInstance().addItem(name);
        }else{
            Toast.makeText(this,
                    "Veuillez saisir votre nom",
                    Toast.LENGTH_SHORT).show();
        }


        finish();
    }
}
