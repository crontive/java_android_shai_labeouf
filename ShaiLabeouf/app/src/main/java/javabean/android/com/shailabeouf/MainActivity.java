package javabean.android.com.shailabeouf;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        final TextView tv1 = (TextView) findViewById(R.id.textview1);
        final TextView tv2 = (TextView) findViewById(R.id.textview2);
        final TextView tv3 = (TextView) findViewById(R.id.textview3);
        final TextView tv4 = (TextView) findViewById(R.id.textview4);
        final TextView tv5 = (TextView) findViewById(R.id.textview5);
        Button button = (Button) findViewById(R.id.button_send);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                final SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", MODE_PRIVATE);
                final SharedPreferences.Editor editor = pref.edit();
                int stance = pref.getInt("stance", 0);
                int stanceLine = pref.getInt("stanceLine", 0);
                EditText et = (EditText) findViewById(R.id.edit_message);
                String value = et.getText().toString();





                switch (stance) {
                    case 0:
                        switch (stanceLine) {
                            case 0:
                                tv1.setText("You're walking through the woods");
                                editor.putInt("stanceLine", 1);
                                editor.commit();
                                break;
                            case 1:
                                String key1 = "look";
                                if (value.contains(key1.toLowerCase())) {
                                    tv2.setText("There's no one around");
                                    editor.putInt("stanceLine", 2);
                                    editor.commit();
                                } else {
                                    error();
                                }
                                break;
                            case 2:
                                String key2 = "phone";
                                if (value.contains(key2.toLowerCase())) {
                                    tv3.setText("And your phone is dead.");
                                    editor.putInt("stanceLine", 3);
                                    editor.commit();
                                } else {
                                    error();
                                }
                                break;
                            case 3:
                                String key3 = "look";
                                if (value.contains(key3.toLowerCase())) {
                                    tv4.setText("Out of the corner of your eye you spot him, ");
                                    editor.putInt("stanceLine", 4);
                                    editor.commit();
                                } else {
                                    error();
                                }
                                break;
                            case 4:
                                tv5.setText("Shia Labeouf.");
                                editor.putInt("stance", 1);
                                editor.putInt("stanceLine", 0);
                                editor.commit();
                                break;
                            default:
                                tv1.setText("");
                        }
                        break;
                    case 1:
                        switch (stanceLine) {
                            case 0:
                                tv1.setText("He's following you");
                                tv2.setText("");
                                tv3.setText("");
                                tv4.setText("");
                                tv5.setText("");
                                editor.putInt("stanceLine", 1);
                                editor.commit();
                                break;
                            case 1:
                                tv2.setText("About 30 feet back.");
                                editor.putInt("stanceLine", 2);
                                editor.commit();
                                break;
                            case 2:
                                String key1 = "run";
                                if (value.contains(key1.toLowerCase())) {
                                    tv3.setText("He gets down on all fours and breaks into a sprint.");
                                    editor.putInt("stanceLine", 3);
                                    editor.commit();
                                } else {
                                    error();
                                }
                                break;
                            case 3:
                                String key2 = "faster";
                                if (value.contains(key2.toLowerCase())) {
                                    tv4.setText("He's gaining on you.");
                                    editor.putInt("stanceLine", 4);
                                    editor.commit();
                                } else {
                                    error();
                                }
                                break;
                            case 4:
                                tv5.setText("Shia Labeouf.");
                                editor.putInt("stance", 2);
                                editor.putInt("stanceLine", 0);
                                editor.commit();
                                break;
                            default:
                                tv1.setText("");

                        }
                        break;
                    case 2:
                        switch (stanceLine) {
                            case 0:
                                String key1 = "look";
                                String key2 = "car";
                                if (value.contains(key1.toLowerCase()) || value.contains(key2.toLowerCase())) {
                                    tv1.setText("You're looking for your car, ");
                                    tv2.setText("");
                                    tv3.setText("");
                                    tv4.setText("");
                                    tv5.setText("");
                                    editor.putInt("stanceLine", 1);
                                    editor.commit();
                                } else {
                                    error();
                                }
                                break;
                            case 1:
                                tv2.setText("But you're all turned around.");
                                editor.putInt("stanceLine", 2);
                                editor.commit();
                                break;
                            case 2:
                                tv3.setText("He's almost upon you now");
                                editor.putInt("stanceLine", 3);
                                editor.commit();

                                break;
                            case 3:
                                tv4.setText("And you can see there's blood on his face! ");
                                editor.putInt("stanceLine", 4);
                                editor.commit();

                                break;
                            case 4:
                                tv5.setText("My god, there's blood everywhere!");
                                editor.putInt("stance", 3);
                                editor.putInt("stanceLine", 0);
                                editor.commit();
                                break;
                            default:
                                tv1.setText("");

                        }
                        break;
                    case 3:
                        switch (stanceLine) {
                            case 0:
                                tv1.setText("Running for your life");
                                tv2.setText("(From Shia Labeouf.)");
                                tv3.setText("He's brandishing a knife.");
                                tv4.setText("(It's Shia Labeouf.)");
                                tv5.setText("Lurking in the shadows");
                                editor.putInt("stance", 4);
                                editor.commit();
                                break;
                            default:
                                tv1.setText("");
                        }
                        break;
                    case 4:
                        switch (stanceLine) {
                            case 0:
                                tv1.setText("Hollywood superstar Shia Labeouf.");
                                tv2.setText("Living in the woods, ");
                                tv3.setText("(Shia Labeouf.)");
                                tv4.setText("Killing for sport, ");
                                tv5.setText("(Shia Labeouf.)");
                                editor.putInt("stance", 5);
                                editor.commit();
                                break;
                            default:
                                tv1.setText("");
                        }
                        break;
                    case 5:
                        switch (stanceLine) {
                            case 0:
                                tv1.setText("Eating all the bodies");
                                tv2.setText("Actual, cannibal Shia Labeouf.");
                                tv3.setText("");
                                tv4.setText("");
                                tv5.setText("");
                                editor.putInt("stance", 6);
                                editor.commit();
                                break;
                            default:
                                tv1.setText("");
                        }
                        break;
                    case 6:
                        switch (stanceLine) {
                            case 0:
                                tv1.setText("Now it's dark and you seem to have lost him, ");
                                tv2.setText("");
                                tv3.setText("");
                                tv4.setText("");
                                tv5.setText("");
                                editor.putInt("stanceLine", 1);
                                editor.commit();
                                break;
                            case 1:
                                String key1 = "look";
                                if (value.contains(key1.toLowerCase())) {
                                    tv2.setText("But you're hopelessly lost yourself.");
                                    editor.putInt("stanceLine", 2);
                                    editor.commit();
                                } else {
                                    error();
                                }
                                break;
                            case 2:
                                tv3.setText("Stranded with a murderer,");
                                editor.putInt("stance", 7);
                                editor.putInt("stanceLine", 0);
                                editor.commit();
                                break;
                            default:
                                tv1.setText("");
                        }
                        break;
                    case 7:
                        switch (stanceLine) {
                            case 0:
                                String key1 = "creep";
                                if (value.contains(key1.toLowerCase())) {
                                    tv1.setText("You creep silently through the underbrush.");
                                    tv2.setText("");
                                    tv3.setText("");
                                    tv4.setText("");
                                    tv5.setText("");
                                    editor.putInt("stanceLine", 1);
                                    editor.commit();
                                } else {
                                    error();
                                }
                                break;
                            case 1:
                                String key2 = "look";
                                if (value.contains(key2.toLowerCase())) {
                                    tv2.setText("A-ha! In the distance, ");
                                    tv3.setText("A small cottage with a light on.");
                                    tv4.setText("Hope!");
                                    editor.putInt("stanceLine", 2);
                                    editor.commit();
                                } else {
                                    error();
                                }
                                break;
                            case 2:
                                String key3 = "walk";
                                if (value.contains(key3.toLowerCase())) {
                                    tv5.setText("You move stealthily toward it, ");
                                    editor.putInt("stance", 8);
                                    editor.putInt("stanceLine", 0);
                                    editor.commit();
                                } else {
                                    error();
                                }
                                break;

                            default:
                                tv1.setText("");
                        }
                        break;
                    case 8:
                        switch (stanceLine) {
                            case 0:
                                tv1.setText("But your leg! AH! It's caught in a bear trap!");
                                tv2.setText("");
                                tv3.setText("");
                                tv4.setText("");
                                tv5.setText("");
                                editor.putInt("stanceLine", 1);
                                editor.commit();
                                break;
                            case 1:
                                String key1 = "bite";
                                String key2 = "gnaw";
                                String key3 = "chew";
                                if (value.contains(key1.toLowerCase()) || value.contains(key2.toLowerCase()) || value.contains(key3.toLowerCase())) {
                                    tv2.setText("Gnawing off your leg,");
                                    tv3.setText("(Quiet, quiet.)");
                                    editor.putInt("stanceLine", 2);
                                    editor.commit();
                                } else {
                                    error();
                                }
                                break;
                            case 2:
                                String key4 = "walk";
                                if (value.contains(key4.toLowerCase())) {
                                    tv4.setText("Limping toward the cottage,");
                                    tv5.setText("(Quiet, quiet.)");
                                    editor.putInt("stance", 9);
                                    editor.putInt("stanceLine", 0);
                                    editor.commit();
                                } else {
                                    error();
                                }
                            default:
                                tv1.setText("");

                        }
                        break;
                    case 9:
                        switch (stanceLine) {
                            case 0:
                                tv1.setText("Now you're on the doorstep, ");
                                tv2.setText("");
                                tv3.setText("");
                                tv4.setText("");
                                tv5.setText("");
                                editor.putInt("stanceLine", 1);
                                editor.commit();
                                break;
                            case 1:
                                String key1 = "look";
                                if (value.contains(key1.toLowerCase())) {

                                    tv2.setText("Sitting inside, Shia Labeouf.");
                                    tv3.setText("Sharpening an ax,");
                                    tv4.setText("(Shia Labeouf.)");
                                    editor.putInt("stanceLine", 2);
                                    editor.commit();
                                } else {
                                    error();
                                }
                                break;
                            case 2:
                                String key2 = "enter";
                                if (value.contains(key2.toLowerCase())) {
                                    tv5.setText("But he doesn't hear you enter,");
                                    editor.putInt("stance", 10);
                                    editor.putInt("stanceLine", 0);
                                    editor.commit();
                                } else {
                                    error();
                                }

                                break;
                            default:
                                tv1.setText("");

                        }
                        break;
                    case 10:
                        switch (stanceLine) {
                            case 0:
                                tv1.setText("(Shia Labeouf.)");
                                tv2.setText("");
                                tv3.setText("");
                                tv4.setText("");
                                tv5.setText("");
                                editor.putInt("stanceLine", 1);
                                editor.commit();
                                break;
                            case 1:
                                String key1 = "sneak";
                                if (value.contains(key1.toLowerCase())) {
                                    tv2.setText("You're sneaking up behind him.");
                                    editor.putInt("stanceLine", 2);
                                    editor.commit();
                                } else {
                                    error();
                                }
                                break;
                            case 2:
                                String key2 = "strangle";
                                if (value.contains(key2.toLowerCase())) {
                                    tv3.setText("Strangling superstar Shia Labeouf.");
                                    editor.putInt("stanceLine", 3);
                                    editor.commit();
                                } else {
                                    error();
                                }
                                break;
                            case 3:
                                String key3 = "punch";
                                if (value.contains(key3.toLowerCase())) {
                                    tv4.setText("Fighting for your life with Shia Labeouf,");
                                    editor.putInt("stanceLine", 4);
                                    editor.commit();
                                } else {
                                    error();
                                }
                                break;
                            case 4:
                                String key4 = "wrestle";
                                if (value.contains(key4.toLowerCase())) {
                                    tv5.setText("Wrestling a knife from Shia Labeouf, ");
                                    editor.putInt("stance", 11);
                                    editor.putInt("stanceLine", 0);
                                    editor.commit();
                                } else {
                                    error();
                                }
                                break;
                            default:
                                tv1.setText("");
                        }
                        break;
                    case 11:
                        switch (stanceLine) {
                            case 0:
                                String key1 = "stab";
                                if (value.contains(key1.toLowerCase())) {
                                    tv1.setText("Stab it in his kidney.");
                                    tv2.setText("");
                                    tv3.setText("");
                                    tv4.setText("");
                                    tv5.setText("");
                                    editor.putInt("stanceLine", 1);
                                    editor.commit();
                                } else {
                                    error();
                                }
                                break;
                            case 1:
                                tv2.setText("Safe at last from Shia Labeouf.");
                                editor.putInt("stanceLine", 2);
                                editor.commit();
                                break;
                            case 2:
                                String key2 = "walk";
                                if (value.contains(key2.toLowerCase())) {
                                    tv3.setText("You limp into the dark woods,");
                                    editor.putInt("stanceLine", 3);
                                    editor.commit();
                                } else {
                                    error();
                                }
                                break;
                            case 3:
                                tv4.setText("Blood oozing from your stump leg.");
                                editor.putInt("stanceLine", 4);
                                editor.commit();
                                break;
                            case 4:
                                tv5.setText("But you have won.");
                                editor.putInt("stance", 12);
                                editor.putInt("stanceLine", 0);
                                editor.commit();
                                break;
                            default:
                                tv1.setText("");

                        }
                        break;
                    case 12:
                        switch (stanceLine) {
                            case 0:
                                tv1.setText("You have beaten Shia Labeouf");
                                tv2.setText("");
                                tv3.setText("");
                                tv4.setText("");
                                tv5.setText("");
                                editor.commit();
                                break;
                            default:
                                tv1.setText("");
                        }
                        break;


                    default:


                }
            }
        });


    }

    public void error() {

        Random r = new Random();
        int v = r.nextInt(5 - 0) + 0;
        String err = "";


        switch (v) {
            case 0:
                err = "You can't do that";
                break;
            case 1:
                err = "Try again";
                break;
            case 2:
                err = "What?";
                break;
            case 3:
                err = "Sorry";
                break;
            case 4:
                err = "Sorry";
                break;
            case 5:
                err = "Try something else";
                break;
            default:
                err = "Try something else";

        }

        Context context = getApplicationContext();
        CharSequence text = err;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

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
