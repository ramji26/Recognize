package com.eranki.recognize;
/**
 created by eranki
 */

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.util.Log;

import com.eranki.recognize.persongroupmanagement.PersonGroupListActivity;

public class MainActivity extends Activity {


    private final String Tag = this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void identification(View view) {
        Intent intent = new Intent(this, IdentificationActivity.class);
        Log.v(Tag,"Starting Identification Intent");
        startActivity(intent);
    }

    public void managePersonGroups(View view) {

        Intent intent = new Intent(this, PersonGroupListActivity.class);
        Log.v(Tag, "Stating Manage Groups Activity");
        startActivity(intent);
    }
}
