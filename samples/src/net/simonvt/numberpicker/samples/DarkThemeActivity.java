package net.simonvt.numberpicker.samples;

import net.simonvt.numberpicker.NumberPicker;

import android.app.Activity;
import android.os.Bundle;

/**
 * @author Simon Vig Therkildsen <simonvt@gmail.com>
 */
public class DarkThemeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dark);

        NumberPicker sp = (NumberPicker) findViewById(R.id.secondPicker);
        sp.setMaxValue(60);
        sp.setMinValue(5);
        sp.setFocusable(true);
        sp.setFocusableInTouchMode(true);
        
        NumberPicker mp = (NumberPicker) findViewById(R.id.minutePicker);
        mp.setMaxValue(60);
        mp.setMinValue(0);
        mp.setFocusable(true);
        mp.setFocusableInTouchMode(true);
        
        NumberPicker hp = (NumberPicker) findViewById(R.id.hourPicker);
        hp.setMaxValue(24);
        hp.setMinValue(0);
        hp.setFocusable(true);
        hp.setFocusableInTouchMode(true);
        
        NumberPicker dp = (NumberPicker) findViewById(R.id.dayPicker);
        dp.setMaxValue(10);
        dp.setMinValue(0);
        dp.setFocusable(true);
        dp.setFocusableInTouchMode(true);
    }
}
