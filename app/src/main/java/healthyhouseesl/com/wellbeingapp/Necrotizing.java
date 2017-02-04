package healthyhouseesl.com.wellbeingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Necrotizing extends AppCompatActivity {


    TextView Nec;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_necrotizing);
        String newString;
        if(savedInstanceState == null){
            Bundle extras = getIntent().getExtras();
            if(extras == null){
                newString = null;
            }
            else {
                newString = extras.getString("Necro");
            }

        }
        else{
            newString = (String) savedInstanceState.getSerializable("Necro");
        }
        Nec = (TextView)findViewById(R.id.somethingelse);
        Nec.setText(newString);
    }
    }

