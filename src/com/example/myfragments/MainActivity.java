package com.example.myfragments;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Log.i("f","reach");
		super.onCreate(savedInstanceState);
		Configuration config=getResources().getConfiguration();
		FragmentManager fragmentManager = getFragmentManager();
		FragmentTransaction fragmentTransaction = 
		fragmentManager.beginTransaction();
		if (config.orientation == Configuration.ORIENTATION_LANDSCAPE)
		{   Log.i("f","landscape");
			LM_fragment ls_fragment = new LM_fragment();
	        fragmentTransaction.replace(android.R.id.content, ls_fragment);
	        
		}
		else
		{	Log.i("f","poatrait");
			PM_fragment pm_fragment = new PM_fragment();
	        fragmentTransaction.replace(R.id.lm_fragment, pm_fragment);
		}
		fragmentTransaction.commit();
	}

	
}
