/*
 * Copyright (C) 2013 Code Universe. All rights reserved.
 * 
 * http://www.codeuniverse.org
 * 
 * Created by Jaison Brooks 4/26/2013
 * 
 * Additionally -------------------------------------
 *
 * Copyright (C) 2008 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.codeuniverse.wallpaper;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LauncherActivity extends Activity {

	Button wallpaper;
	Button website;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		wallpaper = (Button) findViewById(R.id.button1);
		wallpaper.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				Intent myIntent = new Intent(getBaseContext(),
						WallpaperChooser.class);
				startActivity(myIntent);
			}
		});
		website = (Button) findViewById(R.id.button2);
		website.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {

				String url = "http://www.codeuniverse.org";
				Intent i = new Intent(Intent.ACTION_VIEW);
				i.setData(Uri.parse(url));
				startActivity(i);
				finish();
			}
		});

	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}

}
