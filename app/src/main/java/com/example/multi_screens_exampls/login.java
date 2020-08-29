package com.example.multi_screens_exampls;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity implements  View.OnClickListener {
    EditText editText , editText2;
    Button button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        intial_view();


    }

    private void intial_view() {
        editText = findViewById(R.id.edit1);
        editText2 = findViewById(R.id.edit2);

        button2 = findViewById(R.id.btn2);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btn2:
                if(! (editText.getText().toString().equalsIgnoreCase("tammem@gmail.com"))){
                    Toast.makeText(this,"من فضلك ادخل الاسم",Toast.LENGTH_LONG).show();
                    break;
                }

                else if (!(editText2.getText().toString().equalsIgnoreCase("12345"))){

                    Toast.makeText(this,  "من فضلك ادخل كلمة المرور"   , Toast.LENGTH_LONG).show();
                    break;
                }
                else {



                    Intent intent = new Intent(login.this , MainActivity.class);
                    intent .putExtra("username",editText.getText().toString());
                    intent .putExtra("password",editText2.getText().toString());



                    startActivity(intent);

                }




        }
    }


}
