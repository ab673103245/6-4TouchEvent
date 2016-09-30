package qianfeng.a6_4touchevent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
/**
 * 事件分发三大方法：
 * 1.dispatchTouchEvent（事件分发）、
 * <p>
 * 2.onTouchEvent（事件消费/事件处理）,返回true表示事件已处理，返回false表示事件未处理
 * <p>
 * 3.onInterceptTouchEvent（事件拦截，只有容器有事件拦截的方法），true表示将事件拦截，false表示不拦截
 * <p>
 * 当手指按下时，首先调用Activity的dispatchTouchEvent方法进行事件分发，后续的所有的方法都在super.dispatchTouchEvent(ev);
 * 方法中执行，在super.dispatchTouchEvent(ev);方法中，首先调用了LinearLayout的dispatchTouchEvent方法进行事件分发，在LinearLayout的事件分发方法中首先调用了
 * LinearLayout的onInterceptToutchEvent方法，该方法的返回值分未两种：【1】该方法默认返回false表示不拦截事件，则事件会继续向下分发，此时调用TextView的dispatchTouchEvent，TextView的
 * dispatchTouchEvent又将事件发给TextView的onTouchEvent，TextView的onTouchEvent返回值有两种：【1.1】TextView的onTouchEvent默认情况下返回false表示事件未处理，
 * 此时会调用LinearLayout的onTouchEvent方法进行事件处理，默认情况下，LinearLayout的onTouchEvent也是返回false，表示事件未处理，此时会将事件继续向上传递给
 * Activity的onTouchEvent，至此，按下操作结束，后续的移动和抬起操作都将在Activity的onTouchEvent方法中进行处理；【1.2】TextView的onTouchEvent返回true表示
 * 事件已处理,此时按下操作到此结束，不再会调用父容器的onTouchEvent方法。【2】如果LinearLayout的onInterceptTouchEvent方法返回true，表示容器对事件进行拦截，
 * 此时调用LinearLayout的onTouchEvent方法对事件进行处理，事件不再继续向下分发。而LinearLayout的onTouchEvent方法默认返回false，表示事件未处理，此时会再调用
 * Activity的onTouchEvent，如果LinearLayout的onTouchEvent方法返回true表示对事件已处理，事件到此结束。
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d("google.sang", "dispatchTouchEvent: pre--MainActivity");
        boolean b = super.dispatchTouchEvent(ev);
        Log.d("google.sang", "dispatchTouchEvent: post--MainActivity");
        return b;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d("google.sang", "onTouchEvent: --MainActivity");
        return super.onTouchEvent(event);
    }

}
