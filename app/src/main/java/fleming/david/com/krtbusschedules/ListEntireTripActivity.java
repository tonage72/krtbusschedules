package fleming.david.com.krtbusschedules;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ListEntireTripActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_trip_select);
        Intent intent = getIntent();
        TextView textView = (TextView) findViewById(R.id.TripTextView);
        Button mButtonBack;

        final String mRoute = intent.getStringExtra("routeSelected");
        final String mDay = intent.getStringExtra("daySelected");
        final String mDirection = intent.getStringExtra("directionSelected");
        final String mTimepointToReturn = intent.getStringExtra("timepointSelected");
        final int mTimeSlotSelected = intent.getIntExtra("timeSlotSelected", 0);

        mButtonBack = (Button) findViewById(R.id.buttonBack);
        mButtonBack.setText("GO BACK");

        mButtonBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListEntireTripActivity.this, KRTActivity.class);
                intent.putExtra("routeSelected", mRoute);
                intent.putExtra("daySelected", mDay);
                intent.putExtra("directionSelected", mDirection);
                intent.putExtra("timepointSelected", mTimepointToReturn);
                startActivity(intent);
            }
        });

        final String[] timepointsArray = ItemLoader.getTimepoints(mRoute,mDay,mDirection);

        String[] listOfTimes;

        textView.setText("");

        for (String mTimepoint:timepointsArray) {
            textView.append(mTimepoint+"\n");
            switch (mRoute) {
                case "1SA St Albans":
                    listOfTimes = ItemLoader.getTimes1SA(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "1WC West Charleston":
                    listOfTimes = ItemLoader.getTimes1WC(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "2CC Cabin Creek":
                    listOfTimes = ItemLoader.getTimes2CC(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "2KC Kanawha City":
                    listOfTimes = ItemLoader.getTimes2KC(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "3N Nitro":
                    listOfTimes = ItemLoader.getTimes3N(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "3I Institute/WVSU":
                    listOfTimes = ItemLoader.getTimes3I(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "5 Tyler Mtn/Cross Lanes":
                    listOfTimes = ItemLoader.getTimes5(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "6 Elkview":
                    listOfTimes = ItemLoader.getTimes6(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "7 Campbells Creek":
                    listOfTimes = ItemLoader.getTimes7(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "8 Sissonville":
                    listOfTimes = ItemLoader.getTimes8(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "10 Northgate/Hillcrest Drive":
                    listOfTimes = ItemLoader.getTimes10(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "11 Wertz Avenue":
                    listOfTimes = ItemLoader.getTimes11(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "13 Beech Avenue":
                    listOfTimes = ItemLoader.getTimes13(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "14 City Park":
                    listOfTimes = ItemLoader.getTimes14(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "15 South Hills":
                    listOfTimes = ItemLoader.getTimes15(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "16 South Park":
                    listOfTimes = ItemLoader.getTimes16(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "17 South Side":
                    listOfTimes = ItemLoader.getTimes17(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "18 Fort Hill/Montrose":
                    listOfTimes = ItemLoader.getTimes18(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "19 Charleston Loop/Trolley":
                    listOfTimes = ItemLoader.getTimes19(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "20 Virginia St/Capitol Complex":
                    listOfTimes = ItemLoader.getTimes20(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "21 Southridge/Trace Fork/Dudley Farms":
                    listOfTimes = ItemLoader.getTimes21(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "22M Montgomery":
                    listOfTimes = ItemLoader.getTimes22M(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "22Q Quincy Mall":
                    listOfTimes = ItemLoader.getTimes22Q(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
                case "23 Clendenin":
                    listOfTimes = ItemLoader.getTimes23(mDay, mDirection, mTimepoint);
                    textView.append(listOfTimes[mTimeSlotSelected]+"\n\n");
                    break;
            }
        }
    }
}
