package com.ravisravan.mapclick;

/**
 * Created by ravisravankumar on 07/03/16.
 */

import com.google.android.gms.maps.SupportMapFragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MySupportMapFragment extends SupportMapFragment implements TouchableWrapper.MapTouchListener{
    public View mOriginalContentView;
    public TouchableWrapper mTouchView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        mOriginalContentView = super.onCreateView(inflater, parent, savedInstanceState);
        mTouchView = new TouchableWrapper(getActivity(),this);
        mTouchView.addView(mOriginalContentView);
        return mTouchView;
    }

    @Override
    public View getView() {
        return mOriginalContentView;
    }

    @Override
    public void onMapTouchActionDown() {
        Log.e(this.getClass().getSimpleName(),"Action Down");
    }

    @Override
    public void onMapTouchActionUp() {
        Log.e(this.getClass().getSimpleName(),"Action Up");
    }
}
