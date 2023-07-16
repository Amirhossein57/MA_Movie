package ir.amirhossein.ma_movie;

import android.app.Activity;

public class HomeAtivity extends Activity {
    @Override
    protected void onChildTitleChanged(Activity childActivity, CharSequence title) {
        super.onChildTitleChanged(childActivity, title);
        setContentView(R.layout.activity_home);
    }

}
