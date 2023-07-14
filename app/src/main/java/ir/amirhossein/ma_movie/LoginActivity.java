package ir.amirhossein.ma_movie;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class LoginActivity extends Activity {

    boolean isShowPassword = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageView ivShowPassword = findViewById(R.id.iv_show_password);

        EditText etPassword = findViewById(R.id.et_password);

        ivShowPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isShowPassword) {
                    ivShowPassword.setImageResource(R.drawable.ice_eye);
                    etPassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                } else {
                    ivShowPassword.setImageResource(R.drawable.ic_eye_off);
                    etPassword.setInputType(InputType.TYPE_CLASS_TEXT) ;
                }

                isShowPassword = !isShowPassword;

            }
        });
        Button btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginActivity.this, LoginSignInActivity.class);
                startActivity(intent);
                finish();

            }
        });

        }
    }

