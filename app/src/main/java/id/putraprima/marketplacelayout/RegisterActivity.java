package id.putraprima.marketplacelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {

    Button btnNext, btnBackRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnNext = findViewById(R.id.btnNext);
        btnBackRegister = findViewById(R.id.btnBackRegister);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(RegisterActivity.this, ProfileActivity.class));
            }
        });

        btnBackRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(RegisterActivity.this, LoginActivity.class));
            }
        });
    }
}
