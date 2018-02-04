package com.example.android.quizapp;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private int correct = 0, incorrect = 0, score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * this method is called for answer 1 calculations.
     */
    public void answer1(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.ans11:
                if (checked) {
                    correct += 1;
                    score += 1;
                    Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.ans12:
                if (checked) {
                    incorrect += 1;
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.ans13:
                if (checked) {
                    incorrect += 1;
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.ans14:
                if (checked) {
                    incorrect += 1;
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
                break;
        }
        ((RadioButton) view).setChecked(false);
        findViewById(R.id.ans11).setEnabled(false);
        findViewById(R.id.ans12).setEnabled(false);
        findViewById(R.id.ans13).setEnabled(false);
        findViewById(R.id.ans14).setEnabled(false);
    }

    /**
     * this method is called for answer 2 calculations.
     */
    public void answer2(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.ans21:
                if (checked) {
                    incorrect += 1;
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.ans22:
                if (checked) {
                    incorrect += 1;
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.ans23:
                if (checked) {
                    correct += 1;
                    score += 1;
                    Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.ans24:
                if (checked) {
                    incorrect += 1;
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
                break;
        }
        ((RadioButton) view).setChecked(false);
        findViewById(R.id.ans21).setEnabled(false);
        findViewById(R.id.ans22).setEnabled(false);
        findViewById(R.id.ans23).setEnabled(false);
        findViewById(R.id.ans24).setEnabled(false);
    }

    /**
     * this method is called for answer 3 calculations.
     */
    public void answer3(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.ans31:
                if (checked) {
                    incorrect += 1;
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.ans32:
                if (checked) {
                    correct += 1;
                    score += 1;
                    Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.ans33:
                if (checked) {
                    incorrect += 1;
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.ans34:
                if (checked) {
                    incorrect += 1;
                    Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
                }
                break;
        }
        ((RadioButton) view).setChecked(false);
        findViewById(R.id.ans31).setEnabled(false);
        findViewById(R.id.ans32).setEnabled(false);
        findViewById(R.id.ans33).setEnabled(false);
        findViewById(R.id.ans34).setEnabled(false);
    }

    /**
     * this method is called for answer 4 calculations.
     */
    public void answer4(View view) {
        CheckBox check1 = findViewById(R.id.ans41);
        CheckBox check2 = findViewById(R.id.ans42);
        CheckBox check3 = findViewById(R.id.ans43);
        CheckBox check4 = findViewById(R.id.ans44);
        if (check3.isChecked() && check4.isChecked() && !check1.isChecked() && !check2.isChecked()) {
            correct += 1;
            score += 1;
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        } else {
            incorrect += 1;
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
        }
        check1.setChecked(false);
        check2.setChecked(false);
        check3.setChecked(false);
        check4.setChecked(false);
        findViewById(R.id.ans41).setEnabled(false);
        findViewById(R.id.ans42).setEnabled(false);
        findViewById(R.id.ans43).setEnabled(false);
        findViewById(R.id.ans44).setEnabled(false);
        findViewById(R.id.done4).setEnabled(false);
    }

    /**
     * this method is called for answer 5 calculations.
     */
    public void answer5(View view) {
        CheckBox check1 = findViewById(R.id.ans51);
        CheckBox check2 = findViewById(R.id.ans52);
        CheckBox check3 = findViewById(R.id.ans53);
        CheckBox check4 = findViewById(R.id.ans54);
        if (check3.isChecked() && check4.isChecked() && check1.isChecked() && !check2.isChecked()) {
            correct += 1;
            score += 1;
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        } else {
            incorrect += 1;
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
        }
        check1.setChecked(false);
        check2.setChecked(false);
        check3.setChecked(false);
        check4.setChecked(false);
        findViewById(R.id.ans51).setEnabled(false);
        findViewById(R.id.ans52).setEnabled(false);
        findViewById(R.id.ans53).setEnabled(false);
        findViewById(R.id.ans54).setEnabled(false);
        findViewById(R.id.done5).setEnabled(false);
    }

    /**
     * this method called for answer 6 calculations.
     */
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    public void answer6(View v) {
        EditText ans6 = findViewById(R.id.ans61);
        String ans61 = ans6.getText().toString();
        if (Objects.equals(ans61, "ARGENTINA")) {
            correct += 1;
            score += 1;
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        } else {
            incorrect += 1;
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
        }
        ans6.getText().clear();
        findViewById(R.id.ans61).setEnabled(false);
        findViewById(R.id.done6).setEnabled(false);
    }


    /**
     * this method is called when submit button is clicked.
     */
    public void submitScore(View view) {
        String message = ("Correct Answers : " + correct + "\nIncorrect Answers : " + incorrect + "\nTotal score : " + score);
        displayScore(message);
    }

    /**
     * this method is to display result.
     *
     * @param score is the final string.
     */
    public void displayScore(String score) {
        TextView scoreDisplay = findViewById(R.id.result);
        scoreDisplay.setText(score);
        Toast.makeText(this, score, Toast.LENGTH_SHORT).show();
    }

    /**
     * this method is called when reset button is pressed.
     */
    public void resetScore(View v) {
        score = 0;
        correct = 0;
        incorrect = 0;
        String message = ("Correct Answers : " + correct + "\nIncorrect Answers : " + incorrect + "\nTotal score : " + score);
        displayScore(message);

        findViewById(R.id.ans11).setEnabled(true);
        findViewById(R.id.ans12).setEnabled(true);
        findViewById(R.id.ans13).setEnabled(true);
        findViewById(R.id.ans14).setEnabled(true);
        findViewById(R.id.ans21).setEnabled(true);
        findViewById(R.id.ans22).setEnabled(true);
        findViewById(R.id.ans23).setEnabled(true);
        findViewById(R.id.ans24).setEnabled(true);
        findViewById(R.id.ans31).setEnabled(true);
        findViewById(R.id.ans32).setEnabled(true);
        findViewById(R.id.ans33).setEnabled(true);
        findViewById(R.id.ans34).setEnabled(true);
        findViewById(R.id.ans41).setEnabled(true);
        findViewById(R.id.ans42).setEnabled(true);
        findViewById(R.id.ans43).setEnabled(true);
        findViewById(R.id.ans44).setEnabled(true);
        findViewById(R.id.ans51).setEnabled(true);
        findViewById(R.id.ans52).setEnabled(true);
        findViewById(R.id.ans53).setEnabled(true);
        findViewById(R.id.ans54).setEnabled(true);
        findViewById(R.id.ans61).setEnabled(true);
        findViewById(R.id.done4).setEnabled(true);
        findViewById(R.id.done5).setEnabled(true);
        findViewById(R.id.done6).setEnabled(true);
    }
}
