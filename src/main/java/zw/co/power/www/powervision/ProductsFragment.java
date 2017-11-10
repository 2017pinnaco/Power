package zw.co.power.www.powervision;


import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ProductsFragment extends ListFragment  {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_products, container, false);
        ListView lv = (ListView) rootView.findViewById(android.R.id.list);

        CustomAdapter adapter = new CustomAdapter(this.getActivity(), getBusinessProducts());
        lv.setAdapter(adapter);
        return rootView;
    }

    private ArrayList<Business> getBusinessProducts() {
        ArrayList<Business> pd = new ArrayList<>();
      Business business = new Business("GENERATOR",R.drawable.generator);
        pd.add(business);
        business = new Business("BATTERIES",R.drawable.batteries);
       pd.add(business);
  business = new Business("INVERTERS",R.drawable.inverters);
       pd.add(business);
  business = new Business("MODULES",R.drawable.modules);
       pd.add(business);
  business = new Business("PUMPS",R.drawable.pumps);
       pd.add(business);
  business = new Business("SURGE",R.drawable.surge);
       pd.add(business);
        business = new Business("LED LIGHTS",R.drawable.led_lights);
       pd.add(business);
        business = new Business("SOLAR LIGHTS",R.drawable.solar_lights);
       pd.add(business);

        return pd;
    }
    @Override
    public String toString() {
        String title="Products";
        return title;
    }
}








