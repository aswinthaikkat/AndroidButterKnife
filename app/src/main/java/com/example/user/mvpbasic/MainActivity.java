package com.example.user.mvpbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.firstName)  EditText firstName;
    @BindView(R.id.lastName)   EditText lastName;
    @BindView(R.id.DisplayHolder)  TextView displayHolder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.submitButton)
    public void Hello() {
        String str1 = firstName.getText().toString();
        String str2 = lastName.getText().toString();
        if(str1 != null && !str1.isEmpty() && str2 != null && !str2.isEmpty())
        {displayHolder.setText("You have entered " + lastName.getText().toString()+ " " + firstName.getText().toString() );}
        else
        {Toast.makeText(getApplicationContext(),"Enter Names", Toast.LENGTH_SHORT).show();}

    }






}
