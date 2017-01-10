package com.daniel.mycheckoutph;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

//HI ITS ME MARIO

public class loginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
    }

    public void loginClick(View logClick){
        EditText username = (EditText) findViewById(R.id.usernameTextEdit);
        EditText password = (EditText) findViewById(R.id.passwordTextEdit);

        boolean loginValid = isValid(username.getText().toString(),password.getText().toString());
        if(loginValid){
            Intent userPage = new Intent(this, userLayout.class);
            startActivity(userPage);
        }
        else{
            Toast.makeText(this, "Incorrect Username/Password", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean isValid(String username,String password){
        if(username.equals("admin") && password.equals("passwurd")) // equals object will be replaced by matching user's username and password stored in sqLite
            return true;
        else
            return false;
    }

    public void signUpClick(View signup){
        Intent clickSignup = new Intent(this, signUp.class);
        startActivity(clickSignup);
    }

}
