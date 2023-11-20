package awd.example.hamsafinal2023;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Profile extends AppCompatActivity {
    private FloatingActionButton addnewdesign;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        addnewdesign=findViewById(R.id.addnewdesign);
        addnewdesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //to open new activity from current to next activity
                Intent i= new Intent(Profile.this,  EngText.class);
                startActivity(i);

            }
        });




    }
}