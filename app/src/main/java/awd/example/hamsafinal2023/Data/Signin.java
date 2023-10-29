package awd.example.hamsafinal2023.Data;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import awd.example.hamsafinal2023.R;

public class Signin extends AppCompatActivity {

    private Button btnsignin;
    private Button btnsignup;
    private TextInputEditText txtemail;
    private TextInputEditText txtpass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

        txtemail= findViewById(R.id.txtemail);
        txtpass= findViewById(R.id.txtpass);
        btnsignin= findViewById(R.id.btnsignin);
        btnsignup= findViewById(R.id.btnsignup);



    }


}
