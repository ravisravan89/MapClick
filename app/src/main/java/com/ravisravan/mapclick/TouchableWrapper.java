package com.ravisravan.mapclick;

/**
 * Created by ravisravankumar on 07/03/16.
 */
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class TouchableWrapper extends FrameLayout {

    private MapTouchListener mapTouchListener;

    public TouchableWrapper(Context context,MapTouchListener mapTouchListener) {
        super(context);
        this.mapTouchListener = mapTouchListener;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {

        switch (event.getAction()) {

            case MotionEvent.ACTION_DOWN:
                //MainActivity.mMapIsTouched = true;
                mapTouchListener.onMapTouchActionDown();
                break;

            case MotionEvent.ACTION_UP:
                //MainActivity.mMapIsTouched = false;
                mapTouchListener.onMapTouchActionUp();
                break;
        }
        return super.dispatchTouchEvent(event);
    }

    public interface MapTouchListener{
        public void onMapTouchActionDown();
        public void onMapTouchActionUp();
    }
}