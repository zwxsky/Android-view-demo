package demo.example.zwx.textview.control;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.BounceInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

import demo.example.zwx.textview.R;
import demo.example.zwx.textview.View.BadgeView;

public class BadgerActivity extends Activity {

    Button  btn ;
    Button  btn1 ;
    BadgeView badge;
    BadgeView badge1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_badger);
        btn =(Button) findViewById(R.id.btn);
        btn1 =(Button) findViewById(R.id.btn1);

        badge = new BadgeView(this,btn);
        badge.setText("0");
        btn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub 
                if(badge.isShown()){
                    badge.increment(1);

                }else{
                    badge.show();
                }
            }
        });
        badge1 = new BadgeView(this, btn1);
        badge1.setText("123");
        badge1.setBadgePosition(BadgeView.POSITION_TOP_LEFT);
        badge1.setBadgeMargin(15);
        badge1.setBadgeBackgroundColor(Color.parseColor("#A4C639"));
        btn1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                TranslateAnimation anim = new TranslateAnimation(-100, 0, 0, 0);
                anim.setInterpolator(new BounceInterpolator());
                anim.setDuration(1000);
                badge1.toggle(anim, null);
            }
        });

    }
} 