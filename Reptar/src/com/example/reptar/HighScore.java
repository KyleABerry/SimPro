package com.example.reptar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HighScore extends Activity {

	private String _NewName = "";
	private int _NewScore = 0;
	TextView timeView, countView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_high_score);
		
		
		
		timeView = (TextView) findViewById(R.id.time);
		countView = (TextView) findViewById(R.id.count);//Intent intent = getIntent();
		//countView = intent.getIntExtra("NEW_SCORE", -1);
		Bundle bundles = new Bundle();
	    bundles = getIntent().getExtras();
	
	    int c = bundles.getInt("aniCount");
		int t = bundles.getInt("time");
		
		timeView.setText(c+"");
		countView.setText(t+"");
		
		final Button btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				Intent intent = new Intent(HighScore.this,
						MainActivity.class);
				startActivity(intent);
			}
		});
        
       /* final Button btnReset = (Button) findViewById(R.id.btnReset);
        btnReset.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				ResetScores();
				DisplayScores();
			}
		});
        
        final Button btnDone = (Button) findViewById(R.id.btnDone);
        btnDone.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				EditText enterName = (EditText) findViewById(R.id.etEnterName);
				_NewName = enterName.getText().toString();
				enterName.setVisibility(View.INVISIBLE);
				btnDone.setVisibility(View.INVISIBLE);
				//AddNewScore();
				DisplayScores();
			}
		});*/
        
        //DisplayScores();
        Context context = this;
	/*	SharedPreferences sharedPref = context.getSharedPreferences(getString(R.string.high_scores_file), Context.MODE_PRIVATE);
		int defaultValue = 0;
		int score3 = sharedPref.getInt("HighScore3", defaultValue);
		if(_NewScore >= 0)
		{
			TextView YourScore = (TextView) findViewById(R.id.tvYourScore);
			TextView ScoreOutput = (TextView) findViewById(R.id.tvScoreOutput);
			YourScore.setVisibility(View.VISIBLE);
			ScoreOutput.setVisibility(View.VISIBLE);
			ScoreOutput.setText(Integer.toString(_NewScore));
		}
        if(score3 < _NewScore) 
		{
			EditText enterName = (EditText) findViewById(R.id.etEnterName);
			//Button btnDone = (Button) findViewById(R.id.btnDone);
			enterName.setVisibility(View.VISIBLE);
			btnDone.setVisibility(View.VISIBLE);
		}*/
	}
    /*
	private void DisplayScores()
	{
		TextView HighScore1 = (TextView) findViewById(R.id.tvHighScore1);
		TextView HighScore2 = (TextView) findViewById(R.id.tvHighScore2);
		TextView HighScore3 = (TextView) findViewById(R.id.tvHighScore3);
		
		Context context = this;
		SharedPreferences sharedPref = context.getSharedPreferences(getString(R.string.high_scores_file), Context.MODE_PRIVATE);
		int defaultValue = 0;
		
		int score1 = sharedPref.getInt("HighScore1", defaultValue);
		int score2 = sharedPref.getInt("HighScore2", defaultValue);
		int score3 = sharedPref.getInt("HighScore3", defaultValue);
		
		String name1 = sharedPref.getString("HighScore1Name", "No One");
		String name2 = sharedPref.getString("HighScore2Name", "No One");
		String name3 = sharedPref.getString("HighScore3Name", "No One");
		
		HighScore1.setText(name1 + " " + score1);
		HighScore2.setText(name2 + " " + score2);
		HighScore3.setText(name3 + " " + score3);
	}*/

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.high_score, menu);
		return true;
	}
	/*
	private void AddNewScore()
	{	
		Context context = this;
		SharedPreferences sharedPref = context.getSharedPreferences(getString(R.string.high_scores_file), Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = sharedPref.edit();
		
		int defaultValue = 0;
		for(int i=3; i>0; i--)
		{
			int highScore = sharedPref.getInt("HighScore" + i, defaultValue);
			String highScoreName = sharedPref.getString("HighScore" + i + "Name", "No One");
			if(_NewScore > highScore)
			{
				if(i<3)
				{
					editor.putInt("HighScore" + (i+1), highScore);
					editor.commit();
					editor.putString("HighScore" + (i+1) + "Name", highScoreName);
				}
				editor.putInt("HighScore" + i, _NewScore);
				editor.commit();
				editor.putString("HighScore" + i + "Name", _NewName);
				editor.commit();
			}
		}
	}*/
	/*
	private void ResetScores()
	{
		Context context = this;
		SharedPreferences sharedPref = context.getSharedPreferences(getString(R.string.high_scores_file), Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = sharedPref.edit();
		
		for(int i=3; i>0; i--)
		{
			editor.putInt("HighScore" + i, 0);
			editor.commit();
			editor.putString("HighScore" + i + "Name", "Empty");
			editor.commit();
		}
	}*/
}