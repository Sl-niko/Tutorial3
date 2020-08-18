package com.example.intentsproj;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
        private EditText num1,num2;
        private Button ok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
         num1 = findViewById(R.id.num1input);
         num2 = findViewById(R.id.num2input);
         ok = findViewById(R.id.OKbtn);

         ok.setOnClickListener(new View.OnClickListener() {
             @Override

             public void onClick(View view) {
                 String number1 = num1.getText().toString();
                 String number2 = num2.getText().toString();


                 Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                 intent.putExtra("keynum1",number1);
                 intent.putExtra("keynum2",number2);
                 startActivity(intent);


                 Toast.makeText(FirstActivity.this,"You just clicked the OK button",Toast.LENGTH_SHORT).show();


             }


         });
    }





}