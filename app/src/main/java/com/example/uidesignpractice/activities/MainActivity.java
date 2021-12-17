package com.example.uidesignpractice.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.uidesignpractice.R;
import com.example.uidesignpractice.models.Account;
import com.example.uidesignpractice.models.AccountList;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    public static boolean isHidePassword = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        List<Account> accountList = new ArrayList<Account>();
        AccountList.addAccount("admin","giang");
        AccountList.addAccount("HVGiang86","Einstein@86");
        AccountList.addAccount("giangAcount","password");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etUsername = findViewById(R.id.main_activity_et_username);
        EditText etPassword = findViewById(R.id.main_activity_et_password);
        Button loginButton = findViewById(R.id.main_activity_bt_login);
        Button nextActivity = findViewById(R.id.main_activity_bt_switch_activity);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etUsername.getText().toString();
                String password = etPassword.getText().toString();


                if (AccountList.isExistAccount(username,password)) {
                    Toast.makeText(getApplicationContext(),"Login Successfully!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(),"Login failed! Wrong username or password!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        nextActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}