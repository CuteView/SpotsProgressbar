package com.deekea.spotsprogressbar.library;

import android.animation.TimeInterpolator;

/**
 * Created by Deekea on 2015/4/21.
 */
public class DecelerateAccelerateInterpolator implements TimeInterpolator {

    @Override
    public float getInterpolation(float input) {
        return (float) (Math.asin(2 * input - 1) / Math.PI + 0.5);
    }
}
