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
import android.widget.Toast;


public class Advanced extends ActionBarActivity {
    private EditText input2;
    Button simple, del2, sine, cosine, tangent, equal2, ln, log;
    Button pi, e, mod, factorial, root, power, open, closed;
    private int actionLocation;
    private int bracket;
    private String inputText = "0";
    private boolean solution;
    private char action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced);

        Intent intent = getIntent();
        action = intent.getCharExtra("action", '0');
        actionLocation = intent.getIntExtra("actionLocation", -1);
        bracket = intent.getIntExtra("bracket", -1);
        solution = intent.getBooleanExtra("solution", false);
        inputText = intent.getStringExtra("inputText");

        input2 = (EditText)findViewById(R.id.editText2);
        disableSoftInputFromAppearing(input2);

        if(inputText == null)
        {
            input2.setText("0");
        }
        else
        {
            input2.setText(inputText);
        }

        simple = (Button) findViewById(R.id.simple);
        del2 = (Button)findViewById(R.id.del2);
        sine = (Button) findViewById(R.id.sine);
        cosine = (Button) findViewById(R.id.cosine);
        tangent = (Button) findViewById(R.id.tangent);
        equal2 = (Button) findViewById(R.id.equal2);
        ln = (Button) findViewById(R.id.ln);
        log = (Button) findViewById(R.id.log);
        pi = (Button) findViewById(R.id.pi);
        e = (Button) findViewById(R.id.e);
        mod = (Button) findViewById(R.id.mod);
        factorial = (Button) findViewById(R.id.factorial);
        root = (Button) findViewById(R.id.root);
        power = (Button) findViewById(R.id.power);
        open = (Button) findViewById(R.id.open);
        closed = (Button) findViewById(R.id.closed);


        input2.setSelection(input2.getText().length());

        sine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(actionLocation == -1)
                {
                    solution = true;
                    del2.setText("Clear");
                    input2.setText(Double.toString(Math.round(Math.sin(Double.parseDouble(String.valueOf(input2.getText()).replaceAll("[(]",""))) * 10000.0) / 10000.0));
                }

                input2.setSelection(input2.getText().length());
            }
        });

        cosine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (actionLocation == -1)
                {
                    solution = true;
                    del2.setText("Clear");
                    input2.setText(Double.toString(Math.round(Math.cos(Double.parseDouble(String.valueOf(input2.getText()).replaceAll("[(]",""))) * 10000.0) / 10000.0));
                }

                input2.setSelection(input2.getText().length());
            }
        });

        tangent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (actionLocation == -1) {
                    solution = true;
                    del2.setText("Clear");
                    input2.setText(Double.toString(Math.round(Math.tan(Double.parseDouble(String.valueOf(input2.getText()).replaceAll("[(]",""))) * 10000.0) / 10000.0));
                }

                input2.setSelection(input2.getText().length());
            }
        });

        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (actionLocation == -1) {
                    solution = true;
                    del2.setText("Clear");
                    input2.setText(Double.toString(Math.round(Math.log(Double.parseDouble(String.valueOf(input2.getText()).replaceAll("[(]",""))) * 10000.0) / 10000.0));
                }

                input2.setSelection(input2.getText().length());
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (String.valueOf(input2.getText()).equals("0"))
                {
                    Toast toast = Toast.makeText(getApplicationContext(), "Answer Undefined!", Toast.LENGTH_SHORT);
                    toast.show();
                    del2.setText("Del");
                    solution = false;
                }
                else if (actionLocation == -1) {
                    solution = true;
                    del2.setText("Clear");
                    input2.setText(Double.toString(Math.round(Math.log10(Double.parseDouble(String.valueOf(input2.getText()).replaceAll("[(]",""))) * 10000.0) / 10000.0));
                }

                input2.setSelection(input2.getText().length());
            }
        });

        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (String.valueOf(input2.getText()).equals("0") ||
                        String.valueOf(input2.getText()).equals("2.71828") ||
                        String.valueOf(input2.getText()).equals("3.14159") )
                {
                    input2.setText("");
                }

                if(solution)
                {
                    input2.setText("");
                    del2.setText("Del");
                    solution = false;
                }

                input2.getText().insert(input2.getSelectionStart(), "3.14159");
                input2.setSelection(input2.getText().length());
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (String.valueOf(input2.getText()).equals("0") ||
                        String.valueOf(input2.getText()).equals("2.71828") ||
                        String.valueOf(input2.getText()).equals("3.14159") )
                {
                    input2.setText("");
                }

                if (solution)
                {
                    input2.setText("");
                    del2.setText("Del");
                    solution = false;
                }

                input2.getText().insert(input2.getSelectionStart(), "2.71828");
                input2.setSelection(input2.getText().length());
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input2.getText().length() == 0)
                { }
                else if (input2.getText().charAt(input2.getText().length() - 1) == '/' ||
                        input2.getText().charAt(input2.getText().length() - 1) == 'x' ||
                        input2.getText().charAt(input2.getText().length() - 1) == '-' ||
                        input2.getText().charAt(input2.getText().length() - 1) == '+' ||
                        input2.getText().charAt(input2.getText().length() - 1) == '%' ||
                        input2.getText().charAt(input2.getText().length() - 1) == '^')
                {
                    input2.setText(input2.getText().subSequence(0, input2.getText().length() - 1));
                    input2.setSelection(input2.getText().length());

                    input2.getText().insert(input2.getSelectionStart(), "%");

                    action = '%';
                    actionLocation = input2.getText().length() - 1;
                    del2.setText("Del");
                    solution = false;
                }
                else if(actionLocation != -1)
                {
                    double value = Double.valueOf(solve(String.valueOf(input2.getText())));

                    input2.setText(Double.toString(value));
                    input2.setSelection(input2.getText().length());
                }
                else
                {
                    input2.getText().insert(input2.getSelectionStart(), "%");

                    action = '%';
                    actionLocation = input2.getText().length() - 1;
                    del2.setText("Del");
                    solution = false;
                }

                input2.setSelection(input2.getText().length());
            }
        });

        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (actionLocation == -1 && input2.getText().length() != 0)
                {
                    solution = true;
                    del2.setText("Clear");

                    double fact = 1.0;
                    int temp = (int) Double.parseDouble(String.valueOf(input2.getText()).replaceAll("[(]",""));

                    while(temp > 0)
                    {
                        fact = fact * temp;
                        temp--;
                    }

                    input2.setText(Double.toString(fact));
                    input2.setSelection(input2.getText().length());
                }
            }
        });

        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(actionLocation == -1 && input2.getText().length() != 0)
                {
                    solution = true;
                    del2.setText("Clear");
                    input2.setText(Double.toString(Math.round(Math.sqrt(Double.parseDouble(String.valueOf(input2.getText()).replaceAll("[(]",""))) * 10000.0) / 10000.0));
                    input2.setSelection(input2.getText().length());
                }
            }
        });

        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(input2.getText().length() == 0)
                { }
                else if (input2.getText().charAt(input2.getText().length() - 1) == '/' ||
                        input2.getText().charAt(input2.getText().length() - 1) == 'x' ||
                        input2.getText().charAt(input2.getText().length() - 1) == '-' ||
                        input2.getText().charAt(input2.getText().length() - 1) == '+' ||
                        input2.getText().charAt(input2.getText().length() - 1) == '%' ||
                        input2.getText().charAt(input2.getText().length() - 1) == '^')
                {
                    input2.setText(input2.getText().subSequence(0, input2.getText().length() - 1));
                    input2.setSelection(input2.getText().length());

                    input2.getText().insert(input2.getSelectionStart(), "^");

                    action = '^';
                    actionLocation = input2.getText().length() - 1;
                    del2.setText("Del");
                    solution = false;
                }
                else if(actionLocation != -1)
                {
                    double value = Double.valueOf(solve(String.valueOf(input2.getText())));

                    input2.setText(Double.toString(value));
                    input2.setSelection(input2.getText().length());
                }
                else
                {
                    input2.getText().insert(input2.getSelectionStart(), "^");

                    action = '^';
                    actionLocation = input2.getText().length() - 1;
                    del2.setText("Del");
                    solution = false;
                }

                input2.setSelection(input2.getText().length());
            }
        });

        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (solution) {
                    input2.setText("");
                    del2.setText("Del");
                    solution = false;
                }

                input2.getText().insert(input2.getSelectionStart(), "(");
                bracket = input2.getText().length() - 1;
            }
        });

        closed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input2.setText(solve(input2.getText().toString().substring(bracket + 1)));
                actionLocation = -1;
            }
        });

        equal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(actionLocation != -1)
                {
                    double value = Double.valueOf(solve(String.valueOf(input2.getText())));

                    actionLocation = -1;

                    solution = true;
                    del2.setText("Clear");

                    input2.setText(Double.toString(value));
                    input2.setSelection(input2.getText().length());
                }
            }
        });

        del2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solution)
                {
                    input2.setText("0");
                    del2.setText("Del");
                    solution = false;
                }
                else if(input2.getText().length() == 0)
                { }
                else if(input2.getText().length() == 1)
                {
                    input2.setText("0");
                }
                else if(input2.getText().charAt(input2.getText().length() - 1) == '/' ||
                        input2.getText().charAt(input2.getText().length() - 1) == 'x' ||
                        input2.getText().charAt(input2.getText().length() - 1) == '-' ||
                        input2.getText().charAt(input2.getText().length() - 1) == '+' ||
                        input2.getText().charAt(input2.getText().length() - 1) == '%' ||
                        input2.getText().charAt(input2.getText().length() - 1) == '^')
                {
                    actionLocation = -1;
                    input2.setText(input2.getText().subSequence(0, input2.getText().length()-1));
                    input2.setSelection(input2.getText().length());
                }
                else if(input2.getText().length() > 0)
                {
                    input2.setText(input2.getText().subSequence(0, input2.getText().length()-1));
                    input2.setSelection(input2.getText().length());
                }
            }
        });

        simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Advanced.this, Calculator.class);
                intent.putExtra("action", action);
                intent.putExtra("actionLocation", actionLocation);
                intent.putExtra("bracket", bracket);
                intent.putExtra("solution", solution);
                intent.putExtra("inputText", input2.getText().toString());
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

    public String solve(String inputText)
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
                    inputText.charAt(i) == '-' && i != 0 || inputText.charAt(i) == '^' || inputText.charAt(i) == '%')
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
                if(temp == 0.0)
                {
                    Toast toast = Toast.makeText(getApplicationContext(), "Answer Undefined!", Toast.LENGTH_SHORT);
                    toast.show();
                    value = 0.0;
                }
                else
                {
                    value = value / temp;
                }
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
