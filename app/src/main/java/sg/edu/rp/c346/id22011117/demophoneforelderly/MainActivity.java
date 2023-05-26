package sg.edu.rp.c346.id22011117.demophoneforelderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String PETER_PHONE_NUMBER = "92240336";
    private static final String MARY_PHONE_NUMBER = "89675543";

    private Button callSonButton;
    private Button callDaughterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callSonButton = findViewById(R.id.buttonCallSon);
        callDaughterButton = findViewById(R.id.buttonCallDaughter);

        callSonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialPhoneNumber(PETER_PHONE_NUMBER);
            }
        });

        callDaughterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialPhoneNumber(MARY_PHONE_NUMBER);
            }
        });
    }

    private void dialPhoneNumber(String phoneNumber) {
        Intent dialIntent = new Intent(Intent.ACTION_DIAL);
        dialIntent.setData(Uri.parse("tel:" + phoneNumber));
        startActivity(dialIntent);
    }
}

