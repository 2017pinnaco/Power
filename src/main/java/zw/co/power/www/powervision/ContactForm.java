package zw.co.power.www.powervision;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ContactForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_form);
    }


    public void send_click(View v) {

        EditText name = (EditText) findViewById(R.id.name);
        EditText email = (EditText) findViewById(R.id.email);
        EditText subject = (EditText) findViewById(R.id.subject);
        EditText message = (EditText) findViewById(R.id.message);


        if (name.getText().toString().equals(""))
            name.setError("field required");

        else if (email.getText().toString().equals(""))
            email.setError("field required");

        else if (subject.getText().toString().equals(""))
            subject.setError("field required");

        else if (message.getText().toString().equals(""))
            message.setError("field required");

        else {
            Intent i = new Intent(Intent.ACTION_SENDTO);
            i.setData(Uri.parse("mailto:"));
            i.putExtra(Intent.EXTRA_EMAIL, new String[]{"sales@power.co.zw"});
            i.putExtra(Intent.EXTRA_SUBJECT, subject.getText().toString());
            i.putExtra(Intent.EXTRA_TEXT, " , \n" + message.getText().toString() + "\n ,"
                    + email.getText().toString());
            try {
                startActivity(Intent.createChooser(i, "send mail"));
            } catch (android.content.ActivityNotFoundException ex) {
                Toast.makeText(this, "no mail app found", Toast.LENGTH_SHORT).show();
            } catch (Exception ex) {
                Toast.makeText(this, "unexpected error" + ex.toString(), Toast.LENGTH_SHORT).show();
            }
        }
    }
}