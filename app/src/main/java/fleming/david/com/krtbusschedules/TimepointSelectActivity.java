package fleming.david.com.krtbusschedules;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class TimepointSelectActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_timepoint_select);

        Intent intent = getIntent();

        final String routeSelected = intent.getStringExtra("routeSelected");
        final String daySelected = intent.getStringExtra("daySelected");
        final String directionSelected = intent.getStringExtra("directionSelected");

         final String[] timepointsArray = ItemLoader.getTimepoints(routeSelected,daySelected,directionSelected);

        LinearLayout layout = (LinearLayout) findViewById(R.id.TimepointLayout);

        for (final String desc : timepointsArray) {
            Button newBtn = new Button(this);
            newBtn.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            newBtn.setText(desc);
            layout.addView(newBtn);

            newBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(TimepointSelectActivity.this, KRTActivity.class);
                    intent.putExtra("routeSelected", routeSelected);
                    intent.putExtra("daySelected", daySelected);
                    intent.putExtra("directionSelected", directionSelected);
                    intent.putExtra("timepointSelected", desc);
                    startActivity(intent);
                }
            });
        }
    }
}
