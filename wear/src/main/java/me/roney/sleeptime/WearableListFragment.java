package me.roney.sleeptime;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.wearable.view.WearableListView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by roneythomas on 2016-08-04.
 */

public class WearableListFragment extends Fragment implements WearableListView.ClickListener {
    String[] elements = {"Sleep Now, When to wake up", "Wake up at"};
    WearableListView listView;

    public static WearableListFragment newInstance() {

        Bundle args = new Bundle();

        WearableListFragment fragment = new WearableListFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_view, container, false);
        listView = (WearableListView) view.findViewById(R.id.wearable_list);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        listView.setAdapter(new Adapter(getActivity(), elements));
        listView.setClickListener(this);
    }

    @Override
    public void onClick(WearableListView.ViewHolder viewHolder) {
        switch (viewHolder.getAdapterPosition()) {
            case 0:
                Log.d("Main Activity", "onClick: 0");
                Fragment fragment = SleepNowFragment.newInstance();
                getFragmentManager().beginTransaction().replace(R.id.container, fragment).addToBackStack("YES").commit();
                break;
            case 1:
                Log.d("Main Activity", "onClick: 1");
                break;
        }
    }

    @Override
    public void onTopEmptyRegionClick() {

    }
}
