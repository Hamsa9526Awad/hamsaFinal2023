package awd.example.hamsafinal2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import awd.example.hamsafinal2023.Data.Signin;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);



        //start next activity (screen) automatically  after period of time
        Handler h=new Handler();


        Runnable r=new Runnable()
        {
            @Override
            public void run()
            {
                //to open new activity from current to next
                Intent i= new Intent(SplashScreen.this, Signin.class);
                startActivity(i);
                //to close current activity
                finish();

            }
        };
        h.postDelayed(r,3000);
    }
}