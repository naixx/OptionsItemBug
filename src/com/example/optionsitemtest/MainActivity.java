package com.example.optionsitemtest;

import android.os.Bundle;

import com.googlecode.androidannotations.annotations.EActivity;

@EActivity
public class MainActivity extends AbstractOptionsActivity_ {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

}
