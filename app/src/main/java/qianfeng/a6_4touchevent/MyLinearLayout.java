package qianfeng.a6_4touchevent;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2016/9/28 0028.
 */
public class MyLinearLayout extends LinearLayout {


    public MyLinearLayout(Context context) {
        super(context);
    }

    public MyLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("google.sang", "dispatchTouchEvent: pre--MyLinearLayout");
        boolean b = super.dispatchTouchEvent(ev);
        Log.d("google.sang", "dispatchTouchEvent: post--MyLinearLayout");
        return b;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d("google.sang", "onInterceptTouchEvent: --MyLinearLayout");
//        return super.onInterceptTouchEvent(ev);
        return true;
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }
}
