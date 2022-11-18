package com.teamDroiders.ladybuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_about_us);
        Button button=findViewById (R.id.contactUs);
        button.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                composeEmail();
            }
        });
    }
    public void composeEmail() {
        String subject="Contacting for LadyBuddy";
        String mailto = "mailto:dhruvabhattacharya130102@gmail.com" +
                "?cc="+"dhruva.bhattacharya.csai.20@ggits.net"+
                "&bcc="+""+
                "&subject=" + Uri.encode(subject);


        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse(mailto));

        try {
            startActivity(emailIntent);
        } catch (ActivityNotFoundException e) {
            //TODO: Handle case where no email app is available
        }


    }
}
