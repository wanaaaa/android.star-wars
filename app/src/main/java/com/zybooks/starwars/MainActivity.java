package com.zybooks.starwars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "WanActivity====>>>";

    private EditText eTextFirstName;
    private EditText eTextLastName;
    private EditText eTextCity;
    private EditText eTextMother;
    private TextView tViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eTextFirstName = findViewById(R.id.eTextFirstName);
        eTextLastName = findViewById(R.id.eTextLastName);
        eTextCity = findViewById(R.id.eTextCity);
        eTextMother = findViewById(R.id.eTextMother);
        tViewResult = findViewById(R.id.tViewResult);
    }

    public void calResultFun(View v) {
        String fNameStr = eTextFirstName.getText().toString();
        String lNameStr = eTextLastName.getText().toString();
        String cityStr = eTextCity.getText().toString();
        String motherStr = eTextMother.getText().toString();
        String starWarsStr = lNameStr.substring(0, 3) + fNameStr.substring(0, 2)
               + " " + motherStr.substring(0, 2) + cityStr.substring(0, 3) ;
        Log.d(TAG, "=========>>>>>>>>>>> " + lNameStr.substring(0, 3));

        tViewResult.setText("Temperary Name is: " + starWarsStr);
    }
}