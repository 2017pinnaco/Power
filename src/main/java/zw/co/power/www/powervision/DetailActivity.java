package zw.co.power.www.powervision;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);


        Intent i = this.getIntent();

        String product = i.getExtras().getString("PRODUCT_KEY");

        String names = i.getExtras().getString("NAMES_KEY");

        int imge = i.getExtras().getInt("IMGE_KEY");


        TextView txtV = (TextView) findViewById(R.id.txtV);
        txtV.setText(names);

        TextView txt = (TextView) findViewById(R.id.TXT);
        txt.setText(product);
        txt.setMovementMethod(new ScrollingMovementMethod());


        ImageView  imageView = (ImageView) findViewById(R.id.imgView);
        imageView.setImageResource(imge);





     }
    }

