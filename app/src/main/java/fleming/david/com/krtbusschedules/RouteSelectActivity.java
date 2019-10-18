package fleming.david.com.krtbusschedules;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class RouteSelectActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_route_select);

        final String[] routeItems = getResources().getStringArray(R.array.routes_arrays);

        LinearLayout layout = (LinearLayout) findViewById(R.id.RoutesLayout);

        for (final String desc : routeItems) {
            Button newBtn = new Button(this);
            newBtn.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            newBtn.setText(desc);
            layout.addView(newBtn);

            newBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(RouteSelectActivity.this, KRTActivity.class);
                    intent.putExtra("routeSelected", desc);
                    startActivity(intent);
                }
            });
        }
    }
}
