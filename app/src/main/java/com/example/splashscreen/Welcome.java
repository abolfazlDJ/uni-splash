package com.example.splashscreen;
import android.os.Bundle;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class Welcome extends AppCompatActivity {

    private TextView showName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.welcome);

        showName = findViewById(R.id.show_name);
        String userName = getIntent().getStringExtra("USER_NAME");
        showName.setText("Welcome" + userName);
    }
}