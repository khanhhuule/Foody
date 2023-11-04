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

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        TextView tvLogin = findViewById(R.id.tvLogin);
        EditText edtFullName = findViewById(R.id.edtFullNameSignUp);
        EditText edtEmail = findViewById(R.id.edtEmailSignUp);
        EditText edtPassword = findViewById(R.id.edtPasswordSignUp);
        Button btnSignUp = findViewById(R.id.btnSignUp);
        Button btnSignUpFB = findViewById(R.id.btnLoginFacebook_SignUp);
        Button btnSignUpGoogle = findViewById(R.id.btnLoginGoogle_SignUp);

        tvLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUpActivity.this, LoginActivity.class));
            }
        });
    }
}