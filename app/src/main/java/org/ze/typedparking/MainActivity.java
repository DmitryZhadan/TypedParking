package org.ze.typedparking;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import org.ze.typedparking.model.Car;
import org.ze.typedparking.model.Parking;
import org.ze.typedparking.model.Truck;
import org.ze.typedparking.model.Vehicle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
/* Parking class simple test */
/*
        Parking p=new Parking(4,3);

        Vehicle car1=new Car(), car2=new Car(), car3=new Car(), truck1=new Truck();
        int posCar1, posCar2, posCar3, posTruck1;

        posCar1=p.park(car1); posCar2=p.park(car2); posTruck1=p.park(truck1);
        if (!car1.equals(p.unpark(posCar1))) {
            throw new IllegalStateException();
        }
        posCar3=p.park(car3);
        if (!car2.equals(p.unpark(posCar2))) {
            throw new IllegalStateException();
        }
        if (!truck1.equals(p.unpark(posTruck1))) {
            throw new IllegalStateException();
        }
        if (!car3.equals(p.unpark(posCar3))) {
            throw new IllegalStateException();
        }
*/
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
