package com.pixelstudio.appshapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    String userValue;
    int userValueInt;

    public class Number {
        int value;

        public boolean isSquare() {

            double squareRoot = Math.sqrt(value);

            if (squareRoot == Math.floor(squareRoot)) {

                return true;

            } else {

                return false;

            }

        }

        public boolean isTriangular() {

            int x = 1;

            int triangularNumber = 1;

            while (triangularNumber < value) {

                x++;

                triangularNumber = triangularNumber + x;

            }

            if (triangularNumber == value) {

                return true;

            } else {

                return false;

            }

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkShape(View view) {
        editText = findViewById(R.id.userInput);
        Number myNumber = new Number();
        myNumber.value = Integer.parseInt(editText.getText().toString());
        if (myNumber.isSquare()) {
            if (myNumber.isTriangular()) {
                Toast.makeText(this, myNumber.value + " is both Square and Triangular", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, myNumber.value + " is Square", Toast.LENGTH_SHORT).show();
            }
            if (myNumber.isTriangular()) {
                Toast.makeText(this, myNumber.value + " is Triangular", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, myNumber.value + " is neither Square nor Triangular", Toast.LENGTH_SHORT).show();
            }


        }
    }
}
