package id.putraprima.marketplacelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static id.putraprima.marketplacelayout.R.*;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        btnLogin = findViewById(id.btnProvider);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });
    }

}
