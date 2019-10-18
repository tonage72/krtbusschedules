package fleming.david.com.krtbusschedules;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class KRTActivity extends Activity {

    private String[] listOfTimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);

        Button mButtonRoute;
        Button mButtonDay;
        Button mButtonDirection;
        Button mButtonTimepoint;
        TextView mTextTimeOutput;

        final Intent intent = getIntent();

        mButtonRoute = findViewById(R.id.buttonRoute);
        if (intent.hasExtra("routeSelected")) {
            mButtonRoute.setText(intent.getStringExtra("routeSelected"));
        } else {
            mButtonRoute.setText("SELECT A ROUTE");
            currentSelectButton(mButtonRoute);
        }

        mButtonRoute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KRTActivity.this, RouteSelectActivity.class);
                startActivity(intent);
            }
        });

        mButtonDay = findViewById(R.id.buttonDay);
        if (intent.hasExtra("routeSelected")) {

            if (intent.hasExtra("daySelected")) {
                mButtonDay.setText(intent.getStringExtra("daySelected"));
            } else {
                mButtonDay.setText("SELECT DAY OF WEEK");
                currentSelectButton(mButtonDay);
            }

            mButtonDay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    final String mRoute = intent.getStringExtra("routeSelected");

                    Intent intent = new Intent(KRTActivity.this, DaySelectActivity.class);
                    intent.putExtra("routeSelected", mRoute);
                    startActivity(intent);
                }
            });

        } else {
            mButtonDay.setEnabled(false);
            mButtonDay.setText("SELECT A ROUTE FIRST");
            selectPreviousFirst(mButtonDay);
        }

        mButtonDirection = findViewById(R.id.buttonDirection);
        if (intent.hasExtra("daySelected")) {

            if (intent.hasExtra("directionSelected")) {
                mButtonDirection.setText(intent.getStringExtra("directionSelected"));
            } else {
                mButtonDirection.setText("SELECT DIRECTION");
                currentSelectButton(mButtonDirection);
            }

            mButtonDirection.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    final String mRoute = intent.getStringExtra("routeSelected");
                    final String mDay = intent.getStringExtra("daySelected");

                    Intent intent = new Intent(KRTActivity.this, DirectionSelectActivity.class);
                    intent.putExtra("routeSelected", mRoute);
                    intent.putExtra("daySelected", mDay);
                    startActivity(intent);
                }
            });

        } else {
            mButtonDirection.setEnabled(false);
            mButtonDirection.setText("SELECT DAY OF WEEK FIRST");
            selectPreviousFirst(mButtonDirection);
        }

        mButtonTimepoint = findViewById(R.id.buttonTimepoint);
        if (intent.hasExtra("directionSelected")) {

            if (intent.hasExtra("timepointSelected")) {
                mButtonTimepoint.setText(intent.getStringExtra("timepointSelected"));
            } else {
                mButtonTimepoint.setText("SELECT TIMEPOINT");
                currentSelectButton(mButtonTimepoint);
            }

            mButtonTimepoint.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    final String mRoute = intent.getStringExtra("routeSelected");
                    final String mDay = intent.getStringExtra("daySelected");
                    final String mDirection = intent.getStringExtra("directionSelected");

                    Intent intent = new Intent(KRTActivity.this, TimepointSelectActivity.class);
                    intent.putExtra("routeSelected", mRoute);
                    intent.putExtra("daySelected", mDay);
                    intent.putExtra("directionSelected", mDirection);
                    startActivity(intent);
                }
            });
        } else {
            mButtonTimepoint.setEnabled(false);
            mButtonTimepoint.setText("SELECT DIRECTION FIRST");
            selectPreviousFirst(mButtonTimepoint);
        }

        mTextTimeOutput = findViewById(R.id.TextTimeOutput);
        if (intent.hasExtra("timepointSelected")) {

            final String mRoute = intent.getStringExtra("routeSelected");
            final String mDay = intent.getStringExtra("daySelected");
            final String mDirection = intent.getStringExtra("directionSelected");
            final String mTimepoint = intent.getStringExtra("timepointSelected");

            switch (mRoute) {
                case "1SA St Albans":
                    listOfTimes = ItemLoader.getTimes1SA(mDay, mDirection, mTimepoint);
                    break;
                case "1WC West Charleston":
                    listOfTimes = ItemLoader.getTimes1WC(mDay, mDirection, mTimepoint);
                    break;
                case "2CC Cabin Creek":
                    listOfTimes = ItemLoader.getTimes2CC(mDay, mDirection, mTimepoint);
                    break;
                case "2KC Kanawha City":
                    listOfTimes = ItemLoader.getTimes2KC(mDay, mDirection, mTimepoint);
                    break;
                case "3N Nitro":
                    listOfTimes = ItemLoader.getTimes3N(mDay, mDirection, mTimepoint);
                    break;
                case "3I Institute/WVSU":
                    listOfTimes = ItemLoader.getTimes3I(mDay, mDirection, mTimepoint);
                    break;
                case "5 Tyler Mtn/Cross Lanes":
                    listOfTimes = ItemLoader.getTimes5(mDay, mDirection, mTimepoint);
                    break;
                case "6 Elkview":
                    listOfTimes = ItemLoader.getTimes6(mDay, mDirection, mTimepoint);
                    break;
                case "7 Campbells Creek":
                    listOfTimes = ItemLoader.getTimes7(mDay, mDirection, mTimepoint);
                    break;
                case "8 Sissonville":
                    listOfTimes = ItemLoader.getTimes8(mDay, mDirection, mTimepoint);
                    break;
                case "10 Northgate/Hillcrest Drive":
                    listOfTimes = ItemLoader.getTimes10(mDay, mDirection, mTimepoint);
                    break;
                case "11 Wertz Avenue":
                    listOfTimes = ItemLoader.getTimes11(mDay, mDirection, mTimepoint);
                    break;
                case "13 Beech Avenue":
                    listOfTimes = ItemLoader.getTimes13(mDay, mDirection, mTimepoint);
                    break;
                case "14 City Park":
                    listOfTimes = ItemLoader.getTimes14(mDay, mDirection, mTimepoint);
                    break;
                case "15 South Hills":
                    listOfTimes = ItemLoader.getTimes15(mDay, mDirection, mTimepoint);
                    break;
                case "16 South Park":
                    listOfTimes = ItemLoader.getTimes16(mDay, mDirection, mTimepoint);
                    break;
                case "17 South Side":
                    listOfTimes = ItemLoader.getTimes17(mDay, mDirection, mTimepoint);
                    break;
                case "18 Fort Hill/Montrose":
                    listOfTimes = ItemLoader.getTimes18(mDay, mDirection, mTimepoint);
                    break;
                case "19 Charleston Loop/Trolley":
                    listOfTimes = ItemLoader.getTimes19(mDay, mDirection, mTimepoint);
                    break;
                case "20 Virginia St/Capitol Complex":
                    listOfTimes = ItemLoader.getTimes20(mDay, mDirection, mTimepoint);
                    break;
                case "21 Southridge/Trace Fork/Dudley Farms":
                    listOfTimes = ItemLoader.getTimes21(mDay, mDirection, mTimepoint);
                    break;
                case "22M Montgomery":
                    listOfTimes = ItemLoader.getTimes22M(mDay, mDirection, mTimepoint);
                    break;
                case "22Q Quincy Mall":
                    listOfTimes = ItemLoader.getTimes22Q(mDay, mDirection, mTimepoint);
                    break;
                case "23 Clendenin":
                    listOfTimes = ItemLoader.getTimes23(mDay, mDirection, mTimepoint);
                    break;
            }

            mTextTimeOutput.setText("Tap time for whole trip.");

            String mDash = "-";
            Boolean stringCompare;

            LinearLayout layout = findViewById(R.id.mainLayout);

            int i = -1;

            for (final String desc : listOfTimes) {
                i = i + 1;
                stringCompare = desc.equals(mDash);
                if (!stringCompare) {
                    Button newBtn = new Button(this);
                    newBtn.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                    newBtn.setText(desc);
                    layout.addView(newBtn);

                    final int timeSlotSelected = i;

                    newBtn.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(KRTActivity.this, ListEntireTripActivity.class);
                            intent.putExtra("routeSelected", mRoute);
                            intent.putExtra("daySelected", mDay);
                            intent.putExtra("directionSelected", mDirection);
                            intent.putExtra("timeSlotSelected", timeSlotSelected);
                            intent.putExtra("timepointSelected", mTimepoint);
                            startActivity(intent);
                        }
                    });
                }
            }
        } else {
            mTextTimeOutput.setText("Please select each above.");
        }
    }
    protected void currentSelectButton(Button mButton){
        mButton.setBackgroundColor(Color.YELLOW);
        mButton.setTextColor(Color.BLACK);
    }
    protected void selectPreviousFirst(Button mButton){
        mButton.setTextColor(Color.RED);
    }
}