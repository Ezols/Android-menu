package dev.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menuHere) {
        // Link to xml menu
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menuHere);

        return super.onCreateOptionsMenu(menuHere);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Get main_menu items
        super.onOptionsItemSelected(item);

        switch(item.getItemId())
        {
            case R.id.settings:
                Log.i("Menu item selected", "Settings");
                return true;
            case R.id.help:
                Log.i("Menu item selected", "Help");
                return true;
            default:
                return false;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
