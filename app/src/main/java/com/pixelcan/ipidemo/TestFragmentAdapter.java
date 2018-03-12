package com.pixelcan.ipidemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by David Pacioianu on 2/12/16.
 */

class TestFragmentAdapter extends FragmentPagerAdapter {
    protected static final String[] CONTENT = new String[]{"This", "Is", "A", "Test",};

    private int mCount = 8;

    public TestFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return TestFragment.newInstance(CONTENT[position % CONTENT.length]);
    }

    @Override
    public int getCount() {
        return mCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return TestFragmentAdapter.CONTENT[position % CONTENT.length];
    }

    public static final class TestFragment extends Fragment {
        private static final String KEY_CONTENT = "TestFragment:Content";

        public static TestFragment newInstance(String content) {
            TestFragment fragment = new TestFragment();

            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                builder.append(content).append(" ");
            }
            builder.deleteCharAt(builder.length() - 1);
            fragment.mContent = builder.toString();

            return fragment;
        }

        private String mContent = "???";

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            if ((savedInstanceState != null) && savedInstanceState.containsKey(KEY_CONTENT)) {
                mContent = savedInstanceState.getString(KEY_CONTENT);
            }
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            TextView text = new TextView(getActivity());
            text.setGravity(Gravity.CENTER);
            text.setText(mContent);
            text.setTextSize(20 * getResources().getDisplayMetrics().density);
            text.setPadding(20, 20, 20, 20);

            LinearLayout layout = new LinearLayout(getActivity());
            layout.setLayoutParams(new ViewGroup.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT, LinearLayout.LayoutParams.FILL_PARENT));
            layout.setGravity(Gravity.CENTER);
            layout.addView(text);

            return layout;
        }

        @Override
        public void onSaveInstanceState(Bundle outState) {
            super.onSaveInstanceState(outState);
            outState.putString(KEY_CONTENT, mContent);
        }
    }
}
