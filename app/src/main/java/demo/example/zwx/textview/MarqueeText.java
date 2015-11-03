package demo.example.zwx.textview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by luo on 15-11-2.
 */
public class MarqueeText extends TextView {
    public MarqueeText(Context context) {
        super(context);
    }

    public MarqueeText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MarqueeText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



    public  boolean isFocused(){
        return true;
    }
}
