package com.example.premierleagueapp4;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        String[] teams = res.getStringArray(R.array.Teams);

        Integer[] images = {R.drawable.arsenal, R.drawable.bournmath, R.drawable.brighton, R.drawable.burnley, R.drawable.cardiff,
                R.drawable.chelsea, R.drawable.crystal, R.drawable.everton, R.drawable.fulham, R.drawable.huddelsfield,
                R.drawable.leicester, R.drawable.liverpool, R.drawable.mancity, R.drawable.manu, R.drawable.newcastle,
                R.drawable.southhampton, R.drawable.spurs, R.drawable.watford, R.drawable.westham, R.drawable.wolves};

        listView = (ListView) findViewById(R.id.listview);

        final CustomListAdapter whatever = new CustomListAdapter(this, images, teams);

        listView.setAdapter(whatever);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String test = whatever.getItem(position).toString();

                Toast.makeText(getApplicationContext(), test, Toast.LENGTH_SHORT).show();
            }
        });


    }


}
