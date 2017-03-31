package com.example.khoa.ense471_lab6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button one,two,three,four,five,six,seven,eight,nine,zero,
    clear, percent, multiply, subtract, divide, add, bracketLeft, bracketRight,
    equal, decimal, sign;

    private TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        equal = (Button) findViewById(R.id.equal);
        subtract = (Button) findViewById(R.id.sub);
        add = (Button) findViewById(R.id.add);
        decimal = (Button) findViewById(R.id.decimal);
        bracketLeft = (Button) findViewById(R.id.bracketLeft);
        bracketRight = (Button) findViewById(R.id.bracketRight);
        sign = (Button) findViewById(R.id.sign);
        clear = (Button) findViewById(R.id.clear);
        multiply = (Button) findViewById(R.id.mul);
        divide = (Button) findViewById(R.id.div);
        percent= (Button) findViewById(R.id.percent);
        display = (TextView) findViewById(R.id.display);

    }

    public void onCButtonClicked(View view) {
        display.setText("0.");
    }
    public void onSignButtonClicked(View view) {
        display.setText(display+"+/-");
    }
    public void onPercentButtonClicked(View view) {
        display.setText(display+"%");
    }
    public void on1ButtonClicked(View view) {
        display.setText(display+"1");
    }
    public void on2ButtonClicked(View view) {
        display.setText(display+"2");
    }
    public void on3ButtonClicked(View view) {
        display.setText(display+"3");
    }
    public void on4ButtonClicked(View view) {
        display.setText(display+"4");
    }
    public void on5ButtonClicked(View view) {
        display.setText(display+"5");
    }
    public void on6ButtonClicked(View view) {
        display.setText(display+"6");
    }
    public void on7ButtonClicked(View view) {
        display.setText(display+"7");
    }
    public void on8ButtonClicked(View view) {
        display.setText(display+"8");
    }
    public void on9ButtonClicked(View view) {
        display.setText(display+"9");
    }
    public void on0ButtonClicked(View view) {
        display.setText(display+"0");
    }
    public void onMulButtonClicked(View view) {
        display.setText(display+"*");
    }
    public void onDivButtonClicked(View view) {
        display.setText(display+"/");
    }
    public void onSubButtonClicked(View view) {
        display.setText(display+"-");
    }
    public void onAddButtonClicked(View view) {
        display.setText(display+"+");
    }
    public void onEqualButtonClicked(View view) {
        display.setText("answer");
    }
    public void onDeciButtonClicked(View view) {
        display.setText(display+".");
    }
    public void onBracketLeftButtonClicked(View view) {
        display.setText(display+"(");
    }
    public void onBracketRightButtonClicked(View view) {
        display.setText(display+")");
    }
}
