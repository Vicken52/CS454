package vickenkrikorian.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Calculator extends ActionBarActivity {
    private EditText input;
    private Button zero, one, two, three, four, five, six, seven, eight, nine;
    private Button del, divide, multiply, subtract, add, decimal, equal;

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
}
