package cs442.xqiu12.letspot;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class ValidateCreditCard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validate_credit_card);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.add_correctCard:
                Intent intent_m = new Intent(getApplicationContext(), PaymentActivity.class);
                Toast.makeText(getApplicationContext(), "CreditCardAdded", Toast.LENGTH_LONG);
                startActivity(intent_m);
                finish();
                break;
        }
    }

}
