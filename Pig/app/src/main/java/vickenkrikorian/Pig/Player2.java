package vickenkrikorian.Pig;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.widget.Toast;

public class Player2 extends ActionBarActivity {
    private FrameLayout die1, die2;
    private TextView p1, p2, round;
    private Button roll, hold;
    private int score = 0;
    private int score2 = 0;
    private int scoreTemp = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player2);

        p1 = (TextView)findViewById(R.id.p1);
        p2 = (TextView)findViewById(R.id.p2);
        round = (TextView)findViewById(R.id.round);

        Intent intent = getIntent();
        score = intent.getIntExtra("score", 0);
        score2 = intent.getIntExtra("score2", 0);
        Toast.makeText(this, "The score is: " + score, Toast.LENGTH_LONG).show();

        p1.setText("P1: " + score);
        p2.setText("P2: " + score2);

        roll = (Button)findViewById(R.id.button);
        roll.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                rollDice();
                round.setText("Round: " + scoreTemp);

                if(score2 >= 100 || (score2 + scoreTemp) >= 100)
                {
                    score2 += scoreTemp;
                    p2.setText("P2: " + score2);
                    AlertDialog alertDialog = new AlertDialog.Builder(Player2.this).create();
                    alertDialog.setTitle("You Won!");
                    alertDialog.setMessage("Yabadabadoo!");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener()
                            {
                                public void onClick(DialogInterface dialog, int which)
                                {
                                    Intent intent = new Intent(Player2.this, Player2.class);
                                    intent.putExtra("score", 0);
                                    intent.putExtra("score2", 0);
                                    intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                                    startActivity(intent);
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                }
            }
        });

        hold = (Button)findViewById(R.id.hold);
        hold.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                score2 += scoreTemp;
                Intent intent = new Intent(Player2.this, MainActivity.class);
                intent.putExtra("score", score);
                intent.putExtra("score2", score2);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
                startActivity(intent);
            }
        });

        die1 = (FrameLayout)findViewById(R.id.die1);
        die2 = (FrameLayout)findViewById(R.id.die2);
    }

    //Rolls Dice
    public void rollDice()
    {
        int roll1 = 1 + (int)(6 * Math.random());
        int roll2 = 1 + (int)(6 * Math.random());

        if(roll1 == 1 || roll2 == 1)
        {
            Intent intent = new Intent(Player2.this, MainActivity.class);
            intent.putExtra("score", score);
            intent.putExtra("score2", score2);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            startActivity(intent);
        }
        else
        {
            scoreTemp += roll1 + roll2;
            setDie(roll1, die1);
            setDie(roll2, die2);
        }
    }

    //Set Appropiate image to FrameView for an int
    public void setDie(int value, FrameLayout die)
    {
        Drawable pic = null;
        switch (value) {
            case 1:
                pic = getResources().getDrawable(R.drawable.die_face_1);
                break;
            case 2:
                pic = getResources().getDrawable(R.drawable.die_face_2);
                break;
            case 3:
                pic = getResources().getDrawable(R.drawable.die_face_3);
                break;
            case 4:
                pic = getResources().getDrawable(R.drawable.die_face_4);
                break;
            case 5:
                pic = getResources().getDrawable(R.drawable.die_face_5);
                break;
            case 6:
                pic = getResources().getDrawable(R.drawable.die_face_6);
                break;
        }
        die.setBackground(pic);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
