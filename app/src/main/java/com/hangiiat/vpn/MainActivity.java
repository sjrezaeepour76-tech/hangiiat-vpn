package com.hangiiat.vpn;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(30, 30, 30, 30);
        layout.setBackgroundColor(Color.rgb(12, 18, 35));

        TextView title = new TextView(this);
        title.setText("HANGIIAT");
        title.setTextColor(Color.WHITE);
        title.setTextSize(32);
        title.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText("Secure Connection");
        subtitle.setTextColor(Color.LTGRAY);
        subtitle.setTextSize(16);
        subtitle.setGravity(Gravity.CENTER);

        Button connectButton = new Button(this);
        connectButton.setText("CONNECT");

        TextView status = new TextView(this);
        status.setText("Disconnected");
        status.setTextColor(Color.LTGRAY);
        status.setTextSize(16);
        status.setGravity(Gravity.CENTER);

        connectButton.setOnClickListener(v ->
            status.setText("VPN server not configured")
        );

        layout.addView(title);
        layout.addView(subtitle);
        layout.addView(connectButton);
        layout.addView(status);

        setContentView(layout);
    }
}
