package awd.example.hamsafinal2023;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

import awd.example.hamsafinal2023.Data.AppDataBase;

public class Profile extends AppCompatActivity {
    private FloatingActionButton addnewdesign;
    private Button Designsmain;
    private Button Profilemain;
    private AutoCompleteTextView autoetsqorlines;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Designsmain=findViewById(R.id.Designsmain);
        Profilemain=findViewById(R.id.Profilemain);
        autoetsqorlines=findViewById(R.id.autoetsqorlines1);



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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==R.id.itemSettings)
        {
            Toast.makeText(this,"All ok",Toast.LENGTH_SHORT).show();
            //to open new activity from current to next activity

        }
        if (item.getItemId()==R.id.itemSignOut) {
            showYesNoDialog();
            Toast.makeText(this, "All ok", Toast.LENGTH_SHORT).show();
        }
        return true;
    }


    /**
     * بناء ديالوج
     */
    public void showYesNoDialog() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("SignOut");//تحديد العنوان
        builder.setMessage("Are you sure?"); //تحديد فحوى شباك الحوار
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //معالجة حدث للموافقة
                Toast.makeText(Profile.this, "Signing Out", Toast.LENGTH_SHORT).show();
                finish();


            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(Profile.this, "No Signing Out", Toast.LENGTH_SHORT).show();

            }
        });
        AlertDialog dialog = builder.create();//بناء شباك الحوار ديالوغ
        dialog.show();// عرض الشباك
    }

    private void autoshape()
    {
        //مؤشر لقاعدة البيانات
        AppDataBase db= AppDataBase.getDB(getApplicationContext());
        String [] sqrline={"Squares","Lines"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line);
        adapter.addAll(sqrline);
        autoetsqorlines.setAdapter(adapter);
        autoetsqorlines.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                autoetsqorlines.showDropDown();

            }
        });

    }




}