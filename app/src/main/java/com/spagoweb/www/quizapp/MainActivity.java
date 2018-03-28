package com.spagoweb.www.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } //onCreate

    //initialize score
    int score = 0;

    //on submit, check answer and display total score
    public void submitAnswers(View view) {

        //Question One
        RadioButton right_left = (RadioButton) findViewById(R.id.right_left);
        boolean RightLeft = right_left.isChecked();

        RadioButton left_right = (RadioButton) findViewById(R.id.left_right);
        boolean LeftRight = left_right.isChecked();

        if (RightLeft) {
            score += 5;
        } else if (LeftRight) {
            score += 0;
        }

        //Question Two
        RadioButton woman = (RadioButton) findViewById(R.id.woman);
        boolean Woman = woman.isChecked();

        RadioButton dog = (RadioButton) findViewById(R.id.dog);
        boolean Dog = dog.isChecked();

        RadioButton nothing = (RadioButton) findViewById(R.id.nothing);
        boolean Nothing = nothing.isChecked();

        if (Nothing) {
            score += 5;
        } else if (Dog || Woman) {
            score += 0;
        }

        //Question Three
        CheckBox winry = (CheckBox) findViewById(R.id.winry);
        boolean Winry = winry.isChecked();

        CheckBox edward = (CheckBox) findViewById(R.id.edward);
        boolean Edward = edward.isChecked();

        CheckBox mustang = (CheckBox) findViewById(R.id.mustang);
        boolean Mustang = mustang.isChecked();

        CheckBox alphonse = (CheckBox) findViewById(R.id.alphonse);
        boolean Alphonse = alphonse.isChecked();

        if (Edward && Alphonse) {
            score += 5;
        } else {
            score += 0;
        }

        //Question Four
        EditText hair_color = (EditText) findViewById(R.id.hair_color);
        String HairColor = hair_color.getText().toString();
        if (HairColor.equals("Violet") || HairColor.equals("violet")) {
            score += 5;
        } else if ((HairColor == null) || (!HairColor.equals("Violet")) || (!HairColor.equals("violet"))) {
            score += 0;
        }

        //Question Five
        CheckBox kenshiro = (CheckBox) findViewById(R.id.kenshiro);
        boolean Kenshiro = kenshiro.isChecked();

        CheckBox hyo = (CheckBox) findViewById(R.id.hyo);
        boolean Hyo = hyo.isChecked();

        CheckBox raoul = (CheckBox) findViewById(R.id.raoul);
        boolean Raoul = raoul.isChecked();

        if (Kenshiro && Raoul) {
            score += 5;
        } else {
            score += 0;
        }

        //Question Six
        RadioButton mao_dante = (RadioButton) findViewById(R.id.mao_dante);
        boolean MaoDante = mao_dante.isChecked();

        RadioButton devilman = (RadioButton) findViewById(R.id.devilman);
        boolean Devilman = devilman.isChecked();

        RadioButton jojo = (RadioButton) findViewById(R.id.jojo);
        boolean JoJo = jojo.isChecked();

        if (MaoDante) {
            score += 5;
        } else if (Devilman || JoJo) {
            score += 0;
        }

        //Display toast score
        Toast.makeText(getApplicationContext(), "Your total score is " + score, Toast.LENGTH_LONG).show();

        // Reset score each submit to retry
        score = 0;

    } //submitAnswers
} //AppCompatActivity