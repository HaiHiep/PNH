package com.vietis.pnh;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class SettingActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setting);

		BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

		bottomNavigationView.setSelectedItemId(R.id.setting);

		bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
			@Override
			public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
				switch (menuItem.getItemId()) {
					case R.id.home:
						startActivity(new Intent(getApplicationContext(), MainActivity.class));
						overridePendingTransition(0, 0);
						return true;
					case R.id.setting:
						return true;
					case R.id.account:
						startActivity(new Intent(getApplicationContext(), AccountActivity.class));
						overridePendingTransition(0, 0);
						return true;
				}
				return false;
			}
		});
	}
}
