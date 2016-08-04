package me.roney.sleeptime;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Date;

/**
 * Created by roneythomas on 2016-08-04.
 */

public class SleepNowFragment extends Fragment {
    public static SleepNowFragment newInstance() {
        
        Bundle args = new Bundle();
        
        SleepNowFragment fragment = new SleepNowFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("dslkf", ""+(new Date().toString()));
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
