package com.example.optionsitemtest;

import com.actionbarsherlock.view.MenuItem;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.OptionsItem;

@EActivity
public abstract class AbstractOptionsActivity extends SomeBaseActivity_ {

	@OptionsItem(R.id.menu_settings)
	void onOptions(MenuItem item) {

	}

}
