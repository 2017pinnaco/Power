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

public class ServiceFragment extends ListFragment {

    String[] service = {"ALTERNATE GREEN ENERGY ", "POWER PROTECTION SYSTEMS ", "ELECTRICAL INSTALLATIONS",
            "VALUE ADDED SERVICES ", "CONSULTATION SERVICES ", "CUSTOMER SERVICE & SUPPORT"};

    String [] title  = {"SOLAR POWER SYSTEMS FOR COMMERCIAL FARMING & HOME USE","POWERVISION  PROVIDES  SERVICE  FOR  VALUE  PROTECTION  \u00AD  UPS  \u00AD  SURGE  PROTECTION  THAT INCLUDES",
            "POWERVISION  PROVIDES  ELECTRICAL  SERVICES  FOR  DIFFERENT  INDUSTRIAL  AND  HOUSEHOLD SETTINGS","VALUE ADDED SERVICES ", "CONSULTATION SERVICES ", "CUSTOMER SERVICE & SUPPORT"};

   String []  ser = {"Our solar solutions offer energy independence and reliability. " +
           " offer various products that are solar powered & provide an alternative to grid power. We are the authorized service centre for Outback Power one of the international leading companies in the manufacture of high quality power inverters." +
           " Solar Water Pumps We design, install and service solar powered water pumping solutions which can be used for Lodges, Horticulture Gardens, Small Scale farms, Homesteads and Livestock watering. They require no inverter or batteries and are simple to use and maintain. " +
           "Solar water heaters Domestic and industrial use Solar lighting We offer various solutions for solar lighting starting from the home and office to more elaborate designs for street/parking and security lighting.\n",


              "Constant  blackouts,  voltage  fluctuations  and  lightning  can  easily  damage  your  critical  and  expensive equipment." +
                      " Powervision provides products that can help to protect you and your capital investments." +
                      " We offer Uninterruptible Power Supplies (UPS) to keep you going during power outages and protect your equipment from the daily transients in the grid power." +
                      " With more than 20 years in the industry, you can rest assured of our expertise in supplying, installing & maintaining Uninterruptible Power Supply Systems working with reputable brands." +
                      " We  offer  the  best  after  sales  service  as  our  technicians  are  trained  constantly  to  meet  with  the changing industry trends." +
                      "In areas prone to mains voltage fluctuations, Powervision has got premium Surge protection devices and voltage regulators that ensure the quality and consistency of power going to your facilities." +
                      "Our Rayvoss range of products carry a 10 year warranty as testament to their quality. Other products include Constant Voltage Transformers and Stabilized Power Supplies." +
                      "We also offer Phase angle relays for the protection of borehole pumps from surges and lightning strikes.",

              "We  undertake  electrical  installations  for  all  the  equipment  that  we  supply  in  addition  we  also  undertake electrical repairs and maintenance on all other equipment." +
                      " We also have experience and have commissioned projects in the LV and HT power line and substation installations.",

             "Powervision also offers premium solutions for integrating the various power technologies to ensure optimal and useable solutions. " +
                     "For example our hybrid systems, incorporating Outback Power products, have advanced communication and remote monitoring functionality making them the best choice for remote base stations." +
                     "Our solutions make it possible to connect the inverter to the generator, enabling the inverter to start the generator as and when needed saving on fuel.",


              "Site  Audits  for  electrical  installations  Power  Audits  for  new  facilities  and  for  backup  and  standby  power requirements." +
                      "Energy Audits Energy Efficiency Management Specification development for reference purposes and project proposals." +
                      "Project management and planning for renewable energy projects, electrical installations, electrical reticulation and backup power system installations.",

            "Our sales and after sales service network has helped drive positive and sustainable change in our business." +
                    "Powervision has a dedicated support team that is available 24 Hours a day throughout the year to serve and support our customer base and respond quickly to their needs." +
                    "We have a call center where our clients can call for friendly and competent support services." +
                    "We have a fully stocked workshop that is equipped for servicing and repairing of all power related products by our highly qualified technical staff that are trained and certified by our international partners that we deal with."};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ListAdapter adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, service);
        setListAdapter(adapter);


        View rootView = inflater.inflate(R.layout.fragment_service, container, false);

        return rootView;
    }
     @Override
          public void onListItemClick(ListView l, View v, int position, long id) {
        // TODO Auto-generated method stub

         Intent i = new Intent(getActivity(),ServiceActivity.class);
         i.putExtra("SER_KEY",ser[position]);
         i.putExtra("TITLE_KEY",title[position]);
         i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_TASK_ON_HOME);
         startActivity(i);



    }
}
