package zw.co.power.www.powervision;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.Locale;


/**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {


        protected Context mContext;

        public SectionsPagerAdapter(Context context,FragmentManager fm) {
            super(fm);
            mContext = context;
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).

            switch (position) {
                case 0:
                       return new ProductsFragment();
                case 1:
                       return new ServiceFragment();
                case 2:
                       return new AboutUsFragment();
            }
            return null;

        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            Locale l = Locale.getDefault();
            switch (position) {
                case 0:
                    return mContext.getString(R.string.SECTION_1).toUpperCase(l);
                case 1:
                    return mContext.getString(R.string.SECTION_2).toUpperCase(l);
                case 2:
                    return mContext.getString(R.string.SECTION_3).toUpperCase(l);
            }
            return null;

        }
    }

