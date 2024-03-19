package com.example.worldskillsbank;

import static androidx.core.content.ContextCompat.startActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class CustonDialog extends Dialog {
    Boolean log_status = false;
    public CustonDialog(@NonNull Context context) {
        super(context);
    }
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_layout);

        EditText login_field = findViewById(R.id.editTextText);
        EditText password_field = findViewById(R.id.editTextText2);
        Button btn_login = findViewById(R.id.button5);
        Button btn_cancel = findViewById(R.id.button);

        btn_login.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(login_field.getText().toString().equals("admin") && password_field.getText().toString().equals("admin"))
                        {
                            log_status = true;

                            CustonDialog.this.hide();
                        }
                        else
                        {
                            Toast.makeText(getContext(), R.string.incorrect_login_data, Toast.LENGTH_SHORT).show();
                            log_status = false;
                        }
                    }
                }
        );

        btn_cancel.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        CustonDialog.this.hide();
                    }
                }
        );
    }
}
