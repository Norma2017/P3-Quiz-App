package com.example.android.p3_depressiontest_normacmartinez;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    MediaPlayer bird;
    Button btnHappy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the score button is clicked
     */

    public void score (View view) {
        int positiveDepressionAnswers = 0;
        int positiveDisease = 0;

        EditText nameField = findViewById(R.id.name_field);
        String Name = nameField.getText().toString();

        CheckBox checkBox1 = findViewById(R.id.CheckBox_Thiroide);
        boolean hasThiroide = checkBox1.isChecked();
        if (hasThiroide) {
            positiveDisease = positiveDisease + 1;
        } else {
            positiveDisease += 0;
        }

        CheckBox checkBox2 = findViewById(R.id.CheckBox_Diabetes);
        boolean hasDiabetes = checkBox2.isChecked();
        if (hasDiabetes) {
            positiveDisease = positiveDisease + 1;
        } else {
            positiveDisease += 0;
        }

        CheckBox checkBox3 = findViewById(R.id.CheckBox_Hbp);
        boolean hasHbp = checkBox3.isChecked();
        if (hasHbp) {
            positiveDisease = positiveDisease + 1;
        } else {
            positiveDisease += 0;
        }

        CheckBox checkBox4 = findViewById(R.id.CheckBox_Alcoholism);
        boolean hasAlcoholism = checkBox4.isChecked();
        if (hasAlcoholism) {
            positiveDisease = positiveDisease + 1;
        } else {
            positiveDisease += 0;
        }

        CheckBox checkBox5 = findViewById(R.id.CheckBox_Rheumatoid);
        boolean hasRheuma = checkBox5.isChecked();
        if (hasRheuma) {
            positiveDisease = positiveDisease + 1;
        } else {
            positiveDisease += 0;
        }

        CheckBox checkBox6 = findViewById(R.id.CheckBox_DrugAddiction);
        boolean hasAddiction = checkBox6.isChecked();
        if (hasAddiction) {
            positiveDisease = positiveDisease + 1;
        } else {
            positiveDisease += 0;
        }

        RadioButton button1nCheckBox = findViewById(R.id.button1n_CheckBox);
        boolean answerNo = button1nCheckBox.isChecked();
        if (answerNo) {
            positiveDepressionAnswers = positiveDepressionAnswers + 1;
        } else {
            positiveDepressionAnswers += 0;
        }

        RadioButton button2yCheckBox = findViewById(R.id.button2s_CheckBox);
        boolean answerYes = button2yCheckBox.isChecked();
        if (answerYes) {
            positiveDepressionAnswers = positiveDepressionAnswers + 1;
        } else {
            positiveDepressionAnswers += 0;
        }

        RadioButton button3sCheckBox = findViewById(R.id.button3s_CheckBox);
        boolean answerYes3 = button3sCheckBox.isChecked();
        if (answerYes3) {
            positiveDepressionAnswers = positiveDepressionAnswers + 1;
        } else {
            positiveDepressionAnswers += 0;
        }

        RadioButton button4sCheckBox = findViewById(R.id.button4s_CheckBox);
        boolean answerYes4;
        (answerYes4) = button4sCheckBox.isChecked();
        if (answerYes4) {
            positiveDepressionAnswers = positiveDepressionAnswers + 1;
        } else {
            positiveDepressionAnswers += 0;
        }

        RadioButton button5nCheckBox = findViewById(R.id.button5n_CheckBox);
        boolean answerNo5 = button5nCheckBox.isChecked();
        if (answerNo5) {
            positiveDepressionAnswers = positiveDepressionAnswers + 1;
        } else {
            positiveDepressionAnswers += 0;
        }

        RadioButton button6sCheckBox = findViewById(R.id.button6s_CheckBox);
        boolean answerYes6 = button6sCheckBox.isChecked();
        if (answerYes6) {
            positiveDepressionAnswers = positiveDepressionAnswers + 1;
        } else {
            positiveDepressionAnswers += 0;
        }

        RadioButton button7nCheckBox = findViewById(R.id.button7n_CheckBox);
        boolean answerNo7 = button7nCheckBox.isChecked();
        if (answerNo7) {
            positiveDepressionAnswers = positiveDepressionAnswers + 1;
        } else {
            positiveDepressionAnswers += 0;
        }

        RadioButton button8sCheckBox = findViewById(R.id.button8s_CheckBox);
        boolean answerYes8 = button8sCheckBox.isChecked();
        if (answerYes8) {
            positiveDepressionAnswers = positiveDepressionAnswers + 1;
        } else {
            positiveDepressionAnswers += 0;
        }

        RadioButton button9sCheckBox = findViewById(R.id.button9s_CheckBox);
        boolean answerYes9 = button9sCheckBox.isChecked();
        if (answerYes9) {
            positiveDepressionAnswers = positiveDepressionAnswers + 1;
        } else {
            positiveDepressionAnswers += 0;
        }

        RadioButton button10sCheckBox = findViewById(R.id.button10s_CheckBox);
        boolean answerYes10 = button10sCheckBox.isChecked();
        if (answerYes10) {
            positiveDepressionAnswers = positiveDepressionAnswers + 1;
        } else {
            positiveDepressionAnswers += 0;
        }

        RadioButton button11nCheckBox = findViewById(R.id.button11n_CheckBox);
        boolean answerNo11 = button11nCheckBox.isChecked();
        if (answerNo11) {
            positiveDepressionAnswers = positiveDepressionAnswers + 1;
        } else {
            positiveDepressionAnswers += 0;
        }

        RadioButton button12sCheckBox = findViewById(R.id.button12s_CheckBox);
        boolean answerYes12 = button12sCheckBox.isChecked();
        if (answerYes12) {
            positiveDepressionAnswers = positiveDepressionAnswers + 1;
        } else {
            positiveDepressionAnswers += 0;
        }

        RadioButton button13nCheckBox = findViewById(R.id.button13n_CheckBox);
        boolean answerNo13 = button13nCheckBox.isChecked();
        if (answerNo13) {
            positiveDepressionAnswers = positiveDepressionAnswers + 1;
        } else {
            positiveDepressionAnswers += 0;
        }

        RadioButton button14sCheckBox = findViewById(R.id.button14s_CheckBox);
        boolean answer14s = button14sCheckBox.isChecked();
        if (answer14s) {
            positiveDepressionAnswers = positiveDepressionAnswers + 1;
        } else {
            positiveDepressionAnswers += 0;
        }

        RadioButton button15sCheckBox = findViewById(R.id.button15s_CheckBox);
        boolean answer15s = button15sCheckBox.isChecked();
        if (answer15s) {
            positiveDepressionAnswers = positiveDepressionAnswers + 1;
        } else {
            positiveDepressionAnswers += 0;
        }

        // Show message
        if (positiveDepressionAnswers <= 5) {


            Toast.makeText(this, Name + getString(R.string.your_score_is) + positiveDepressionAnswers + getString(R.string.points_is_normal),Toast.LENGTH_LONG).show();
        }


        if (positiveDepressionAnswers > 5) {
            // Show message
            Toast.makeText(this,Name +  getString(R.string.your_score_is)  +  positiveDepressionAnswers +  getString(R.string.points_greater_than_5_indicates_probably_depression) + getString(R.string.you_have) + positiveDisease + getString(R.string.diseases_physical_illness_increases_the_risk_of_developing_depressive_illness),Toast.LENGTH_LONG).show();
        }
    }

    /**
     * This method is called when the happy buttons are clicked.
     */

    public void bird (View view) {
        btnHappy = findViewById(R.id.btnHappy);
        bird = MediaPlayer.create(this,R.raw.bird);
        btnHappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bird.start();
            }
        });
    }
}
