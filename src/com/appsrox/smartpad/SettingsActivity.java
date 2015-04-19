package com.appsrox.smartpad;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * @author appsrox.com
 *
 */
public class SettingsActivity extends PreferenceActivity {
	
	//private static final String TAG = "SettingsActivity";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
    }
}
