package com.example.fourwebcontent;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class Jabberwocky extends Activity {
	WebView myWebView;
	Button wikiButton;
	Button imageButton;
	MediaPlayer jabberwockymusic;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.jabberwocky);
		
		myWebView = (WebView) findViewById(R.id.webView);
		myWebView.loadUrl("file:///android_asset/jabberwocky.html");
		myWebView.getSettings().setBuiltInZoomControls(true);
		
		wikiButton = (Button) findViewById(R.id.WikiButton);
		imageButton = (Button) findViewById(R.id.imageButton);
		imageButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String imageButtonText = imageButton.getText().toString();
				if(imageButtonText.equals("Open Image")){
					myWebView.loadUrl("file:///android_asset/jabberwockyimage.html");
					imageButton.setText("Open Poem");
				} else {
					myWebView.loadUrl("file:///android_asset/jabberwocky.html");
					imageButton.setText("Open Image");
				}
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jabberwocky, menu);
		return true;
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	    // Check if the key event was the Back button and if there's history
	    if ((keyCode == KeyEvent.KEYCODE_BACK) && myWebView.canGoBack()) {
	        myWebView.goBack();
	        return true;
	    }
	    // If it wasn't the Back key or there's no web page history, bubble up to the default
	    // system behavior (probably exit the activity)
	    return super.onKeyDown(keyCode, event);
	}
	
	public void openWiki(View v) {
		String url = "http://en.wikipedia.org/wiki/Jabberwocky";
		Intent i = new Intent(Intent.ACTION_VIEW);
		i.setData(Uri.parse(url));
		startActivity(i);
	}
	
	/*public void openImage(View v){
		myWebView.loadUrl("file:///android_asset/jabberwockyimage.html");
		myWebView.getSettings().setBuiltInZoomControls(true);
		
	}*/
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		jabberwockymusic = MediaPlayer.create(this, R.raw.jabberwockymusic);
		jabberwockymusic.start();
		jabberwockymusic.setLooping(true);
		super.onResume();
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		jabberwockymusic.stop();
		jabberwockymusic.release();
		super.onPause();
	}
}
