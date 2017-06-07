package cs442.xqiu12.letspot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;


public class PaymentOptions extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_options);


    }
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.add_creditCard:
                Intent intent_m = new Intent(getApplicationContext(), ValidateCreditCard.class);
                startActivity(intent_m);
                finish();
                break;
        }
    }


}
