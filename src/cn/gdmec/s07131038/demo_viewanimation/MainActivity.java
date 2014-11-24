package cn.gdmec.s07131038.demo_viewanimation;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
	private TextView tv;
	private Button btnAlpha,btnTranslate,btnRotate,btnScale,btnAll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=(TextView) findViewById(R.id.textView1);
        btnAlpha=(Button) findViewById(R.id.button1);
        btnTranslate=(Button) findViewById(R.id.button2);
        btnScale=(Button) findViewById(R.id.button3);
        btnRotate=(Button) findViewById(R.id.button4);
        btnAll=(Button) findViewById(R.id.button5);
        btnAlpha.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Animation alpha=AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha_animation);
				tv.startAnimation(alpha);
			}
		});
        btnTranslate.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Animation animation=AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate_animation);
				tv.startAnimation(animation);
			}
		});
        btnScale.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Animation animation=AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale_animation);
				tv.startAnimation(animation);
			}
});
        btnRotate.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Animation animation=AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate_animation);
				tv.startAnimation(animation);
			}
});
        btnAll.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Animation animation=AnimationUtils.loadAnimation(MainActivity.this, R.anim.all_animation);
				tv.startAnimation(animation);
			}
});
    }


 
    
}
