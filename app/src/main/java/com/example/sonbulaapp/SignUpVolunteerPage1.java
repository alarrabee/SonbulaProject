package com.example.sonbulaapp;

import androidx.annotation.IdRes;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class SignUpVolunteerPage1 extends AppCompatActivity {
Button buttonBackSignup;
Button buttonNextSignupVolunteerPage2;
RadioGroup radioGroupMF;
RadioButton radioButton;
EditText passwordVolunteer,idVolunteer;
    boolean x=false;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_volunteer_page1);

        buttonBackSignup=findViewById(R.id.buttonBackSignUp);
        buttonBackSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBackSignup=new Intent(SignUpVolunteerPage1.this,SignUpPage.class);
                startActivity(intentBackSignup);
            }
        });
        passwordVolunteer=findViewById(R.id.passwordVolunteer);
        idVolunteer=findViewById(R.id.idVolunteer);


        radioGroupMF=(RadioGroup) findViewById(R.id.radioGroupMFD);
        radioGroupMF.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group,@IdRes int checkedId) {
                radioButton=findViewById(checkedId);
                switch (radioButton.getId())
                {

                    case R.id.radioButtonMale:
                    {
                        x=true;
                    }
                    case R.id.radioButtonFemale:
                    {
                        x=true;
                    }
                }
            }
        });
        buttonNextSignupVolunteerPage2=findViewById(R.id.buttonNextSignUpVolunteerPage2);
        buttonNextSignupVolunteerPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String id_Volunteer=idVolunteer.getText().toString();
                String pass_Volunteer=passwordVolunteer.getText().toString();

                if(id_Volunteer.equals("1937517"))
                {
                    if(pass_Volunteer.equals("0000"))
                    {
                        if(x)
                        {
                            Intent intentButtonNextSignUpVolunteerPage2 = new Intent(SignUpVolunteerPage1.this, SignUpVolunteerPage2.class);
                            startActivity(intentButtonNextSignUpVolunteerPage2);
                        }
                        {
                            openDialog("Please enter your gender");
                        }

                    }
                    else
                    {
                        passwordVolunteer.setError("please enter you pass");
                    }

                }
                else
                {

                    idVolunteer.setError("Pleass enter you id ");

                }


            }
        });
    }

    public void radioGroupisChecked()
    {
       

    }
    public void openDialog(String s)
    {
        Dialog Dia = new Dialog(s);
        Dia.show(getSupportFragmentManager(),"example dialog");

    }
}