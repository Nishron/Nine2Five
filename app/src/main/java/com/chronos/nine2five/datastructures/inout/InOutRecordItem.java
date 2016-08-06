package com.chronos.nine2five.datastructures.inout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.chronos.nine2five.R;
import com.chronos.nine2five.utils.Constants;

/**
 * Created by user on 16/07/2016.
 */
public class InOutRecordItem implements InOutListItem {
    private ViewHolder holder;
    private String mInDate;
    private String mOutDate;
    private String mDuration;

    public InOutRecordItem(String inDate,String outDate, String duration) {
        this.mInDate = inDate;
        this.mOutDate = outDate;
        this.mDuration = duration;
    }

    @Override
    public int getViewType() {
        return Constants.INOUT_RECORD_ITEM;
    }

//    @Override
//    //public View getView(LayoutInflater inflater, View convertView, ViewGroup parent) {
//    public View getView(int position, View convertView, ViewGroup parent) {
//        if (convertView == null) {
//            convertView = LayoutInflater.from(getContext()).inflate(R.layout.inout_record_item, parent, false);
//            holder = new ViewHolder();
//            holder.textViewInDate = (TextView) convertView.findViewById(R.id.txtInDate);
//            holder.textViewOutDate = (TextView) convertView.findViewById(R.id.txtOutDate);
//            holder.textViewDuration = (TextView) convertView.findViewById(R.id.txtInOutDuration);
//            convertView.setTag(holder);
//        } else {
//            holder = (ViewHolder) convertView.getTag();
//        }
//
//        holder.textViewInDate.setText(mInDate);
//        holder.textViewOutDate.setText(mOutDate);
//        holder.textViewDuration.setText(mDuration);
//
//        return convertView;
//    }

    private static class ViewHolder {
        TextView textViewInDate;
        TextView textViewOutDate;
        TextView textViewDuration;
    }

    public String getInDate() {
        return mInDate;
    }

    public String getOutDate() {
        return mOutDate;
    }

    public String getDuration() {
        return mDuration;
    }

    public void setOutDate(String outDate) {
        this.mOutDate = outDate;
    }

    public void setDuration(String duration) {
        this.mDuration = duration;
    }
}
