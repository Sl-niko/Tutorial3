package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
            private EditText num1, num2;
            private Button add,sub,devi,multi;
            private TextView viewresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        num1 = findViewById(R.id.AnsNum1);
        num2 = findViewById(R.id.AnsNum2);
       add= findViewById(R.id.btnadd);
       sub = findViewById(R.id.btnsub);
        multi= findViewById(R.id.btnmulti);
        devi = findViewById(R.id.btndevi);
       viewresult= findViewById(R.id.textViewAns);

        String number1 = getIntent().getStringExtra("keynum1");
        String number2 = getIntent().getStringExtra("keynum2");

        num1.setText(number1);
        num2.setText(number2);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(num1.getText().toString().length()==0){

                    num1.setText("0");
                }
                if(num2.getText().toString().length()==0){

                    num2.setText("0");
                }


                int numbe1 = Integer.parseInt(num1.getText().toString()) ;
                int numbe2 =Integer.parseInt(num2.getText().toString());

                int sum = numbe1+numbe2;
                viewresult.setText(numbe1+"+"+numbe2+ "=" +sum);

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(num1.getText().toString().length()==0){

                    num1.setText("0");
                }
                if(num2.getText().toString().length()==0){

                    num2.setText("0");
                }


                int numbe1 = Integer.parseInt(num1.getText().toString()) ;
                int numbe2 =Integer.parseInt(num2.getText().toString());

                int sub=numbe1-numbe2;

                viewresult.setText(numbe1+"-"+numbe2+ "=" +sub);
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numbe1 = Integer.parseInt(num1.getText().toString()) ;
                int numbe2 =Integer.parseInt(num2.getText().toString());

                int multi = numbe1* numbe2;
                viewresult.setText(numbe1+"*"+numbe2+ "=" +multi);
            }
        });

        devi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numbe1 = Integer.parseInt(num1.getText().toString()) ;
                int numbe2 =Integer.parseInt(num2.getText().toString());

                int devis = numbe1/numbe2;

                viewresult.setText(numbe1+"/"+numbe2+ "=" +devis);
            }
        });

    }
}