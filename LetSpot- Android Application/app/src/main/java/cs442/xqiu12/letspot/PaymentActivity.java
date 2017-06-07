package cs442.xqiu12.letspot;

import android.content.Intent;
import android.media.session.MediaSession;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.common.ErrorDialogFragment;


public class PaymentActivity extends FragmentActivity {

    public static final String PUBLISHABLE_KEY = "pk_test_6pRNASCoBOKtIshFeQd4XMUh";


    private ProgressDialogFragment progressFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_payment);
    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_map:
                Intent intent_m = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent_m);
                finish();
                break;
            case R.id.button_reservation:
                Intent intent_r = new Intent(getApplicationContext(), ReservationActivity.class);
                startActivity(intent_r);
                finish();
                break;
            case R.id.button_payment:
                Intent intent_p = new Intent(getApplicationContext(), PaymentActivity.class);
                startActivity(intent_p);
                finish();
                break;
            case R.id.button_us:
                Intent intent_u = new Intent(getApplicationContext(), SpotActivity.class);
                startActivity(intent_u);
                finish();
                break;
            case R.id.Change_Card:
                Intent intent_po = new Intent(getApplicationContext(), PaymentOptions.class);
                startActivity(intent_po);
                finish();
                break;
            case R.id.button_pay:
                Intent intent_pay = new Intent(getApplicationContext(), PaymentOptions.class);
                startActivity(intent_pay);
                finish();
                break;
        }
    }
}