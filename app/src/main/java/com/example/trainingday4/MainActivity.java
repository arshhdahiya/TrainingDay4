package com.example.trainingday4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends Activity {

    private Map<String, String> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hardcoded usernames and passwords
        users = new HashMap<>();
        users.put("user1", "password1");
        users.put("user2", "password2");
        users.put("user3", "password3");
    }

    public void login(View view) {
        EditText usernameEditText = findViewById(R.id.usernameEditText);
        EditText passwordEditText = findViewById(R.id.passwordEditText);
        TextView resultTextView = findViewById(R.id.resultTextView);

        String enteredUsername = usernameEditText.getText().toString();
        String enteredPassword = passwordEditText.getText().toString();

        if (isValidUser(enteredUsername, enteredPassword)) {
            resultTextView.setText("Login successful");
        } else {
            resultTextView.setText("You are not a valid user");
        }
    }

    private boolean isValidUser(String username, String password) {
        // Check if the entered username and password match any of the hardcoded values
        return users.containsKey(username) && users.get(username).equals(password);
    }
}
