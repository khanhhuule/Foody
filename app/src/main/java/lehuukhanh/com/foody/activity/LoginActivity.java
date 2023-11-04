package lehuukhanh.com.foody.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import lehuukhanh.com.foody.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ImageButton btnBack = findViewById(R.id.btnBack);
        EditText edtEmail = findViewById(R.id.edtEmailLogin);
        EditText edtPassword = findViewById(R.id.edtPasswordLogin);
        TextView tvForgot = findViewById(R.id.tvForgotPassword);
        TextView tvSignUp = findViewById(R.id.tvSignup);
        Button btnLogin = findViewById(R.id.btnLogin);
        Button btnLoginFacebook = findViewById(R.id.btnLoginFacebook_Login);
        Button btnLoginGoogle = findViewById(R.id.btnLoginGoogle_Login);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        tvSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, SignUpActivity.class));
            }
        });

    }
}