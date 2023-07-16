package ir.amirhossein.ma_movie;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        SharedPreferences pref = getSharedPreferences( "MA_Movie",MODE_PRIVATE );
        Boolean isLogin = pref.getBoolean( "is_Login", false);

        if (isLogin) {
            goMain();
        } else {
            goLogin();
        }

    }

    private void goMain() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashActivity.this, LoginSignInActivity.class);
                startActivity(intent);
                finish();
            }
        }, 1000);
    }

    private void goLogin() {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashActivity.this, LoginSignInActivity.class);
                startActivity(intent);
                finish();
            }
        }, 1000);
    }
}
