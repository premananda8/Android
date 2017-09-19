package com.mycompany.calendar;

import android.app.ActionBar;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.CalendarView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private CalendarView calendarView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayout=(RelativeLayout) findViewById(R.id.relativeLayout);
        calendarView=new CalendarView(MainActivity.this);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams((int) RelativeLayout.LayoutParams.MATCH_PARENT,(int)RelativeLayout.LayoutParams.MATCH_PARENT);
        params.topMargin=100;
        calendarView.setLayoutParams(params);
        relativeLayout.addView(calendarView);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.calendar_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.itm_monthview:
                //newGame();
                return true;
            case R.id.itm_yearview:

                return true;
            case R.id.itm_todayview:
                return true;
            case R.id.itm_addevent:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
