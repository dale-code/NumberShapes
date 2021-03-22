package wadale.apps.numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    class Number {
        int number;

        public boolean isSquare() {
            double Squareroot = Math.sqrt(number);
            if ((Squareroot == Math.floor(Squareroot))) {
                return true;
            } else {
                return false;
            }
        }
        public boolean isTriangular() {
            int counterVariable = 1;
            int triangularNumber = 1;
            while (triangularNumber < number) {
                counterVariable++;
                triangularNumber = triangularNumber + counterVariable;
            }
            if (triangularNumber == number) {
                return true;
            } else {
                return false;
            }
        }
    }
    public void Test (View view){
        Log.i("button","checked");
        Number myNumber = new Number();
        EditText editText = (EditText) findViewById(R.id.editTextNumber);
        String message;
        message = " enter a number";
        if (editText.getText().toString().isEmpty()){
        }else {
            myNumber.number = Integer.parseInt(editText.getText().toString());
            message = editText.getText().toString();
            if (myNumber.isSquare() && myNumber.isTriangular()) {
                message += " is both a triangular number and a square number";
            } else if (myNumber.isSquare()) {
                message += " is a square number";
            } else if (myNumber.isTriangular()) {
                message += " is a triangular number";
            } else {
                message += " is neither a triangular number or a square number";
            }
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}