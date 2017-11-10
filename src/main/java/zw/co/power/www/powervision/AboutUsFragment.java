package zw.co.power.www.powervision;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class AboutUsFragment extends ListFragment {

    String[] aboutus = {"ABOUT US", "VISION", "MISSION"};

    String [] abu = {"Powervision (Pvt) Limited is an Engineering company specializing in Renewable energy, Power Backup and Power Protection Solutions. " +
            "It is one of Zimbabwe’s leading solutions provider in the field of alternative back\u00ADup power and is focused on providing end\u00ADto end electrical power solutions to all the major sectors of industry." +
            " Our range of products includes, diesel electric generators, uninterruptible power supply units, automatic voltage regulators, renewable energy solutions, surge and lightning protectors, power and energy audits and power management consultancy services." +
            " With more than 19 years’ experience in the electrical power field and linkages to some of the world’s best power equipment manufacturers, Powervision is a company with a proven track record and are dedicated to providing customized solutions for meet all of our customers needs." +
            " We are proud of our customer relationships and our partnership approach ensures that we deliver to customer requirements and exceed expectations.",
            "To be the Power Engineering Technological integrator of choice.",
            "Powervision aims to provide high quality power engineering services by engaging our clients to develop efficient and cost effective solutions. " +
                    "We aim to deliver Value for Money to customers who demand quality, innovative, technologically superior products and services.\n",
    };


    String [] title  = {"ABOUT US","VISION","MISSION"};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ListAdapter adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, aboutus);
        setListAdapter(adapter);


        View rootView = inflater.inflate(R.layout.fragment_aboutus, container, false);

        return rootView;
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // TODO Auto-generated method stub


        Intent i = new Intent(getActivity(),AboutUsActivity.class);
        i.putExtra("ABU_KEY",abu[position]);
        i.putExtra("TITLE_KEY",title[position]);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_TASK_ON_HOME);
        startActivity(i);

    }

}