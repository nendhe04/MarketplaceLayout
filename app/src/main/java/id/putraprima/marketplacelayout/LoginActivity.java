package id.putraprima.marketplacelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button btnProviderRegister, btnBackLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnProviderRegister = findViewById(R.id.btnProviderRegister);
        btnBackLogin = findViewById(R.id.btnBackLogin);

        btnProviderRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });

        btnBackLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            }
        });
    };
}
