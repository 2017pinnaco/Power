package zw.co.power.www.powervision;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

String product []  = {"Industrial and domestic diseal generators 8KVA-2200KVA." +
        "All kinds of generators accessories, such as sound Attenuated Enclosures /Containers" +
        ".Generators control panels automatic load transfer panel, synchronizing panels ,trailers ." +
        "etc",
        "Solar Deka batteries completely maintenance free, designed for deep cycle applications.  " +
        "Available in 100AH and 210AH.Batteries for backup power applications in ups, CSB, Panasonic and Yuasa.",
        "Outback Inverters designed for commercial and industrial use with ranges from 1KVA to 7KVA including genus inverters specifically designed for home use." +
        "Various accessories including charge controllers. ",
        "Suntech range of pv modules ranging from 30Watts to 290Watts in 12 and 24Volts.",
        "Suntech range of pv modules ranging from 30Watts to 290Watts in 12 and 24Volts.",
        "Surge protection for power supply systems both AC and DC Surge protection for it systems lightning and earthing protection",

        "The Led lights are most  common in Zimbabwe since they are energy saver."+
       "Led lights are recommended by Zesa holdings for domestic and commercial use rather than yellow lamps.",

        "The solar lights are designed to achieve the perfect solution for your commercials or high demand flood light needs ." +
        "Solar flood lights blends the benefits of dusk or dawn flood light operation."+
          "Its been nice to say goodbye to darkness in the evening and costly electricity bills."};









    String names [] = {"Generator","Batteries","Inverters","Modules","Pumps","Surge","Led lights","Solar lights"};

int imge [] = {R.drawable.generator,R.drawable.batteries,R.drawable.inverters,R.drawable.modules,R.drawable.pumps,R.drawable.surge,R.drawable.led_lights,R.drawable.solar_lights};




    Context c;
    ArrayList<Business> business;
    LayoutInflater inflater;

    public CustomAdapter(Context c, ArrayList<Business> business) {
        this.c = c;
        this.business = business;
    }

    @Override
    public int getCount() {
        return business.size();
    }

    @Override
    public Object getItem(int position) {
        return business.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (inflater == null) {
            inflater = (LayoutInflater)
                    c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.model, parent, false);
        }
        // give views
        TextView nameTxt = (TextView) convertView.findViewById(R.id.txt);
        ImageView img = (ImageView) convertView.findViewById(R.id.img);

        final String name = business.get(position).getName();
        int image = business.get(position).getImage();

        nameTxt.setText(name);
        img.setImageResource(image);
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(c, DetailActivity.class);
                i.putExtra("PRODUCT_KEY", product[position]);
                i.putExtra("IMGE_KEY",imge[position]);
                i.putExtra("NAMES_KEY", names[position]);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_TASK_ON_HOME);
                c.startActivity(i);

            }
        });
        return convertView;

    }
}









