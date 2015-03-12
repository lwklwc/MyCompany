package com.mc.mycompany;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;


public class MainActivity extends ActionBarActivity {

    private Spinner parkSp;
    private Spinner accSp;

    private EditText etArrival, etStay, etAdults, etNum16, etNum5;
    private CheckBox cbPets, cbMember21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }

    private void initUI() {
        parkSp = (Spinner) findViewById(R.id.spinner_park);
        accSp = (Spinner) findViewById(R.id.spinner_acco);

        ArrayAdapter<CharSequence> parkAdapter = ArrayAdapter.createFromResource(this,
                R.array.parks, android.R.layout.simple_spinner_item);
        parkSp.setAdapter(parkAdapter);

        ArrayAdapter<CharSequence> accoAdapter = ArrayAdapter.createFromResource(this,
                R.array.accommodation, android.R.layout.simple_spinner_item);
        accSp.setAdapter(accoAdapter);


        etArrival = (EditText) findViewById(R.id.et_arrival);
        etStay = (EditText) findViewById(R.id.et_stay);
        etAdults = (EditText) findViewById(R.id.et_adults);
        etNum16 = (EditText) findViewById(R.id.et_num16);
        etNum5 = (EditText) findViewById(R.id.et_num5);
    }


    public void calculate(View v) {

    }

    public void check(View v) {
        startActivity(new Intent(this, ConfirmActivity.class));
    }

}
