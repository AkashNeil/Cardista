package akashneil.com.cardista;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button buttonZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button buttonZero = (Button) findViewById(R.id.buttonZero);
    }


    public void tapButtonZero (View v) {
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("0");
    }

    public void tapButtonHalf (View v) {
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("0.5");
    }

    public void tapButtonOne (View v) {
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("1");
    }

    public void tapButtonTwo (View v) {
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("2");
    }

    public void tapButtonThree (View v) {
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("3");
    }

    public void tapButtonFive (View v) {
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("5");
    }

    public void tapButtonEight (View v) {
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("8");
    }

    public void tapButtonThirteen (View v) {
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("13");
    }

}
