package com.android_fans.test;

import android.app.Activity;
import android.os.Bundle;
/**
 * 
* @Project: Android-fans
* @PackagName: com.android_fans.test
* @ClassName: AActivity
* @Description: Hello ,@����-����� ,����AActivity,��һ���ύ�������� view �ˡ������´�setContentView(R.layout.activity_aactivity);
 */
public class AActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_b);
	}
}
