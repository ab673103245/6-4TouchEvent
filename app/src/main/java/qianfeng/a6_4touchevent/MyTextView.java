package qianfeng.a6_4touchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/9/28 0028.
 */
public class MyTextView extends TextView {

    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

//    @Override
//    public boolean dispatchTouchEvent(MotionEvent event){
//
//        return super.dispatchTouchEvent(event);
//    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d("google.sang", "dispatchTouchEvent: pre--MyTextView");
        boolean b = super.dispatchTouchEvent(event);
        Log.d("google.sang", "dispatchTouchEvent: post--MyTextView");
        return b;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

}
