package com.vietis.pnh;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.vietis.pnh.Adapter.MovieAdapter;
import com.vietis.pnh.Model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
	RecyclerView recyclerView;

	List<Movie> movieList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		recyclerView = findViewById(R.id.recyclerView);

		initData();
		initRecyclerView();

		BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

		bottomNavigationView.setSelectedItemId(R.id.home);

		bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
			@Override
			public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
				switch (menuItem.getItemId()) {
					case R.id.home:
						return true;
					case R.id.setting:
						startActivity(new Intent(getApplicationContext(), SettingActivity.class));
						overridePendingTransition(0, 0);
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

	private void initRecyclerView() {
		MovieAdapter movieAdapter = new MovieAdapter(movieList);
		recyclerView.setLayoutManager(new LinearLayoutManager(this));
		recyclerView.setAdapter(movieAdapter);
	}

	private void initData() {
		movieList = new ArrayList<>();
		movieList.add(new Movie("Iron Man", "7.9", "2008", "After being held captive in an Afghan cave, billionaire engineer Tony Stark creates a unique weaponized suit of armor to fight evil."));
		movieList.add(new Movie("The Incredible Hulk", "6.7", "2008", "Bruce Banner, a scientist on the run from the U.S. Government, must find a cure for the monster he turns into, whenever he loses his temper."));
		movieList.add(new Movie("Avengers: Endgame","8.5","2019","After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe."));
	}
}
