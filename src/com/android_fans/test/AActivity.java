package com.android_fans.test;

import android.app.Activity;
import android.os.Bundle;
/**
 * 
* @Project: Android-fans
* @PackagName: com.android_fans.test
* @ClassName: AActivity
* @Description: Hello ,@北京-邶溟涙 ,这是AActivity,这一次提交忘了设置 view 了。留在下次setContentView(R.layout.activity_aactivity);
 */
public class AActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_b);
	}
}
