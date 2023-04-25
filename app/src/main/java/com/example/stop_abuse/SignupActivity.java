package com.example.stop_abuse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignupActivity extends AppCompatActivity {
    EditText signupName,signupEmail,signupAddress,signupUsername,signupPassword;
    TextView loginRedirectText;
    Button signupButton;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;
    TextView signupDataToMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        signupName=findViewById(R.id.signup_name);
        signupEmail=findViewById(R.id.signup_email);
        signupAddress=findViewById(R.id.signup_address);
        signupUsername=findViewById(R.id.signup_username);
        signupPassword=findViewById(R.id.signup_password);
        signupButton=findViewById(R.id.signup_button);
        loginRedirectText=findViewById(R.id.loginRedirectText);

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firebaseDatabase=FirebaseDatabase.getInstance();
                reference=firebaseDatabase.getReference("users");

                String name = signupName.getText().toString();
                String email = signupEmail.getText().toString();
                String address = signupAddress.getText().toString();
                String username = signupUsername.getText().toString();
                String password = signupPassword.getText().toString();

                HelperClass helperClass = new HelperClass(name,email,address,username,password);
                reference.child(name).setValue(helperClass);

                Toast.makeText(SignupActivity.this, "Signup Successful", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
         // Change code from here START
//        signupDataToMain.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String name = signupName.getText().toString();
//                String email = signupEmail.getText().toString();
//                String address = signupAddress.getText().toString();
//                String username = signupUsername.getText().toString();
//                Intent intent = new Intent(SignupActivity.this,MainActivity.class);
//                 intent.putExtra("name",name);
//                 intent.putExtra("email",email);
//                 intent.putExtra("address",address);
//                 intent.putExtra("username",username);
//                 startActivity(intent);
//            }
//        });
           //to here only END


         loginRedirectText.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(SignupActivity.this,LoginActivity.class);
                 startActivity(intent);
             }
         });
    }
}