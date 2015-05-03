package vickenkrikorian.calculator;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Calculator extends ActionBarActivity {
    private EditText input;
    Button zero, one, two, three, four, five, six, seven, eight, nine;
    Button del, advanced, divide, multiply, subtract, add, decimal, equal;
    private int actionLocation;
    private int bracket;
    private String inputText = "0";
    private boolean solution;
    private char action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        Intent intent = getIntent();
        action = intent.getCharExtra("action", '0');
        actionLocation = intent.getIntExtra("actionLocation", -1);
        bracket = intent.getIntExtra("bracket", -1);
        solution = intent.getBooleanExtra("solution", false);
        inputText = intent.getStringExtra("inputText");

        input = (EditText)findViewById(R.id.editText);
        disableSoftInputFromAppearing(input);

        if(inputText == null)
        {
            input.setText("0");
        }
        else
        {
            input.setText(inputText);
        }

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
        advanced = (Button)findViewById(R.id.advanced);
        input.setSelection(input.getText().length());

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (String.valueOf(input.getText()).equals("0") ||
                        String.valueOf(input.getText()).equals("2.71828") ||
                        String.valueOf(input.getText()).equals("3.14159") )
                {
                    input.setText("");
                }

                if(solution)
                {
                    input.setText("");
                    del.setText("Del");
                    solution = false;
                }

                input.getText().insert(input.getSelectionStart(), "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (String.valueOf(input.getText()).equals("0") ||
                        String.valueOf(input.getText()).equals("2.71828") ||
                        String.valueOf(input.getText()).equals("3.14159") )
                {
                    input.setText("");
                }

                if(solution)
                {
                    input.setText("");
                    del.setText("Del");
                    solution = false;
                }

                input.getText().insert(input.getSelectionStart(), "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (String.valueOf(input.getText()).equals("0") ||
                        String.valueOf(input.getText()).equals("2.71828") ||
                        String.valueOf(input.getText()).equals("3.14159") )
                {
                    input.setText("");
                }

                if(solution)
                {
                    input.setText("");
                    del.setText("Del");
                    solution = false;
                }

                input.getText().insert(input.getSelectionStart(), "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (String.valueOf(input.getText()).equals("0") ||
                        String.valueOf(input.getText()).equals("2.71828") ||
                        String.valueOf(input.getText()).equals("3.14159") )
                {
                    input.setText("");
                }

                if(solution)
                {
                    input.setText("");
                    del.setText("Del");
                    solution = false;
                }

                input.getText().insert(input.getSelectionStart(), "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (String.valueOf(input.getText()).equals("0") ||
                        String.valueOf(input.getText()).equals("2.71828") ||
                        String.valueOf(input.getText()).equals("3.14159") )
                {
                    input.setText("");
                }

                if(solution)
                {
                    input.setText("");
                    del.setText("Del");
                    solution = false;
                }

                input.getText().insert(input.getSelectionStart(), "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (String.valueOf(input.getText()).equals("0") ||
                        String.valueOf(input.getText()).equals("2.71828") ||
                        String.valueOf(input.getText()).equals("3.14159") )
                {
                    input.setText("");
                }

                if(solution)
                {
                    input.setText("");
                    del.setText("Del");
                    solution = false;
                }

                input.getText().insert(input.getSelectionStart(), "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (String.valueOf(input.getText()).equals("0") ||
                        String.valueOf(input.getText()).equals("2.71828") ||
                        String.valueOf(input.getText()).equals("3.14159") )
                {
                    input.setText("");
                }

                if(solution)
                {
                    input.setText("");
                    del.setText("Del");
                    solution = false;
                }

                input.getText().insert(input.getSelectionStart(), "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (String.valueOf(input.getText()).equals("0") ||
                        String.valueOf(input.getText()).equals("2.71828") ||
                        String.valueOf(input.getText()).equals("3.14159") )
                {
                    input.setText("");
                }

                if(solution)
                {
                    input.setText("");
                    del.setText("Del");
                    solution = false;
                }

                input.getText().insert(input.getSelectionStart(), "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (String.valueOf(input.getText()).equals("0") ||
                        String.valueOf(input.getText()).equals("2.71828") ||
                        String.valueOf(input.getText()).equals("3.14159") )
                {
                    input.setText("");
                }

                if(solution)
                {
                    input.setText("");
                    del.setText("Del");
                    solution = false;
                }

                input.getText().insert(input.getSelectionStart(), "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (String.valueOf(input.getText()).equals("0") ||
                        String.valueOf(input.getText()).equals("2.71828") ||
                        String.valueOf(input.getText()).equals("3.14159") )
                {
                    input.setText("");
                }

                if(solution)
                {
                    input.setText("");
                    del.setText("Del");
                    solution = false;
                }

                input.getText().insert(input.getSelectionStart(), "9");
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.getText().insert(input.getSelectionStart(), ".");
                del.setText("Del");
                solution = false;
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(actionLocation != -1)
                {
                    double value = Double.valueOf(solve(String.valueOf(input.getText())));

                    input.setText(Double.toString(value));
                    input.setSelection(input.getText().length());
                }
                else if(input.getText().length() == 0)
                { }
                else if(input.getText().charAt(input.getText().length() - 1) == '/' ||
                        input.getText().charAt(input.getText().length() - 1) == 'x' ||
                        input.getText().charAt(input.getText().length() - 1) == '-' ||
                        input.getText().charAt(input.getText().length() - 1) == '+' ||
                        input.getText().charAt(input.getText().length() - 1) == '%' ||
                        input.getText().charAt(input.getText().length() - 1) == '^')
                {
                    input.setText(input.getText().subSequence(0, input.getText().length() - 1));

                    input.getText().insert(input.getSelectionStart(), "/");

                    action = '/';
                    actionLocation = input.getText().length() - 1;
                    del.setText("Del");
                    solution = false;
                }
                else
                {
                    input.getText().insert(input.getSelectionStart(), "/");

                    action = '/';
                    actionLocation = input.getText().length() - 1;
                    del.setText("Del");
                    solution = false;
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(actionLocation != -1)
                {
                    double value = Double.valueOf(solve(String.valueOf(input.getText())));

                    input.setText(Double.toString(value));
                    input.setSelection(input.getText().length());
                }
                else if(input.getText().length() == 0)
                { }
                else if(input.getText().charAt(input.getText().length() - 1) == '/' ||
                        input.getText().charAt(input.getText().length() - 1) == 'x' ||
                        input.getText().charAt(input.getText().length() - 1) == '-' ||
                        input.getText().charAt(input.getText().length() - 1) == '+' ||
                        input.getText().charAt(input.getText().length() - 1) == '%' ||
                        input.getText().charAt(input.getText().length() - 1) == '^')
                {
                    input.setText(input.getText().subSequence(0, input.getText().length() - 1));

                    input.getText().insert(input.getSelectionStart(), "x");

                    action = '*';
                    actionLocation = input.getText().length() - 1;
                    del.setText("Del");
                    solution = false;
                }
                else
                {
                    input.getText().insert(input.getSelectionStart(), "x");

                    action = '*';
                    actionLocation = input.getText().length() - 1;
                    del.setText("Del");
                    solution = false;
                }
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(actionLocation != -1)
                {
                    double value = Double.valueOf(solve(String.valueOf(input.getText())));

                    input.setText(Double.toString(value));
                    input.setSelection(input.getText().length());
                }
                else if(input.getText().length() == 0)
                { }
                else if(input.getText().charAt(input.getText().length() - 1) == '/' ||
                        input.getText().charAt(input.getText().length() - 1) == 'x' ||
                        input.getText().charAt(input.getText().length() - 1) == '-' ||
                        input.getText().charAt(input.getText().length() - 1) == '+' ||
                        input.getText().charAt(input.getText().length() - 1) == '%' ||
                        input.getText().charAt(input.getText().length() - 1) == '^')
                {
                    input.setText(input.getText().subSequence(0, input.getText().length() - 1));

                    input.getText().insert(input.getSelectionStart(), "-");

                    action = '-';
                    actionLocation = input.getText().length() - 1;
                    del.setText("Del");
                    solution = false;
                }
                else
                {
                    input.getText().insert(input.getSelectionStart(), "-");

                    action = '-';
                    actionLocation = input.getText().length() - 1;
                    del.setText("Del");
                    solution = false;
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(actionLocation != -1)
                {
                    double value = Double.valueOf(solve(String.valueOf(input.getText())));

                    input.setText(Double.toString(value));
                    input.setSelection(input.getText().length());
                }
                else if(input.getText().length() == 0)
                { }
                else if(input.getText().charAt(input.getText().length() - 1) == '/' ||
                        input.getText().charAt(input.getText().length() - 1) == 'x' ||
                        input.getText().charAt(input.getText().length() - 1) == '-' ||
                        input.getText().charAt(input.getText().length() - 1) == '+' ||
                        input.getText().charAt(input.getText().length() - 1) == '%' ||
                        input.getText().charAt(input.getText().length() - 1) == '^')
                {
                    input.setText(input.getText().subSequence(0, input.getText().length() - 1));

                    input.getText().insert(input.getSelectionStart(), "+");

                    action = '+';
                    actionLocation = input.getText().length() - 1;
                    del.setText("Del");
                    solution = false;
                }
                else
                {
                    input.getText().insert(input.getSelectionStart(), "+");

                    action = '+';
                    actionLocation = input.getText().length() - 1;
                    del.setText("Del");
                    solution = false;
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(actionLocation != -1)
                {
                    double value = Double.valueOf(solve(String.valueOf(input.getText())));

                    actionLocation = -1;

                    solution = true;
                    del.setText("Clear");

                    input.setText(Double.toString(value));
                    input.setSelection(input.getText().length());
                }
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solution)
                {
                    input.setText("0");
                    del.setText("Del");
                    solution = false;
                }
                else if(input.getText().length() == 0)
                { }
                else if(input.getText().length() == 1)
                {
                    input.setText("0");
                }
                else if(input.getText().charAt(input.getText().length() - 1) == '/' ||
                        input.getText().charAt(input.getText().length() - 1) == 'x' ||
                        input.getText().charAt(input.getText().length() - 1) == '-' ||
                        input.getText().charAt(input.getText().length() - 1) == '+' ||
                        input.getText().charAt(input.getText().length() - 1) == '%' ||
                        input.getText().charAt(input.getText().length() - 1) == '^')
                {
                    actionLocation = -1;
                    input.setText(input.getText().subSequence(0, input.getText().length()-1));
                    input.setSelection(input.getText().length());
                }
                else if(input.getText().length() > 0)
                {
                    input.setText(input.getText().subSequence(0, input.getText().length()-1));
                    input.setSelection(input.getText().length());
                }
            }
        });

        advanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calculator.this, Advanced.class);
                intent.putExtra("action", action);
                intent.putExtra("actionLocation", actionLocation);
                intent.putExtra("solution", solution);
                intent.putExtra("bracket", bracket);
                intent.putExtra("inputText", input.getText().toString());
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
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

    public static String solve(String inputText)
    {
        String tempS = "";
        double value = 0.0;
        double temp = 0.0;
        char action = 'q';

        for(int i = 0; i < inputText.length(); i++)
        {
            if(inputText.charAt(i) == '(')
            { }
            else if(inputText.charAt(i) == 'x' || inputText.charAt(i) == '/' || inputText.charAt(i) == '+' ||
                    inputText.charAt(i) == '-' || inputText.charAt(i) == '^' || inputText.charAt(i) == '%' && i != 0)
            {
                value = Double.parseDouble(tempS);

                tempS = "";
                action = inputText.charAt(i);
            }
            else
            {
                tempS += inputText.charAt(i);
            }
        }

        temp = Double.parseDouble(tempS);

        switch (action)
        {
            case '/':
                value = value / temp;
                break;
            case 'x':
                value = value * temp;
                break;
            case '+':
                value = value + temp;
                break;
            case '-':
                value = value - temp;
                break;
            case '%':
                value = value % temp;
                break;
            case '^':
                value = Math.pow(value, temp);
                break;
        }

        value = Math.round (value * 10000.0) / 10000.0;

        return Double.toString(value);
    }
}
