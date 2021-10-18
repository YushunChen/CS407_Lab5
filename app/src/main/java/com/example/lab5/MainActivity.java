package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void onButtonClick(View view) {
        EditText usernameTextField = (EditText) findViewById(R.id.username);
        String str = usernameTextField.getText().toString();
        goToLoginActivity(str);
        Log.i("Info,", "Button pressed");
    }

    public void goToLoginActivity(String s) {
        Intent intent = new Intent(this, LoginActivity.class);
        intent.putExtra("username", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}