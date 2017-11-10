package zw.co.power.www.powervision;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class ServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        Intent i = this.getIntent();

        String title = i.getExtras().getString("TITLE_KEY");
        String ser = i.getExtras().getString("SER_KEY");


        TextView text = (TextView) findViewById(R.id.textVw);
                        text.setText(title);

        TextView txt = (TextView) findViewById(R.id.text);
                      txt.setText(ser);
              txt.setSingleLine(false);
        txt.setMovementMethod(new ScrollingMovementMethod());


    }
}
