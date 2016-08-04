package me.roney.sleeptime;

import android.app.Fragment;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;

public class MainActivity extends WearableActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fragment fragment = WearableListFragment.newInstance();
        getFragmentManager().beginTransaction().add(R.id.container, fragment).commit();
        //setAmbientEnabled();
//        mContainerView = (BoxInsetLayout) findViewById(R.id.container);
    }

//    @Override
//    public void onEnterAmbient(Bundle ambientDetails) {
//        super.onEnterAmbient(ambientDetails);
//        updateDisplay();
//    }
//
//    @Override
//    public void onUpdateAmbient() {
//        super.onUpdateAmbient();
//        updateDisplay();
//    }

//    @Override
//    public void onExitAmbient() {
//        updateDisplay();
//        super.onExitAmbient();
//    }

//    private void updateDisplay() {
//        if (isAmbient()) {
//            mContainerView.setBackgroundColor(getResources().getColor(android.R.color.black));
////            mTextView.setTextColor(getResources().getColor(android.R.color.white));
////            mClockView.setVisibility(View.VISIBLE);
////
////            mClockView.setText(AMBIENT_DATE_FORMAT.format(new Date()));
//        } else {
//            mContainerView.setBackground(null);
////            mTextView.setTextColor(getResources().getColor(android.R.color.black));
////            mClockView.setVisibility(View.GONE);
//        }
//    }
}
