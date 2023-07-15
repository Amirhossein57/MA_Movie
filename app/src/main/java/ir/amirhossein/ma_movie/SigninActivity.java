package ir.amirhossein.ma_movie;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class SigninActivity extends Activity {

    boolean isShowPassword = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

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

        boolean isShowPassword1 = false;

        ImageView ivShowPassword1 = findViewById(R.id.iv1_show_password);

        EditText etPassword1 = findViewById(R.id.et1_password);

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




    }
}
