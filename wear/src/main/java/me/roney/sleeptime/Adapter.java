package me.roney.sleeptime;

import android.content.Context;
import android.support.wearable.view.WearableListView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by roneythomas on 2016-08-03.
 */

public class Adapter extends WearableListView.Adapter {
    private final LayoutInflater mInflater;
    private String[] mDataset;

    public Adapter(Context context, String[] dataset) {
        mInflater = LayoutInflater.from(context);
        mDataset = dataset;
    }

    @Override
    public WearableListView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new WearableListView.ViewHolder(mInflater.inflate(R.layout.list_item, null));
    }

    @Override
    public void onBindViewHolder(WearableListView.ViewHolder holder, int position) {
        TextView view = (TextView) holder.itemView.findViewById(R.id.name);
        view.setText(mDataset[position]);
        holder.itemView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
