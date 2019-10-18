package fleming.david.com.krtbusschedules;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class DaySelectActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_day_select);

        Intent intent = getIntent();

        final String routeSelected = intent.getStringExtra("routeSelected");

        final String[] daysArray = ItemLoader.getDayItems(routeSelected);

        LinearLayout layout = findViewById(R.id.DaysLayout);

        for (final String desc : daysArray) {
            Button newBtn = new Button(this);
            newBtn.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            newBtn.setText(desc);
            layout.addView(newBtn);

            newBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(DaySelectActivity.this, KRTActivity.class);
                    intent.putExtra("routeSelected", routeSelected);
                    intent.putExtra("daySelected", desc);
                    startActivity(intent);
                }
            });
        }
    }
}