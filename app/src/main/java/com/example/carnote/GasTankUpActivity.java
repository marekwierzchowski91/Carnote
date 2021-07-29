package com.example.carnote;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.text.DateFormat;
import java.util.Date;

public class GasTankUpActivity extends AppCompatActivity {

    private EditText dateEditText;
    private EditText mileageEditText;
    private EditText litersEditText;
    private EditText costEditText;

    private Button confirmButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gas_tank_up_layout);
        dateEditText = (EditText) findViewById(R.id.date);
        mileageEditText = (EditText) findViewById(R.id.mileage);
        litersEditText = (EditText) findViewById(R.id.liters);
        costEditText = (EditText) findViewById(R.id.cost);


        dateEditText.setText(getCurrentDate());

        confirmButton = (Button) findViewById(R.id.confirm);

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GasTankUpActivity.this, getOneLiterCost(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private String getOneLiterCost() {
        return String.valueOf(Double.valueOf(costEditText.getText().toString())/Double.valueOf(litersEditText.getText().toString()));
    }


    private String getCurrentDate() {
        DateFormat dateFormat = DateFormat.getDateInstance();
        Date date = new Date();
        return dateFormat.format(date);
    }
}
