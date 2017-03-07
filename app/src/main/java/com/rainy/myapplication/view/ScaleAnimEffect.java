package com.rainy.myapplication.view;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

/**
 * 缩放
 * Author: liuyuting
 * Description: MyApplication
 * Since: 2017/3/6 9:36
 */

public class ScaleAnimEffect {
    private long duration;
//    private float fromAlpha;
    private float fromXScale;
    private float fromYScale;
//    private float toAlpha;
    private float toXScale;
    private float toYScale;

    /**
     * 透明度变化动画
     * @param fromAlpha
     * @param toAlpha
     * @param dueation
     * @param paramLong2
     * @return
     */
    public Animation alphaAnimation(float fromAlpha, float toAlpha, long dueation, long paramLong2) {
        AlphaAnimation localAlphaAnimation = new AlphaAnimation(fromAlpha, toAlpha);
        localAlphaAnimation.setDuration(dueation);
        localAlphaAnimation.setStartOffset(paramLong2);
        localAlphaAnimation.setInterpolator(new AccelerateInterpolator());
        return localAlphaAnimation;

    }

    /**
     * 缩放动画
     * this.fromXScale,
     * this.toXScale,
     * this.fromYScale,
     * this.toYScale,
     * 1,  int pivotXType,  X中心点的类型
     * 0.5F, float pivotXValue, X值
     * 1, int pivotYType, Y中心点的类型
     * 0.5F  float pivotYValue Y值
     * @return
     */
    public Animation createAnimation() {
        ScaleAnimation localScaleAnimation = new ScaleAnimation(this.fromXScale, this.toXScale, this.fromYScale, this.toYScale, 1, 0.5F, 1, 0.5F);
        localScaleAnimation.setFillAfter(true);
        localScaleAnimation.setInterpolator(new AccelerateInterpolator());
        localScaleAnimation.setDuration(this.duration);
        return localScaleAnimation;
    }

    /**
     * 设置参数
     * @param fromXScale
     * @param toXScale
     * @param fromYScale
     * @param toYScale
     * @param duration
     */
    public void setAttributs(float fromXScale, float toXScale, float fromYScale, float toYScale, long duration) {
        this.fromXScale = fromXScale;
        this.fromYScale = fromYScale;
        this.toXScale = toXScale;
        this.toYScale = toYScale;
        this.duration = duration;
    }
}
