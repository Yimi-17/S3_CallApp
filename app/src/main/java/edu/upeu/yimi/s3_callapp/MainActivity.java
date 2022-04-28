package edu.upeu.yimi.s3_callapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    Button buttonCall;
    EditText txtPhone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonCall=findViewById(R.id.btnCall);
        txtPhone=findViewById(R.id.txtPhone);

        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String phone;
                phone=txtPhone.getText().toString();
                Intent intent=new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+ txtPhone.getText().toString()));
                startActivity(intent);

            }




        });
    }
}