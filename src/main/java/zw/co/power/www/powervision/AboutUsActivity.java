package zw.co.power.www.powervision;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class AboutUsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);


        Intent i = this.getIntent();
        String abu= i.getExtras().getString("ABU_KEY");
        String title = i.getExtras().getString("TITLE_KEY");

        TextView txt1 = (TextView) findViewById(R.id.txtVw1);
        txt1.setText(title);


        TextView txt = (TextView) findViewById(R.id.text1);
        txt.setText(abu);
        txt.setMovementMethod(new ScrollingMovementMethod());



    }

}
