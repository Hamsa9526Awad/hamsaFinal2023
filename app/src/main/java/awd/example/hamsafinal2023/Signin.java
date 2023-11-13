package awd.example.hamsafinal2023;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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

    public void onClicksignup (View v)
    {
        //to open new activity from current to next activity
        Intent i= new Intent(Signin.this,   Signupactivity.class);
        startActivity(i);

    }

    public void onClicksignin (View v)
    {
        checkEmailPass();



    }

    private void checkEmailPass()
    {
        boolean isAllOk=true; // يحوي نتيجة فحص الحقول ان كانت سليمة

        // استخراج النص من حقل الايميل
        String email= txtemail.getText().toString();

        // استخراج نص كلمة المرور
        String pass=txtpass.getText().toString();

        // فحص الايميل ان كان طوله أقل من 6 أو لا يحتوي على @ فهو خاطئ
        if (email.length()<6 || email.contains("@")== false)
        {
            // تعديل المتغير ليدل على أن الفحص يعطي نتيجة خاطئة
            isAllOk=false;
            // عرض ملاحظة خطأ على الشاشة داخل حقل البريد
            txtemail.setError("wrong email");
        }
        if (pass.length()<8 || pass.contains(" ")== true)
        {
            isAllOk=false;
            txtpass.setError("Wrong password");
        }


        if (isAllOk)
        {
            Toast.makeText(this,"All ok",Toast.LENGTH_SHORT).show();

        }
    }







}
