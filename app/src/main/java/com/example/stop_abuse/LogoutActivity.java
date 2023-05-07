//package com.example.stop_abuse;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//
//public class LogoutActivity extends AppCompatActivity {
//
//    TextView loginRedirectText;
//    Button logout;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
//
//        loginRedirectText=findViewById(R.id.loginRedirectText);
//
//        logout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(LogoutActivity.this, LoginActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        logout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(LogoutActivity.this,LoginActivity.class);
//                startActivity(intent);
//            }
//        });
//
//    }
//
//}
