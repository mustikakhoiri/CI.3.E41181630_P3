package com.example.coba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivityConstraint extends AppCompatActivity {
    EditText name;
    Button bLogin;

    private String KEYNAME = "USERNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_constraint);

        //inisialisasi
        name = (EditText)findViewById(R.id.uname);
        bLogin = (Button)findViewById(R.id.btn_login);

        //function tombol
        bLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String nama = name.getText().toString();
                    if (nama != null && !nama.isEmpty() && !nama.equals("null")){
                        Intent i = new Intent( MainActivityConstraint.this, MainActivityFrame.class);
                        i.putExtra(KEYNAME, nama);
                        startActivity(i);
                    }else{
                        Toast.makeText(getApplicationContext(), "PLEASE FILL YOUR USERNAME", Toast.LENGTH_SHORT).show();
                    }
                }catch (Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "ERROR, TRY AGAIN!", Toast.LENGTH_SHORT);
                }
            }
        });
    }
}
