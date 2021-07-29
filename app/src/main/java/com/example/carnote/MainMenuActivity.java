package com.example.carnote;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Okno menu głównego
 */

public class MainMenuActivity extends AppCompatActivity {

    private Button goToTankFormButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_layout);
        goToTankFormButton = (Button) findViewById(R.id.go_to_tank_form_button);

        goToTankFormButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenuActivity.this, GasTankUpActivity.class);
                intent.putExtra("SPECIAL_DATA", "Dodatkowe Dane");
                startActivity(intent);
            }
        });

    }
}
