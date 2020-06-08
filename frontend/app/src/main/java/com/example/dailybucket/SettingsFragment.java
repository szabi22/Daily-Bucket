package com.example.dailybucket;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsFragment extends AppCompatActivity {
    // Array of strings...
    String[] settingsArray = {"User Settings","Notifications","Help","About",
            "Language Settings"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.listview_settings, settingsArray);

        ListView listView = (ListView) findViewById(R.id.settings);
        listView.setAdapter(adapter);
    }

}
