package com.rainy.myapplication.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

import com.rainy.myapplication.utils.DensityUtil;

/**
 * 自定义的ImageView
 * Author: liuyuting
 * Description: MyApplication
 * Since: 2017/3/6 9:31
 */

public class MyImageView extends ImageView implements ShadowCallBack,View.OnClickListener, View.OnFocusChangeListener{

    private Context context;//上下文
    private ImageView whiteBorder;// 白色框
    private ScaleAnimEffect animEffect;//动画效果的类

    private float x = 0.0F;
    private float y = 0.0F;
    private int width = 0;// 放大前的宽
    private int height = 0;// 放大前的高

    private OnClickListener onClickListener;

    private OnFocusChangeListener onFocusChangeListener;

    /**
     * 注册焦点监听的动作
     * */
    public void initListener(OnFocusChangeListener onFocusChangeListener) {
        this.onFocusChangeListener = onFocusChangeListener;
    }


    public MyImageView(Context context) {
        this(context,null,0);
    }

    public MyImageView(Context context, AttributeSet attrs) {
        this(context, attrs,0);

    }

    public MyImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
        animEffect = new ScaleAnimEffect();
        width = DensityUtil.dip2px(context, 247);// 放大前的宽
        height = DensityUtil.dip2px(context, 357);// 放大前的高
    }

    @Override
    public void destroy() {

    }

    @Override
    public void initListener() {

    }

    /**
     * 注册onClicklistener监听器
     */
    public void initListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;

    }

    @Override
    public void initView() {

    }

    @Override
    public void updateData() {

    }

    /**
     * 点击事件
     * @param v
     */
    @Override
    public void onClick(View v) {

    }

    /**
     * 焦点变化
     * @param v
     * @param hasFocus
     */
    @Override
    public void onFocusChange(View v, boolean hasFocus) {

    }
}
