package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import id.ac.polinema.intent.model.user;

import static id.ac.polinema.intent.ParcelableActivity.USER_KEY;

public class ProfileParcelableActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);
        // TODO: bind here


        Bundle extras = getIntent().getExtras();
        if (extras != null) {

            user use = extras.getParcelable(USER_KEY);

            String username = use.getUsername();
            String name = use.getName();
            int age = use.getAge();

            usernameText.setText(username);
            nameText.setText(name);
            ageText.setText(String.valueOf(age));
            // TODO: display value here
        }
    }
}
