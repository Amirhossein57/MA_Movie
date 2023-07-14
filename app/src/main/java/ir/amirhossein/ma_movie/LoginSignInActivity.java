package ir.amirhossein.ma_movie;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class LoginSignInActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_sign_in);

        Button btnSignInLogin = findViewById(R.id.btn_sign_in_login);

        btnSignInLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginSignInActivity.this, SigninActivity.class);
                startActivity(intent);
            }
        });

        Button btnLoginSignIn = findViewById(R.id.btn_login_sign_in);

        btnLoginSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginSignInActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

}



