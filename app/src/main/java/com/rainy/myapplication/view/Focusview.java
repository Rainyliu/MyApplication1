package com.rainy.myapplication.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Scroller;

/**
 * 自定义UI界面
 * 类似gridview
 * Author: liuyuting
 * Description: MyApplication
 * Since: 2017/3/6 11:37
 */

public class Focusview extends ViewGroup{
    /**
     * 设置mScroller滚动的位置时，并不会导致View的滚动，
     通常是用mScroller记录/计算View滚动的位置，
     再重写View的computeScroll()，完成实际的滚动。
     */
    private Scroller mScroller;//实现View平滑滚动的一个Helper类
    private int scaledTouchSlop;

    public Focusview(Context context) {
        this(context,null,0);
    }

    public Focusview(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public Focusview(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initViewGroup(context);
    }

    private void initViewGroup(Context context) {
        mScroller = new Scroller(context);

        scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();

    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = MeasureSpec.getSize(widthMeasureSpec);
        int height = MeasureSpec.getSize(heightMeasureSpec);
    }
}
