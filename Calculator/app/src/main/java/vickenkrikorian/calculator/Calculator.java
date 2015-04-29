package vickenkrikorian.calculator;

import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;


public class Calculator extends ActionBarActivity {
    private EditText input;
    private Button zero, one, two, three, four, five, six, seven, eight, nine;
    private Button del, divide, multiply, subtract, add, decimal, equal;
    private int actionLocation;
    private char action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        input = (EditText)findViewById(R.id.editText);

        zero = (Button)findViewById(R.id.zero);
        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        five = (Button)findViewById(R.id.five);
        six = (Button)findViewById(R.id.six);
        seven = (Button)findViewById(R.id.seven);
        eight = (Button)findViewById(R.id.eight);
        nine = (Button)findViewById(R.id.nine);

        del = (Button)findViewById(R.id.del);
        divide = (Button)findViewById(R.id.divide);
        multiply = (Button)findViewById(R.id.multiply);
        subtract = (Button)findViewById(R.id.minus);
        add = (Button)findViewById(R.id.plus);
        decimal = (Button)findViewById(R.id.decimal);
        equal = (Button)findViewById(R.id.equal);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().append('0'));
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().append('1'));
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().append('2'));
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().append('3'));
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().append('4'));
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().append('5'));
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().append('6'));
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().append('7'));
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().append('8'));
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().append('9'));
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().append('.'));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().charAt(input.getText().length()-1) == '/' ||
                        input.getText().charAt(input.getText().length()-1) == 'x' ||
                        input.getText().charAt(input.getText().length()-1) == '-' ||
                        input.getText().charAt(input.getText().length()-1) == '+')
                {
                    input.setText(input.getText().subSequence(0, input.getText().length() - 1));
                }
                input.setText(input.getText().append('/'));

                action = '/';
                actionLocation = input.getText().length() - 1;
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().charAt(input.getText().length()-1) == '/' ||
                        input.getText().charAt(input.getText().length()-1) == 'x' ||
                        input.getText().charAt(input.getText().length()-1) == '-' ||
                        input.getText().charAt(input.getText().length()-1) == '+')
                {
                    input.setText(input.getText().subSequence(0, input.getText().length() - 1));
                }
                input.setText(input.getText().append('x'));

                action = '*';
                actionLocation = input.getText().length() - 1;
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().charAt(input.getText().length()-1) == '/' ||
                        input.getText().charAt(input.getText().length()-1) == 'x' ||
                        input.getText().charAt(input.getText().length()-1) == '-' ||
                        input.getText().charAt(input.getText().length()-1) == '+')
                {
                    input.setText(input.getText().subSequence(0, input.getText().length() - 1));
                }
                input.setText(input.getText().append('-'));

                action = '-';
                actionLocation = input.getText().length() - 1;
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input.getText().charAt(input.getText().length()-1) == '/' ||
                        input.getText().charAt(input.getText().length()-1) == 'x' ||
                        input.getText().charAt(input.getText().length()-1) == '-' ||
                        input.getText().charAt(input.getText().length()-1) == '+')
                {
                    input.setText(input.getText().subSequence(0, input.getText().length() - 1));
                }
                input.setText(input.getText().append('+'));

                action = '+';
                actionLocation = input.getText().length() - 1;
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value;
                double temp;
                String text = String.valueOf(input.getText());

                value = Double.parseDouble(text.substring(0, actionLocation - 1));
                temp = Double.parseDouble(text.substring(actionLocation));

                switch (action) {
                    case '/':  value = value / temp;
                    case '*':  value = value * temp;
                    case '+':  value = value + temp;
                    case '-':  value = value - temp;
                }

                input.setText(Double.toString(value));
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(input.getText().subSequence(0, input.getText().length()-1));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Disable soft keyboard from appearing, use in conjunction with adding the android:windowSoftInputMode="stateAlwaysHidden|adjustNothing" attribute to your activity tag in your manifest
     file.
     * @param editText
     */
    public static void disableSoftInputFromAppearing(EditText editText) {
        if (Build.VERSION.SDK_INT >= 11) {
            editText.setRawInputType(InputType.TYPE_CLASS_TEXT);
            editText.setTextIsSelectable(true);
        } else {
            editText.setRawInputType(InputType.TYPE_NULL);
            editText.setFocusable(true);
        }
    }
}
