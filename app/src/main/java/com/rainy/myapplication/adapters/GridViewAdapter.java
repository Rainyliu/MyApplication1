package com.rainy.myapplication.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.rainy.myapplication.R;

import java.util.List;

/**
 * Author: liuyuting
 * Description: MyApplication
 * Since: 2017/3/6 10:38
 */

public class GridViewAdapter extends BaseAdapter{
    private Context context;
    private List<Drawable> list;
    private LayoutInflater inflater;

   public GridViewAdapter(Context context, List<Drawable> list){
       this.context = context;
       this.list = list;
       inflater = LayoutInflater.from(context);
   }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            convertView = inflater.inflate(R.layout.gridview_item,parent,false);
            holder = new ViewHolder();
            holder.iv = (ImageView) convertView.findViewById(R.id.ivItem);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.iv.setImageDrawable(list.get(position));

        return convertView;
    }

    class ViewHolder{
        ImageView iv;
    }
}
