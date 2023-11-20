package awd.example.hamsafinal2023;

import static awd.example.hamsafinal2023.Data.engLetters.Letters.v;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Profile extends AppCompatActivity {
    private FloatingActionButton addnewdesign;
    private Button Designsmain;
    private Button Profilemain;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Designsmain=findViewById(R.id.Designsmain);
        Profilemain=findViewById(R.id.Profilemain);



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

    public void onClickDesigns (View v)
    {
        //to open new activity from current to next activity
        Intent i= new Intent(Profile.this,  MainActivity.class);
        startActivity(i);

    }


}