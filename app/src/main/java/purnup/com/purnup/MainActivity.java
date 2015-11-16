package purnup.com.purnup;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new GcmRegistrationAsyncTask(this).execute();
        setContentView(R.layout.activity_main);
        Toolbar actionBar = (Toolbar) findViewById(R.id.top_menu);
        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        String[] testData = new String[3];

        for (int i = 0; i < testData.length; i++) {
            testData[i] = "This is a test String";
        }
        mRecyclerView.setAdapter(new PurnUpListAdapter(testData));

        setSupportActionBar(actionBar);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_menu);
        tabLayout.addTab(tabLayout.newTab().setIcon(R.mipmap.ic_home_blue_24dp), true);
        tabLayout.addTab(tabLayout.newTab().setIcon(R.mipmap.ic_event_black_24dp));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.mipmap.ic_message_black_24dp));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.mipmap.ic_person_black_24dp));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return true;
    }
}