package awd.example.hamsafinal2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.Toast;

import awd.example.hamsafinal2023.R;

public class MainActivity extends AppCompatActivity {

    private SearchView Designs_search;
    private Button Designsmain;
    private Button Profilemain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Designs_search=findViewById(R.id.Designs_search);
        Designsmain=findViewById(R.id.Designsmain);
        Profilemain=findViewById(R.id.Profilemain);






    }












    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("hamsa","onRestart");
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("hamsa","onPause");
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("hamsa","onStart");
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("hamsa","onStart");
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("hamsa","onStart");
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("hamsa","onStart");
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();

    }
}