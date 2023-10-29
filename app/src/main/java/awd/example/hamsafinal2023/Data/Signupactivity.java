package awd.example.hamsafinal2023.Data;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import awd.example.hamsafinal2023.R;

public class Signupactivity extends AppCompatActivity {

    private TextInputEditText ETemail;
    private TextInputEditText ETpass;
    private TextInputEditText ETrepass;
    private TextInputEditText ETname;
    private TextInputEditText ETphone;
    private Button btnsave;
    private Button btncancel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        ETemail= findViewById(R.id.ETemail);
        ETpass=findViewById(R.id.ETpass);
        ETrepass= findViewById(R.id.ETrepass);
        ETname= findViewById(R.id.ETname);
        ETphone=findViewById(R.id.ETphone);
        btnsave=findViewById(R.id.btnsave);
        btncancel=findViewById(R.id.btncancel);
    }




}
