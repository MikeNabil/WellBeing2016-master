package healthyhouseesl.com.wellbeingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity_HomeScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity__home_screen);

        defineButtons();

    }

    private void defineButtons() {
        findViewById(R.id.BackgroundInfoButton).setOnClickListener(buttonClickListener);//this sets the first button ("BackgroundInfo") so it can be pressed and will take you to the background info page. The XML for this page is (activity_faq.xml)
        findViewById(R.id.DocotorFAQButton).setOnClickListener(buttonClickListener); //this sets the second button ("FAQ") so that it can be pressed and will take you to the FAQ page. The XML for this page is (activity_faq.xml)
        findViewById(R.id.AntiBioInfoButton).setOnClickListener(buttonClickListener); //this sets the third button ("Antibiotic Info") so that it can be pressed and will take you to the Antibiotic Bio page. The XML for this page is (activity_anti_bio.xml)
        findViewById(R.id.IllnessesInfoButton).setOnClickListener(buttonClickListener); //same as above. XML page is (activity_illness_info.xml)
        findViewById(R.id.DoAndDontButton).setOnClickListener(buttonClickListener);
        findViewById(R.id.LocationButton).setOnClickListener(buttonClickListener);
        findViewById(R.id.SourcesInfoButton).setOnClickListener(buttonClickListener);
    }

    private View.OnClickListener buttonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) { //here we are establishing the buttons and listening for each press so we can see which is selected (FAQ, Antibio Info. Illnesses, etc)
            switch (view.getId()) {
                case R.id.BackgroundInfoButton:// these are the ids for the buttons being called
                    Intent BackgroundInfo = new Intent("healthyhousees1.com.wellbeingapp.BackgroundInfo");//first button seen on Main page
                    startActivity(BackgroundInfo);
                    break;
                case R.id.DocotorFAQButton:
                    Intent FAQ = new Intent("healthyhousees1.com.wellbeingapp.FaqActivity");
                    startActivity(FAQ);
                    break;
                case R.id.AntiBioInfoButton:
                    Intent AntiBio = new Intent("healthyhouseesl.com.wellbeingapp.AntiBio");
                    startActivity(AntiBio);
                    break;
                case R.id.IllnessesInfoButton:
                    Intent Illness = new Intent("healthyhouseesl.com.wellbeingapp.IllnessInfo");
                    startActivity(Illness);
                    break;
                case R.id.DoAndDontButton:
                    Intent Resources = new Intent("healthyhouseesl.com.wellbeingapp.Resources");
                    startActivity(Resources);
                    break;
                case R.id.LocationButton:
                    Intent Doctor = new Intent("healthyhouseesl.com.wellbeingapp.DoctorActivity");
                    startActivity(Doctor);
                    break;
                case R.id.SourcesInfoButton:
                    Intent SourcesInfo = new Intent("healthyhousees1.com.wellbeingapp.SourcesInfo");
                    startActivity(SourcesInfo);
                    break;

            }
        }
    };
    //the below code is commented but hasn't been deleted for reference and my mental well being . It allowed the pressing of only one button but served as a starting off point.

   /* public void OnClickButtonListener(){
        button_sbm = (Button)findViewById(R.id.button);
        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent("healthyhouseesl.com.wellbeingapp.FaqActivity");
                        startActivity(intent);
                    }
                }
        );
    } */

}
