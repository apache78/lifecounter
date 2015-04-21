package edu.washington.apache78.LifeCounter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity{
    private final int startingPoints=20;
    private int num=0;
    private Player p1;
    private Player p2;
    private Player p3;
    private Player p4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState ==null) {
            this.p1 = new Player("p1", startingPoints);
            this.p2 = new Player("p2", startingPoints);
            this.p3 = new Player("p3", startingPoints);
            this.p4 = new Player("p4", startingPoints);
        }

    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
    }

    public void onClick(View v){
        if(v.getId() == R.id.p1plus){
            //increment p1 by one
            TextView tv = (TextView)findViewById(R.id.p1lifepoints);
            num = p1.lifePoints;
            num++;
            tv.setText("Life Points: "+ num);
            p1.lifePoints = num;
        }else if (v.getId() == R.id.p1minus){
            TextView tv = (TextView)findViewById(R.id.p1lifepoints);
            num = p1.lifePoints;
            num--;
            tv.setText("Life Points: "+ num);
            p1.lifePoints = num;
            checkIfLost(p1);

        }else if (v.getId() == R.id.p1plus5){
            TextView tv = (TextView)findViewById(R.id.p1lifepoints);
            num = p1.lifePoints;
            num+=5;
            tv.setText("Life Points: "+ num);
            p1.lifePoints = num;

        }else if (v.getId() == R.id.p1minus5){
            TextView tv = (TextView)findViewById(R.id.p1lifepoints);
            num = p1.lifePoints;
            num-=5;
            tv.setText("Life Points: "+ num);
            p1.lifePoints = num;
            checkIfLost(p1);

        }else if (v.getId() == R.id.p2plus){
            TextView tv = (TextView)findViewById(R.id.p2lifepoints);
            num = p2.lifePoints;
            num++;
            tv.setText("Life Points: "+ num);
            p2.lifePoints = num;

        }else if (v.getId() == R.id.p2minus){
            TextView tv = (TextView)findViewById(R.id.p2lifepoints);
            num = p2.lifePoints;
            num--;
            tv.setText("Life Points: "+ num);
            p2.lifePoints = num;
            checkIfLost(p2);

        }else if (v.getId() == R.id.p2plus5){
            TextView tv = (TextView)findViewById(R.id.p2lifepoints);
            num = p2.lifePoints;
            num+=5;
            tv.setText("Life Points: "+ num);
            p2.lifePoints = num;

        }else if (v.getId() == R.id.p2minus5){
            TextView tv = (TextView)findViewById(R.id.p2lifepoints);
            num = p2.lifePoints;
            num-=5;
            tv.setText("Life Points: "+ num);
            p2.lifePoints = num;
            checkIfLost(p2);

        }else if (v.getId() == R.id.p3plus){
            TextView tv = (TextView)findViewById(R.id.p3lifepoints);
            num = p3.lifePoints;
            num++;
            tv.setText("Life Points: "+ num);
            p3.lifePoints = num;

        }else if (v.getId() == R.id.p3minus){
            TextView tv = (TextView)findViewById(R.id.p3lifepoints);
            num = p3.lifePoints;
            num--;
            tv.setText("Life Points: "+ num);
            p3.lifePoints = num;
            checkIfLost(p3);

        }else if (v.getId() == R.id.p3plus5){
            TextView tv = (TextView)findViewById(R.id.p3lifepoints);
            num = p3.lifePoints;
            num+=5;
            tv.setText("Life Points: "+ num);
            p3.lifePoints = num;

        }else if (v.getId() == R.id.p3minus5){
            TextView tv = (TextView)findViewById(R.id.p3lifepoints);
            num = p3.lifePoints;
            num-=5;
            tv.setText("Life Points: "+ num);
            p3.lifePoints = num;
            checkIfLost(p3);
        }else if (v.getId() == R.id.p4plus){
            TextView tv = (TextView)findViewById(R.id.p4lifepoints);
            num = p4.lifePoints;
            num++;
            tv.setText("Life Points: "+ num);
            p4.lifePoints = num;

        }else if (v.getId() == R.id.p4minus){
            TextView tv = (TextView)findViewById(R.id.p4lifepoints);
            num = p4.lifePoints;
            num--;
            tv.setText("Life Points: "+ num);
            p4.lifePoints = num;
            checkIfLost(p4);

        }else if (v.getId() == R.id.p4plus5){
            TextView tv = (TextView)findViewById(R.id.p4lifepoints);
            num = p4.lifePoints;
            num+=5;
            tv.setText("Life Points: "+ num);
            p4.lifePoints = num;

        }else if (v.getId() == R.id.p4minus5){
            TextView tv = (TextView)findViewById(R.id.p4lifepoints);
            num = p4.lifePoints;
            num-=5;
            tv.setText("Life Points: "+ num);
            p4.lifePoints = num;
            checkIfLost(p4);
        }
    }

    public void checkIfLost(Player p){
        int num = Integer.parseInt(p.name.substring(1));
        if(p.lifePoints <=0){
            Context context = getApplicationContext();
            CharSequence text = "Player "+ num +" LOSES!";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }


    public class Player{
        public int lifePoints;
        String name;
        public Player(String name, int lifeCount){
            this.name = name;
            this.lifePoints = lifeCount;
            String idName = name+"lifepoints";
            int resID;
            resID = getResources().getIdentifier(idName, "id", MainActivity.this.getPackageName());
            TextView points = (TextView)findViewById(resID);
            points.append(""+lifePoints);
        }
    }
}
