package com.bt.andy.zhedian.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.bt.andy.zhedian.R;
import com.bt.andy.zhedian.messegeInfo.WorkProceInfo;

import java.util.List;

/**
 * @创建者 AndyYan
 * @创建时间 2018/7/17 15:17
 * @描述 ${TODO}
 * @更新者 $Author$
 * @更新时间 $Date$
 * @更新描述 ${TODO}
 */

public class SelectWorkProceAdapter extends BaseAdapter {
    private Context             mContext;
    private List<WorkProceInfo> mList;

    public SelectWorkProceAdapter(Context context, List list) {
        this.mContext = context;
        this.mList = list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        MyViewHolder viewHolder;
        if (null == view) {
            viewHolder = new MyViewHolder();
            view = View.inflate(mContext, R.layout.spinner_item_kind, null);
            viewHolder.tv_kind = view.findViewById(R.id.tv_kind);
            view.setTag(viewHolder);
        } else {
            viewHolder = (MyViewHolder) view.getTag();
        }
        viewHolder.tv_kind.setText(mList.get(i).getFName());
        return view;
    }

    class MyViewHolder {
        TextView tv_kind;
    }
}
