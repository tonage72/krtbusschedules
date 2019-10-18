package fleming.david.com.krtbusschedules;

import java.util.ArrayList;

class ItemLoader {

    protected static String[] getDayItems(String mRouteSelected) {

        ArrayList mTempDays = new ArrayList();

        switch (mRouteSelected) {
            case "5 Tyler Mtn/Cross Lanes":
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                break;
            case "6 Elkview":
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                break;
            case "7 Campbells Creek":
                mTempDays.add("Monday-Friday");
                break;
            case "8 Sissonville":
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                break;
            case "10 Northgate/Hillcrest Drive":
                mTempDays.add("Monday-Friday");
                break;
            case "13 Beech Avenue":
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                break;
            case "14 City Park":
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                break;
            case "15 South Hills":
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                break;
            case "16 South Park":
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                break;
            case "17 South Side":
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                break;
            case "18 Fort Hill/Montrose":
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                break;
            case "23 Clendenin":
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                break;
            case "19 Charleston Loop/Trolley":
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                break;
            default:
                mTempDays.add("Monday-Friday");
                mTempDays.add("Saturday");
                mTempDays.add("Sunday");
                break;
        }

        String[] mDays = new String[mTempDays.size()];

        for (int i = 0; i < mDays.length; i++)
            mDays[i] = mTempDays.get(i).toString();

        return mDays;
    }

    protected static String[] getDirectionItems(String mRouteSelected) {

        ArrayList mTempDirections = new ArrayList();

        switch (mRouteSelected) {
            case "19 Charleston Loop/Trolley":
                mTempDirections.add("Loop");
            break;
            default:
                mTempDirections.add("Inbound");
                mTempDirections.add("Outbound");
            break;
        }

        String[] mDirections = new String[mTempDirections.size()];

        for (int i = 0; i < mDirections.length; i++)
            mDirections[i] = mTempDirections.get(i).toString();

        return mDirections;
    }

    protected static String[] getTimepoints(String mRouteSelected,String mDaySelected,String mDirectionSelected) {

        ArrayList mTimepointsList = new ArrayList();

        switch (mRouteSelected) {
            case "1SA St Albans":
                switch (mDirectionSelected) {
                    case "Outbound":
                       mTimepointsList.add("Laidley Transit Mall");
                       mTimepointsList.add("4th at Stockton");
                       mTimepointsList.add("Thomas Hospital");
                       mTimepointsList.add("St Albans Station");
                       mTimepointsList.add("Route 60/35");
                        break;
                    case "Inbound":
                       mTimepointsList.add("Route 60/35");
                       mTimepointsList.add("St Albans Station");
                       mTimepointsList.add("Thomas Hospital");
                       mTimepointsList.add("4th at Stockton");
                       mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "1WC West Charleston":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("4th at Stockton");
                        mTimepointsList.add("Patrick Street Plaza");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Patrick Street Plaza");
                        mTimepointsList.add("4th at Stockton");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "2CC Cabin Creek":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("57th at MacCorkle");
                        mTimepointsList.add("Marmet Junction");
                        mTimepointsList.add("Cabin Creek Turnaround");
                        mTimepointsList.add("Quincy Walmart");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Quincy Walmart");
                        mTimepointsList.add("Cabin Creek Turnaround");
                        mTimepointsList.add("Marmet Junction");
                        mTimepointsList.add("57th at MacCorkle");
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "2KC Kanawha City":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("57th at MacCorkle");
                        break;
                    case "Inbound":
                        mTimepointsList.add("57th at MacCorkle");
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "3N Nitro":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("7th Ave and 26th St");
                        mTimepointsList.add("12th and Dunbar Ave");
                        mTimepointsList.add("WV State University");
                        mTimepointsList.add("St Albans Station");
                        mTimepointsList.add("40th St and Route 25");
                        mTimepointsList.add("Nitro Marketplace");
                        mTimepointsList.add("Mardi Gras Casino & Resort");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Mardi Gras Casino & Resort");
                        mTimepointsList.add("Nitro Marketplace");
                        mTimepointsList.add("40th St and Route 25");
                        mTimepointsList.add("St Albans Station");
                        mTimepointsList.add("WV State University");
                        mTimepointsList.add("12th and Dunbar Ave");
                        mTimepointsList.add("7th Ave and 26th St");
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Capitol Complex");
                        break;
                }
                break;

            case "3I Institute/WVSU": //Needs 2 switches to remove Stockton and Washington from all but M-F inbound
                switch (mDaySelected) {
                    case "Monday-Friday":
                        switch (mDirectionSelected) {
                            case "Outbound":
                                mTimepointsList.add("Capitol Complex");
                                mTimepointsList.add("Laidley Transit Mall");
                                mTimepointsList.add("7th Ave and 26th St");
                                mTimepointsList.add("12th and Dunbar Ave");
                                mTimepointsList.add("WV State University");
                                break;
                            case "Inbound":
                                mTimepointsList.add("WV State University");
                                mTimepointsList.add("12th and Dunbar Ave");
                                mTimepointsList.add("7th Ave and 26th St");
                                mTimepointsList.add("Stockton and W Washington");
                                mTimepointsList.add("Laidley Transit Mall");
                                mTimepointsList.add("Capitol Complex");
                                break;
                        }
                        break;
                    default:
                        switch (mDirectionSelected) {
                            case "Outbound":
                                mTimepointsList.add("Capitol Complex");
                                mTimepointsList.add("Laidley Transit Mall");
                                mTimepointsList.add("7th Ave and 26th St");
                                mTimepointsList.add("12th and Dunbar Ave");
                                mTimepointsList.add("WV State University");
                                break;
                            case "Inbound":
                                mTimepointsList.add("WV State University");
                                mTimepointsList.add("12th and Dunbar Ave");
                                mTimepointsList.add("7th Ave and 26th St");
                                mTimepointsList.add("Laidley Transit Mall");
                                mTimepointsList.add("Capitol Complex");
                                break;
                        }
                        break;
                }
                break;

            case "5 Tyler Mtn/Cross Lanes":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("7th Ave and 26th St");
                        mTimepointsList.add("Top of Tyler Mountain");
                        mTimepointsList.add("Andrew Jackson Middle School");
                        mTimepointsList.add("Nitro Marketplace");
                        mTimepointsList.add("Mardi Gras Casino & Resort");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Mardi Gras Casino & Resort");
                        mTimepointsList.add("Nitro Marketplace");
                        mTimepointsList.add("Andrew Jackson Middle School");
                        mTimepointsList.add("Top of Tyler Mountain");
                        mTimepointsList.add("7th Ave and 26th St");
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Capitol Complex");
                        break;
                }
                break;

            case "6 Elkview":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Greenbrier St at Washington St");
                        mTimepointsList.add("Northgate Business Park");
                        mTimepointsList.add("Capital High School");
                        mTimepointsList.add("Quick Road");
                        mTimepointsList.add("Crossings Mall");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Crossings Mall");
                        mTimepointsList.add("Quick Road");
                        mTimepointsList.add("Capital High School");
                        mTimepointsList.add("Northgate Business Park");
                        mTimepointsList.add("Greenbrier St at Washington St");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "7 Campbells Creek":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("CAMC Memorial");
                        mTimepointsList.add("57th at MacCorkle");
                        mTimepointsList.add("Cambronne Lane");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Cambronne Lane");
                        mTimepointsList.add("57th at MacCorkle");
                        mTimepointsList.add("CAMC Memorial");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "8 Sissonville":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Casdorph Road");
                        mTimepointsList.add("Fishers Branch");
                        mTimepointsList.add("Sissonville High School");
                        mTimepointsList.add("Sissonville");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Sissonville");
                        mTimepointsList.add("Sissonville High School");
                        mTimepointsList.add("Fishers Branch");
                        mTimepointsList.add("Casdorph Road");
                        mTimepointsList.add("Littlepage Terrace");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "10 Northgate/Hillcrest Drive":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Greenbrier at Washington");
                        mTimepointsList.add("YMCA");
                        mTimepointsList.add("Hillcrest Apartments");
                        mTimepointsList.add("Northgate Business Park");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Northgate Business Park");
                        mTimepointsList.add("Greenbrier at Washington");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "11 Wertz Avenue":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Piedmont at Morris");
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("Oakridge at Serene");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Oakridge at Serene");
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("Piedmont at Morris");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "13 Beech Avenue":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("McQueen at Beech");
                        mTimepointsList.add("Patrick Street Plaza");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Patrick Street Plaza");
                        mTimepointsList.add("McQueen at Beech");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "14 City Park":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Capitol Market");
                        mTimepointsList.add("City Park/Vista View Apartments");
                        break;
                    case "Inbound":
                        mTimepointsList.add("City Park/Vista View Apartments");
                        mTimepointsList.add("Capitol Market");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "15 South Hills":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Bridge Rd and Walnut Rd");
                        mTimepointsList.add("Ashton Place Shopping Center");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Ashton Place Shopping Center");
                        mTimepointsList.add("Bridge Rd and Walnut Rd");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "16 South Park":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("Alcoa Dr/South Park");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Alcoa Dr/South Park");
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "17 South Side":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("CAMC Memorial");
                        mTimepointsList.add("Shops at Kanawha Mall");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Shops at Kanawha Mall");
                        mTimepointsList.add("CAMC Memorial");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "18 Fort Hill/Montrose":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Wilkie Dr at Churchill Dr");
                        mTimepointsList.add("Daverton Rd at Thorne Rd");
                        mTimepointsList.add("Montrose Dr at Glendale Ave");
                        mTimepointsList.add("SC Tech Center");
                        mTimepointsList.add("E St at 6th Ave");
                        mTimepointsList.add("Riverwalk");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Riverwalk");
                        mTimepointsList.add("E St at 6th Ave");
                        mTimepointsList.add("SC Tech Center");
                        mTimepointsList.add("Montrose Dr at Glendale Ave");
                        mTimepointsList.add("Daverton Rd at Thorne Rd");
                        mTimepointsList.add("Wilkie Dr at Churchill Dr");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "20 Virginia St/Capitol Complex":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Capitol Complex");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "21 Southridge/Trace Fork/Dudley Farms":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Oakwood at Oakhurst");
                        mTimepointsList.add("Davis Creek");
                        mTimepointsList.add("Trace Fork (Ice Rink)");
                        mTimepointsList.add("Walmart/Southridge Center");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Walmart/Southridge Center");
                        mTimepointsList.add("South Central Regional Jail");
                        mTimepointsList.add("Cross Terrace Blvd at Parkway Rd");
                        mTimepointsList.add("Trace Fork (Ice Rink)");
                        mTimepointsList.add("Davis Creek");
                        mTimepointsList.add("Oakwood at Oakhurst");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "22Q Quincy Mall": //Needs 2 switches because Walmart and Quincy Mall are reversed on Sunday in and out.
                switch (mDaySelected) {
                    case "Sunday":
                        switch (mDirectionSelected) {
                            case "Outbound":
                                mTimepointsList.add("Laidley Transit Mall");
                                mTimepointsList.add("Capitol Complex");
                                mTimepointsList.add("Malden Underpass");
                                mTimepointsList.add("Quincy Walmart");
                                mTimepointsList.add("Quincy Mall");
                                break;
                            case "Inbound":
                                mTimepointsList.add("Quincy Mall");
                                mTimepointsList.add("Quincy Walmart");
                                mTimepointsList.add("Malden Underpass");
                                mTimepointsList.add("Capitol Complex");
                                mTimepointsList.add("Laidley Transit Mall");
                                break;
                        }
                        break;
                    default:
                        switch (mDirectionSelected) {
                            case "Outbound":
                                mTimepointsList.add("Laidley Transit Mall");
                                mTimepointsList.add("Capitol Complex");
                                mTimepointsList.add("Malden Underpass");
                                mTimepointsList.add("Quincy Mall");
                                mTimepointsList.add("Quincy Walmart");
                                break;
                            case "Inbound":
                                mTimepointsList.add("Quincy Walmart");
                                mTimepointsList.add("Quincy Mall");
                                mTimepointsList.add("Malden Underpass");
                                mTimepointsList.add("Capitol Complex");
                                mTimepointsList.add("Laidley Transit Mall");
                                break;
                        }
                        break;
                }
                break;

            case "22M Montgomery":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("Malden Underpass");
                        mTimepointsList.add("Quincy Walmart");
                        mTimepointsList.add("Quincy Mall");
                        mTimepointsList.add("Cedar Grove");
                        mTimepointsList.add("Montgomery");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Montgomery");
                        mTimepointsList.add("Cedar Grove");
                        mTimepointsList.add("Quincy Mall");
                        mTimepointsList.add("Quincy Walmart");
                        mTimepointsList.add("Malden Underpass");
                        mTimepointsList.add("Capitol Complex");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "23 Clendenin":
                switch (mDirectionSelected) {
                    case "Outbound":
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Lilly St");
                        mTimepointsList.add("Dutch Rd");
                        mTimepointsList.add("Coopers Creek");
                        mTimepointsList.add("Frame Rd to Crossings Mall");
                        mTimepointsList.add("Crossings Mall");
                        mTimepointsList.add("Frame Rd from Crossings Mall");
                        mTimepointsList.add("Jordan Creek");
                        mTimepointsList.add("Clendenin");
                        break;
                    case "Inbound":
                        mTimepointsList.add("Clendenin");
                        mTimepointsList.add("Jordan Creek");
                        mTimepointsList.add("Frame Rd to Crossings Mall");
                        mTimepointsList.add("Crossings Mall");
                        mTimepointsList.add("Frame Rd from Crossings Mall");
                        mTimepointsList.add("Coopers Creek");
                        mTimepointsList.add("Dutch Rd");
                        mTimepointsList.add("Lilly St");
                        mTimepointsList.add("Laidley Transit Mall");
                        break;
                }
                break;

            case "19 Charleston Loop/Trolley":
                        mTimepointsList.add("Lee St at Maryland Ave (start route)");
                        mTimepointsList.add("Laidley Transit Mall");
                        mTimepointsList.add("Capitol Market (eastbound)");
                        mTimepointsList.add("California Ave at Washington St");
                        mTimepointsList.add("Quarrier St at Capitol St");
                        mTimepointsList.add("Capitol Market (westbound)");
                        mTimepointsList.add("Bigley Ave at Ash St");
                        mTimepointsList.add("Lee St at Maryland Ave (end route)");
                break;

            default: mTimepointsList.add("Route data not complete");
        }

        String[] mTimepoints = new String[mTimepointsList.size()];

        for (int i = 0; i < mTimepoints.length; i++)
            mTimepoints[i] = mTimepointsList.get(i).toString();

        return mTimepoints;
    }

    protected static String[] getTimes1SA(String mDay, String mDirection, String mTimepoint) {

        ArrayList mTimesList = new ArrayList();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("5:45 a.m.");
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("6:30 a.m.\n(Ordinance Park)");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("5:15 p.m.\n(Ordinance Park)");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:20 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "4th at Stockton":
                                mTimesList.add("4:40 a.m.");
                                mTimesList.add("5:10 a.m.");
                                mTimesList.add("5:30 a.m.");
                                mTimesList.add("5:57 a.m.");
                                mTimesList.add("6:12 a.m.");
                                mTimesList.add("6:42 a.m.\n(Ordinance Park)");
                                mTimesList.add("7:12 a.m.");
                                mTimesList.add("7:42 a.m.");
                                mTimesList.add("8:12 a.m.");
                                mTimesList.add("8:42 a.m.");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("9:42 a.m.");
                                mTimesList.add("10:12 a.m.");
                                mTimesList.add("10:42 a.m.");
                                mTimesList.add("11:12 a.m.");
                                mTimesList.add("11:42 a.m.");
                                mTimesList.add("12:12 p.m.");
                                mTimesList.add("12:42 p.m.");
                                mTimesList.add("1:12 p.m.");
                                mTimesList.add("1:42 p.m.");
                                mTimesList.add("2:12 p.m.");
                                mTimesList.add("2:42 p.m.");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("3:42 p.m.");
                                mTimesList.add("4:12 p.m.");
                                mTimesList.add("4:42 p.m.");
                                mTimesList.add("5:12 p.m.");
                                mTimesList.add("5:27 p.m.\n(Ordinance Park)");
                                mTimesList.add("6:12 p.m.");
                                mTimesList.add("7:27 p.m.");
                                mTimesList.add("9:32 p.m.");
                                mTimesList.add("11:27 p.m.");
                                break;
                            case "Thomas Hospital":
                                mTimesList.add("4:50 a.m.");
                                mTimesList.add("5:20 a.m.");
                                mTimesList.add("5:40 a.m.");
                                mTimesList.add("6:09 a.m.");
                                mTimesList.add("6:24 a.m.");
                                mTimesList.add("6:54 a.m.\n(Ordinance Park)");
                                mTimesList.add("7:24 a.m.");
                                mTimesList.add("7:54 a.m.");
                                mTimesList.add("8:24 a.m.");
                                mTimesList.add("8:54 a.m.");
                                mTimesList.add("9:24 a.m.");
                                mTimesList.add("9:54 a.m.");
                                mTimesList.add("10:24 a.m.");
                                mTimesList.add("10:54 a.m.");
                                mTimesList.add("11:24 a.m.");
                                mTimesList.add("11:54 a.m.");
                                mTimesList.add("12:24 p.m.");
                                mTimesList.add("12:54 p.m.");
                                mTimesList.add("1:24 p.m.");
                                mTimesList.add("1:54 p.m.");
                                mTimesList.add("2:24 p.m.");
                                mTimesList.add("2:54 p.m.");
                                mTimesList.add("3:24 p.m.");
                                mTimesList.add("3:54 p.m.");
                                mTimesList.add("4:24 p.m.");
                                mTimesList.add("4:54 p.m.");
                                mTimesList.add("5:24 p.m.");
                                mTimesList.add("5:39 p.m.\n(Ordinance Park)");
                                mTimesList.add("6:24 p.m.");
                                mTimesList.add("7:39 p.m.");
                                mTimesList.add("9:44 p.m.");
                                mTimesList.add("11:39 p.m.");
                                break;
                            case "St Albans Station":
                                mTimesList.add("5:10 a.m.");
                                mTimesList.add("5:40 a.m.");
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("6:29 a.m.");
                                mTimesList.add("6:44 a.m.");
                                mTimesList.add("7:14 a.m.");
                                mTimesList.add("7:44 a.m.");
                                mTimesList.add("8:14 a.m.");
                                mTimesList.add("8:44 a.m.");
                                mTimesList.add("9:14 a.m.");
                                mTimesList.add("9:44 a.m.");
                                mTimesList.add("10:14 a.m.");
                                mTimesList.add("10:44 a.m.");
                                mTimesList.add("11:14 a.m.");
                                mTimesList.add("11:44 a.m.");
                                mTimesList.add("12:14 p.m.");
                                mTimesList.add("12:44 p.m.");
                                mTimesList.add("1:14 p.m.");
                                mTimesList.add("1:44 p.m.");
                                mTimesList.add("2:14 p.m.");
                                mTimesList.add("2:44 p.m.");
                                mTimesList.add("3:14 p.m.");
                                mTimesList.add("3:44 p.m.");
                                mTimesList.add("4:14 p.m.");
                                mTimesList.add("4:44 p.m.");
                                mTimesList.add("5:14 p.m.");
                                mTimesList.add("5:44 p.m.");
                                mTimesList.add("5:59 p.m.");
                                mTimesList.add("6:44 p.m.");
                                mTimesList.add("7:59 p.m.");
                                mTimesList.add("10:05 p.m.");
                                mTimesList.add("11:59 p.m.");
                                break;
                            case "Route 60/35":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:49 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:49 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:49 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("11:49 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:49 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("2:49 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:49 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:49 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:49 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("8:04 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:01 a.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Route 60/35":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:50 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:50 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:49 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("11:49 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:49 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("2:49 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:49 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:49 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("5:54 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:04 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:01 a.m.");
                                break;
                            case "St Albans Station":
                                mTimesList.add("5:10 a.m.");
                                mTimesList.add("5:45 a.m.");
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("7:30 a.m.\n(Ordinance Park)");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("4:25 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("6:00 p.m.\n(Ordinance Park)");
                                mTimesList.add("6:05 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("8:25 p.m.");
                                mTimesList.add("10:30 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Thomas Hospital":
                                mTimesList.add("5:30 a.m.");
                                mTimesList.add("6:05 a.m.");
                                mTimesList.add("6:20 a.m.");
                                mTimesList.add("6:50 a.m.");
                                mTimesList.add("7:20 a.m.");
                                mTimesList.add("7:50 a.m.");
                                mTimesList.add("8:20 a.m.");
                                mTimesList.add("8:50 a.m.");
                                mTimesList.add("9:20 a.m.");
                                mTimesList.add("9:50 a.m.");
                                mTimesList.add("10:20 a.m.");
                                mTimesList.add("10:50 a.m.");
                                mTimesList.add("11:20 a.m.");
                                mTimesList.add("11:50 a.m.");
                                mTimesList.add("12:20 p.m.");
                                mTimesList.add("12:50 p.m.");
                                mTimesList.add("1:20 p.m.");
                                mTimesList.add("1:50 p.m.");
                                mTimesList.add("2:20 p.m.");
                                mTimesList.add("2:50 p.m.");
                                mTimesList.add("3:20 p.m.");
                                mTimesList.add("3:50 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:20 p.m.");
                                mTimesList.add("5:50 p.m.");
                                mTimesList.add("6:20 p.m.");
                                mTimesList.add("6:25 p.m.");
                                mTimesList.add("7:05 p.m.");
                                mTimesList.add("8:45 p.m.");
                                mTimesList.add("10:50 p.m.");
                                mTimesList.add("12:11 a.m.");
                                break;
                            case "4th at Stockton":
                                mTimesList.add("5:43 a.m.");
                                mTimesList.add("6:18 a.m.");
                                mTimesList.add("6:33 a.m.");
                                mTimesList.add("7:03 a.m.");
                                mTimesList.add("7:33 a.m.");
                                mTimesList.add("8:03 a.m.");
                                mTimesList.add("8:33 a.m.");
                                mTimesList.add("9:03 a.m.");
                                mTimesList.add("9:33 a.m.");
                                mTimesList.add("10:03 a.m.");
                                mTimesList.add("10:33 a.m.");
                                mTimesList.add("11:03 a.m.");
                                mTimesList.add("11:33 a.m.");
                                mTimesList.add("12:03 p.m.");
                                mTimesList.add("12:33 p.m.");
                                mTimesList.add("1:03 p.m.");
                                mTimesList.add("1:33 p.m.");
                                mTimesList.add("2:03 p.m.");
                                mTimesList.add("2:33 p.m.");
                                mTimesList.add("3:03 p.m.");
                                mTimesList.add("3:33 p.m.");
                                mTimesList.add("4:03 p.m.");
                                mTimesList.add("4:33 p.m.");
                                mTimesList.add("5:03 p.m.");
                                mTimesList.add("5:33 p.m.");
                                mTimesList.add("6:03 p.m.");
                                mTimesList.add("6:33 p.m.");
                                mTimesList.add("6:38 p.m.");
                                mTimesList.add("7:18 p.m.");
                                mTimesList.add("8:58 p.m.");
                                mTimesList.add("11:03 p.m.");
                                mTimesList.add("12:20 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("5:55 a.m.");
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("1:45 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("5:45 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("6:50 p.m.");
                                mTimesList.add("7:30 p.m.");
                                mTimesList.add("9:10 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("-");
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:20 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "4th at Stockton":
                                mTimesList.add("5:20 a.m.");
                                mTimesList.add("6:13 a.m.");
                                mTimesList.add("7:13 a.m.");
                                mTimesList.add("8:13 a.m.");
                                mTimesList.add("9:13 a.m.");
                                mTimesList.add("10:13 a.m.");
                                mTimesList.add("11:13 a.m.");
                                mTimesList.add("12:13 p.m.");
                                mTimesList.add("1:13 p.m.");
                                mTimesList.add("2:13 p.m.");
                                mTimesList.add("3:13 p.m.");
                                mTimesList.add("4:13 p.m.");
                                mTimesList.add("5:13 p.m.");
                                mTimesList.add("6:13 p.m.");
                                mTimesList.add("7:28 p.m.");
                                mTimesList.add("9:32 p.m.");
                                mTimesList.add("11:28 p.m.");
                                break;
                            case "Thomas Hospital":
                                mTimesList.add("5:30 a.m.");
                                mTimesList.add("6:28 a.m.");
                                mTimesList.add("7:28 a.m.");
                                mTimesList.add("8:28 a.m.");
                                mTimesList.add("9:28 a.m.");
                                mTimesList.add("10:28 a.m.");
                                mTimesList.add("11:28 a.m.");
                                mTimesList.add("12:28 p.m.");
                                mTimesList.add("1:28 p.m.");
                                mTimesList.add("2:28 p.m.");
                                mTimesList.add("3:28 p.m.");
                                mTimesList.add("4:28 p.m.");
                                mTimesList.add("5:28 p.m.");
                                mTimesList.add("6:28 p.m.");
                                mTimesList.add("7:43 p.m.");
                                mTimesList.add("9:44 p.m.");
                                mTimesList.add("11:43 p.m.");
                                break;
                            case "St Albans Station":
                                mTimesList.add("5:52 a.m.");
                                mTimesList.add("6:50 a.m.");
                                mTimesList.add("7:50 a.m.");
                                mTimesList.add("8:50 a.m.");
                                mTimesList.add("9:50 a.m.");
                                mTimesList.add("10:50 a.m.");
                                mTimesList.add("11:50 a.m.");
                                mTimesList.add("12:50 p.m.");
                                mTimesList.add("1:50 p.m.");
                                mTimesList.add("2:50 p.m.");
                                mTimesList.add("3:50 p.m.");
                                mTimesList.add("4:50 p.m.");
                                mTimesList.add("5:50 p.m.");
                                mTimesList.add("6:50 p.m.");
                                mTimesList.add("8:05 p.m.");
                                mTimesList.add("10:05 p.m.");
                                mTimesList.add("12:05 a.m.");
                                break;
                            case "Route 60/35":
                                mTimesList.add("-");
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("7:55 a.m.");
                                mTimesList.add("8:55 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:55 a.m.");
                                mTimesList.add("11:55 a.m.");
                                mTimesList.add("12:55 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("3:55 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:55 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:10 p.m.");
                                mTimesList.add("12:10 p.m.");
                                break;
                        }
                        break;
                    case "Inbound" :
                        switch (mTimepoint) {
                            case "Route 60/35":
                                mTimesList.add("-");
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("7:55 a.m.");
                                mTimesList.add("8:55 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:55 a.m.");
                                mTimesList.add("11:55 a.m.");
                                mTimesList.add("12:55 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("3:55 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:55 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:10 p.m.");
                                mTimesList.add("12:10 a.m.");
                                break;
                            case "St Albans Station":
                                mTimesList.add("6:12 a.m.");
                                mTimesList.add("7:10 a.m.");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("9:10 a.m.");
                                mTimesList.add("10:10 a.m.");
                                mTimesList.add("11:10 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("1:10 p.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("3:10 p.m.");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("5:10 p.m.");
                                mTimesList.add("6:10 p.m.");
                                mTimesList.add("7:10 p.m.");
                                mTimesList.add("8:25 p.m.");
                                mTimesList.add("10:30 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Thomas Hospital":
                                mTimesList.add("6:34 a.m.");
                                mTimesList.add("7:32 a.m.");
                                mTimesList.add("8:32 a.m.");
                                mTimesList.add("9:32 a.m.");
                                mTimesList.add("10:32 a.m.");
                                mTimesList.add("11:32 a.m.");
                                mTimesList.add("12:32 p.m.");
                                mTimesList.add("1:32 p.m.");
                                mTimesList.add("2:32 p.m.");
                                mTimesList.add("3:32 p.m.");
                                mTimesList.add("4:32 p.m.");
                                mTimesList.add("5:32 p.m.");
                                mTimesList.add("6:32 p.m.");
                                mTimesList.add("7:32 p.m.");
                                mTimesList.add("8:47 p.m.");
                                mTimesList.add("10:50 p.m.");
                                mTimesList.add("12:20 a.m.");
                                break;
                            case "4th at Stockton":
                                mTimesList.add("6:47 a.m.");
                                mTimesList.add("7:47 a.m.");
                                mTimesList.add("8:47 a.m.");
                                mTimesList.add("9:47 a.m.");
                                mTimesList.add("10:47 a.m.");
                                mTimesList.add("11:47 a.m.");
                                mTimesList.add("12:47 p.m.");
                                mTimesList.add("1:47 p.m.");
                                mTimesList.add("2:47 p.m.");
                                mTimesList.add("3:47 p.m.");
                                mTimesList.add("4:47 p.m.");
                                mTimesList.add("5:47 p.m.");
                                mTimesList.add("6:47 p.m.");
                                mTimesList.add("7:47 p.m.");
                                mTimesList.add("9:02 p.m.");
                                mTimesList.add("11:03 p.m.");
                                mTimesList.add("12:35 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("7:00 p.m.");
                                mTimesList.add("8:00 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                }
                break;
            case "Sunday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("-");
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "4th at Stockton":
                                mTimesList.add("5:28 a.m.");
                                mTimesList.add("7:28 a.m.");
                                mTimesList.add("9:28 a.m.");
                                mTimesList.add("11:28 a.m.");
                                mTimesList.add("1:28 p.m.");
                                mTimesList.add("3:28 p.m.");
                                mTimesList.add("5:28 p.m.");
                                mTimesList.add("7:28 p.m.");
                                mTimesList.add("9:28 p.m.");
                                mTimesList.add("11:28 p.m.");
                                break;
                            case "Thomas Hospital":
                                mTimesList.add("5:43 a.m.");
                                mTimesList.add("7:43 a.m.");
                                mTimesList.add("9:43 a.m.");
                                mTimesList.add("11:43 a.m.");
                                mTimesList.add("1:43 p.m.");
                                mTimesList.add("3:43 p.m.");
                                mTimesList.add("5:43 p.m.");
                                mTimesList.add("7:43 p.m.");
                                mTimesList.add("9:43 p.m.");
                                mTimesList.add("11:43 p.m.");
                                break;
                            case "St Albans Station":
                                mTimesList.add("6:05 a.m.");
                                mTimesList.add("8:05 a.m.");
                                mTimesList.add("10:05 a.m.");
                                mTimesList.add("12:05 p.m.");
                                mTimesList.add("2:05 p.m.");
                                mTimesList.add("4:05 p.m.");
                                mTimesList.add("6:05 p.m.");
                                mTimesList.add("8:05 p.m.");
                                mTimesList.add("10:05 p.m.");
                                mTimesList.add("12:05 a.m.");
                                break;
                            case "Route 60/35":
                                mTimesList.add("-");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("10:10 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:10 a.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Route 60/35":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("10:10 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:10 a.m.");
                                break;
                            case "St Albans Station":
                                mTimesList.add("-");
                                mTimesList.add("6:25 a.m.");
                                mTimesList.add("8:25 a.m.");
                                mTimesList.add("10:25 a.m.");
                                mTimesList.add("12:25 p.m.");
                                mTimesList.add("2:25 p.m.");
                                mTimesList.add("4:25 p.m.");
                                mTimesList.add("6:25 p.m.");
                                mTimesList.add("8:25 p.m.");
                                mTimesList.add("10:25 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Thomas Hospital":
                                mTimesList.add("-");
                                mTimesList.add("6:47 a.m.");
                                mTimesList.add("8:47 a.m.");
                                mTimesList.add("10:47 a.m.");
                                mTimesList.add("12:47 p.m.");
                                mTimesList.add("2:47 p.m.");
                                mTimesList.add("4:47 p.m.");
                                mTimesList.add("6:47 p.m.");
                                mTimesList.add("8:47 p.m.");
                                mTimesList.add("10:47 p.m.");
                                mTimesList.add("12:32 a.m.");
                                break;
                            case "4th at Stockton":
                                mTimesList.add("5:05 a.m.");
                                mTimesList.add("7:02 a.m.");
                                mTimesList.add("9:02 a.m.");
                                mTimesList.add("11:02 a.m.");
                                mTimesList.add("1:02 p.m.");
                                mTimesList.add("3:02 p.m.");
                                mTimesList.add("5:02 p.m.");
                                mTimesList.add("7:02 p.m.");
                                mTimesList.add("9:02 p.m.");
                                mTimesList.add("11:02 p.m.");
                                mTimesList.add("12:47 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("5:15 a.m.");
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i).toString();

        return mTimes;

    }

    protected static String[] getTimes1WC(String mDay, String mDirection, String mTimepoint) {

        ArrayList mTimesList = new ArrayList();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("5:45 a.m.");
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("11:55 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("1:55 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("5:45 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:00 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("7:45 p.m.");
                                mTimesList.add("8:15 p.m.");
                                mTimesList.add("9:00 p.m.");
                                mTimesList.add("9:20 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "4th at Stockton":
                                mTimesList.add("5:57 a.m.");
                                mTimesList.add("6:12 a.m.");
                                mTimesList.add("6:42 a.m.");
                                mTimesList.add("6:57 a.m.");
                                mTimesList.add("7:12 a.m.");
                                mTimesList.add("7:27 a.m.");
                                mTimesList.add("7:42 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("8:12 a.m.");
                                mTimesList.add("8:27 a.m.");
                                mTimesList.add("8:42 a.m.");
                                mTimesList.add("8:57 a.m.");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("9:27 a.m.");
                                mTimesList.add("9:42 a.m.");
                                mTimesList.add("9:57 a.m.");
                                mTimesList.add("10:12 a.m.");
                                mTimesList.add("10:27 a.m.");
                                mTimesList.add("10:42 a.m.");
                                mTimesList.add("10:57 a.m.");
                                mTimesList.add("11:12 a.m.");
                                mTimesList.add("11:27 a.m.");
                                mTimesList.add("11:42 a.m.");
                                mTimesList.add("12:07 p.m.");
                                mTimesList.add("12:12 p.m.");
                                mTimesList.add("12:27 p.m.");
                                mTimesList.add("12:42 p.m.");
                                mTimesList.add("12:57 p.m.");
                                mTimesList.add("1:12 p.m.");
                                mTimesList.add("1:27 p.m.");
                                mTimesList.add("1:42 p.m.");
                                mTimesList.add("2:07 p.m.");
                                mTimesList.add("2:12 p.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("2:42 p.m.");
                                mTimesList.add("3:07 p.m.");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("3:27 p.m.");
                                mTimesList.add("3:42 p.m.");
                                mTimesList.add("4:12 p.m.");
                                mTimesList.add("4:27 p.m.");
                                mTimesList.add("4:42 p.m.");
                                mTimesList.add("4:57 p.m.");
                                mTimesList.add("5:12 p.m.");
                                mTimesList.add("5:27 p.m.");
                                mTimesList.add("5:57 p.m.");
                                mTimesList.add("6:12 p.m.");
                                mTimesList.add("6:27 p.m.");
                                mTimesList.add("6:57 p.m.");
                                mTimesList.add("7:12 p.m.");
                                mTimesList.add("7:27 p.m.");
                                mTimesList.add("7:55 p.m.");
                                mTimesList.add("8:25 p.m.");
                                mTimesList.add("9:10 p.m.");
                                mTimesList.add("9:32 p.m.");
                                mTimesList.add("11:27 p.m.");
                                break;
                            case "Patrick Street Plaza":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("7:00 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Patrick Street Plaza":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("5:30 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:45 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:35 p.m.");
                                mTimesList.add("7:00 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:55 p.m.");
                                mTimesList.add("-");
                                break;
                            case "4th at Stockton":
                                mTimesList.add("4:20 a.m.");
                                mTimesList.add("5:20 a.m.");
                                mTimesList.add("5:33 a.m.");
                                mTimesList.add("5:43 a.m.");
                                mTimesList.add("6:05 a.m.");
                                mTimesList.add("6:18 a.m.");
                                mTimesList.add("6:20 a.m.");
                                mTimesList.add("6:33 a.m.");
                                mTimesList.add("6:48 a.m.");
                                mTimesList.add("7:03 a.m.");
                                mTimesList.add("7:18 a.m.");
                                mTimesList.add("7:33 a.m.");
                                mTimesList.add("7:48 a.m.");
                                mTimesList.add("8:03 a.m.");
                                mTimesList.add("8:18 a.m.");
                                mTimesList.add("8:33 a.m.");
                                mTimesList.add("8:48 a.m.");
                                mTimesList.add("9:03 a.m.");
                                mTimesList.add("9:18 a.m.");
                                mTimesList.add("9:33 a.m.");
                                mTimesList.add("9:48 a.m.");
                                mTimesList.add("10:03 a.m.");
                                mTimesList.add("10:18 a.m.");
                                mTimesList.add("10:33 a.m.");
                                mTimesList.add("10:48 a.m.");
                                mTimesList.add("11:03 a.m.");
                                mTimesList.add("11:18 a.m.");
                                mTimesList.add("11:33 a.m.");
                                mTimesList.add("11:48 a.m.");
                                mTimesList.add("12:03 p.m.");
                                mTimesList.add("12:18 p.m.");
                                mTimesList.add("12:33 p.m.");
                                mTimesList.add("12:48 p.m.");
                                mTimesList.add("1:03 p.m.");
                                mTimesList.add("1:18 p.m.");
                                mTimesList.add("1:33 p.m.");
                                mTimesList.add("1:48 p.m.");
                                mTimesList.add("2:03 p.m.");
                                mTimesList.add("2:18 p.m.");
                                mTimesList.add("2:33 p.m.");
                                mTimesList.add("2:48 p.m.");
                                mTimesList.add("3:03 p.m.");
                                mTimesList.add("3:18 p.m.");
                                mTimesList.add("3:33 p.m.");
                                mTimesList.add("3:48 p.m.");
                                mTimesList.add("4:03 p.m.");
                                mTimesList.add("4:33 p.m.");
                                mTimesList.add("4:48 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("5:03 p.m.");
                                mTimesList.add("5:33 p.m.");
                                mTimesList.add("6:03 p.m.");
                                mTimesList.add("6:33 p.m.");
                                mTimesList.add("6:38 p.m.");
                                mTimesList.add("7:03 p.m.");
                                mTimesList.add("7:18 p.m.");
                                mTimesList.add("8:58 p.m.");
                                mTimesList.add("11:03 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("4:30 a.m.");
                                mTimesList.add("5:30 a.m.");
                                mTimesList.add("5:45 a.m.");
                                mTimesList.add("5:55 a.m.");
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("1:45 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("5:45 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("6:50 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("7:30 p.m.");
                                mTimesList.add("9:10 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("6:30 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("7:30 p.m.");
                                mTimesList.add("9:20 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "4th at Stockton":
                                mTimesList.add("6:13 a.m.");
                                mTimesList.add("6:43 a.m.");
                                mTimesList.add("7:13 a.m.");
                                mTimesList.add("7:43 a.m.");
                                mTimesList.add("8:13 a.m.");
                                mTimesList.add("8:43 a.m.");
                                mTimesList.add("9:13 a.m.");
                                mTimesList.add("9:43 a.m.");
                                mTimesList.add("10:13 a.m.");
                                mTimesList.add("10:43 a.m.");
                                mTimesList.add("11:13 a.m.");
                                mTimesList.add("11:43 a.m.");
                                mTimesList.add("12:13 p.m.");
                                mTimesList.add("12:43 p.m.");
                                mTimesList.add("1:13 p.m.");
                                mTimesList.add("1:43 p.m.");
                                mTimesList.add("2:13 p.m.");
                                mTimesList.add("2:43 p.m.");
                                mTimesList.add("3:13 p.m.");
                                mTimesList.add("3:43 p.m.");
                                mTimesList.add("4:13 p.m.");
                                mTimesList.add("4:43 p.m.");
                                mTimesList.add("5:13 p.m.");
                                mTimesList.add("5:43 p.m.");
                                mTimesList.add("6:13 p.m.");
                                mTimesList.add("6:43 p.m.");
                                mTimesList.add("7:28 p.m.");
                                mTimesList.add("7:43 p.m.");
                                mTimesList.add("9:32 p.m.");
                                mTimesList.add("11:28 p.m.");
                                break;
                            case "Patrick Street Plaza":
                                mTimesList.add("-");
                                mTimesList.add("6:47 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:47 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:47 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:47 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:47 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("11:47 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:47 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:47 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:47 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:47 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:47 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:47 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("7:47 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Patrick Street Plaza":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("7:03 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:03 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:03 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:03 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("11:03 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:03 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:03 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:03 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:03 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:03 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:03 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("6:03 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("7:47 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "4th at Stockton":
                                mTimesList.add("5:20 a.m.");
                                mTimesList.add("5:50 a.m.");
                                mTimesList.add("6:47 a.m.");
                                mTimesList.add("7:07 a.m.");
                                mTimesList.add("7:47 a.m.");
                                mTimesList.add("8:07 a.m.");
                                mTimesList.add("8:47 a.m.");
                                mTimesList.add("9:07 a.m.");
                                mTimesList.add("9:47 a.m.");
                                mTimesList.add("10:07 a.m.");
                                mTimesList.add("10:47 a.m.");
                                mTimesList.add("11:07 a.m.");
                                mTimesList.add("11:47 a.m.");
                                mTimesList.add("12:07 p.m.");
                                mTimesList.add("12:47 p.m.");
                                mTimesList.add("1:07 p.m.");
                                mTimesList.add("1:47 p.m.");
                                mTimesList.add("2:07 p.m.");
                                mTimesList.add("2:47 p.m.");
                                mTimesList.add("3:07 p.m.");
                                mTimesList.add("3:47 p.m.");
                                mTimesList.add("4:07 p.m.");
                                mTimesList.add("4:47 p.m.");
                                mTimesList.add("5:07 p.m.");
                                mTimesList.add("5:47 p.m.");
                                mTimesList.add("6:07 p.m.");
                                mTimesList.add("6:47 p.m.");
                                mTimesList.add("7:47 p.m.");
                                mTimesList.add("7:50 p.m.");
                                mTimesList.add("9:02 p.m.");
                                mTimesList.add("11:03 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("5:30 a.m.");
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("7:20 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("8:20 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("9:20 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("10:20 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("11:20 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("12:20 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("1:20 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("2:20 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("3:20 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("5:20 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("6:20 p.m.");
                                mTimesList.add("7:00 p.m.");
                                mTimesList.add("8:00 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Sunday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("-");
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "4th at Stockton":
                                mTimesList.add("5:28 a.m.");
                                mTimesList.add("7:28 a.m.");
                                mTimesList.add("9:28 a.m.");
                                mTimesList.add("11:28 a.m.");
                                mTimesList.add("1:28 p.m.");
                                mTimesList.add("3:28 p.m.");
                                mTimesList.add("5:28 p.m.");
                                mTimesList.add("7:28 p.m.");
                                mTimesList.add("9:28 p.m.");
                                mTimesList.add("11:28 p.m.");
                                break;
                            case "Patrick Street Plaza":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Patrick Street Plaza":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "4th at Stockton":
                                mTimesList.add("5:05 a.m.");
                                mTimesList.add("7:02 a.m.");
                                mTimesList.add("9:02 a.m.");
                                mTimesList.add("11:02 a.m.");
                                mTimesList.add("1:02 p.m.");
                                mTimesList.add("3:02 p.m.");
                                mTimesList.add("5:02 p.m.");
                                mTimesList.add("7:02 p.m.");
                                mTimesList.add("9:02 p.m.");
                                mTimesList.add("11:02 p.m.");
                                mTimesList.add("12:47 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("5:15 a.m.");
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i).toString();

        return mTimes;
    }

    protected static String[] getTimes2CC(String mDay, String mDirection, String mTimepoint) {

        ArrayList mTimesList = new ArrayList();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("-");
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:20 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("-");
                                mTimesList.add("6:12 a.m.");
                                mTimesList.add("6:42 a.m.");
                                mTimesList.add("7:12 a.m.");
                                mTimesList.add("8:12 a.m.");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("10:12 a.m.");
                                mTimesList.add("11:12 a.m.");
                                mTimesList.add("12:12 p.m.");
                                mTimesList.add("1:12 p.m.");
                                mTimesList.add("2:12 p.m.");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("4:12 p.m.");
                                mTimesList.add("5:12 p.m.");
                                mTimesList.add("6:27 p.m.");
                                mTimesList.add("7:27 p.m.");
                                mTimesList.add("9:32 p.m.");
                                mTimesList.add("11:26 p.m.");
                                break;
                            case "57th at MacCorkle":
                                mTimesList.add("-");
                                mTimesList.add("6:23 a.m.");
                                mTimesList.add("6:53 a.m.");
                                mTimesList.add("7:23 a.m.");
                                mTimesList.add("8:23 a.m.");
                                mTimesList.add("9:23 a.m.");
                                mTimesList.add("10:23 a.m.");
                                mTimesList.add("11:23 a.m.");
                                mTimesList.add("12:23 p.m.");
                                mTimesList.add("1:23 p.m.");
                                mTimesList.add("2:23 p.m.");
                                mTimesList.add("3:23 p.m.");
                                mTimesList.add("4:23 p.m.");
                                mTimesList.add("5:23 p.m.");
                                mTimesList.add("6:38 p.m.");
                                mTimesList.add("7:38 p.m.");
                                mTimesList.add("9:43 p.m.");
                                mTimesList.add("11:34 p.m.");
                                break;
                            case "Marmet Junction":
                                mTimesList.add("-");
                                mTimesList.add("6:33 a.m.");
                                mTimesList.add("7:03 a.m.");
                                mTimesList.add("7:33 a.m.");
                                mTimesList.add("8:33 a.m.");
                                mTimesList.add("9:33 a.m.");
                                mTimesList.add("10:33 a.m.");
                                mTimesList.add("11:33 a.m.");
                                mTimesList.add("12:33 p.m.");
                                mTimesList.add("1:33 p.m.");
                                mTimesList.add("2:33 p.m.");
                                mTimesList.add("3:33 p.m.");
                                mTimesList.add("4:33 p.m.");
                                mTimesList.add("5:33 p.m.");
                                mTimesList.add("6:48 p.m.");
                                mTimesList.add("7:48 p.m.");
                                mTimesList.add("9:53 p.m.");
                                mTimesList.add("11:42 p.m.");
                                break;
                            case "Cabin Creek Turnaround":
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("6:46 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:46 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:46 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("11:46 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:46 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:46 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:46 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:01 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("11:54 p.m.");
                                break;
                            case "Quincy Walmart":
                                mTimesList.add("6:25 a.m.");
                                mTimesList.add("6:56 a.m.");
                                mTimesList.add("7:18 a.m.");
                                mTimesList.add("7:56 a.m.");
                                mTimesList.add("8:47 a.m.");
                                mTimesList.add("9:56 a.m.");
                                mTimesList.add("10:48 a.m.");
                                mTimesList.add("11:56 a.m.");
                                mTimesList.add("12:48 p.m.");
                                mTimesList.add("1:56 p.m.");
                                mTimesList.add("2:48 p.m.");
                                mTimesList.add("3:56 p.m.");
                                mTimesList.add("4:48 p.m.");
                                mTimesList.add("5:56 p.m.");
                                mTimesList.add("7:03 p.m.");
                                mTimesList.add("8:10 p.m.");
                                mTimesList.add("10:08 p.m.");
                                mTimesList.add("12:04 a.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Quincy Walmart":
                                mTimesList.add("-");
                                mTimesList.add("6:32 a.m.");
                                mTimesList.add("7:10 a.m.");
                                mTimesList.add("7:32 a.m.");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("9:02 a.m.");
                                mTimesList.add("10:10 a.m.");
                                mTimesList.add("11:02 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("1:02 p.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("3:02 p.m.");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("5:02 p.m.");
                                mTimesList.add("6:10 p.m.");
                                mTimesList.add("7:17 p.m.");
                                mTimesList.add("8:25 p.m.");
                                mTimesList.add("10:17 p.m.");
                                mTimesList.add("12:05 a.m.");
                                break;
                            case "Cabin Creek Turnaround":
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("6:42 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:42 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("11:12 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:27 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:27 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Marmet Junction":
                                mTimesList.add("6:11 a.m.");
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("7:25 a.m.");
                                mTimesList.add("7:55 a.m.");
                                mTimesList.add("8:25 a.m.");
                                mTimesList.add("9:25 a.m.");
                                mTimesList.add("10:25 a.m.");
                                mTimesList.add("11:25 a.m.");
                                mTimesList.add("12:25 p.m.");
                                mTimesList.add("1:25 p.m.");
                                mTimesList.add("2:25 p.m.");
                                mTimesList.add("3:25 p.m.");
                                mTimesList.add("4:25 p.m.");
                                mTimesList.add("5:25 p.m.");
                                mTimesList.add("6:25 p.m.");
                                mTimesList.add("7:40 p.m.");
                                mTimesList.add("8:40 p.m.");
                                mTimesList.add("10:40 p.m.");
                                mTimesList.add("12:15 a.m.");
                                break;
                            case "57th at MacCorkle":
                                mTimesList.add("6:22 a.m.");
                                mTimesList.add("7:07 a.m.");
                                mTimesList.add("7:37 a.m.");
                                mTimesList.add("8:07 a.m.");
                                mTimesList.add("8:37 a.m.");
                                mTimesList.add("9:37 a.m.");
                                mTimesList.add("10:37 a.m.");
                                mTimesList.add("11:37 a.m.");
                                mTimesList.add("12:37 p.m.");
                                mTimesList.add("1:37 p.m.");
                                mTimesList.add("2:37 p.m.");
                                mTimesList.add("3:37 p.m.");
                                mTimesList.add("4:37 p.m.");
                                mTimesList.add("5:37 p.m.");
                                mTimesList.add("6:37 p.m.");
                                mTimesList.add("7:52 p.m.");
                                mTimesList.add("8:52 p.m.");
                                mTimesList.add("10:52 p.m.");
                                mTimesList.add("12:23 a.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:33 a.m.");
                                mTimesList.add("7:18 a.m.");
                                mTimesList.add("7:48 a.m.");
                                mTimesList.add("8:18 a.m.");
                                mTimesList.add("8:48 a.m.");
                                mTimesList.add("9:48 a.m.");
                                mTimesList.add("10:48 a.m.");
                                mTimesList.add("11:48 a.m.");
                                mTimesList.add("12:48 p.m.");
                                mTimesList.add("1:48 p.m.");
                                mTimesList.add("2:48 p.m.");
                                mTimesList.add("3:48 p.m.");
                                mTimesList.add("4:48 p.m.");
                                mTimesList.add("5:48 p.m.");
                                mTimesList.add("6:48 p.m.");
                                mTimesList.add("8:03 p.m.");
                                mTimesList.add("9:03 p.m.");
                                mTimesList.add("11:03 p.m.");
                                mTimesList.add("12:31 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("7:00 p.m.");
                                mTimesList.add("8:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("12:41 a.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("5:00 a.m.");
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:20 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("5:12 a.m.");
                                mTimesList.add("6:12 a.m.");
                                mTimesList.add("7:12 a.m.");
                                mTimesList.add("8:12 a.m.");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("10:12 a.m.");
                                mTimesList.add("11:12 a.m.");
                                mTimesList.add("12:12 p.m.");
                                mTimesList.add("1:12 p.m.");
                                mTimesList.add("2:12 p.m.");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("4:12 p.m.");
                                mTimesList.add("5:12 p.m.");
                                mTimesList.add("6:12 p.m.");
                                mTimesList.add("7:27 p.m.");
                                mTimesList.add("9:32 p.m.");
                                mTimesList.add("11:27 p.m.");
                                break;
                            case "57th at MacCorkle":
                                mTimesList.add("5:23 a.m.");
                                mTimesList.add("6:23 a.m.");
                                mTimesList.add("7:23 a.m.");
                                mTimesList.add("8:23 a.m.");
                                mTimesList.add("9:23 a.m.");
                                mTimesList.add("10:23 a.m.");
                                mTimesList.add("11:23 a.m.");
                                mTimesList.add("12:23 p.m.");
                                mTimesList.add("1:23 p.m.");
                                mTimesList.add("2:23 p.m.");
                                mTimesList.add("3:23 p.m.");
                                mTimesList.add("4:23 p.m.");
                                mTimesList.add("5:23 p.m.");
                                mTimesList.add("6:23 p.m.");
                                mTimesList.add("7:38 p.m.");
                                mTimesList.add("9:43 p.m.");
                                mTimesList.add("11:38 p.m.");
                                break;
                            case "Marmet Junction":
                                mTimesList.add("5:33 a.m.");
                                mTimesList.add("6:33 a.m.");
                                mTimesList.add("7:33 a.m.");
                                mTimesList.add("8:33 a.m.");
                                mTimesList.add("9:33 a.m.");
                                mTimesList.add("10:33 a.m.");
                                mTimesList.add("11:33 a.m.");
                                mTimesList.add("12:33 p.m.");
                                mTimesList.add("1:33 p.m.");
                                mTimesList.add("2:33 p.m.");
                                mTimesList.add("3:33 p.m.");
                                mTimesList.add("4:33 p.m.");
                                mTimesList.add("5:33 p.m.");
                                mTimesList.add("6:33 p.m.");
                                mTimesList.add("7:48 p.m.");
                                mTimesList.add("9:53 p.m.");
                                mTimesList.add("11:48 p.m.");
                                break;
                            case "Cabin Creek Turnaround":
                                mTimesList.add("5:46 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:46 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:46 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("11:46 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:46 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:46 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:46 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:01 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:01 a.m.");
                                break;
                            case "Quincy Walmart":
                                mTimesList.add("5:56 a.m.");
                                mTimesList.add("6:48 a.m.");
                                mTimesList.add("7:56 a.m.");
                                mTimesList.add("8:48 a.m.");
                                mTimesList.add("9:56 a.m.");
                                mTimesList.add("10:48 a.m.");
                                mTimesList.add("11:56 a.m.");
                                mTimesList.add("12:48 p.m.");
                                mTimesList.add("1:56 p.m.");
                                mTimesList.add("2:48 p.m.");
                                mTimesList.add("3:56 p.m.");
                                mTimesList.add("4:48 p.m.");
                                mTimesList.add("5:56 p.m.");
                                mTimesList.add("6:48 p.m.");
                                mTimesList.add("8:11 p.m.");
                                mTimesList.add("10:08 p.m.");
                                mTimesList.add("12:11 a.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Quincy Walmart":
                                mTimesList.add("6:10 a.m.");
                                mTimesList.add("7:02 a.m.");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("9:02 a.m.");
                                mTimesList.add("10:10 a.m.");
                                mTimesList.add("11:02 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("1:02 p.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("3:02 p.m.");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("5:02 p.m.");
                                mTimesList.add("6:10 p.m.");
                                mTimesList.add("7:02 p.m.");
                                mTimesList.add("8:25 p.m.");
                                mTimesList.add("10:17 p.m.");
                                mTimesList.add("12:11 a.m.");
                                break;
                            case "Cabin Creek Turnaround":
                                mTimesList.add("-");
                                mTimesList.add("7:12 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("11:12 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:27 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Marmet Junction":
                                mTimesList.add("6:25 a.m.");
                                mTimesList.add("7:25 a.m.");
                                mTimesList.add("8:25 a.m.");
                                mTimesList.add("9:25 a.m.");
                                mTimesList.add("10:25 a.m.");
                                mTimesList.add("11:25 a.m.");
                                mTimesList.add("12:25 p.m.");
                                mTimesList.add("1:25 p.m.");
                                mTimesList.add("2:25 p.m.");
                                mTimesList.add("3:25 p.m.");
                                mTimesList.add("4:25 p.m.");
                                mTimesList.add("5:25 p.m.");
                                mTimesList.add("6:25 p.m.");
                                mTimesList.add("7:25 p.m.");
                                mTimesList.add("8:40 p.m.");
                                mTimesList.add("10:40 p.m.");
                                mTimesList.add("12:21 a.m.");
                                break;
                            case "57th at MacCorkle":
                                mTimesList.add("6:37 a.m.");
                                mTimesList.add("7:37 a.m.");
                                mTimesList.add("8:37 a.m.");
                                mTimesList.add("9:37 a.m.");
                                mTimesList.add("10:37 a.m.");
                                mTimesList.add("11:37 a.m.");
                                mTimesList.add("12:37 p.m.");
                                mTimesList.add("1:37 p.m.");
                                mTimesList.add("2:37 p.m.");
                                mTimesList.add("3:37 p.m.");
                                mTimesList.add("4:37 p.m.");
                                mTimesList.add("5:37 p.m.");
                                mTimesList.add("6:37 p.m.");
                                mTimesList.add("7:37 p.m.");
                                mTimesList.add("8:52 p.m.");
                                mTimesList.add("10:52 p.m.");
                                mTimesList.add("12:29 a.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:48 a.m.");
                                mTimesList.add("7:48 a.m.");
                                mTimesList.add("8:48 a.m.");
                                mTimesList.add("9:48 a.m.");
                                mTimesList.add("10:48 a.m.");
                                mTimesList.add("11:48 a.m.");
                                mTimesList.add("12:48 p.m.");
                                mTimesList.add("1:48 p.m.");
                                mTimesList.add("2:48 p.m.");
                                mTimesList.add("3:48 p.m.");
                                mTimesList.add("4:48 p.m.");
                                mTimesList.add("5:48 p.m.");
                                mTimesList.add("6:48 p.m.");
                                mTimesList.add("7:48 p.m.");
                                mTimesList.add("9:03 p.m.");
                                mTimesList.add("11:03 p.m.");
                                mTimesList.add("12:37 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("7:00 p.m.");
                                mTimesList.add("8:00 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("12:47 a.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Sunday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("5:15 a.m.");
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("5:27 a.m.");
                                mTimesList.add("7:27 a.m.");
                                mTimesList.add("9:27 a.m.");
                                mTimesList.add("11:27 a.m.");
                                mTimesList.add("1:27 p.m.");
                                mTimesList.add("3:27 p.m.");
                                mTimesList.add("5:27 p.m.");
                                mTimesList.add("7:27 p.m.");
                                mTimesList.add("9:27 p.m.");
                                mTimesList.add("11:27 p.m.");
                                break;
                            case "57th at MacCorkle":
                                mTimesList.add("5:38 a.m.");
                                mTimesList.add("7:38 a.m.");
                                mTimesList.add("9:38 a.m.");
                                mTimesList.add("11:38 a.m.");
                                mTimesList.add("1:38 p.m.");
                                mTimesList.add("3:38 p.m.");
                                mTimesList.add("5:38 p.m.");
                                mTimesList.add("7:38 p.m.");
                                mTimesList.add("9:38 p.m.");
                                mTimesList.add("11:38 p.m.");
                                break;
                            case "Marmet Junction":
                                mTimesList.add("5:48 a.m.");
                                mTimesList.add("7:48 a.m.");
                                mTimesList.add("9:48 a.m.");
                                mTimesList.add("11:48 a.m.");
                                mTimesList.add("1:48 p.m.");
                                mTimesList.add("3:48 p.m.");
                                mTimesList.add("5:48 p.m.");
                                mTimesList.add("7:48 p.m.");
                                mTimesList.add("9:48 p.m.");
                                mTimesList.add("11:48 p.m.");
                                break;
                            case "Cabin Creek Turnaround":
                                mTimesList.add("6:01 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:01 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:01 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("6:01 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:01 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Quincy Walmart":
                                mTimesList.add("6:11 a.m.");
                                mTimesList.add("8:03 a.m.");
                                mTimesList.add("10:11 a.m.");
                                mTimesList.add("12:03 p.m.");
                                mTimesList.add("2:11 p.m.");
                                mTimesList.add("4:03 p.m.");
                                mTimesList.add("6:11 p.m.");
                                mTimesList.add("8:03 p.m.");
                                mTimesList.add("10:11 p.m.");
                                mTimesList.add("12:03 a.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Quincy Walmart":
                                mTimesList.add("6:25 a.m.");
                                mTimesList.add("8:17 a.m.");
                                mTimesList.add("10:25 a.m.");
                                mTimesList.add("12:17 p.m.");
                                mTimesList.add("2:25 p.m.");
                                mTimesList.add("4:17 p.m.");
                                mTimesList.add("6:25 p.m.");
                                mTimesList.add("8:17 p.m.");
                                mTimesList.add("10:25 p.m.");
                                mTimesList.add("12:03 a.m.");
                                break;
                            case "Cabin Creek Turnaround":
                                mTimesList.add("-");
                                mTimesList.add("8:27 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:27 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:27 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:27 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:13 a.m.");
                                break;
                            case "Marmet Junction":
                                mTimesList.add("6:40 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("10:40 a.m.");
                                mTimesList.add("12:40 p.m.");
                                mTimesList.add("2:40 p.m.");
                                mTimesList.add("4:40 p.m.");
                                mTimesList.add("6:40 p.m.");
                                mTimesList.add("8:40 p.m.");
                                mTimesList.add("10:40 p.m.");
                                mTimesList.add("12:26 a.m.");
                                break;
                            case "57th at MacCorkle":
                                mTimesList.add("6:52 a.m.");
                                mTimesList.add("8:52 a.m.");
                                mTimesList.add("10:52 a.m.");
                                mTimesList.add("12:52 p.m.");
                                mTimesList.add("2:52 p.m.");
                                mTimesList.add("4:52 p.m.");
                                mTimesList.add("6:52 p.m.");
                                mTimesList.add("8:52 p.m.");
                                mTimesList.add("10:52 p.m.");
                                mTimesList.add("12:38 a.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("7:03 a.m.");
                                mTimesList.add("9:03 a.m.");
                                mTimesList.add("11:03 a.m.");
                                mTimesList.add("1:03 p.m.");
                                mTimesList.add("3:03 p.m.");
                                mTimesList.add("5:03 p.m.");
                                mTimesList.add("7:03 p.m.");
                                mTimesList.add("9:03 p.m.");
                                mTimesList.add("11:03 p.m.");
                                mTimesList.add("12:49 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("1:01 a.m.");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i).toString();

        return mTimes;
    }

    protected static String[] getTimes2KC(String mDay, String mDirection, String mTimepoint) {

        ArrayList mTimesList = new ArrayList();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("6:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("6:30 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:30 a.m.\n(Ends at Mall)");
                                mTimesList.add("8:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("8:30 a.m.\n(Ends at Mall)");
                                mTimesList.add("9:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("9:30 a.m.\n(Ends at Mall)");
                                mTimesList.add("10:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("10:30 a.m.\n(Ends at Mall)");
                                mTimesList.add("11:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("11:30 a.m.\n(Ends at Mall)");
                                mTimesList.add("12:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("12:30 p.m.\n(Ends at Mall)");
                                mTimesList.add("1:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("1:30 p.m.\n(Ends at Mall)");
                                mTimesList.add("2:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("2:30 p.m.\n(Ends at Mall)");
                                mTimesList.add("3:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("3:30 p.m.\n(Ends at Mall)");
                                mTimesList.add("4:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("5:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("5:15 p.m.\n(Ends at Mall)");
                                mTimesList.add("6:15 p.m.\n(To Cabin Creek)");
                                mTimesList.add("7:15 p.m.\n(To Cabin Creek)");
                                mTimesList.add("9:20 p.m.\n(To Cabin Creek)");
                                mTimesList.add("10:30 p.m.\n(To capitol only Mon-Thu)");
                                mTimesList.add("11:15 p.m.\n(To Cabin Creek)");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("6:42 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:42 a.m.\n(Ends at Mall)");
                                mTimesList.add("8:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("8:42 a.m.\n(Ends at Mall)");
                                mTimesList.add("9:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("9:42 a.m.\n(Ends at Mall)");
                                mTimesList.add("10:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("10:42 a.m.\n(Ends at Mall)");
                                mTimesList.add("11:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("11:42 a.m.\n(Ends at Mall)");
                                mTimesList.add("12:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("12:42 p.m.\n(Ends at Mall)");
                                mTimesList.add("1:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("1:42 p.m.\n(Ends at Mall)");
                                mTimesList.add("2:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("2:42 p.m.\n(Ends at Mall)");
                                mTimesList.add("3:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("3:42 p.m.\n(Ends at Mall)");
                                mTimesList.add("4:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("5:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("5:27 p.m.\n(Ends at Mall)");
                                mTimesList.add("6:27 p.m.\n(To Cabin Creek)");
                                mTimesList.add("7:27 p.m.\n(To Cabin Creek)");
                                mTimesList.add("9:32 p.m.\n(To Cabin Creek)");
                                mTimesList.add("10:42 p.m.\n(End route Mon-Thu)");
                                mTimesList.add("11:26 p.m.\n(To Cabin Creek)");
                                break;
                            case "57th at MacCorkle":
                                mTimesList.add("6:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("6:53 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:53 a.m.\n(Ends at Mall)");
                                mTimesList.add("8:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("8:53 a.m.\n(Ends at Mall)");
                                mTimesList.add("9:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("9:53 a.m.\n(Ends at Mall)");
                                mTimesList.add("10:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("10:53 a.m.\n(Ends at Mall)");
                                mTimesList.add("11:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("11:53 a.m.\n(Ends at Mall)");
                                mTimesList.add("12:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("12:53 p.m.\n(Ends at Mall)");
                                mTimesList.add("1:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("1:53 p.m.\n(Ends at Mall)");
                                mTimesList.add("2:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("2:53 p.m.\n(Ends at Mall)");
                                mTimesList.add("3:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("3:53 p.m.\n(Ends at Mall)");
                                mTimesList.add("4:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("5:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("5:38 p.m.\n(Ends at Mall)");
                                mTimesList.add("6:38 p.m.\n(To Cabin Creek)");
                                mTimesList.add("7:38 p.m.\n(To Cabin Creek)");
                                mTimesList.add("9:43 p.m.\n(To Cabin Creek)");
                                mTimesList.add("-");
                                mTimesList.add("11:34 p.m.\n(To Cabin Creek)");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "57th at MacCorkle":
                                mTimesList.add("5:40 a.m.\n(Starts at Mall)");
                                mTimesList.add("6:22 a.m.\n(From Cabin Creek)");
                                mTimesList.add("7:07 a.m.\n(From Cabin Creek)");
                                mTimesList.add("7:37 a.m.\n(From Cabin Creek)");
                                mTimesList.add("8:05 a.m.\n(Starts at Mall)");
                                mTimesList.add("8:07 a.m.\n(From Cabin Creek)");
                                mTimesList.add("8:37 a.m.\n(From Cabin Creek)");
                                mTimesList.add("9:05 a.m.\n(Starts at Mall)");
                                mTimesList.add("9:37 a.m.\n(From Cabin Creek)");
                                mTimesList.add("10:05 a.m.\n(Starts at Mall)");
                                mTimesList.add("10:37 a.m.\n(From Cabin Creek)");
                                mTimesList.add("11:05 a.m.\n(Starts at Mall)");
                                mTimesList.add("11:37 a.m.\n(From Cabin Creek)");
                                mTimesList.add("12:05 p.m.\n(Starts at Mall)");
                                mTimesList.add("12:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("1:05 p.m.\n(Starts at Mall)");
                                mTimesList.add("1:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("2:05 p.m.\n(Starts at Mall)");
                                mTimesList.add("2:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("3:05 p.m.\n(Starts at Mall)");
                                mTimesList.add("3:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("4:05 p.m.\n(Starts at Mall)");
                                mTimesList.add("4:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("5:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("5:50 p.m.\n(Starts at Mall)");
                                mTimesList.add("6:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("7:52 p.m.\n(From Cabin Creek)");
                                mTimesList.add("8:52 p.m.\n(From Cabin Creek)");
                                mTimesList.add("10:52 p.m.\n(From Cabin Creek)");
                                mTimesList.add("12:23 a.m.\n(From Cabin Creek)");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("5:52 a.m.");
                                mTimesList.add("6:33 a.m.");
                                mTimesList.add("7:18 a.m.");
                                mTimesList.add("7:48 a.m.");
                                mTimesList.add("8:16 a.m.");
                                mTimesList.add("8:18 a.m.");
                                mTimesList.add("8:48 a.m.");
                                mTimesList.add("9:16 a.m.");
                                mTimesList.add("9:48 a.m.");
                                mTimesList.add("10:16 a.m.");
                                mTimesList.add("10:48 a.m.");
                                mTimesList.add("11:16 a.m.");
                                mTimesList.add("11:48 p.m.");
                                mTimesList.add("12:16 p.m.");
                                mTimesList.add("12:48 p.m.");
                                mTimesList.add("1:16 p.m.");
                                mTimesList.add("1:48 p.m.");
                                mTimesList.add("2:16 p.m.");
                                mTimesList.add("2:48 p.m.");
                                mTimesList.add("3:16 p.m.");
                                mTimesList.add("3:48 p.m.");
                                mTimesList.add("4:16 p.m.");
                                mTimesList.add("4:48 p.m.");
                                mTimesList.add("5:48 p.m.");
                                mTimesList.add("6:01 p.m.");
                                mTimesList.add("6:48 p.m.");
                                mTimesList.add("8:03 p.m.");
                                mTimesList.add("9:03 p.m.");
                                mTimesList.add("11:03 p.m.");
                                mTimesList.add("12:31 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("7:00 p.m.");
                                mTimesList.add("8:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("12:41 a.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("5:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("6:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:25 a.m.\n(Ends at Mall)");
                                mTimesList.add("8:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("8:25 a.m.\n(Ends at Mall)");
                                mTimesList.add("9:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("9:25 a.m.\n(Ends at Mall)");
                                mTimesList.add("10:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("10:25 a.m.\n(Ends at Mall)");
                                mTimesList.add("11:00 a.m.\n(To Cabin Creek)");
                                mTimesList.add("11:25 a.m.\n(Ends at Mall)");
                                mTimesList.add("12:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("12:25 p.m.\n(Ends at Mall)");
                                mTimesList.add("1:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("1:25 p.m.\n(Ends at Mall)");
                                mTimesList.add("2:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("2:25 p.m.\n(Ends at Mall)");
                                mTimesList.add("3:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("3:25 p.m.\n(Ends at Mall)");
                                mTimesList.add("4:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("4:25 p.m.\n(Ends at Mall)");
                                mTimesList.add("5:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("5:25 p.m.\n(Ends at Mall)");
                                mTimesList.add("6:00 p.m.\n(To Cabin Creek)");
                                mTimesList.add("6:25 p.m.\n(Ends at Mall)");
                                mTimesList.add("7:15 p.m.\n(To Cabin Creek)");
                                mTimesList.add("9:20 p.m.\n(To Cabin Creek)");
                                mTimesList.add("11:15 p.m.\n(To Cabin Creek)");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("5:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("6:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:37 a.m.\n(Ends at Mall)");
                                mTimesList.add("8:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("8:37 a.m.\n(Ends at Mall)");
                                mTimesList.add("9:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("9:37 a.m.\n(Ends at Mall)");
                                mTimesList.add("10:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("10:37 a.m.\n(Ends at Mall)");
                                mTimesList.add("11:12 a.m.\n(To Cabin Creek)");
                                mTimesList.add("11:37 a.m.\n(Ends at Mall)");
                                mTimesList.add("12:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("12:37 p.m.\n(Ends at Mall)");
                                mTimesList.add("1:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("1:37 p.m.\n(Ends at Mall)");
                                mTimesList.add("2:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("2:37 p.m.\n(Ends at Mall)");
                                mTimesList.add("3:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("3:37 p.m.\n(Ends at Mall)");
                                mTimesList.add("4:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("4:37 p.m.\n(Ends at Mall)");
                                mTimesList.add("5:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("5:37 p.m.\n(Ends at Mall)");
                                mTimesList.add("6:12 p.m.\n(To Cabin Creek)");
                                mTimesList.add("6:37 p.m.\n(Ends at Mall)");
                                mTimesList.add("7:27 p.m.\n(To Cabin Creek)");
                                mTimesList.add("9:32 p.m.\n(To Cabin Creek)");
                                mTimesList.add("11:27 p.m.\n(To Cabin Creek)");
                                break;
                            case "57th at MacCorkle":
                                mTimesList.add("5:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("6:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:48 a.m.\n(Ends at Mall)");
                                mTimesList.add("8:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("8:48 a.m.\n(Ends at Mall)");
                                mTimesList.add("9:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("9:48 a.m.\n(Ends at Mall)");
                                mTimesList.add("10:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("10:48 a.m.\n(Ends at Mall)");
                                mTimesList.add("11:23 a.m.\n(To Cabin Creek)");
                                mTimesList.add("11:48 a.m.\n(Ends at Mall)");
                                mTimesList.add("12:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("12:48 p.m.\n(Ends at Mall)");
                                mTimesList.add("1:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("1:48 p.m.\n(Ends at Mall)");
                                mTimesList.add("2:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("2:48 p.m.\n(Ends at Mall)");
                                mTimesList.add("3:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("3:48 p.m.\n(Ends at Mall)");
                                mTimesList.add("4:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("4:48 p.m.\n(Ends at Mall)");
                                mTimesList.add("5:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("5:48 p.m.\n(Ends at Mall)");
                                mTimesList.add("6:23 p.m.\n(To Cabin Creek)");
                                mTimesList.add("6:48 p.m.\n(Ends at Mall)");
                                mTimesList.add("7:38 p.m.\n(To Cabin Creek)");
                                mTimesList.add("9:43 p.m.\n(To Cabin Creek)");
                                mTimesList.add("11:38 p.m.\n(To Cabin Creek)");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "57th at MacCorkle":
                                mTimesList.add("6:05 a.m.\n(Starts at Mall)");
                                mTimesList.add("6:37 a.m.\n(From Cabin Creek)");
                                mTimesList.add("7:37 a.m.\n(From Cabin Creek)");
                                mTimesList.add("8:00 a.m.\n(Starts at Mall)");
                                mTimesList.add("8:37 a.m.\n(From Cabin Creek)");
                                mTimesList.add("9:00 a.m.\n(Starts at Mall)");
                                mTimesList.add("9:37 a.m.\n(From Cabin Creek)");
                                mTimesList.add("10:00 a.m.\n(Starts at Mall)");
                                mTimesList.add("10:37 a.m.\n(From Cabin Creek)");
                                mTimesList.add("11:00 a.m.\n(Starts at Mall)");
                                mTimesList.add("11:37 a.m.\n(From Cabin Creek)");
                                mTimesList.add("12:00 p.m.\n(Starts at Mall)");
                                mTimesList.add("12:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("1:00 p.m.\n(Starts at Mall)");
                                mTimesList.add("1:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("2:00 p.m.\n(Starts at Mall)");
                                mTimesList.add("2:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("3:00 p.m.\n(Starts at Mall)");
                                mTimesList.add("3:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("4:00 p.m.\n(Starts at Mall)");
                                mTimesList.add("4:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("5:00 p.m.\n(Starts at Mall)");
                                mTimesList.add("5:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("6:00 p.m.\n(Starts at Mall)");
                                mTimesList.add("6:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("7:00 p.m.\n(Starts at Mall)");
                                mTimesList.add("7:37 p.m.\n(From Cabin Creek)");
                                mTimesList.add("8:52 p.m.\n(From Cabin Creek)");
                                mTimesList.add("10:52 p.m.\n(From Cabin Creek)");
                                mTimesList.add("12:29 a.m.\n(From Cabin Creek)");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:16 a.m.");
                                mTimesList.add("6:48 a.m.");
                                mTimesList.add("7:48 a.m.");
                                mTimesList.add("8:11 a.m.");
                                mTimesList.add("8:48 a.m.");
                                mTimesList.add("9:11 a.m.");
                                mTimesList.add("9:48 a.m.");
                                mTimesList.add("10:11 a.m.");
                                mTimesList.add("10:48 a.m.");
                                mTimesList.add("11:11 a.m.");
                                mTimesList.add("11:48 a.m.");
                                mTimesList.add("12:11 p.m.");
                                mTimesList.add("12:48 p.m.");
                                mTimesList.add("1:11 p.m.");
                                mTimesList.add("1:48 p.m.");
                                mTimesList.add("2:11 p.m.");
                                mTimesList.add("2:48 p.m.");
                                mTimesList.add("3:11 p.m.");
                                mTimesList.add("3:48 p.m.");
                                mTimesList.add("4:11 p.m.");
                                mTimesList.add("4:48 p.m.");
                                mTimesList.add("5:11 p.m.");
                                mTimesList.add("5:48 p.m.");
                                mTimesList.add("6:11 p.m.");
                                mTimesList.add("6:48 p.m.");
                                mTimesList.add("7:11 p.m.");
                                mTimesList.add("7:48 p.m.");
                                mTimesList.add("9:03 p.m.");
                                mTimesList.add("11:03 p.m.");
                                mTimesList.add("12:37 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("8:25 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("9:25 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("10:25 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("11:25 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("12:25 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("1:25 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("2:25 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("3:25 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("4:25 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("5:25 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("6:25 p.m.");
                                mTimesList.add("7:00 p.m.");
                                mTimesList.add("7:25 p.m.");
                                mTimesList.add("8:00 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("12:47 a.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Sunday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("5:15 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:15 a.m.\n(To Cabin Creek)");
                                mTimesList.add("9:15 a.m.\n(To Cabin Creek)");
                                mTimesList.add("11:15 a.m.\n(To Cabin Creek)");
                                mTimesList.add("1:15 p.m.\n(To Cabin Creek)");
                                mTimesList.add("3:15 p.m.\n(To Cabin Creek)");
                                mTimesList.add("5:15 p.m.\n(To Cabin Creek)");
                                mTimesList.add("7:15 p.m.\n(To Cabin Creek)");
                                mTimesList.add("9:15 p.m.\n(To Cabin Creek)");
                                mTimesList.add("11:15 p.m.\n(To Cabin Creek)");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("5:27 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:27 a.m.\n(To Cabin Creek)");
                                mTimesList.add("9:27 a.m.\n(To Cabin Creek)");
                                mTimesList.add("11:27 a.m.\n(To Cabin Creek)");
                                mTimesList.add("1:27 p.m.\n(To Cabin Creek)");
                                mTimesList.add("3:27 p.m.\n(To Cabin Creek)");
                                mTimesList.add("5:27 p.m.\n(To Cabin Creek)");
                                mTimesList.add("7:27 p.m.\n(To Cabin Creek)");
                                mTimesList.add("9:27 p.m.\n(To Cabin Creek)");
                                mTimesList.add("11:27 p.m.\n(To Cabin Creek)");
                                break;
                            case "57th at MacCorkle":
                                mTimesList.add("5:38 a.m.\n(To Cabin Creek)");
                                mTimesList.add("7:38 a.m.\n(To Cabin Creek)");
                                mTimesList.add("9:38 a.m.\n(To Cabin Creek)");
                                mTimesList.add("11:38 a.m.\n(To Cabin Creek)");
                                mTimesList.add("1:38 p.m.\n(To Cabin Creek)");
                                mTimesList.add("3:38 p.m.\n(To Cabin Creek)");
                                mTimesList.add("5:38 p.m.\n(To Cabin Creek)");
                                mTimesList.add("7:38 p.m.\n(To Cabin Creek)");
                                mTimesList.add("9:38 p.m.\n(To Cabin Creek)");
                                mTimesList.add("11:38 p.m.\n(To Cabin Creek)");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "57th at MacCorkle":
                                mTimesList.add("6:52 a.m.\n(From Cabin Creek)");
                                mTimesList.add("8:52 a.m.\n(From Cabin Creek)");
                                mTimesList.add("10:52 a.m.\n(From Cabin Creek)");
                                mTimesList.add("12:52 p.m.\n(From Cabin Creek)");
                                mTimesList.add("2:52 p.m.\n(From Cabin Creek)");
                                mTimesList.add("4:52 p.m.\n(From Cabin Creek)");
                                mTimesList.add("6:52 p.m.\n(From Cabin Creek)");
                                mTimesList.add("8:52 p.m.\n(From Cabin Creek)");
                                mTimesList.add("10:52 p.m.\n(From Cabin Creek)");
                                mTimesList.add("12:38 a.m.\n(From Cabin Creek)");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("7:03 a.m.");
                                mTimesList.add("9:03 a.m.");
                                mTimesList.add("11:03 a.m.");
                                mTimesList.add("1:03 p.m.");
                                mTimesList.add("3:03 p.m.");
                                mTimesList.add("5:03 p.m.");
                                mTimesList.add("7:03 p.m.");
                                mTimesList.add("9:03 p.m.");
                                mTimesList.add("11:03 p.m.");
                                mTimesList.add("12:49 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("1:01 a.m.");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i).toString();

        return mTimes;
    }

    protected static String[] getTimes3N(String mDay, String mDirection, String mTimepoint) {

        ArrayList mTimesList = new ArrayList();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Capitol Complex":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:59 a.m.");
                                mTimesList.add("7:59 a.m.");
                                mTimesList.add("8:59 a.m.");
                                mTimesList.add("9:59 a.m.");
                                mTimesList.add("10:59 a.m.");
                                mTimesList.add("11:59 a.m.");
                                mTimesList.add("1:09 p.m.");
                                mTimesList.add("2:09 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:09 p.m.");
                                mTimesList.add("5:09 p.m.");
                                mTimesList.add("6:09 p.m.");
                                mTimesList.add("7:09 p.m.");
                                mTimesList.add("8:09 p.m.");
                                mTimesList.add("9:09 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("-");
                                mTimesList.add("5:20 a.m.");
                                mTimesList.add("6:20 a.m.");
                                mTimesList.add("7:10 a.m.");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("9:10 a.m.");
                                mTimesList.add("10:10 a.m.");
                                mTimesList.add("11:10 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("1:20 p.m.");
                                mTimesList.add("2:20 p.m.");
                                mTimesList.add("3:20 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("5:20 p.m.");
                                mTimesList.add("6:20 p.m.");
                                mTimesList.add("7:20 p.m.");
                                mTimesList.add("8:20 p.m.");
                                mTimesList.add("9:20 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "7th Ave and 26th St":
                                mTimesList.add("5:05 a.m.");
                                mTimesList.add("5:34 a.m.");
                                mTimesList.add("6:34 a.m.");
                                mTimesList.add("7:24 a.m.");
                                mTimesList.add("8:24 a.m.");
                                mTimesList.add("9:24 a.m.");
                                mTimesList.add("10:24 a.m.");
                                mTimesList.add("11:24 a.m.");
                                mTimesList.add("12:24 p.m.");
                                mTimesList.add("1:34 p.m.");
                                mTimesList.add("2:34 p.m.");
                                mTimesList.add("3:34 p.m.");
                                mTimesList.add("4:34 p.m.");
                                mTimesList.add("5:34 p.m.");
                                mTimesList.add("6:34 p.m.");
                                mTimesList.add("7:34 p.m.");
                                mTimesList.add("8:34 p.m.");
                                mTimesList.add("9:34 p.m.");
                                mTimesList.add("11:34 p.m.");
                                break;
                            case "12th and Dunbar Ave":
                                mTimesList.add("5:14 a.m.");
                                mTimesList.add("5:43 a.m.");
                                mTimesList.add("6:43 a.m.");
                                mTimesList.add("7:33 a.m.");
                                mTimesList.add("8:33 a.m.");
                                mTimesList.add("9:33 a.m.");
                                mTimesList.add("10:33 a.m.");
                                mTimesList.add("11:33 a.m.");
                                mTimesList.add("12:33 p.m.");
                                mTimesList.add("1:43 p.m.");
                                mTimesList.add("2:43 p.m.");
                                mTimesList.add("3:43 p.m.");
                                mTimesList.add("4:43 p.m.");
                                mTimesList.add("5:43 p.m.");
                                mTimesList.add("6:43 p.m.");
                                mTimesList.add("7:43 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:43 p.m.");
                                mTimesList.add("11:43 p.m.");
                                break;
                            case "WV State University":
                                mTimesList.add("5:22 a.m.");
                                mTimesList.add("5:51 a.m.");
                                mTimesList.add("6:51 a.m.");
                                mTimesList.add("7:41 a.m.");
                                mTimesList.add("8:41 a.m.");
                                mTimesList.add("9:41 a.m.");
                                mTimesList.add("10:41 a.m.");
                                mTimesList.add("11:41 a.m.");
                                mTimesList.add("12:41 p.m.");
                                mTimesList.add("1:51 p.m.");
                                mTimesList.add("2:51 p.m.");
                                mTimesList.add("3:51 p.m.");
                                mTimesList.add("4:51 p.m.");
                                mTimesList.add("5:51 p.m.");
                                mTimesList.add("6:51 p.m.");
                                mTimesList.add("7:51 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:51 p.m.");
                                mTimesList.add("11:51 p.m.");
                                break;
                            case "St Albans Station":
                                mTimesList.add("-");
                                mTimesList.add("6:04 a.m.");
                                mTimesList.add("7:04 a.m.");
                                mTimesList.add("7:54 a.m.");
                                mTimesList.add("8:54 a.m.");
                                mTimesList.add("9:54 a.m.");
                                mTimesList.add("10:54 a.m.");
                                mTimesList.add("11:54 a.m.");
                                mTimesList.add("12:54 p.m.");
                                mTimesList.add("2:04 p.m.");
                                mTimesList.add("3:04 p.m.");
                                mTimesList.add("4:04 p.m.");
                                mTimesList.add("5:04 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:04 p.m.");
                                mTimesList.add("8:04 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("12:04 a.m.");
                                break;
                            case "40th St and Route 25":
                                mTimesList.add("5:32 a.m.");
                                mTimesList.add("6:17 a.m.");
                                mTimesList.add("7:17 a.m.");
                                mTimesList.add("8:07 a.m.");
                                mTimesList.add("9:07 a.m.");
                                mTimesList.add("10:07 a.m.");
                                mTimesList.add("11:07 a.m.");
                                mTimesList.add("12:07 p.m.");
                                mTimesList.add("1:07 p.m.");
                                mTimesList.add("2:17 p.m.");
                                mTimesList.add("3:17 p.m.");
                                mTimesList.add("4:17 p.m.");
                                mTimesList.add("5:17 p.m.");
                                mTimesList.add("6:04 p.m.");
                                mTimesList.add("7:17 p.m.");
                                mTimesList.add("8:17 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:01 p.m.");
                                mTimesList.add("12:17 a.m.");
                                break;
                            case "Nitro Marketplace":
                                mTimesList.add("5:42 a.m.");
                                mTimesList.add("6:27 a.m.");
                                mTimesList.add("7:27 a.m.");
                                mTimesList.add("8:17 a.m.");
                                mTimesList.add("9:17 a.m.");
                                mTimesList.add("10:17 a.m.");
                                mTimesList.add("11:17 a.m.");
                                mTimesList.add("12:17 p.m.");
                                mTimesList.add("1:17 p.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("3:27 p.m.");
                                mTimesList.add("4:27 p.m.");
                                mTimesList.add("5:27 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("7:27 p.m.");
                                mTimesList.add("8:27 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:11 p.m.");
                                mTimesList.add("12:27 a.m.");
                                break;
                            case "Mardi Gras Casino & Resort":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("8:20 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:20 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("12:30 a.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Mardi Gras Casino & Resort":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("8:31 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:31 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("2:41 p.m.");
                                mTimesList.add("3:41 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:41 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("12:30 a.m.");
                                break;
                            case "Nitro Marketplace":
                                mTimesList.add("5:44 a.m.");
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:34 a.m.");
                                mTimesList.add("8:34 a.m.");
                                mTimesList.add("9:34 a.m.");
                                mTimesList.add("10:34 a.m.");
                                mTimesList.add("11:44 a.m.");
                                mTimesList.add("12:21 p.m.");
                                mTimesList.add("1:44 p.m.");
                                mTimesList.add("2:44 p.m.");
                                mTimesList.add("3:44 p.m.");
                                mTimesList.add("4:44 p.m.");
                                mTimesList.add("5:44 p.m.");
                                mTimesList.add("6:44 p.m.");
                                mTimesList.add("7:44 p.m.");
                                mTimesList.add("8:44 p.m.");
                                mTimesList.add("10:15 p.m.");
                                mTimesList.add("-");
                                break;
                            case "40th St and Route 25":
                                mTimesList.add("5:54 a.m.");
                                mTimesList.add("6:42 a.m.");
                                mTimesList.add("7:44 a.m.");
                                mTimesList.add("8:44 a.m.");
                                mTimesList.add("9:44 a.m.");
                                mTimesList.add("10:44 a.m.");
                                mTimesList.add("11:54 a.m.");
                                mTimesList.add("12:31 p.m.");
                                mTimesList.add("1:54 p.m.");
                                mTimesList.add("2:54 p.m.");
                                mTimesList.add("3:54 p.m.");
                                mTimesList.add("4:54 p.m.");
                                mTimesList.add("5:54 p.m.");
                                mTimesList.add("6:54 p.m.");
                                mTimesList.add("7:54 p.m.");
                                mTimesList.add("8:54 p.m.");
                                mTimesList.add("10:25 p.m.");
                                mTimesList.add("12:40 a.m.");
                                break;
                            case "St Albans Station":
                                mTimesList.add("-");
                                mTimesList.add("6:57 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("8:57 a.m.");
                                mTimesList.add("9:57 a.m.");
                                mTimesList.add("10:57 a.m.");
                                mTimesList.add("12:07 p.m.");
                                mTimesList.add("12:44 p.m.");
                                mTimesList.add("2:07 p.m.");
                                mTimesList.add("3:07 p.m.");
                                mTimesList.add("4:07 p.m.");
                                mTimesList.add("5:07 p.m.");
                                mTimesList.add("6:07 p.m.");
                                mTimesList.add("7:07 p.m.");
                                mTimesList.add("8:07 p.m.");
                                mTimesList.add("9:07 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "WV State University":
                                mTimesList.add("6:04 a.m.");
                                mTimesList.add("7:10 a.m.");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("9:10 a.m.");
                                mTimesList.add("10:10 a.m.");
                                mTimesList.add("11:10 a.m.");
                                mTimesList.add("12:20 p.m.");
                                mTimesList.add("12:57 p.m.");
                                mTimesList.add("2:20 p.m.");
                                mTimesList.add("3:20 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("5:20 p.m.");
                                mTimesList.add("6:20 p.m.");
                                mTimesList.add("7:20 p.m.");
                                mTimesList.add("8:20 p.m.");
                                mTimesList.add("9:20 p.m.");
                                mTimesList.add("10:35 p.m.");
                                mTimesList.add("12:50 a.m.");
                                break;
                            case "12th and Dunbar Ave":
                                mTimesList.add("6:12 a.m.");
                                mTimesList.add("7:18 a.m.");
                                mTimesList.add("8:18 a.m.");
                                mTimesList.add("9:18 a.m.");
                                mTimesList.add("10:18 a.m.");
                                mTimesList.add("11:18 a.m.");
                                mTimesList.add("12:28 p.m.");
                                mTimesList.add("1:05 p.m.");
                                mTimesList.add("2:28 p.m.");
                                mTimesList.add("3:28 p.m.");
                                mTimesList.add("4:28 p.m.");
                                mTimesList.add("5:28 p.m.");
                                mTimesList.add("6:28 p.m.");
                                mTimesList.add("7:28 p.m.");
                                mTimesList.add("8:28 p.m.");
                                mTimesList.add("9:28 p.m.");
                                mTimesList.add("10:43 p.m.");
                                mTimesList.add("12:57 a.m.");
                                break;
                            case "7th Ave and 26th St":
                                mTimesList.add("6:22 a.m.");
                                mTimesList.add("7:28 a.m.");
                                mTimesList.add("8:28 a.m.");
                                mTimesList.add("9:28 a.m.");
                                mTimesList.add("10:28 a.m.");
                                mTimesList.add("11:28 a.m.");
                                mTimesList.add("12:38 p.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("2:38 p.m.");
                                mTimesList.add("3:38 p.m.");
                                mTimesList.add("4:38 p.m.");
                                mTimesList.add("5:38 p.m.");
                                mTimesList.add("6:38 p.m.");
                                mTimesList.add("7:38 p.m.");
                                mTimesList.add("8:38 p.m.");
                                mTimesList.add("9:38 p.m.");
                                mTimesList.add("10:51 p.m.");
                                mTimesList.add("1:05 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:39 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("12:55 p.m.");
                                mTimesList.add("1:32 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("3:55 p.m.");
                                mTimesList.add("4:55 p.m.");
                                mTimesList.add("5:55 p.m.");
                                mTimesList.add("6:55 p.m.");
                                mTimesList.add("7:55 p.m.");
                                mTimesList.add("8:55 p.m.");
                                mTimesList.add("9:55 p.m.");
                                mTimesList.add("11:08 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:51 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("8:57 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:57 a.m.");
                                mTimesList.add("11:57 a.m.");
                                mTimesList.add("1:07 p.m.");
                                mTimesList.add("1:44 p.m.");
                                mTimesList.add("3:07 p.m.");
                                mTimesList.add("4:07 p.m.");
                                mTimesList.add("5:07 p.m.");
                                mTimesList.add("6:07 p.m.");
                                mTimesList.add("7:07 p.m.");
                                mTimesList.add("8:07 p.m.");
                                mTimesList.add("9:07 p.m.");
                                mTimesList.add("10:07 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Capitol Complex":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("-");
                                mTimesList.add("5:30 a.m.");
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:20 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "7th Ave and 26th St":
                                mTimesList.add("5:20 a.m.");
                                mTimesList.add("5:48 a.m.");
                                mTimesList.add("6:48 a.m.");
                                mTimesList.add("7:48 a.m.");
                                mTimesList.add("8:48 a.m.");
                                mTimesList.add("9:48 a.m.");
                                mTimesList.add("10:48 a.m.");
                                mTimesList.add("11:48 a.m.");
                                mTimesList.add("12:48 p.m.");
                                mTimesList.add("1:48 p.m.");
                                mTimesList.add("2:48 p.m.");
                                mTimesList.add("2:58 p.m.");
                                mTimesList.add("3:48 p.m.");
                                mTimesList.add("4:48 p.m.");
                                mTimesList.add("5:48 p.m.");
                                mTimesList.add("6:58 p.m.");
                                mTimesList.add("7:29 p.m.");
                                mTimesList.add("9:34 p.m.");
                                mTimesList.add("11:29 p.m.");
                                break;
                            case "12th and Dunbar Ave":
                                mTimesList.add("5:27 a.m.");
                                mTimesList.add("5:56 a.m.");
                                mTimesList.add("6:56 a.m.");
                                mTimesList.add("7:56 a.m.");
                                mTimesList.add("8:56 a.m.");
                                mTimesList.add("9:56 a.m.");
                                mTimesList.add("10:56 a.m.");
                                mTimesList.add("11:56 a.m.");
                                mTimesList.add("12:56 p.m.");
                                mTimesList.add("1:56 p.m.");
                                mTimesList.add("2:56 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:56 p.m.");
                                mTimesList.add("4:56 p.m.");
                                mTimesList.add("5:56 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:35 p.m.");
                                mTimesList.add("9:43 p.m.");
                                mTimesList.add("11:35 p.m.");
                                break;
                            case "WV State University":
                                mTimesList.add("5:35 a.m.");
                                mTimesList.add("6:05 a.m.");
                                mTimesList.add("7:05 a.m.");
                                mTimesList.add("8:05 a.m.");
                                mTimesList.add("9:05 a.m.");
                                mTimesList.add("10:05 a.m.");
                                mTimesList.add("11:05 a.m.");
                                mTimesList.add("12:05 p.m.");
                                mTimesList.add("1:05 p.m.");
                                mTimesList.add("2:05 p.m.");
                                mTimesList.add("3:05 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:05 p.m.");
                                mTimesList.add("5:05 p.m.");
                                mTimesList.add("6:05 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:41 p.m.");
                                mTimesList.add("9:51 p.m.");
                                mTimesList.add("11:41 p.m.");
                                break;
                            case "St Albans Station":
                                mTimesList.add("-");
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "40th St and Route 25":
                                mTimesList.add("5:45 a.m.");
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("6:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:53 p.m.");
                                mTimesList.add("10:01 p.m.");
                                mTimesList.add("11:53 p.m.");
                                break;
                            case "Nitro Marketplace":
                                mTimesList.add("5:55 a.m.");
                                mTimesList.add("6:40 a.m.");
                                mTimesList.add("7:40 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("9:40 a.m.");
                                mTimesList.add("10:40 a.m.");
                                mTimesList.add("11:40 a.m.");
                                mTimesList.add("12:40 p.m.");
                                mTimesList.add("1:40 p.m.");
                                mTimesList.add("2:40 p.m.");
                                mTimesList.add("3:40 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:40 p.m.");
                                mTimesList.add("5:40 p.m.");
                                mTimesList.add("6:40 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:03 p.m.");
                                mTimesList.add("10:11 p.m.");
                                mTimesList.add("12:03 a.m.");
                                break;
                            case "Mardi Gras Casino & Resort":
                                mTimesList.add("5:58 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("8:06 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:05 a.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Mardi Gras Casino & Resort":
                                mTimesList.add("5:58 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("8:24 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:0 a.m.");
                                break;
                            case "Nitro Marketplace":
                                mTimesList.add("6:01 a.m.");
                                mTimesList.add("6:47 a.m.");
                                mTimesList.add("7:47 a.m.");
                                mTimesList.add("8:47 a.m.");
                                mTimesList.add("9:47 a.m.");
                                mTimesList.add("10:47 a.m.");
                                mTimesList.add("11:47 a.m.");
                                mTimesList.add("12:47 p.m.");
                                mTimesList.add("1:47 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:47 p.m.");
                                mTimesList.add("3:47 p.m.");
                                mTimesList.add("4:47 p.m.");
                                mTimesList.add("5:47 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("6:47 p.m.");
                                mTimesList.add("8:27 p.m.");
                                mTimesList.add("10:15 p.m.");
                                mTimesList.add("-");
                                break;
                            case "40th St and Route 25":
                                mTimesList.add("6:11 a.m.");
                                mTimesList.add("6:57 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("8:57 a.m.");
                                mTimesList.add("9:57 a.m.");
                                mTimesList.add("10:57 a.m.");
                                mTimesList.add("11:57 a.m.");
                                mTimesList.add("12:57 p.m.");
                                mTimesList.add("1:57 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:57 p.m.");
                                mTimesList.add("3:57 p.m.");
                                mTimesList.add("4:57 p.m.");
                                mTimesList.add("5:57 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("6:57 p.m.");
                                mTimesList.add("8:37 p.m.");
                                mTimesList.add("10:25 p.m.");
                                mTimesList.add("12:15 a.m.");
                                break;
                            case "St Albans Station":
                                mTimesList.add("-");
                                mTimesList.add("7:12 a.m.");
                                mTimesList.add("8:12 a.m.");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("10:12 a.m.");
                                mTimesList.add("11:12 a.m.");
                                mTimesList.add("12:12 p.m.");
                                mTimesList.add("1:12 p.m.");
                                mTimesList.add("2:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("4:12 p.m.");
                                mTimesList.add("5:12 p.m.");
                                mTimesList.add("6:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:38 p.m.");
                                mTimesList.add("-");
                                break;
                            case "WV State University":
                                mTimesList.add("6:26 a.m.");
                                mTimesList.add("7:22 a.m.");
                                mTimesList.add("8:22 a.m.");
                                mTimesList.add("9:22 a.m.");
                                mTimesList.add("10:22 a.m.");
                                mTimesList.add("11:22 a.m.");
                                mTimesList.add("12:22 p.m.");
                                mTimesList.add("1:22 p.m.");
                                mTimesList.add("2:22 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:22 p.m.");
                                mTimesList.add("4:22 p.m.");
                                mTimesList.add("5:22 p.m.");
                                mTimesList.add("6:22 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:22 p.m.");
                                mTimesList.add("8:49 p.m.");
                                mTimesList.add("10:50 p.m.");
                                mTimesList.add("12:25 a.m.");
                                break;
                            case "12th and Dunbar Ave":
                                mTimesList.add("6:34 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("6:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:30 p.m.");
                                mTimesList.add("8:55 p.m.");
                                mTimesList.add("10:56 p.m.");
                                mTimesList.add("12:31 a.m.");
                                break;
                            case "7th Ave and 26th St":
                                mTimesList.add("6:46 a.m.");
                                mTimesList.add("7:42 a.m.");
                                mTimesList.add("8:42 a.m.");
                                mTimesList.add("9:42 a.m.");
                                mTimesList.add("10:42 a.m.");
                                mTimesList.add("11:42 a.m.");
                                mTimesList.add("12:42 p.m.");
                                mTimesList.add("1:42 p.m.");
                                mTimesList.add("2:42 p.m.");
                                mTimesList.add("2:58 p.m.");
                                mTimesList.add("3:42 p.m.");
                                mTimesList.add("4:42 p.m.");
                                mTimesList.add("5:42 p.m.");
                                mTimesList.add("6:42 p.m.");
                                mTimesList.add("6:58 p.m.");
                                mTimesList.add("7:42 p.m.");
                                mTimesList.add("9:01 p.m.");
                                mTimesList.add("11:02 p.m.");
                                mTimesList.add("12:37 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("7:00 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("8:00 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                }
                break;
            case "Sunday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Capitol Complex":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("-");
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("5:25 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "7th Ave and 26th St":
                                mTimesList.add("4:55 a.m.");
                                mTimesList.add("6:40 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("10:10 a.m.");
                                mTimesList.add("11:25 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("2:40 p.m.");
                                mTimesList.add("3:40 p.m.");
                                mTimesList.add("5:35 p.m.");
                                mTimesList.add("7:25 p.m.");
                                mTimesList.add("9:25 p.m.");
                                mTimesList.add("11:25 p.m.");
                                break;
                            case "12th and Dunbar Ave":
                                mTimesList.add("5:02 a.m.");
                                mTimesList.add("6:47 a.m.");
                                mTimesList.add("8:47 a.m.");
                                mTimesList.add("10:17 a.m.");
                                mTimesList.add("11:35 a.m.");
                                mTimesList.add("12:17 p.m.");
                                mTimesList.add("2:47 p.m.");
                                mTimesList.add("3:47 p.m.");
                                mTimesList.add("5:43 p.m.");
                                mTimesList.add("7:33 p.m.");
                                mTimesList.add("9:33 p.m.");
                                mTimesList.add("11:33 p.m.");
                                break;
                            case "WV State University":
                                mTimesList.add("5:10 a.m.");
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("8:55 a.m.");
                                mTimesList.add("10:25 a.m.");
                                mTimesList.add("11:43 a.m.");
                                mTimesList.add("12:25 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("3:55 p.m.");
                                mTimesList.add("5:51 p.m.");
                                mTimesList.add("7:41 p.m.");
                                mTimesList.add("9:41 p.m.");
                                mTimesList.add("11:41 p.m.");
                                break;
                            case "St Albans Station":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("10:36 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("3:07 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "40th St and Route 25":
                                mTimesList.add("5:18 a.m.");
                                mTimesList.add("7:11 a.m.");
                                mTimesList.add("9:11 a.m.");
                                mTimesList.add("10:47 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:41 p.m.");
                                mTimesList.add("3:19 p.m.");
                                mTimesList.add("4:11 p.m.");
                                mTimesList.add("6:07 p.m.");
                                mTimesList.add("7:57 p.m.");
                                mTimesList.add("9:57 p.m.");
                                mTimesList.add("11:57 p.m.");
                                break;
                            case "Nitro Marketplace":
                                mTimesList.add("5:28 a.m.");
                                mTimesList.add("7:21 a.m.");
                                mTimesList.add("9:21 a.m.");
                                mTimesList.add("10:57 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:51 p.m.");
                                mTimesList.add("3:29 p.m.");
                                mTimesList.add("4:21 p.m.");
                                mTimesList.add("6:17 p.m.");
                                mTimesList.add("8:07 p.m.");
                                mTimesList.add("10:06 p.m.");
                                mTimesList.add("12:07 a.m.");
                                break;
                            case "Mardi Gras Casino & Resort":
                                mTimesList.add("-");
                                mTimesList.add("7:25 a.m.");
                                mTimesList.add("9:25 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("3:33 p.m.");
                                mTimesList.add("4:25 p.m.");
                                mTimesList.add("6:20 p.m.");
                                mTimesList.add("8:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:10 a.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Mardi Gras Casino & Resort":
                                mTimesList.add("-");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("9:25 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("4:13 p.m.");
                                mTimesList.add("6:20 p.m.");
                                mTimesList.add("8:24 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:10 a.m.");
                                break;
                            case "Nitro Marketplace":
                                mTimesList.add("5:30 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("11:03 a.m.");
                                mTimesList.add("1:13 p.m.");
                                mTimesList.add("4:18 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("10:21 p.m.");
                                mTimesList.add("-");
                                break;
                            case "40th St and Route 25":
                                mTimesList.add("5:40 a.m.");
                                mTimesList.add("7:55 a.m.");
                                mTimesList.add("9:35 a.m.");
                                mTimesList.add("11:13 a.m.");
                                mTimesList.add("1:23 p.m.");
                                mTimesList.add("4:28 p.m.");
                                mTimesList.add("6:30 p.m.");
                                mTimesList.add("8:34 p.m.");
                                mTimesList.add("10:31 p.m.");
                                mTimesList.add("12:20 a.m.");
                                break;
                            case "St Albans Station":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("4:40 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "WV State University":
                                mTimesList.add("5:57 a.m.");
                                mTimesList.add("8:12 a.m.");
                                mTimesList.add("9:52 a.m.");
                                mTimesList.add("11:29 a.m.");
                                mTimesList.add("1:40 p.m.");
                                mTimesList.add("4:52 p.m.");
                                mTimesList.add("6:47 p.m.");
                                mTimesList.add("8:48 p.m.");
                                mTimesList.add("10:47 p.m.");
                                mTimesList.add("12:35 a.m.");
                                break;
                            case "12th and Dunbar Ave":
                                mTimesList.add("6:05 a.m.");
                                mTimesList.add("8:20 a.m.");
                                mTimesList.add("10:02 a.m.");
                                mTimesList.add("11:37 a.m.");
                                mTimesList.add("1:50 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:55 p.m.");
                                mTimesList.add("8:56 p.m.");
                                mTimesList.add("10:55 p.m.");
                                mTimesList.add("12:42 a.m.");
                                break;
                            case "7th Ave and 26th St":
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("8:28 a.m.");
                                mTimesList.add("10:12 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("5:10 p.m.");
                                mTimesList.add("7:03 p.m.");
                                mTimesList.add("9:03 p.m.");
                                mTimesList.add("11:03 p.m.");
                                mTimesList.add("12:49 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("10:27 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("5:25 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:13 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i).toString();

        return mTimes;
    }

    protected static String[] getTimes3I(String mDay, String mDirection, String mTimepoint) {

        ArrayList mTimesList = new ArrayList();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Capitol Complex":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:59 a.m.");
                                mTimesList.add("7:29 a.m.");
                                mTimesList.add("7:59 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:29 a.m.");
                                mTimesList.add("8:59 a.m.");
                                mTimesList.add("9:29 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:59 a.m.");
                                mTimesList.add("10:59 a.m.");
                                mTimesList.add("11:19 a.m.\n(Travels Roxalana Rd)");
                                mTimesList.add("11:59 a.m.");
                                mTimesList.add("12:19 p.m.");
                                mTimesList.add("1:09 p.m.");
                                mTimesList.add("1:19 p.m.");
                                mTimesList.add("2:09 p.m.");
                                mTimesList.add("2:19 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:19 p.m.");
                                mTimesList.add("4:09 p.m.");
                                mTimesList.add("4:19 p.m.\n(Travels Roxalana Rd)");
                                mTimesList.add("5:05 p.m.");
                                mTimesList.add("5:09 p.m.");
                                mTimesList.add("5:49 p.m.\n(Travels Roxalana Rd)");
                                mTimesList.add("6:04 p.m.");
                                mTimesList.add("6:09 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:09 p.m.");
                                mTimesList.add("8:09 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:09 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:09 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("-");
                                mTimesList.add("5:20 a.m.");
                                mTimesList.add("6:20 a.m.");
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:10 a.m.");
                                mTimesList.add("7:40 a.m.");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("8:30 a.m.\n(Travels Roxalana Rd)");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("9:10 a.m.");
                                mTimesList.add("9:40 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("10:10 a.m.");
                                mTimesList.add("11:10 a.m.");
                                mTimesList.add("11:30 a.m.\n(Travels Roxalana Rd)");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:20 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("2:20 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:20 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("4:30 p.m.\n(Travels Roxalana Rd)");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("5:20 p.m.");
                                mTimesList.add("6:00 p.m.\n(Travels Roxalana Rd)");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("6:20 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("7:20 p.m.");
                                mTimesList.add("8:20 p.m.");
                                mTimesList.add("8:45 p.m.");
                                mTimesList.add("9:20 p.m.");
                                mTimesList.add("10:11 p.m.");
                                mTimesList.add("10:20 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "7th Ave and 26th St":
                                mTimesList.add("5:05 a.m.");
                                mTimesList.add("5:34 a.m.");
                                mTimesList.add("6:34 a.m.");
                                mTimesList.add("6:59 a.m.");
                                mTimesList.add("7:24 a.m.");
                                mTimesList.add("7:54 a.m.");
                                mTimesList.add("8:24 a.m.");
                                mTimesList.add("8:44 a.m.\n(Travels Roxalana Rd)");
                                mTimesList.add("8:54 a.m.");
                                mTimesList.add("9:24 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:59 a.m.");
                                mTimesList.add("10:24 a.m.");
                                mTimesList.add("11:24 a.m.");
                                mTimesList.add("11:44 a.m.\n(Travels Roxalana Rd)");
                                mTimesList.add("12:24 p.m.");
                                mTimesList.add("12:44 p.m.");
                                mTimesList.add("1:34 p.m.");
                                mTimesList.add("1:44 p.m.");
                                mTimesList.add("2:34 p.m.");
                                mTimesList.add("2:44 p.m.");
                                mTimesList.add("3:34 p.m.");
                                mTimesList.add("3:44 p.m.");
                                mTimesList.add("4:34 p.m.");
                                mTimesList.add("4:44 p.m.\n(Travels Roxalana Rd)");
                                mTimesList.add("-");
                                mTimesList.add("5:34 p.m.");
                                mTimesList.add("6:14 p.m.\n(Travels Roxalana Rd)");
                                mTimesList.add("6:29 p.m.");
                                mTimesList.add("6:34 p.m.");
                                mTimesList.add("7:29 p.m.");
                                mTimesList.add("7:34 p.m.");
                                mTimesList.add("8:34 p.m.");
                                mTimesList.add("8:59 p.m.");
                                mTimesList.add("9:34 p.m.");
                                mTimesList.add("10:25 p.m.");
                                mTimesList.add("10:34 p.m.");
                                mTimesList.add("11:34 p.m.");
                                break;
                            case "12th and Dunbar Ave":
                                mTimesList.add("5:14 a.m.");
                                mTimesList.add("5:43 a.m.");
                                mTimesList.add("6:43 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:33 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:33 a.m.");
                                mTimesList.add("8:53 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:33 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:08 a.m.");
                                mTimesList.add("10:33 a.m.");
                                mTimesList.add("11:33 a.m.");
                                mTimesList.add("11:53 a.m.");
                                mTimesList.add("12:33 p.m.");
                                mTimesList.add("12:53 p.m.");
                                mTimesList.add("1:43 p.m.");
                                mTimesList.add("1:53 p.m.");
                                mTimesList.add("2:43 p.m.");
                                mTimesList.add("2:53 p.m.");
                                mTimesList.add("3:43 p.m.");
                                mTimesList.add("3:53 p.m.");
                                mTimesList.add("4:43 p.m.");
                                mTimesList.add("4:53 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:43 p.m.");
                                mTimesList.add("6:23 p.m.");
                                mTimesList.add("6:38 p.m.");
                                mTimesList.add("6:43 p.m.");
                                mTimesList.add("7:38 p.m.");
                                mTimesList.add("7:43 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:08 p.m.");
                                mTimesList.add("9:43 p.m.");
                                mTimesList.add("10:34 p.m.");
                                mTimesList.add("10:43 p.m.");
                                mTimesList.add("11:43 p.m.");
                                break;
                            case "WV State University":
                                mTimesList.add("5:22 a.m.");
                                mTimesList.add("5:51 a.m.");
                                mTimesList.add("6:51 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:41 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:41 a.m.");
                                mTimesList.add("9:01 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:41 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:16 a.m.");
                                mTimesList.add("10:41 a.m.");
                                mTimesList.add("11:41 a.m.");
                                mTimesList.add("12:01 p.m.");
                                mTimesList.add("12:41 p.m.");
                                mTimesList.add("1:01 p.m.");
                                mTimesList.add("1:51 p.m.");
                                mTimesList.add("2:01 p.m.");
                                mTimesList.add("2:51 p.m.");
                                mTimesList.add("3:01 p.m.");
                                mTimesList.add("3:51 p.m.");
                                mTimesList.add("4:01 p.m.");
                                mTimesList.add("4:51 p.m.");
                                mTimesList.add("5:01 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:51 p.m.");
                                mTimesList.add("6:31 p.m.");
                                mTimesList.add("6:46 p.m.");
                                mTimesList.add("6:51 p.m.");
                                mTimesList.add("7:46 p.m.");
                                mTimesList.add("7:51 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:16 p.m.");
                                mTimesList.add("9:51 p.m.");
                                mTimesList.add("10:42 p.m.");
                                mTimesList.add("10:51 p.m.");
                                mTimesList.add("11:51 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "WV State University":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:04 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:10 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:06 a.m.\n(Travels Roxalana Rd)");
                                mTimesList.add("9:10 a.m.");
                                mTimesList.add("10:10 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("11:10 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:15 p.m.\n(Travels Roxalana Rd)");
                                mTimesList.add("12:20 p.m.");
                                mTimesList.add("12:57 p.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("2:20 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("3:20 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("5:15 p.m.\n(Travels Roxalana Rd)");
                                mTimesList.add("5:20 p.m.");
                                mTimesList.add("6:20 p.m.");
                                mTimesList.add("6:35 p.m.");
                                mTimesList.add("6:50 p.m.");
                                mTimesList.add("7:20 p.m.");
                                mTimesList.add("7:50 p.m.");
                                mTimesList.add("8:20 p.m.");
                                mTimesList.add("9:20 p.m.");
                                mTimesList.add("9:35 p.m.");
                                mTimesList.add("10:35 p.m.");
                                mTimesList.add("10:42 p.m.");
                                mTimesList.add("10:55 p.m.");
                                mTimesList.add("12:50 a.m.");
                                break;
                            case "12th and Dunbar Ave":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:12 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:18 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:18 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:14 a.m.\n(Travels Roxalana Rd)");
                                mTimesList.add("9:18 a.m.");
                                mTimesList.add("10:18 a.m.");
                                mTimesList.add("10:38 a.m.");
                                mTimesList.add("11:18 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:23 p.m.\n(Travels Roxalana Rd)");
                                mTimesList.add("12:28 p.m.");
                                mTimesList.add("1:05 p.m.");
                                mTimesList.add("1:23 p.m.");
                                mTimesList.add("2:23 p.m.");
                                mTimesList.add("2:28 p.m.");
                                mTimesList.add("3:23 p.m.");
                                mTimesList.add("3:28 p.m.");
                                mTimesList.add("4:23 p.m.");
                                mTimesList.add("4:28 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("5:23 p.m.\n(Travels Roxalana Rd)");
                                mTimesList.add("5:28 p.m.");
                                mTimesList.add("6:28 p.m.");
                                mTimesList.add("6:43 p.m.");
                                mTimesList.add("6:58 p.m.");
                                mTimesList.add("7:28 p.m.");
                                mTimesList.add("7:58 p.m.");
                                mTimesList.add("8:28 p.m.");
                                mTimesList.add("9:28 p.m.");
                                mTimesList.add("9:43 p.m.");
                                mTimesList.add("10:43 p.m.");
                                mTimesList.add("10:48 p.m.");
                                mTimesList.add("11:02 p.m.");
                                mTimesList.add("12:57 a.m.");
                                break;
                            case "7th Ave and 26th St":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:22 a.m.");
                                mTimesList.add("6:59 a.m.");
                                mTimesList.add("7:28 a.m.");
                                mTimesList.add("7:59 a.m.");
                                mTimesList.add("8:28 a.m.");
                                mTimesList.add("8:59 a.m.");
                                mTimesList.add("9:24 a.m.\n(Travels Roxalana Rd)");
                                mTimesList.add("9:28 a.m.");
                                mTimesList.add("10:28 a.m.");
                                mTimesList.add("10:48 a.m.");
                                mTimesList.add("11:28 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:33 p.m.\n(Travels Roxalana Rd)");
                                mTimesList.add("12:38 p.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("1:33 p.m.");
                                mTimesList.add("2:33 p.m.");
                                mTimesList.add("2:38 p.m.");
                                mTimesList.add("3:33 p.m.");
                                mTimesList.add("3:38 p.m.");
                                mTimesList.add("4:33 p.m.");
                                mTimesList.add("4:38 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("5:33 p.m.\n(Travels Roxalana Rd)");
                                mTimesList.add("5:38 p.m.");
                                mTimesList.add("6:38 p.m.");
                                mTimesList.add("6:53 p.m.");
                                mTimesList.add("7:08 p.m.");
                                mTimesList.add("7:38 p.m.");
                                mTimesList.add("8:08 p.m.");
                                mTimesList.add("8:38 p.m.");
                                mTimesList.add("9:38 p.m.");
                                mTimesList.add("9:53 p.m.");
                                mTimesList.add("10:51 p.m.");
                                mTimesList.add("10:58 p.m.");
                                mTimesList.add("11:10 p.m.");
                                mTimesList.add("1:05 a.m.");
                                break;
                            case "Stockton and W Washington":
                                mTimesList.add("5:36 a.m.");
                                mTimesList.add("6:06 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("11:41 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("4:51 p.m.");
                                mTimesList.add("5:26 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("5:45 a.m.");
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("6:39 a.m.");
                                mTimesList.add("7:16 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:16 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:16 a.m.");
                                mTimesList.add("9:41 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:05 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("11:50 a.m.");
                                mTimesList.add("12:50 p.m.");
                                mTimesList.add("12:55 p.m.");
                                mTimesList.add("1:32 p.m.");
                                mTimesList.add("1:50 p.m.");
                                mTimesList.add("2:50 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("3:50 p.m.");
                                mTimesList.add("3:55 p.m.");
                                mTimesList.add("4:50 p.m.");
                                mTimesList.add("4:55 p.m.");
                                mTimesList.add("5:02 p.m.");
                                mTimesList.add("5:35 p.m.");
                                mTimesList.add("5:50 p.m.");
                                mTimesList.add("5:55 p.m.");
                                mTimesList.add("6:55 p.m.");
                                mTimesList.add("7:10 p.m.");
                                mTimesList.add("7:25 p.m.");
                                mTimesList.add("7:55 p.m.");
                                mTimesList.add("8:25 p.m.");
                                mTimesList.add("8:55 p.m.");
                                mTimesList.add("9:55 p.m.");
                                mTimesList.add("10:10 p.m.");
                                mTimesList.add("11:08 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:51 a.m.");
                                mTimesList.add("7:28 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("8:28 a.m.");
                                mTimesList.add("8:57 a.m.");
                                mTimesList.add("9:28 a.m.");
                                mTimesList.add("9:53 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:57 a.m.");
                                mTimesList.add("11:17 a.m.");
                                mTimesList.add("11:57 a.m.");
                                mTimesList.add("12:03 p.m.");
                                mTimesList.add("1:02 p.m.");
                                mTimesList.add("1:07 p.m.");
                                mTimesList.add("1:44 p.m.");
                                mTimesList.add("2:02 p.m.");
                                mTimesList.add("3:02 p.m.");
                                mTimesList.add("3:07 p.m.");
                                mTimesList.add("4:02 p.m.");
                                mTimesList.add("4:07 p.m.");
                                mTimesList.add("5:02 p.m.");
                                mTimesList.add("5:07 p.m.");
                                mTimesList.add("5:14 p.m.");
                                mTimesList.add("5:47 p.m.");
                                mTimesList.add("6:02 p.m.");
                                mTimesList.add("6:07 p.m.");
                                mTimesList.add("7:07 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("8:07 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:07 p.m.");
                                mTimesList.add("10:07 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Capitol Complex":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("5:30 a.m.");
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:00 p.m.");
                                mTimesList.add("9:20 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "7th Ave and 26th St":
                                mTimesList.add("5:20 a.m.");
                                mTimesList.add("5:40 a.m.");
                                mTimesList.add("5:48 a.m.");
                                mTimesList.add("6:18 a.m.");
                                mTimesList.add("6:48 a.m.");
                                mTimesList.add("7:18 a.m.");
                                mTimesList.add("7:48 a.m.");
                                mTimesList.add("8:18 a.m.");
                                mTimesList.add("8:48 a.m.");
                                mTimesList.add("9:18 a.m.");
                                mTimesList.add("9:48 a.m.");
                                mTimesList.add("10:18 a.m.");
                                mTimesList.add("10:48 a.m.");
                                mTimesList.add("11:18 a.m.");
                                mTimesList.add("11:48 a.m.");
                                mTimesList.add("12:18 p.m.");
                                mTimesList.add("12:48 p.m.");
                                mTimesList.add("1:18 p.m.");
                                mTimesList.add("1:48 p.m.");
                                mTimesList.add("2:18 p.m.");
                                mTimesList.add("2:48 p.m.");
                                mTimesList.add("2:58 p.m.");
                                mTimesList.add("3:18 p.m.");
                                mTimesList.add("3:48 p.m.");
                                mTimesList.add("4:18 p.m.");
                                mTimesList.add("4:48 p.m.");
                                mTimesList.add("5:18 p.m.");
                                mTimesList.add("5:48 p.m.");
                                mTimesList.add("6:18 p.m.");
                                mTimesList.add("6:58 p.m.");
                                mTimesList.add("7:29 p.m.");
                                mTimesList.add("9:18 p.m.");
                                mTimesList.add("9:34 p.m.");
                                mTimesList.add("11:29 p.m.");
                                break;
                            case "12th and Dunbar Ave":
                                mTimesList.add("5:27 a.m.");
                                mTimesList.add("5:48 a.m.");
                                mTimesList.add("5:56 a.m.");
                                mTimesList.add("6:26 a.m.");
                                mTimesList.add("6:56 a.m.");
                                mTimesList.add("7:26 a.m.");
                                mTimesList.add("7:56 a.m.");
                                mTimesList.add("8:26 a.m.");
                                mTimesList.add("8:56 a.m.");
                                mTimesList.add("9:26 a.m.");
                                mTimesList.add("9:56 a.m.");
                                mTimesList.add("10:26 a.m.");
                                mTimesList.add("10:56 a.m.");
                                mTimesList.add("11:26 a.m.");
                                mTimesList.add("11:56 a.m.");
                                mTimesList.add("12:26 p.m.");
                                mTimesList.add("12:56 p.m.");
                                mTimesList.add("1:26 p.m.");
                                mTimesList.add("1:56 p.m.");
                                mTimesList.add("2:26 p.m.");
                                mTimesList.add("2:56 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:26 p.m.");
                                mTimesList.add("3:56 p.m.");
                                mTimesList.add("4:26 p.m.");
                                mTimesList.add("4:56 p.m.");
                                mTimesList.add("5:26 p.m.");
                                mTimesList.add("5:56 p.m.");
                                mTimesList.add("6:26 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:35 p.m.");
                                mTimesList.add("9:26 p.m.");
                                mTimesList.add("9:43 p.m.");
                                mTimesList.add("11:35 p.m.");
                                break;
                            case "WV State University":
                                mTimesList.add("5:35 a.m.");
                                mTimesList.add("5:57 a.m.");
                                mTimesList.add("6:05 a.m.");
                                mTimesList.add("6:35 a.m.");
                                mTimesList.add("7:05 a.m.");
                                mTimesList.add("7:35 a.m.");
                                mTimesList.add("8:05 a.m.");
                                mTimesList.add("8:35 a.m.");
                                mTimesList.add("9:05 a.m.");
                                mTimesList.add("9:35 a.m.");
                                mTimesList.add("10:05 a.m.");
                                mTimesList.add("10:35 a.m.");
                                mTimesList.add("11:05 a.m.");
                                mTimesList.add("11:35 a.m.");
                                mTimesList.add("12:05 p.m.");
                                mTimesList.add("12:35 p.m.");
                                mTimesList.add("1:05 p.m.");
                                mTimesList.add("1:35 p.m.");
                                mTimesList.add("2:05 p.m.");
                                mTimesList.add("2:35 p.m.");
                                mTimesList.add("3:05 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:35 p.m.");
                                mTimesList.add("4:05 p.m.");
                                mTimesList.add("4:35 p.m.");
                                mTimesList.add("5:05 p.m.");
                                mTimesList.add("5:35 p.m.");
                                mTimesList.add("6:05 p.m.");
                                mTimesList.add("6:35 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:41 p.m.");
                                mTimesList.add("9:35 p.m.");
                                mTimesList.add("9:51 p.m.");
                                mTimesList.add("11:41 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "WV State University":
                                mTimesList.add("5:57 a.m.");
                                mTimesList.add("6:26 a.m.");
                                mTimesList.add("6:57 a.m.");
                                mTimesList.add("7:22 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("8:22 a.m.");
                                mTimesList.add("8:57 a.m.");
                                mTimesList.add("9:22 a.m.");
                                mTimesList.add("9:57 a.m.");
                                mTimesList.add("10:22 a.m.");
                                mTimesList.add("10:57 a.m.");
                                mTimesList.add("11:22 a.m.");
                                mTimesList.add("11:57 a.m.");
                                mTimesList.add("12:22 p.m.");
                                mTimesList.add("12:57 p.m.");
                                mTimesList.add("1:22 p.m.");
                                mTimesList.add("1:57 p.m.");
                                mTimesList.add("2:22 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:57 p.m.");
                                mTimesList.add("3:22 p.m.");
                                mTimesList.add("3:57 p.m.");
                                mTimesList.add("4:22 p.m.");
                                mTimesList.add("4:57 p.m.");
                                mTimesList.add("5:22 p.m.");
                                mTimesList.add("5:57 p.m.");
                                mTimesList.add("6:22 p.m.");
                                mTimesList.add("6:42 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:22 p.m.");
                                mTimesList.add("8:49 p.m.");
                                mTimesList.add("9:42 p.m.");
                                mTimesList.add("10:50 p.m.");
                                mTimesList.add("12:25 a.m.");
                                break;
                            case "12th and Dunbar Ave":
                                mTimesList.add("6:05 a.m.");
                                mTimesList.add("6:34 a.m.");
                                mTimesList.add("7:05 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:05 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:05 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:05 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("11:05 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("12:05 p.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:05 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("2:05 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:05 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:05 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:05 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("6:05 p.m.");
                                mTimesList.add("6:30 p.m.");
                                mTimesList.add("6:50 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:30 p.m.");
                                mTimesList.add("8:55 p.m.");
                                mTimesList.add("9:50 p.m.");
                                mTimesList.add("10:56 p.m.");
                                mTimesList.add("12:31 a.m.");
                                break;
                            case "7th Ave and 26th St":
                                mTimesList.add("6:13 a.m.");
                                mTimesList.add("6:46 a.m.");
                                mTimesList.add("7:13 a.m.");
                                mTimesList.add("7:42 a.m.");
                                mTimesList.add("8:13 a.m.");
                                mTimesList.add("8:42 a.m.");
                                mTimesList.add("9:13 a.m.");
                                mTimesList.add("9:42 a.m.");
                                mTimesList.add("10:13 a.m.");
                                mTimesList.add("10:42 a.m.");
                                mTimesList.add("11:13 a.m.");
                                mTimesList.add("11:42 a.m.");
                                mTimesList.add("12:13 p.m.");
                                mTimesList.add("12:42 p.m.");
                                mTimesList.add("1:13 p.m.");
                                mTimesList.add("1:42 p.m.");
                                mTimesList.add("2:13 p.m.");
                                mTimesList.add("2:42 p.m.");
                                mTimesList.add("2:58 p.m.");
                                mTimesList.add("3:13 p.m.");
                                mTimesList.add("3:42 p.m.");
                                mTimesList.add("4:13 p.m.");
                                mTimesList.add("4:42 p.m.");
                                mTimesList.add("5:13 p.m.");
                                mTimesList.add("5:42 p.m.");
                                mTimesList.add("6:13 p.m.");
                                mTimesList.add("6:42 p.m.");
                                mTimesList.add("6:57 p.m.");
                                mTimesList.add("6:58 p.m.");
                                mTimesList.add("7:42 p.m.");
                                mTimesList.add("9:01 p.m.");
                                mTimesList.add("9:57 p.m.");
                                mTimesList.add("11:02 p.m.");
                                mTimesList.add("12:37 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("6:30 p.m.");
                                mTimesList.add("7:00 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("8:00 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("10:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                }
                break;
            case "Sunday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Capitol Complex":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("-");
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("5:25 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "7th Ave and 26th St":
                                mTimesList.add("4:55 a.m.");
                                mTimesList.add("6:40 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("10:10 a.m.");
                                mTimesList.add("11:25 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("2:40 p.m.");
                                mTimesList.add("3:40 p.m.");
                                mTimesList.add("5:35 p.m.");
                                mTimesList.add("7:25 p.m.");
                                mTimesList.add("9:25 p.m.");
                                mTimesList.add("11:25 p.m.");
                                break;
                            case "12th and Dunbar Ave":
                                mTimesList.add("5:02 a.m.");
                                mTimesList.add("6:47 a.m.");
                                mTimesList.add("8:47 a.m.");
                                mTimesList.add("10:17 a.m.");
                                mTimesList.add("11:35 a.m.");
                                mTimesList.add("12:17 p.m.");
                                mTimesList.add("2:47 p.m.");
                                mTimesList.add("3:47 p.m.");
                                mTimesList.add("5:43 p.m.");
                                mTimesList.add("7:33 p.m.");
                                mTimesList.add("9:33 p.m.");
                                mTimesList.add("11:33 p.m.");
                                break;
                            case "WV State University":
                                mTimesList.add("5:10 a.m.");
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("8:55 a.m.");
                                mTimesList.add("10:25 a.m.");
                                mTimesList.add("11:43 a.m.");
                                mTimesList.add("12:25 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("3:55 p.m.");
                                mTimesList.add("5:51 p.m.");
                                mTimesList.add("7:41 p.m.");
                                mTimesList.add("9:41 p.m.");
                                mTimesList.add("11:41 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "WV State University":
                                mTimesList.add("5:57 a.m.");
                                mTimesList.add("8:12 a.m.");
                                mTimesList.add("9:52 a.m.");
                                mTimesList.add("11:29 a.m.");
                                mTimesList.add("1:40 p.m.");
                                mTimesList.add("4:52 p.m.");
                                mTimesList.add("6:47 p.m.");
                                mTimesList.add("8:48 p.m.");
                                mTimesList.add("10:47 p.m.");
                                mTimesList.add("12:35 a.m.");
                                break;
                            case "12th and Dunbar Ave":
                                mTimesList.add("6:05 a.m.");
                                mTimesList.add("8:20 a.m.");
                                mTimesList.add("10:02 a.m.");
                                mTimesList.add("11:37 a.m.");
                                mTimesList.add("1:50 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:55 p.m.");
                                mTimesList.add("8:56 p.m.");
                                mTimesList.add("10:55 p.m.");
                                mTimesList.add("12:42 a.m.");
                                break;
                            case "7th Ave and 26th St":
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("8:28 a.m.");
                                mTimesList.add("10:12 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("5:10 p.m.");
                                mTimesList.add("7:03 p.m.");
                                mTimesList.add("9:03 p.m.");
                                mTimesList.add("11:03 p.m.");
                                mTimesList.add("12:49 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("10:27 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("5:25 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:13 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i).toString();

        return mTimes;
    }

    protected static String[] getTimes5(String mDay, String mDirection, String mTimepoint) {

        ArrayList mTimesList = new ArrayList();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Capitol Complex":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("7:54 a.m.");
                                mTimesList.add("9:01 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("2:06 p.m.");
                                mTimesList.add("3:09 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("-");
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("7:06 a.m.");
                                mTimesList.add("8:05 a.m.");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("10:11 a.m.");
                                mTimesList.add("11:08 a.m.");
                                mTimesList.add("12:07 p.m.");
                                mTimesList.add("1:07 p.m.");
                                mTimesList.add("2:17 p.m.");
                                mTimesList.add("3:26 p.m.");
                                mTimesList.add("4:26 p.m.");
                                mTimesList.add("5:26 p.m.");
                                break;
                            case "7th Ave and 26th St":
                                mTimesList.add("5:15 a.m.");
                                mTimesList.add("6:14 a.m.");
                                mTimesList.add("7:20 a.m.");
                                mTimesList.add("8:19 a.m.");
                                mTimesList.add("9:26 a.m.");
                                mTimesList.add("10:25 a.m.");
                                mTimesList.add("11:22 a.m.");
                                mTimesList.add("12:21 p.m.");
                                mTimesList.add("1:21 p.m.");
                                mTimesList.add("2:31 p.m.");
                                mTimesList.add("3:40 p.m.");
                                mTimesList.add("4:40 p.m.");
                                mTimesList.add("5:40 p.m.");
                                break;
                            case "Top of Tyler Mountain":
                                mTimesList.add("5:27 a.m.");
                                mTimesList.add("6:26 a.m.");
                                mTimesList.add("7:32 a.m.");
                                mTimesList.add("8:31 a.m.");
                                mTimesList.add("9:38 a.m.");
                                mTimesList.add("10:37 a.m.");
                                mTimesList.add("11:34 a.m.");
                                mTimesList.add("12:33 p.m.");
                                mTimesList.add("1:33 p.m.");
                                mTimesList.add("2:43 p.m.");
                                mTimesList.add("3:52 p.m.");
                                mTimesList.add("4:52 p.m.");
                                mTimesList.add("5:52 p.m.");
                                break;
                            case "Andrew Jackson Middle School":
                                mTimesList.add("5:38 a.m.");
                                mTimesList.add("6:37 a.m.");
                                mTimesList.add("7:43 a.m.");
                                mTimesList.add("8:42 a.m.");
                                mTimesList.add("9:49 a.m.");
                                mTimesList.add("10:48 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("12:44 p.m.");
                                mTimesList.add("1:44 p.m.");
                                mTimesList.add("2:54 p.m.");
                                mTimesList.add("4:03 p.m.");
                                mTimesList.add("5:03 p.m.");
                                mTimesList.add("6:03 p.m.");
                                break;
                            case "Nitro Marketplace":
                                mTimesList.add("5:48 a.m.");
                                mTimesList.add("6:47 a.m.");
                                mTimesList.add("7:53 a.m.");
                                mTimesList.add("8:52 a.m.");
                                mTimesList.add("9:59 a.m.");
                                mTimesList.add("10:58 p.m.");
                                mTimesList.add("11:55 p.m.");
                                mTimesList.add("12:54 p.m.");
                                mTimesList.add("1:54 p.m.");
                                mTimesList.add("3:04 p.m.");
                                mTimesList.add("4:13 p.m.");
                                mTimesList.add("5:13 p.m.");
                                mTimesList.add("6:13 p.m.");
                                break;
                            case "Mardi Gras Casino & Resort":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Mardi Gras Casino & Resort":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Nitro Marketplace":
                                mTimesList.add("5:53 a.m.");
                                mTimesList.add("6:52 a.m.");
                                mTimesList.add("7:58 a.m.");
                                mTimesList.add("8:57 a.m.");
                                mTimesList.add("10:18 a.m.");
                                mTimesList.add("11:07 a.m.");
                                mTimesList.add("12:03 p.m.");
                                mTimesList.add("1:03 p.m.");
                                mTimesList.add("2:02 p.m.");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("4:17 p.m.");
                                mTimesList.add("5:17 p.m.");
                                mTimesList.add("6:17 p.m.");
                                break;
                            case "Andrew Jackson Middle School":
                                mTimesList.add("6:03 a.m.");
                                mTimesList.add("7:02 a.m.");
                                mTimesList.add("8:08 a.m.");
                                mTimesList.add("9:07 a.m.");
                                mTimesList.add("10:28 a.m.");
                                mTimesList.add("11:17 a.m.");
                                mTimesList.add("12:13 p.m.");
                                mTimesList.add("1:13 p.m.");
                                mTimesList.add("2:12 p.m.");
                                mTimesList.add("3:22 p.m.");
                                mTimesList.add("4:27 p.m.");
                                mTimesList.add("5:27 p.m.");
                                mTimesList.add("6:27 p.m.");
                                break;
                            case "Top of Tyler Mountain":
                                mTimesList.add("6:13 a.m.");
                                mTimesList.add("7:12 a.m.");
                                mTimesList.add("8:18 a.m.");
                                mTimesList.add("9:17 a.m.");
                                mTimesList.add("10:38 a.m.");
                                mTimesList.add("11:27 a.m.");
                                mTimesList.add("12:23 p.m.");
                                mTimesList.add("1:23 p.m.");
                                mTimesList.add("2:22 p.m.");
                                mTimesList.add("3:32 p.m.");
                                mTimesList.add("4:37 p.m.");
                                mTimesList.add("5:37 p.m.");
                                mTimesList.add("6:37 p.m.");
                                break;
                            case "7th Ave and 26th St":
                                mTimesList.add("6:25 a.m.");
                                mTimesList.add("7:24 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:29 a.m.");
                                mTimesList.add("10:50 a.m.");
                                mTimesList.add("11:39 a.m.");
                                mTimesList.add("12:35 p.m.");
                                mTimesList.add("1:35 p.m.");
                                mTimesList.add("2:34 p.m.");
                                mTimesList.add("3:44 p.m.");
                                mTimesList.add("4:49 p.m.");
                                mTimesList.add("5:49 p.m.");
                                mTimesList.add("6:49 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:43 a.m.");
                                mTimesList.add("7:42 a.m.");
                                mTimesList.add("8:48 a.m.");
                                mTimesList.add("9:47 a.m.");
                                mTimesList.add("11:08 a.m.");
                                mTimesList.add("11:57 a.m.");
                                mTimesList.add("12:53 p.m.");
                                mTimesList.add("1:53 p.m.");
                                mTimesList.add("2:52 p.m.");
                                mTimesList.add("4:02 p.m.");
                                mTimesList.add("5:06 p.m.");
                                mTimesList.add("6:07 p.m.");
                                mTimesList.add("7:15 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("7:54 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("2:05 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:14 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("7:27 p.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Capitol Complex":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("-");
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                break;
                            case "7th Ave and 26th St":
                                mTimesList.add("5:45 a.m.");
                                mTimesList.add("6:33 a.m.");
                                mTimesList.add("7:33 a.m.");
                                mTimesList.add("8:33 a.m.");
                                mTimesList.add("10:33 a.m.");
                                mTimesList.add("12:33 p.m.");
                                mTimesList.add("2:33 p.m.");
                                mTimesList.add("4:33 p.m.");
                                mTimesList.add("5:33 p.m.");
                                break;
                            case "Top of Tyler Mountain":
                                mTimesList.add("5:57 a.m.");
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:45 p.m.");
                                break;
                            case "Andrew Jackson Middle School":
                                mTimesList.add("6:09 a.m.");
                                mTimesList.add("6:57 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("8:57 a.m.");
                                mTimesList.add("10:57 a.m.");
                                mTimesList.add("12:57 p.m.");
                                mTimesList.add("2:57 p.m.");
                                mTimesList.add("4:57 p.m.");
                                mTimesList.add("5:57 p.m.");
                                break;
                            case "Nitro Marketplace":
                                mTimesList.add("6:19 a.m.");
                                mTimesList.add("7:09 a.m.");
                                mTimesList.add("8:09 a.m.");
                                mTimesList.add("9:09 a.m.");
                                mTimesList.add("11:09 a.m.");
                                mTimesList.add("1:05 p.m.");
                                mTimesList.add("3:09 p.m.");
                                mTimesList.add("5:09 p.m.");
                                mTimesList.add("6:09 p.m.");
                                break;
                            case "Mardi Gras Casino & Resort":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("6:12 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Mardi Gras Casino & Resort":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("9:17 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("3:17 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("6:17 p.m.");
                                break;
                            case "Nitro Marketplace":
                                mTimesList.add("6:20 a.m.");
                                mTimesList.add("7:20 a.m.");
                                mTimesList.add("8:20 a.m.");
                                mTimesList.add("9:20 a.m.");
                                mTimesList.add("11:20 a.m.");
                                mTimesList.add("1:20 p.m.");
                                mTimesList.add("3:20 p.m.");
                                mTimesList.add("5:20 p.m.");
                                mTimesList.add("6:20 p.m.");
                                break;
                            case "Andrew Jackson Middle School":
                                mTimesList.add("6:32 a.m.");
                                mTimesList.add("7:32 a.m.");
                                mTimesList.add("8:32 a.m.");
                                mTimesList.add("9:32 a.m.");
                                mTimesList.add("11:32 a.m.");
                                mTimesList.add("1:32 p.m.");
                                mTimesList.add("3:32 p.m.");
                                mTimesList.add("5:32 p.m.");
                                mTimesList.add("6:32 p.m.");
                                break;
                            case "Top of Tyler Mountain":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("1:45 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("5:45 p.m.");
                                mTimesList.add("6:45 p.m.");
                                break;
                            case "7th Ave and 26th St":
                                mTimesList.add("6:57 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("8:57 a.m.");
                                mTimesList.add("9:57 a.m.");
                                mTimesList.add("11:57 a.m.");
                                mTimesList.add("1:57 p.m.");
                                mTimesList.add("3:57 p.m.");
                                mTimesList.add("5:57 p.m.");
                                mTimesList.add("6:57 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i).toString();

        return mTimes;
    }

    protected static String[] getTimes6(String mDay, String mDirection, String mTimepoint) {

        ArrayList mTimesList = new ArrayList();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("5:25 p.m.");
                                break;
                            case "Greenbrier St at Washington St":
                                mTimesList.add("7:10 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("3:55 p.m.");
                                mTimesList.add("5:35 p.m.");
                                break;
                            case "Northgate Business Park":
                                mTimesList.add("-");
                                mTimesList.add("8:49 a.m.");
                                mTimesList.add("2:19 p.m.");
                                mTimesList.add("4:04 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Capital High School":
                                mTimesList.add("7:19 a.m.");
                                mTimesList.add("8:57 a.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("4:12 p.m.");
                                mTimesList.add("5:43 p.m.");
                                break;
                            case "Quick Road":
                                mTimesList.add("7:31 a.m.");
                                mTimesList.add("9:09 a.m.");
                                mTimesList.add("2:39 p.m.");
                                mTimesList.add("4:24 p.m.");
                                mTimesList.add("5:55 p.m.");
                                break;
                            case "Crossings Mall":
                                mTimesList.add("7:43 a.m.");
                                mTimesList.add("9:21 a.m.");
                                mTimesList.add("2:51 p.m.");
                                mTimesList.add("4:36 p.m.");
                                mTimesList.add("6:05 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Crossings Mall":
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("7:46 a.m.");
                                mTimesList.add("9:24 a.m.");
                                mTimesList.add("2:54 p.m.");
                                mTimesList.add("4:39 p.m.");
                                break;
                            case "Quick Road":
                                mTimesList.add("6:27 a.m.");
                                mTimesList.add("7:58 a.m.");
                                mTimesList.add("9:36 a.m.");
                                mTimesList.add("3:06 p.m.");
                                mTimesList.add("4:51 p.m.");
                                break;
                            case "Capital High School":
                                mTimesList.add("6:39 a.m.");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("9:48 a.m.");
                                mTimesList.add("3:18 p.m.");
                                mTimesList.add("5:03 p.m.");
                                break;
                            case "Northgate Business Park":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("9:56 a.m.");
                                mTimesList.add("3:26 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Greenbrier St at Washington St":
                                mTimesList.add("6:48 a.m.");
                                mTimesList.add("8:19 a.m.");
                                mTimesList.add("10:05 a.m.");
                                mTimesList.add("3:35 p.m.");
                                mTimesList.add("5:12 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:58 a.m.");
                                mTimesList.add("8:29 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("5:22 p.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "Greenbrier St at Washington St":
                                mTimesList.add("7:40 a.m.");
                                mTimesList.add("9:25 a.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("3:55 p.m.");
                                mTimesList.add("5:40 p.m.");
                                break;
                            case "Northgate Business Park":
                                mTimesList.add("7:49 a.m.");
                                mTimesList.add("9:34 a.m.");
                                mTimesList.add("2:19 p.m.");
                                mTimesList.add("4:04 p.m.");
                                mTimesList.add("5:49 p.m.");
                                break;
                            case "Capital High School":
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("9:42 a.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("4:12 p.m.");
                                mTimesList.add("5:57 p.m.");
                                break;
                            case "Quick Road":
                                mTimesList.add("8:09 a.m.");
                                mTimesList.add("9:54 a.m.");
                                mTimesList.add("2:39 p.m.");
                                mTimesList.add("4:24 p.m.");
                                mTimesList.add("6:09 p.m.");
                                break;
                            case "Crossings Mall":
                                mTimesList.add("8:21 a.m.");
                                mTimesList.add("10:06 a.m.");
                                mTimesList.add("2:51 p.m.");
                                mTimesList.add("4:36 p.m.");
                                mTimesList.add("6:21 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Crossings Mall":
                                mTimesList.add("6:35 a.m.");
                                mTimesList.add("8:24 a.m.");
                                mTimesList.add("10:09 a.m.");
                                mTimesList.add("2:54 p.m.");
                                mTimesList.add("4:39 p.m.");
                                break;
                            case "Quick Road":
                                mTimesList.add("6:47 a.m.");
                                mTimesList.add("8:36 a.m.");
                                mTimesList.add("10:21 a.m.");
                                mTimesList.add("3:06 p.m.");
                                mTimesList.add("4:51 p.m.");
                                break;
                            case "Capital High School":
                                mTimesList.add("6:59 a.m.");
                                mTimesList.add("8:48 a.m.");
                                mTimesList.add("10:33 a.m.");
                                mTimesList.add("3:18 p.m.");
                                mTimesList.add("5:03 p.m.");
                                break;
                            case "Northgate Business Park":
                                mTimesList.add("7:07 a.m.");
                                mTimesList.add("8:56 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:26 p.m.");
                                mTimesList.add("5:11 p.m.");
                                break;
                            case "Greenbrier St at Washington St":
                                mTimesList.add("7:16 a.m.");
                                mTimesList.add("9:05 a.m.");
                                mTimesList.add("10:43 a.m.");
                                mTimesList.add("3:35 p.m.");
                                mTimesList.add("5:20 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:26 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:55 a.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i).toString();

        return mTimes;
    }

    protected static String[] getTimes7(String mDay, String mDirection, String mTimepoint) {

        ArrayList mTimesList = new ArrayList();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                break;
                            case "CAMC Memorial":
                                mTimesList.add("6:56 a.m.");
                                mTimesList.add("8:56 a.m.");
                                mTimesList.add("12:26 p.m.");
                                mTimesList.add("3:26 p.m.");
                                mTimesList.add("5:26 p.m.");
                                break;
                            case "57th at MacCorkle":
                                mTimesList.add("7:10 a.m.");
                                mTimesList.add("9:10 a.m.");
                                mTimesList.add("12:40 p.m.");
                                mTimesList.add("3:40 p.m.");
                                mTimesList.add("5:40 p.m.");
                                break;
                            case "Cambronne Lane":
                                mTimesList.add("7:35 a.m.");
                                mTimesList.add("9:35 a.m.");
                                mTimesList.add("1:05 p.m.");
                                mTimesList.add("4:05 p.m.");
                                mTimesList.add("6:05 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Cambronne Lane":
                                mTimesList.add("7:50 a.m.");
                                mTimesList.add("9:50 a.m.");
                                mTimesList.add("1:20 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("6:20 p.m.");
                                break;
                            case "57th at MacCorkle":
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("1:45 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("6:45 p.m.");
                                break;
                            case "CAMC Memorial":
                                mTimesList.add("8:29 a.m.");
                                mTimesList.add("10:29 a.m.");
                                mTimesList.add("1:59 p.m.");
                                mTimesList.add("4:59 p.m.");
                                mTimesList.add("6:59 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i).toString();

        return mTimes;
    }

    protected static String[] getTimes8(String mDay, String mDirection, String mTimepoint) {

        ArrayList mTimesList = new ArrayList();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("-");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("5:00 p.m.");
                                break;
                            case "Casdorph Road":
                                mTimesList.add("6:25 a.m.");
                                mTimesList.add("7:50 a.m.");
                                mTimesList.add("9:20 a.m.");
                                mTimesList.add("2:20 p.m.");
                                mTimesList.add("3:50 p.m.");
                                mTimesList.add("5:20 p.m.");
                                break;
                            case "Fishers Branch":
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("9:27 a.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("3:57 p.m.");
                                mTimesList.add("5:27 p.m.");
                                break;
                            case "Sissonville High School":
                                mTimesList.add("6:35 a.m.");
                                mTimesList.add("8:02 a.m.");
                                mTimesList.add("9:32 a.m.");
                                mTimesList.add("2:32 p.m.");
                                mTimesList.add("4:02 p.m.");
                                mTimesList.add("5:32 p.m.");
                                break;
                            case "Sissonville":
                                mTimesList.add("6:42 a.m.");
                                mTimesList.add("8:12 a.m.");
                                mTimesList.add("9:42 a.m.");
                                mTimesList.add("2:42 p.m.");
                                mTimesList.add("4:17 p.m.");
                                mTimesList.add("5:43 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Sissonville":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("5:43 p.m.");
                                break;
                            case "Sissonville High School":
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("8:25 a.m.");
                                mTimesList.add("9:55 a.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:52 p.m.");
                                break;
                            case "Fishers Branch":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:35 p.m.");
                                mTimesList.add("5:57 p.m.");
                                break;
                            case "Casdorph Road":
                                mTimesList.add("7:07 a.m.");
                                mTimesList.add("8:37 a.m.");
                                mTimesList.add("10:07 a.m.");
                                mTimesList.add("3:07 p.m.");
                                mTimesList.add("4:42 p.m.");
                                mTimesList.add("6:02 p.m.");
                                break;
                            case "Littlepage Terrace":
                                mTimesList.add("7:11 a.m.");
                                mTimesList.add("8:41 a.m.");
                                mTimesList.add("10:11 a.m.");
                                mTimesList.add("3:11 p.m.");
                                mTimesList.add("4:46 p.m.");
                                mTimesList.add("6:07 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:58 p.m.");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("-");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("5:00 p.m.");
                                break;
                            case "Casdorph Road":
                                mTimesList.add("6:25 a.m.");
                                mTimesList.add("7:50 a.m.");
                                mTimesList.add("9:20 a.m.");
                                mTimesList.add("2:20 p.m.");
                                mTimesList.add("3:50 p.m.");
                                mTimesList.add("5:20 p.m.");
                                break;
                            case "Fishers Branch":
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("9:27 a.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("3:57 p.m.");
                                mTimesList.add("5:27 p.m.");
                                break;
                            case "Sissonville High School":
                                mTimesList.add("6:35 a.m.");
                                mTimesList.add("8:02 a.m.");
                                mTimesList.add("9:32 a.m.");
                                mTimesList.add("2:32 p.m.");
                                mTimesList.add("4:02 p.m.");
                                mTimesList.add("5:32 p.m.");
                                break;
                            case "Sissonville":
                                mTimesList.add("6:42 a.m.");
                                mTimesList.add("8:12 a.m.");
                                mTimesList.add("9:42 a.m.");
                                mTimesList.add("2:42 p.m.");
                                mTimesList.add("4:17 p.m.");
                                mTimesList.add("5:43 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Sissonville":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("5:43 p.m.");
                                break;
                            case "Sissonville High School":
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("8:25 a.m.");
                                mTimesList.add("9:55 a.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:52 p.m.");
                                break;
                            case "Fishers Branch":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:35 p.m.");
                                mTimesList.add("5:57 p.m.");
                                break;
                            case "Casdorph Road":
                                mTimesList.add("7:07 a.m.");
                                mTimesList.add("8:37 a.m.");
                                mTimesList.add("10:07 a.m.");
                                mTimesList.add("3:07 p.m.");
                                mTimesList.add("4:42 p.m.");
                                mTimesList.add("6:02 p.m.");
                                break;
                            case "Littlepage Terrace":
                                mTimesList.add("7:11 a.m.");
                                mTimesList.add("8:41 a.m.");
                                mTimesList.add("10:11 a.m.");
                                mTimesList.add("3:11 p.m.");
                                mTimesList.add("4:46 p.m.");
                                mTimesList.add("6:07 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:58 p.m.");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i).toString();

        return mTimes;
    }

    protected static String[] getTimes10(String mDay, String mDirection, String mTimepoint) {

        ArrayList mTimesList = new ArrayList();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "Greenbrier at Washington":
                                mTimesList.add("6:40 a.m.");
                                mTimesList.add("7:40 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("4:40 p.m.");
                                mTimesList.add("5:40 p.m.");
                                break;
                            case "YMCA":
                                mTimesList.add("6:47 a.m.");
                                mTimesList.add("7:47 a.m.");
                                mTimesList.add("12:17 p.m.");
                                mTimesList.add("4:47 p.m.");
                                mTimesList.add("5:47 p.m.");
                                break;
                            case "Hillcrest Apartments":
                                mTimesList.add("6:52 a.m.");
                                mTimesList.add("7:52 a.m.");
                                mTimesList.add("12:22 p.m.");
                                mTimesList.add("4:52 p.m.");
                                mTimesList.add("5:52 p.m.");
                                break;
                            case "Northgate Business Park":
                                mTimesList.add("7:05 a.m.");
                                mTimesList.add("8:05 a.m.");
                                mTimesList.add("12:35 p.m.");
                                mTimesList.add("5:05 p.m.");
                                mTimesList.add("6:05 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Northgate Business Park":
                                mTimesList.add("7:05 a.m.");
                                mTimesList.add("8:05 a.m.");
                                mTimesList.add("12:35 p.m.");
                                mTimesList.add("5:05 p.m.");
                                mTimesList.add("6:05 p.m.");
                                break;
                            case "Greenbrier at Washington":
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("6:15 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("6:30 p.m.");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i).toString();

        return mTimes;
    }

    protected static String[] getTimes11(String mDay, String mDirection, String mTimepoint) {

        ArrayList mTimesList = new ArrayList();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("6:10 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "Piedmont at Morris":
                                mTimesList.add("-");
                                mTimesList.add("7:06 a.m.");
                                mTimesList.add("8:06 a.m.");
                                mTimesList.add("9:06 a.m.");
                                mTimesList.add("11:21 a.m.");
                                mTimesList.add("1:21 p.m.");
                                mTimesList.add("2:36 p.m.");
                                mTimesList.add("3:36 p.m.");
                                mTimesList.add("4:36 p.m.");
                                mTimesList.add("5:36 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:18 a.m.");
                                mTimesList.add("7:12 a.m.");
                                mTimesList.add("8:12 a.m.");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("11:27 a.m.");
                                mTimesList.add("1:27 p.m.");
                                mTimesList.add("2:42 p.m.");
                                mTimesList.add("3:42 p.m.");
                                mTimesList.add("4:42 p.m.");
                                mTimesList.add("5:42 p.m.");
                                break;
                            case "Oakridge at Serene":
                                mTimesList.add("6:28 a.m.");
                                mTimesList.add("7:25 a.m.");
                                mTimesList.add("8:25 a.m.");
                                mTimesList.add("9:25 a.m.");
                                mTimesList.add("11:40 a.m.");
                                mTimesList.add("1:40 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("3:55 p.m.");
                                mTimesList.add("4:55 p.m.");
                                mTimesList.add("5:55 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Oakridge at Serene":
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("1:45 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:37 a.m.");
                                mTimesList.add("7:37 a.m.");
                                mTimesList.add("8:37 a.m.");
                                mTimesList.add("9:37 a.m.");
                                mTimesList.add("11:52 a.m.");
                                mTimesList.add("1:52 p.m.");
                                mTimesList.add("3:07 p.m.");
                                mTimesList.add("4:07 p.m.");
                                mTimesList.add("5:07 p.m.");
                                mTimesList.add("6:07 p.m.");
                                break;
                            case "Piedmont at Morris":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("6:15 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("7:55 a.m.");
                                mTimesList.add("8:55 a.m.");
                                mTimesList.add("9:55 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("3:25 p.m.");
                                mTimesList.add("4:25 p.m.");
                                mTimesList.add("5:25 p.m.");
                                mTimesList.add("6:25 p.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("6:10 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "Piedmont at Morris":
                                mTimesList.add("-");
                                mTimesList.add("7:06 a.m.");
                                mTimesList.add("8:06 a.m.");
                                mTimesList.add("9:06 a.m.");
                                mTimesList.add("11:21 a.m.");
                                mTimesList.add("1:21 p.m.");
                                mTimesList.add("2:36 p.m.");
                                mTimesList.add("3:36 p.m.");
                                mTimesList.add("4:36 p.m.");
                                mTimesList.add("5:36 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:18 a.m.");
                                mTimesList.add("7:12 a.m.");
                                mTimesList.add("8:12 a.m.");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("11:27 a.m.");
                                mTimesList.add("1:27 p.m.");
                                mTimesList.add("2:42 p.m.");
                                mTimesList.add("3:42 p.m.");
                                mTimesList.add("4:42 p.m.");
                                mTimesList.add("5:42 p.m.");
                                break;
                            case "Oakridge at Serene":
                                mTimesList.add("6:28 a.m.");
                                mTimesList.add("7:25 a.m.");
                                mTimesList.add("8:25 a.m.");
                                mTimesList.add("9:25 a.m.");
                                mTimesList.add("11:40 a.m.");
                                mTimesList.add("1:40 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("3:55 p.m.");
                                mTimesList.add("4:55 p.m.");
                                mTimesList.add("5:55 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Oakridge at Serene":
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("1:45 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:37 a.m.");
                                mTimesList.add("7:37 a.m.");
                                mTimesList.add("8:37 a.m.");
                                mTimesList.add("9:37 a.m.");
                                mTimesList.add("11:52 a.m.");
                                mTimesList.add("1:52 p.m.");
                                mTimesList.add("3:07 p.m.");
                                mTimesList.add("4:07 p.m.");
                                mTimesList.add("5:07 p.m.");
                                mTimesList.add("6:07 p.m.");
                                break;
                            case "Piedmont at Morris":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("6:15 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("7:55 a.m.");
                                mTimesList.add("8:55 a.m.");
                                mTimesList.add("9:55 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("3:25 p.m.");
                                mTimesList.add("4:25 p.m.");
                                mTimesList.add("5:25 p.m.");
                                mTimesList.add("6:25 p.m.");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i).toString();

        return mTimes;
    }

    protected static String[] getTimes13(String mDay, String mDirection, String mTimepoint) {

        ArrayList mTimesList = new ArrayList();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "McQueen at Beech":
                                mTimesList.add("7:14 a.m.");
                                mTimesList.add("8:14 a.m.");
                                mTimesList.add("9:14 a.m.");
                                mTimesList.add("10:14 a.m.");
                                mTimesList.add("11:14 a.m.");
                                mTimesList.add("12:44 p.m.");
                                mTimesList.add("1:44 p.m.");
                                mTimesList.add("3:44 p.m.");
                                mTimesList.add("4:44 p.m.");
                                mTimesList.add("5:44 p.m.");
                                break;
                            case "Patrick Street Plaza":
                                mTimesList.add("7:24 a.m.");
                                mTimesList.add("8:24 a.m.");
                                mTimesList.add("9:24 a.m.");
                                mTimesList.add("10:24 a.m.");
                                mTimesList.add("11:24 a.m.");
                                mTimesList.add("12:54 p.m.");
                                mTimesList.add("1:54 p.m.");
                                mTimesList.add("3:54 p.m.");
                                mTimesList.add("4:54 p.m.");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Patrick Street Plaza":
                                mTimesList.add("-");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                break;
                            case "McQueen at Beech":
                                mTimesList.add("6:40 a.m.");
                                mTimesList.add("7:40 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("9:40 a.m.");
                                mTimesList.add("10:40 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("1:10 p.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("5:10 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:57 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("8:57 a.m.");
                                mTimesList.add("9:57 a.m.");
                                mTimesList.add("10:57 a.m.");
                                mTimesList.add("12:27 p.m.");
                                mTimesList.add("1:27 p.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("4:27 p.m.");
                                mTimesList.add("5:27 p.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "McQueen at Beech":
                                mTimesList.add("7:14 a.m.");
                                mTimesList.add("8:14 a.m.");
                                mTimesList.add("9:14 a.m.");
                                mTimesList.add("10:14 a.m.");
                                mTimesList.add("11:14 a.m.");
                                mTimesList.add("12:44 p.m.");
                                mTimesList.add("1:44 p.m.");
                                mTimesList.add("3:44 p.m.");
                                mTimesList.add("4:44 p.m.");
                                mTimesList.add("5:44 p.m.");
                                break;
                            case "Patrick Street Plaza":
                                mTimesList.add("7:24 a.m.");
                                mTimesList.add("8:24 a.m.");
                                mTimesList.add("9:24 a.m.");
                                mTimesList.add("10:24 a.m.");
                                mTimesList.add("11:24 a.m.");
                                mTimesList.add("12:54 p.m.");
                                mTimesList.add("1:54 p.m.");
                                mTimesList.add("3:54 p.m.");
                                mTimesList.add("4:54 p.m.");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Patrick Street Plaza":
                                mTimesList.add("-");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                break;
                            case "McQueen at Beech":
                                mTimesList.add("6:40 a.m.");
                                mTimesList.add("7:40 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("9:40 a.m.");
                                mTimesList.add("10:40 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("1:10 p.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("5:10 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:57 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("8:57 a.m.");
                                mTimesList.add("9:57 a.m.");
                                mTimesList.add("10:57 a.m.");
                                mTimesList.add("12:27 p.m.");
                                mTimesList.add("1:27 p.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("4:27 p.m.");
                                mTimesList.add("5:27 p.m.");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i).toString();

        return mTimes;
    }

    protected static String[] getTimes14(String mDay, String mDirection, String mTimepoint) {

        ArrayList mTimesList = new ArrayList();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                break;
                            case "Capitol Market":
                                mTimesList.add("7:03 a.m.");
                                mTimesList.add("8:03 a.m.");
                                mTimesList.add("9:03 a.m.");
                                mTimesList.add("10:03 a.m.");
                                mTimesList.add("12:03 p.m.");
                                mTimesList.add("1:03 p.m.");
                                mTimesList.add("2:03 p.m.");
                                mTimesList.add("3:03 p.m.");
                                mTimesList.add("4:03 p.m.");
                                mTimesList.add("5:03 p.m.");
                                mTimesList.add("6:03 p.m.");
                                break;
                            case "City Park/Vista View Apartments":
                                mTimesList.add("7:08 a.m.");
                                mTimesList.add("8:08 a.m.");
                                mTimesList.add("9:08 a.m.");
                                mTimesList.add("10:08 a.m.");
                                mTimesList.add("12:08 p.m.");
                                mTimesList.add("1:08 p.m.");
                                mTimesList.add("2:08 p.m.");
                                mTimesList.add("3:08 p.m.");
                                mTimesList.add("4:08 p.m.");
                                mTimesList.add("5:08 p.m.");
                                mTimesList.add("6:08 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "City Park/Vista View Apartments":
                                mTimesList.add("7:08 a.m.");
                                mTimesList.add("8:08 a.m.");
                                mTimesList.add("9:08 a.m.");
                                mTimesList.add("10:08 a.m.");
                                mTimesList.add("12:08 p.m.");
                                mTimesList.add("1:08 p.m.");
                                mTimesList.add("2:08 p.m.");
                                mTimesList.add("3:08 p.m.");
                                mTimesList.add("4:08 p.m.");
                                mTimesList.add("5:08 p.m.");
                                mTimesList.add("6:08 p.m.");
                                break;
                            case "Capitol Market":
                                mTimesList.add("7:12 a.m.");
                                mTimesList.add("8:12 a.m.");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("10:12 a.m.");
                                mTimesList.add("12:12 p.m.");
                                mTimesList.add("1:12 p.m.");
                                mTimesList.add("2:12 p.m.");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("4:12 p.m.");
                                mTimesList.add("5:12 p.m.");
                                mTimesList.add("6:12 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:17 a.m.");
                                mTimesList.add("8:17 a.m.");
                                mTimesList.add("9:17 a.m.");
                                mTimesList.add("10:17 a.m.");
                                mTimesList.add("12:17 p.m.");
                                mTimesList.add("1:17 p.m.");
                                mTimesList.add("2:17 p.m.");
                                mTimesList.add("3:17 p.m.");
                                mTimesList.add("4:17 p.m.");
                                mTimesList.add("5:17 p.m.");
                                mTimesList.add("6:17 p.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                break;
                            case "Capitol Market":
                                mTimesList.add("7:03 a.m.");
                                mTimesList.add("8:03 a.m.");
                                mTimesList.add("9:03 a.m.");
                                mTimesList.add("10:03 a.m.");
                                mTimesList.add("12:03 p.m.");
                                mTimesList.add("1:03 p.m.");
                                mTimesList.add("2:03 p.m.");
                                mTimesList.add("3:03 p.m.");
                                mTimesList.add("4:03 p.m.");
                                mTimesList.add("5:03 p.m.");
                                break;
                            case "City Park/Vista View Apartments":
                                mTimesList.add("7:08 a.m.");
                                mTimesList.add("8:08 a.m.");
                                mTimesList.add("9:08 a.m.");
                                mTimesList.add("10:08 a.m.");
                                mTimesList.add("12:08 p.m.");
                                mTimesList.add("1:08 p.m.");
                                mTimesList.add("2:08 p.m.");
                                mTimesList.add("3:08 p.m.");
                                mTimesList.add("4:08 p.m.");
                                mTimesList.add("5:08 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "City Park/Vista View Apartments":
                                mTimesList.add("7:08 a.m.");
                                mTimesList.add("8:08 a.m.");
                                mTimesList.add("9:08 a.m.");
                                mTimesList.add("10:08 a.m.");
                                mTimesList.add("12:08 p.m.");
                                mTimesList.add("1:08 p.m.");
                                mTimesList.add("2:08 p.m.");
                                mTimesList.add("3:08 p.m.");
                                mTimesList.add("4:08 p.m.");
                                mTimesList.add("5:08 p.m.");
                                break;
                            case "Capitol Market":
                                mTimesList.add("7:12 a.m.");
                                mTimesList.add("8:12 a.m.");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("10:12 a.m.");
                                mTimesList.add("12:12 p.m.");
                                mTimesList.add("1:12 p.m.");
                                mTimesList.add("2:12 p.m.");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("4:12 p.m.");
                                mTimesList.add("5:12 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:17 a.m.");
                                mTimesList.add("8:17 a.m.");
                                mTimesList.add("9:17 a.m.");
                                mTimesList.add("10:17 a.m.");
                                mTimesList.add("12:17 p.m.");
                                mTimesList.add("1:17 p.m.");
                                mTimesList.add("2:17 p.m.");
                                mTimesList.add("3:17 p.m.");
                                mTimesList.add("4:17 p.m.");
                                mTimesList.add("5:17 p.m.");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i).toString();

        return mTimes;
    }

    protected static String[] getTimes15(String mDay, String mDirection, String mTimepoint) {

        ArrayList mTimesList = new ArrayList();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("7:20 a.m.\n(No Myrlte Rd)");
                                mTimesList.add("8:20 a.m.");
                                mTimesList.add("9:20 a.m.");
                                mTimesList.add("10:20 a.m.");
                                mTimesList.add("11:20 a.m.");
                                mTimesList.add("12:20 p.m.");
                                mTimesList.add("1:20 p.m.");
                                mTimesList.add("2:20 p.m.");
                                mTimesList.add("3:20 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("5:20 p.m.");
                                break;
                            case "Bridge Rd and Walnut Rd":
                                mTimesList.add("7:25 a.m.\n(No Myrlte Rd)");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "Ashton Place Shopping Center":
                                mTimesList.add("7:39 a.m.");
                                mTimesList.add("8:39 a.m.");
                                mTimesList.add("9:39 a.m.");
                                mTimesList.add("10:39 a.m.");
                                mTimesList.add("11:39 a.m.");
                                mTimesList.add("12:39 p.m.");
                                mTimesList.add("1:39 p.m.");
                                mTimesList.add("2:39 p.m.");
                                mTimesList.add("3:39 p.m.");
                                mTimesList.add("4:39 p.m.");
                                mTimesList.add("5:39 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Ashton Place Shopping Center":
                                mTimesList.add("6:39 a.m.");
                                mTimesList.add("7:39 a.m.");
                                mTimesList.add("8:39 a.m.");
                                mTimesList.add("9:39 a.m.");
                                mTimesList.add("10:39 a.m.");
                                mTimesList.add("11:39 a.m.");
                                mTimesList.add("12:39 p.m.");
                                mTimesList.add("1:39 p.m.");
                                mTimesList.add("2:39 p.m.");
                                mTimesList.add("3:39 p.m.");
                                mTimesList.add("4:39 p.m.");
                                mTimesList.add("5:39 p.m.");
                                break;
                            case "Bridge Rd and Walnut Rd":
                                mTimesList.add("6:48 a.m.");
                                mTimesList.add("7:48 a.m.");
                                mTimesList.add("8:48 a.m.");
                                mTimesList.add("9:48 a.m.");
                                mTimesList.add("10:48 a.m.");
                                mTimesList.add("11:48 a.m.");
                                mTimesList.add("12:48 p.m.");
                                mTimesList.add("1:48 p.m.");
                                mTimesList.add("2:48 p.m.");
                                mTimesList.add("3:48 p.m.");
                                mTimesList.add("4:48 p.m.");
                                mTimesList.add("5:48 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("7:20 a.m.\n(No Myrlte Rd)");
                                mTimesList.add("8:20 a.m.");
                                mTimesList.add("9:20 a.m.");
                                mTimesList.add("10:20 a.m.");
                                mTimesList.add("11:20 a.m.");
                                mTimesList.add("12:20 p.m.");
                                mTimesList.add("1:20 p.m.");
                                mTimesList.add("2:20 p.m.");
                                mTimesList.add("3:20 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("5:20 p.m.");
                                break;
                            case "Bridge Rd and Walnut Rd":
                                mTimesList.add("7:25\n(No Myrlte Rd)");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "Ashton Place Shopping Center":
                                mTimesList.add("7:39 a.m.");
                                mTimesList.add("8:39 a.m.");
                                mTimesList.add("9:39 a.m.");
                                mTimesList.add("10:39 a.m.");
                                mTimesList.add("11:39 a.m.");
                                mTimesList.add("12:39 p.m.");
                                mTimesList.add("1:39 p.m.");
                                mTimesList.add("2:39 p.m.");
                                mTimesList.add("3:39 p.m.");
                                mTimesList.add("4:39 p.m.");
                                mTimesList.add("5:39 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Ashton Place Shopping Center":
                                mTimesList.add("6:39 a.m.");
                                mTimesList.add("7:39 a.m.");
                                mTimesList.add("8:39 a.m.");
                                mTimesList.add("9:39 a.m.");
                                mTimesList.add("10:39 a.m.");
                                mTimesList.add("11:39 a.m.");
                                mTimesList.add("12:39 p.m.");
                                mTimesList.add("1:39 p.m.");
                                mTimesList.add("2:39 p.m.");
                                mTimesList.add("3:39 p.m.");
                                mTimesList.add("4:39 p.m.");
                                mTimesList.add("5:39 p.m.");
                                break;
                            case "Bridge Rd and Walnut Rd":
                                mTimesList.add("6:48 a.m.");
                                mTimesList.add("7:48 a.m.");
                                mTimesList.add("8:48 a.m.");
                                mTimesList.add("9:48 a.m.");
                                mTimesList.add("10:48 a.m.");
                                mTimesList.add("11:48 a.m.");
                                mTimesList.add("12:48 p.m.");
                                mTimesList.add("1:48 p.m.");
                                mTimesList.add("2:48 p.m.");
                                mTimesList.add("3:48 p.m.");
                                mTimesList.add("4:48 p.m.");
                                mTimesList.add("5:48 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i).toString();

        return mTimes;
    }

    protected static String[] getTimes16(String mDay, String mDirection, String mTimepoint) {

        ArrayList mTimesList = new ArrayList();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:45 p.m.");
                                break;
                            case "Alcoa Dr/South Park":
                                mTimesList.add("7:28 a.m.");
                                mTimesList.add("8:28 a.m.");
                                mTimesList.add("9:28 a.m.");
                                mTimesList.add("10:28 a.m.");
                                mTimesList.add("12:43 p.m.");
                                mTimesList.add("2:58 p.m.");
                                mTimesList.add("3:58 p.m.");
                                mTimesList.add("4:58 p.m.");
                                mTimesList.add("5:58 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Alcoa Dr/South Park":
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:45 p.m.");
                                break;
                            case "Alcoa Dr/South Park":
                                mTimesList.add("7:28 a.m.");
                                mTimesList.add("8:28 a.m.");
                                mTimesList.add("9:28 a.m.");
                                mTimesList.add("10:28 a.m.");
                                mTimesList.add("12:43 p.m.");
                                mTimesList.add("2:58 p.m.");
                                mTimesList.add("3:58 p.m.");
                                mTimesList.add("4:58 p.m.");
                                mTimesList.add("5:58 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Alcoa Dr/South Park":
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i).toString();

        return mTimes;
    }

    protected static String[] getTimes17(String mDay, String mDirection, String mTimepoint) {

        ArrayList mTimesList = new ArrayList();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("1:45 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:45 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("8:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                break;
                            case "CAMC Memorial":
                                mTimesList.add("6:26 a.m.");
                                mTimesList.add("7:26 a.m.");
                                mTimesList.add("8:26 a.m.");
                                mTimesList.add("9:26 a.m.");
                                mTimesList.add("10:26 a.m.");
                                mTimesList.add("10:56 a.m.");
                                mTimesList.add("11:56 a.m.");
                                mTimesList.add("12:56 p.m.");
                                mTimesList.add("1:56 p.m.");
                                mTimesList.add("2:56 p.m.");
                                mTimesList.add("3:56 p.m.");
                                mTimesList.add("4:56 p.m.");
                                mTimesList.add("5:56 p.m.");
                                mTimesList.add("6:56 p.m.");
                                mTimesList.add("8:26 p.m.");
                                mTimesList.add("9:26 p.m.");
                                break;
                            case "Shops at Kanawha Mall":
                                mTimesList.add("6:40 a.m.");
                                mTimesList.add("7:40 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("9:40 a.m.");
                                mTimesList.add("10:40 a.m.");
                                mTimesList.add("11:10 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("1:10 p.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("3:10 p.m.");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("5:10 p.m.");
                                mTimesList.add("6:10 p.m.");
                                mTimesList.add("7:10 p.m.");
                                mTimesList.add("8:40 p.m.");
                                mTimesList.add("9:40 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Shops at Kanawha Mall":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("10:55 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("7:45 p.m.");
                                mTimesList.add("8:45 p.m.");
                                mTimesList.add("9:45 p.m.");
                                break;
                            case "CAMC Memorial":
                                mTimesList.add("6:59 a.m.");
                                mTimesList.add("7:59 a.m.");
                                mTimesList.add("8:59 a.m.");
                                mTimesList.add("9:59 a.m.");
                                mTimesList.add("11:09 a.m.");
                                mTimesList.add("11:59 a.m.");
                                mTimesList.add("12:29 p.m.");
                                mTimesList.add("1:29 p.m.");
                                mTimesList.add("2:29 p.m.");
                                mTimesList.add("3:29 p.m.");
                                mTimesList.add("4:29 p.m.");
                                mTimesList.add("5:29 p.m.");
                                mTimesList.add("6:29 p.m.");
                                mTimesList.add("7:59 p.m.");
                                mTimesList.add("8:59 p.m.");
                                mTimesList.add("9:59 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("11:25 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("1:45 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:45 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("8:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("10:15 p.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("1:45 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:45 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("8:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                break;
                            case "CAMC Memorial":
                                mTimesList.add("7:26 a.m.");
                                mTimesList.add("8:26 a.m.");
                                mTimesList.add("9:26 a.m.");
                                mTimesList.add("10:26 a.m.");
                                mTimesList.add("11:26 a.m.");
                                mTimesList.add("12:56 p.m.");
                                mTimesList.add("1:56 p.m.");
                                mTimesList.add("2:56 p.m.");
                                mTimesList.add("3:56 p.m.");
                                mTimesList.add("4:56 p.m.");
                                mTimesList.add("5:56 p.m.");
                                mTimesList.add("6:56 p.m.");
                                mTimesList.add("8:26 p.m.");
                                mTimesList.add("9:26 p.m.");
                                break;
                            case "Shops at Kanawha Mall":
                                mTimesList.add("7:40 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("9:40 a.m.");
                                mTimesList.add("10:40 a.m.");
                                mTimesList.add("11:40 a.m.");
                                mTimesList.add("1:10 p.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("3:10 p.m.");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("5:10 p.m.");
                                mTimesList.add("6:10 p.m.");
                                mTimesList.add("7:10 p.m.");
                                mTimesList.add("8:40 p.m.");
                                mTimesList.add("9:40 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Shops at Kanawha Mall":
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("7:45 p.m.");
                                mTimesList.add("8:45 p.m.");
                                mTimesList.add("9:45 p.m.");
                                break;
                            case "CAMC Memorial":
                                mTimesList.add("7:59 a.m.");
                                mTimesList.add("8:59 a.m.");
                                mTimesList.add("9:59 a.m.");
                                mTimesList.add("10:59 a.m.");
                                mTimesList.add("12:29 p.m.");
                                mTimesList.add("1:29 p.m.");
                                mTimesList.add("2:29 p.m.");
                                mTimesList.add("3:29 p.m.");
                                mTimesList.add("4:29 p.m.");
                                mTimesList.add("5:29 p.m.");
                                mTimesList.add("6:29 p.m.");
                                mTimesList.add("7:59 p.m.");
                                mTimesList.add("8:59 p.m.");
                                mTimesList.add("9:59 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("1:45 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:45 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("8:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("10:15 p.m.");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i).toString();

        return mTimes;
    }

    protected static String[] getTimes18(String mDay, String mDirection, String mTimepoint) {

        ArrayList mTimesList = new ArrayList();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:35 a.m.\n(To SC Tech Park on St Albans Rt)");
                                mTimesList.add("1:00 p.m.\n(To SC Tech Park on St Albans Rt)");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("6:30 p.m.\n(To SC Tech Park on St Albans Rt)");
                                mTimesList.add("9:25 p.m.\n(To SC Tech Park on St Albans Rt)");
                                break;
                            case "Wilkie Dr at Churchill Dr":
                                mTimesList.add("7:40 a.m.");
                                mTimesList.add("9:10 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("2:40 p.m.");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("5:40 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Daverton Rd at Thorne Rd":
                                mTimesList.add("7:48 a.m.");
                                mTimesList.add("9:18 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("2:48 p.m.");
                                mTimesList.add("4:18 p.m.");
                                mTimesList.add("5:48 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Montrose Dr at Glendale Ave":
                                mTimesList.add("7:53 a.m.");
                                mTimesList.add("9:23 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("2:53 p.m.");
                                mTimesList.add("4:23 p.m.");
                                mTimesList.add("5:53 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "SC Tech Center":
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("10:55 a.m.");
                                mTimesList.add("1:20 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("6:50 p.m.");
                                mTimesList.add("9:45 p.m.");
                                break;
                            case "E St at 6th Ave":
                                mTimesList.add("8:08 a.m.");
                                mTimesList.add("9:38 a.m.");
                                mTimesList.add("11:03 a.m.");
                                mTimesList.add("1:28 p.m.");
                                mTimesList.add("3:08 p.m.");
                                mTimesList.add("4:38 p.m.");
                                mTimesList.add("6:08 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Riverwalk":
                                mTimesList.add("8:12 a.m.");
                                mTimesList.add("9:42 a.m.");
                                mTimesList.add("11:07 a.m.");
                                mTimesList.add("1:32 p.m.");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("4:42 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Riverwalk":
                                mTimesList.add("-");
                                mTimesList.add("8:17 a.m.");
                                mTimesList.add("9:47 a.m.");
                                mTimesList.add("11:22 a.m.\n(To Transit Mall on St Albans Rt from Tech Center)");
                                mTimesList.add("1:37 p.m.\n(To Garage on St Albans Rt from Tech Center)");
                                mTimesList.add("3:17 p.m.");
                                mTimesList.add("4:47 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "E St at 6th Ave":
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("8:21 a.m.");
                                mTimesList.add("9:51 a.m.");
                                mTimesList.add("11:26 a.m.\n(To Transit Mall on St Albans Rt from Tech Center)");
                                mTimesList.add("1:41 p.m.\n(To Garage on St Albans Rt from Tech Center)");
                                mTimesList.add("3:21 p.m.");
                                mTimesList.add("4:51 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "SC Tech Center":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("9:59 a.m.");
                                mTimesList.add("11:34 a.m.\n(To Transit Mall on St Albans Rt from Tech Center)");
                                mTimesList.add("1:49 p.m.\n(To Garage on St Albans Rt from Tech Center)");
                                mTimesList.add("3:29 p.m.");
                                mTimesList.add("4:59 p.m.");
                                mTimesList.add("6:50 p.m.\n(To Garage on St Albans Rt)");
                                mTimesList.add("10:00 p.m.\n(To Transit Mall on St Albans Rt)");
                                break;
                            case "Montrose Dr at Glendale Ave":
                                mTimesList.add("7:05 a.m.");
                                mTimesList.add("8:31 a.m.");
                                mTimesList.add("10:06 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("3:36 p.m.");
                                mTimesList.add("5:06 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Daverton Rd at Thorne Rd":
                                mTimesList.add("7:10 a.m.");
                                mTimesList.add("8:36 a.m.");
                                mTimesList.add("10:11 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("3:41 p.m.");
                                mTimesList.add("5:11 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Wilkie Dr at Churchill Dr":
                                mTimesList.add("7:18 a.m.");
                                mTimesList.add("8:44 a.m.");
                                mTimesList.add("10:19 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("3:49 p.m.");
                                mTimesList.add("5:19 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:28 a.m.");
                                mTimesList.add("8:54 a.m.");
                                mTimesList.add("10:29 a.m.");
                                mTimesList.add("11:54 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:59 p.m.");
                                mTimesList.add("5:29 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:20 p.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "Wilkie Dr at Churchill Dr":
                                mTimesList.add("7:40 a.m.");
                                mTimesList.add("9:10 a.m.");
                                mTimesList.add("2:40 p.m.");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("5:40 p.m.");
                                break;
                            case "Daverton Rd at Thorne Rd":
                                mTimesList.add("7:50 a.m.");
                                mTimesList.add("9:20 a.m.");
                                mTimesList.add("2:50 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("5:50 p.m.");
                                break;
                            case "Montrose Dr at Glendale Ave":
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("6:00 p.m.");
                                break;
                            case "SC Tech Center":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "E St at 6th Ave":
                                mTimesList.add("8:06 a.m.");
                                mTimesList.add("9:36 a.m.");
                                mTimesList.add("3:06 p.m.");
                                mTimesList.add("4:36 p.m.");
                                mTimesList.add("6:06 p.m.");
                                break;
                            case "Riverwalk":
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("9:40 a.m.");
                                mTimesList.add("3:10 p.m.");
                                mTimesList.add("4:40 p.m.");
                                mTimesList.add("6:10 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Riverwalk":
                                mTimesList.add("-");
                                mTimesList.add("8:20 a.m.");
                                mTimesList.add("9:50 a.m.");
                                mTimesList.add("3:20 p.m.");
                                mTimesList.add("4:50 p.m.");
                                break;
                            case "E St at 6th Ave":
                                mTimesList.add("6:54 a.m.");
                                mTimesList.add("8:24 a.m.");
                                mTimesList.add("9:54 a.m.");
                                mTimesList.add("3:24 p.m.");
                                mTimesList.add("4:54 p.m.");
                                break;
                            case "SC Tech Center":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Montrose Dr at Glendale Ave":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("5:00 p.m.");
                                break;
                            case "Daverton Rd at Thorne Rd":
                                mTimesList.add("7:10 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("10:10 a.m.");
                                mTimesList.add("3:40 p.m.");
                                mTimesList.add("5:10 p.m.");
                                break;
                            case "Wilkie Dr at Churchill Dr":
                                mTimesList.add("7:20 a.m.");
                                mTimesList.add("8:50 a.m.");
                                mTimesList.add("10:20 a.m.");
                                mTimesList.add("3:50 p.m.");
                                mTimesList.add("5:20 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i).toString();

        return mTimes;
    }

    protected static String[] getTimes20(String mDay, String mDirection, String mTimepoint) {

        ArrayList mTimesList = new ArrayList();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("6:39 a.m.");
                                mTimesList.add("6:43 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("7:16 a.m.");
                                mTimesList.add("7:42 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("8:16 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("8:48 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("9:16 a.m.");
                                mTimesList.add("9:41 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("10:36 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:05 a.m.");
                                mTimesList.add("11:36 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("11:50 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("12:36 p.m.");
                                mTimesList.add("12:50 p.m.");
                                mTimesList.add("12:55 p.m.");
                                mTimesList.add("1:32 p.m.");
                                mTimesList.add("1:36 p.m.");
                                mTimesList.add("1:50 p.m.");
                                mTimesList.add("1:53 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("2:50 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("3:06 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("3:50 p.m.");
                                mTimesList.add("3:55 p.m.");
                                mTimesList.add("4:02 p.m.");
                                mTimesList.add("4:06 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("4:50 p.m.");
                                mTimesList.add("4:55 p.m.");
                                mTimesList.add("5:02 p.m.");
                                mTimesList.add("5:06 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("5:35 p.m.");
                                mTimesList.add("5:50 p.m.");
                                mTimesList.add("5:55 p.m.");
                                mTimesList.add("6:55 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("7:55 p.m.");
                                mTimesList.add("8:55 p.m.");
                                mTimesList.add("9:55 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:51 a.m.");
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("7:28 a.m.");
                                mTimesList.add("7:54 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("8:28 a.m.");
                                mTimesList.add("8:57 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("9:28 a.m.");
                                mTimesList.add("9:53 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("10:57 a.m.");
                                mTimesList.add("11:17 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("11:57 p.m.");
                                mTimesList.add("12:03 p.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("1:02 p.m.");
                                mTimesList.add("1:07 p.m.");
                                mTimesList.add("1:44 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("2:02 p.m.");
                                mTimesList.add("2:05 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("3:02 p.m.");
                                mTimesList.add("3:07 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("4:02 p.m.");
                                mTimesList.add("4:07 p.m.");
                                mTimesList.add("4:14 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:02 p.m.");
                                mTimesList.add("5:07 p.m.");
                                mTimesList.add("5:14 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("5:45 p.m.");
                                mTimesList.add("5:47 p.m.");
                                mTimesList.add("6:02 p.m.");
                                mTimesList.add("6:07 p.m.");
                                mTimesList.add("7:07 p.m.");
                                mTimesList.add("7:27 p.m.");
                                mTimesList.add("8:07 p.m.");
                                mTimesList.add("9:07 p.m.");
                                mTimesList.add("10:07 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Capitol Complex":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("6:59 a.m.");
                                mTimesList.add("7:29 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("7:54 a.m.");
                                mTimesList.add("7:59 a.m.");
                                mTimesList.add("8:29 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("8:59 a.m.");
                                mTimesList.add("9:01 a.m.");
                                mTimesList.add("9:29 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("9:59 a.m.");
                                mTimesList.add("10:59 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("11:19 a.m.");
                                mTimesList.add("11:59 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("12:19 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("1:09 p.m.");
                                mTimesList.add("1:19 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("2:06 p.m.");
                                mTimesList.add("2:09 p.m.");
                                mTimesList.add("2:19 p.m.");
                                mTimesList.add("3:09 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("3:19 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:09 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("4:19 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:05 p.m.");
                                mTimesList.add("5:09 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("5:49 p.m.");
                                mTimesList.add("6:04 p.m.");
                                mTimesList.add("6:09 p.m.");
                                mTimesList.add("7:09 p.m.");
                                mTimesList.add("8:09 p.m.");
                                mTimesList.add("9:09 p.m.");
                                mTimesList.add("10:09 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("7:06 a.m.");
                                mTimesList.add("7:10 a.m.");
                                mTimesList.add("7:40 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("8:05 a.m.");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("9:10 a.m.");
                                mTimesList.add("9:12 a.m.");
                                mTimesList.add("9:40 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("10:10 a.m.");
                                mTimesList.add("11:10 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("11:36 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("12:36 p.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("1:36 p.m.");
                                mTimesList.add("1:20 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("2:36 p.m.");
                                mTimesList.add("2:17 p.m.");
                                mTimesList.add("2:20 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:20 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:06 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("4:26 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:06 p.m.");
                                mTimesList.add("5:16 p.m.");
                                mTimesList.add("5:20 p.m.");
                                mTimesList.add("5:26 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("6:20 p.m.");
                                mTimesList.add("7:20 p.m.");
                                mTimesList.add("8:20 p.m.");
                                mTimesList.add("9:20 p.m.");
                                mTimesList.add("10:20 p.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("10:36 a.m.");
                                mTimesList.add("11:36 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("12:36 p.m.");
                                mTimesList.add("1:36 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:06 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:06 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:06 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("5:45 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Capitol Complex":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("11:36 a.m.");
                                mTimesList.add("12:36 p.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("1:36 p.m.");
                                mTimesList.add("2:36 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:06 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:06 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("-");
                                break;
                        }
                        break;
                }
                break;
            case "Sunday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("4:25 a.m.");
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("5:25 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("4:35 a.m.");
                                mTimesList.add("6:41 a.m.");
                                mTimesList.add("8:52 a.m.");
                                mTimesList.add("10:42 a.m.");
                                mTimesList.add("12:12 p.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("5:33 p.m.");
                                mTimesList.add("7:24 p.m.");
                                mTimesList.add("9:24 p.m.");
                                mTimesList.add("11:24 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Capitol Complex":
                                mTimesList.add("6:12 a.m.");
                                mTimesList.add("7:52 a.m.");
                                mTimesList.add("10:55 a.m.");
                                mTimesList.add("11:47 a.m.");
                                mTimesList.add("2:16 p.m.");
                                mTimesList.add("3:16 p.m.");
                                mTimesList.add("7:02 p.m.");
                                mTimesList.add("8:59 p.m.");
                                mTimesList.add("11:00 p.m.");
                                mTimesList.add("12:23 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("11:10 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("12:35 a.m.");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i).toString();

        return mTimes;
    }

    protected static String[] getTimes21(String mDay, String mDirection, String mTimepoint) {

        ArrayList mTimesList = new ArrayList();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("5:45 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:30 a.m.\n(Express)");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:30 p.m.\n(Express)");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.\n(Express)");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:00 p.m.\n(Express)");
                                mTimesList.add("6:30 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("8:00 p.m.\n(Express)");
                                mTimesList.add("9:00 p.m.");
                                mTimesList.add("10:30 p.m.\n(Express w/ Oakwood at Oakhurst)");
                                break;
                            case "Oakwood at Oakhurst":
                                mTimesList.add("5:52 a.m.");
                                mTimesList.add("7:12 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:42 a.m.");
                                mTimesList.add("11:12 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:42 p.m.");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:42 p.m.");
                                mTimesList.add("5:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("6:42 p.m.");
                                mTimesList.add("7:27 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:12 p.m.");
                                mTimesList.add("10:38 p.m.\n(Express)");
                                break;
                            case "Davis Creek":
                                mTimesList.add("5:57 a.m.");
                                mTimesList.add("7:17 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:47 a.m.");
                                mTimesList.add("11:17 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:47 p.m.");
                                mTimesList.add("3:17 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:47 p.m.");
                                mTimesList.add("5:17 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("6:47 p.m.");
                                mTimesList.add("7:32 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:17 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Trace Fork (Ice Rink)":
                                mTimesList.add("6:02 a.m.");
                                mTimesList.add("7:29 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:59 a.m.");
                                mTimesList.add("11:29 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:59 p.m.");
                                mTimesList.add("3:29 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:59 p.m.");
                                mTimesList.add("5:29 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("6:59 p.m.");
                                mTimesList.add("7:44 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:29 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Walmart/Southridge Center":
                                mTimesList.add("6:08 a.m.\n(To jail - see inbound times)");
                                mTimesList.add("7:37 a.m.\n(To jail - see inbound times)");
                                mTimesList.add("8:50 a.m.\n(Rt end - see inbound times)");
                                mTimesList.add("10:07 a.m.\n(To jail - see inbound times)");
                                mTimesList.add("11:37 a.m.\n(To jail - see inbound times)");
                                mTimesList.add("12:50 p.m.\n(Rt end - see inbound times)");
                                mTimesList.add("2:07 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("3:37 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("4:20 p.m.\n(Rt end - see inbound times)");
                                mTimesList.add("5:07 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("5:37 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("6:20 p.m.\n(Rt end - see inbound times)");
                                mTimesList.add("7:07 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("7:52 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("8:20 p.m.\n(Rt end - see inbound times)");
                                mTimesList.add("9:37 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("10:50 p.m.\n(Rt end - see inbound times)");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Walmart/Southridge Center":
                                mTimesList.add("6:08 a.m.");
                                mTimesList.add("7:37 a.m.");
                                mTimesList.add("8:50 a.m.");
                                mTimesList.add("10:07 a.m.");
                                mTimesList.add("11:37 a.m.");
                                mTimesList.add("12:50 p.m.");
                                mTimesList.add("2:07 p.m.");
                                mTimesList.add("3:37 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("5:07 p.m.");
                                mTimesList.add("5:37 p.m.");
                                mTimesList.add("6:20 p.m.");
                                mTimesList.add("7:07 p.m.");
                                mTimesList.add("7:52 p.m.");
                                mTimesList.add("8:20 p.m.");
                                mTimesList.add("9:37 p.m.");
                                mTimesList.add("10:50 p.m.");
                                break;
                            case "South Central Regional Jail":
                                mTimesList.add("6:12 a.m.");
                                mTimesList.add("7:42 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:12 a.m.");
                                mTimesList.add("11:42 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:12 p.m.");
                                mTimesList.add("3:42 p.m.");
                                mTimesList.add("4:25 p.m.");
                                mTimesList.add("5:12 p.m.");
                                mTimesList.add("5:42 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:12 p.m.");
                                mTimesList.add("7:57 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:42 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Cross Terrace Blvd at Parkway Rd":
                                mTimesList.add("6:20 a.m.");
                                mTimesList.add("7:50 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:20 a.m.");
                                mTimesList.add("11:50 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:20 p.m.");
                                mTimesList.add("3:50 p.m.");
                                mTimesList.add("4:32 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("5:50 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:20 p.m.");
                                mTimesList.add("8:20 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:50 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Trace Fork (Ice Rink)":
                                mTimesList.add("6:35 a.m.");
                                mTimesList.add("8:02 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:32 a.m.");
                                mTimesList.add("12:02 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:32 p.m.");
                                mTimesList.add("4:02 p.m.");
                                mTimesList.add("4:42 p.m.");
                                mTimesList.add("5:42 p.m.");
                                mTimesList.add("6:02 p.m.");
                                mTimesList.add("6:32 p.m.");
                                mTimesList.add("7:32 p.m.");
                                mTimesList.add("8:32 p.m.");
                                mTimesList.add("8:30 p.m.");
                                mTimesList.add("10:02 p.m.");
                                mTimesList.add("11:00 p.m.");
                                break;
                            case "Davis Creek":
                                mTimesList.add("6:40 a.m.");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:40 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:40 p.m.");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:10 p.m.");
                                mTimesList.add("6:40 p.m.");
                                mTimesList.add("7:40 p.m.");
                                mTimesList.add("8:40 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:10 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Oakwood at Oakhurst":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("8:16 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:46 a.m.");
                                mTimesList.add("12:16 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:46 p.m.");
                                mTimesList.add("4:16 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:16 p.m.");
                                mTimesList.add("6:46 p.m.");
                                mTimesList.add("7:46 p.m.");
                                mTimesList.add("8:46 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:16 p.m.");
                                mTimesList.add("11:07 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("8:28 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:58 a.m.");
                                mTimesList.add("12:28 p.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("2:58 p.m.");
                                mTimesList.add("4:28 p.m.");
                                mTimesList.add("4:57 p.m.");
                                mTimesList.add("5:57 p.m.");
                                mTimesList.add("6:28 p.m.");
                                mTimesList.add("6:58 p.m.");
                                mTimesList.add("7:58 p.m.");
                                mTimesList.add("8:58 p.m.");
                                mTimesList.add("8:45 p.m.");
                                mTimesList.add("10:28 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("5:45 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:30 a.m.\n(Express)");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:30 p.m.\n(Express)");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("3:00 p.m.");
                                mTimesList.add("4:00 p.m.\n(Express)");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:00 p.m.\n(Express)");
                                mTimesList.add("6:30 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("8:00 p.m.\n(Express)");
                                mTimesList.add("9:00 p.m.");
                                mTimesList.add("10:30 p.m.\n(Express w/ Oakwood at Oakhurst)");
                                break;
                            case "Oakwood at Oakhurst":
                                mTimesList.add("5:52 a.m.");
                                mTimesList.add("7:12 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:42 a.m.");
                                mTimesList.add("11:12 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:42 p.m.");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:42 p.m.");
                                mTimesList.add("5:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("6:42 p.m.");
                                mTimesList.add("7:27 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:12 p.m.");
                                mTimesList.add("10:38 p.m.\n(Express)");
                                break;
                            case "Davis Creek":
                                mTimesList.add("5:57 a.m.");
                                mTimesList.add("7:17 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:47 a.m.");
                                mTimesList.add("11:17 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:47 p.m.");
                                mTimesList.add("3:17 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:47 p.m.");
                                mTimesList.add("5:17 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("6:47 p.m.");
                                mTimesList.add("7:32 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:17 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Trace Fork (Ice Rink)":
                                mTimesList.add("6:02 a.m.");
                                mTimesList.add("7:29 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:59 a.m.");
                                mTimesList.add("11:29 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:59 p.m.");
                                mTimesList.add("3:29 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:59 p.m.");
                                mTimesList.add("5:29 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("6:59 p.m.");
                                mTimesList.add("7:44 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:29 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Walmart/Southridge Center":
                                mTimesList.add("6:08 a.m.\n(To jail - see inbound times)");
                                mTimesList.add("7:37 a.m.\n(To jail - see inbound times)");
                                mTimesList.add("8:50 a.m.\n(Rt end - see inbound times)");
                                mTimesList.add("10:07 a.m.\n(To jail - see inbound times)");
                                mTimesList.add("11:37 a.m.\n(To jail - see inbound times)");
                                mTimesList.add("12:50 p.m.\n(Rt end - see inbound times)");
                                mTimesList.add("2:07 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("3:37 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("4:20 p.m.\n(Rt end - see inbound times)");
                                mTimesList.add("5:07 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("5:37 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("6:20 p.m.\n(Rt end - see inbound times)");
                                mTimesList.add("7:07 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("7:52 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("8:20 p.m.\n(Rt end - see inbound times)");
                                mTimesList.add("9:37 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("10:50 p.m.\n(Rt end - see inbound times)");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Walmart/Southridge Center":
                                mTimesList.add("6:08 a.m.");
                                mTimesList.add("7:37 a.m.");
                                mTimesList.add("8:50 a.m.");
                                mTimesList.add("10:07 a.m.");
                                mTimesList.add("11:37 a.m.");
                                mTimesList.add("12:50 p.m.");
                                mTimesList.add("2:07 p.m.");
                                mTimesList.add("3:37 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("5:07 p.m.");
                                mTimesList.add("5:37 p.m.");
                                mTimesList.add("6:20 p.m.");
                                mTimesList.add("7:07 p.m.");
                                mTimesList.add("7:52 p.m.");
                                mTimesList.add("8:20 p.m.");
                                mTimesList.add("9:37 p.m.");
                                mTimesList.add("10:50 p.m.");
                                break;
                            case "South Central Regional Jail":
                                mTimesList.add("6:12 a.m.");
                                mTimesList.add("7:42 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:12 a.m.");
                                mTimesList.add("11:42 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:12 p.m.");
                                mTimesList.add("3:42 p.m.");
                                mTimesList.add("4:25 p.m.");
                                mTimesList.add("5:12 p.m.");
                                mTimesList.add("5:42 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:12 p.m.");
                                mTimesList.add("7:57 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:42 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Cross Terrace Blvd at Parkway Rd":
                                mTimesList.add("6:20 a.m.");
                                mTimesList.add("7:50 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:20 a.m.");
                                mTimesList.add("11:50 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:20 p.m.");
                                mTimesList.add("3:50 p.m.");
                                mTimesList.add("4:32 p.m.");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("5:50 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:20 p.m.");
                                mTimesList.add("8:20 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:50 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Trace Fork (Ice Rink)":
                                mTimesList.add("6:35 a.m.");
                                mTimesList.add("8:02 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:32 a.m.");
                                mTimesList.add("12:02 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:32 p.m.");
                                mTimesList.add("4:02 p.m.");
                                mTimesList.add("4:42 p.m.");
                                mTimesList.add("5:42 p.m.");
                                mTimesList.add("6:02 p.m.");
                                mTimesList.add("6:32 p.m.");
                                mTimesList.add("7:32 p.m.");
                                mTimesList.add("8:32 p.m.");
                                mTimesList.add("8:30 p.m.");
                                mTimesList.add("10:02 p.m.");
                                mTimesList.add("11:00 p.m.");
                                break;
                            case "Davis Creek":
                                mTimesList.add("6:40 a.m.");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:40 a.m.");
                                mTimesList.add("12:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:40 p.m.");
                                mTimesList.add("4:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:10 p.m.");
                                mTimesList.add("6:40 p.m.");
                                mTimesList.add("7:40 p.m.");
                                mTimesList.add("8:40 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:10 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Oakwood at Oakhurst":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("8:16 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:46 a.m.");
                                mTimesList.add("12:16 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:46 p.m.");
                                mTimesList.add("4:16 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:16 p.m.");
                                mTimesList.add("6:46 p.m.");
                                mTimesList.add("7:46 p.m.");
                                mTimesList.add("8:46 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:16 p.m.");
                                mTimesList.add("11:07 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("8:28 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:58 a.m.");
                                mTimesList.add("12:28 p.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("2:58 p.m.");
                                mTimesList.add("4:28 p.m.");
                                mTimesList.add("4:57 p.m.");
                                mTimesList.add("5:57 p.m.");
                                mTimesList.add("6:28 p.m.");
                                mTimesList.add("6:58 p.m.");
                                mTimesList.add("7:58 p.m.");
                                mTimesList.add("8:58 p.m.");
                                mTimesList.add("8:45 p.m.");
                                mTimesList.add("10:28 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Sunday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:30 a.m.\n(Express)");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("4:15 p.m.\n(Express)");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:30 p.m.\n(Express)");
                                mTimesList.add("7:15 p.m.");
                                break;
                            case "Oakwood at Oakhurst":
                                mTimesList.add("8:51 a.m.");
                                mTimesList.add("10:12 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:12 p.m.");
                                mTimesList.add("2:42 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:27 p.m.");
                                break;
                            case "Davis Creek":
                                mTimesList.add("8:56 a.m.");
                                mTimesList.add("10:17 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:17 p.m.");
                                mTimesList.add("2:47 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:17 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:32 p.m.");
                                break;
                            case "Trace Fork (Ice Rink)":
                                mTimesList.add("9:04 a.m.");
                                mTimesList.add("10:29 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:29 p.m.");
                                mTimesList.add("2:59 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:29 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:44 p.m.");
                                break;
                            case "Walmart/Southridge Center":
                                mTimesList.add("9:10 a.m.\n(To jail - see inbound times)");
                                mTimesList.add("10:37 a.m.\n(To jail - see inbound times)");
                                mTimesList.add("11:50 a.m.\n(Rt end - see inbound times)");
                                mTimesList.add("1:37 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("3:07 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("4:35 p.m.\n(Rt end - see inbound times)");
                                mTimesList.add("5:37 p.m.\n(To jail - see inbound times)");
                                mTimesList.add("6:50 p.m.\n(Rt end - see inbound times)");
                                mTimesList.add("7:52 p.m.\n(To jail - see inbound times)");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Walmart/Southridge Center":
                                mTimesList.add("9:10 a.m.");
                                mTimesList.add("10:37 a.m.");
                                mTimesList.add("11:50 a.m.");
                                mTimesList.add("1:37 p.m.");
                                mTimesList.add("3:07 p.m.");
                                mTimesList.add("4:35 p.m.");
                                mTimesList.add("5:37 p.m.");
                                mTimesList.add("6:50 p.m.");
                                mTimesList.add("7:52 p.m.");
                                break;
                            case "South Central Regional Jail":
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:42 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:42 p.m.");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:42 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:57 p.m.");
                                break;
                            case "Cross Terrace Blvd at Parkway Rd":
                                mTimesList.add("9:22 a.m.");
                                mTimesList.add("10:50 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:50 p.m.");
                                mTimesList.add("3:20 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:50 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:05 p.m.");
                                break;
                            case "Trace Fork (Ice Rink)":
                                mTimesList.add("9:34 a.m.");
                                mTimesList.add("11:02 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("2:02 p.m.");
                                mTimesList.add("3:32 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("6:02 p.m.");
                                mTimesList.add("7:00 p.m.");
                                mTimesList.add("8:17 p.m.");
                                break;
                            case "Davis Creek":
                                mTimesList.add("9:42 a.m.");
                                mTimesList.add("11:10 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("3:40 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("6:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:25 p.m.");
                                break;
                            case "Oakwood at Oakhurst":
                                mTimesList.add("9:48 a.m.");
                                mTimesList.add("11:16 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("2:16 p.m.");
                                mTimesList.add("3:46 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("6:16 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:31 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:28 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("2:28 p.m.");
                                mTimesList.add("3:58 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:28 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("8:43 p.m.");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i).toString();

        return mTimes;
    }

    protected static String[] getTimes22M(String mDay, String mDirection, String mTimepoint) {

        ArrayList mTimesList = new ArrayList();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("4:30 a.m.");
                                mTimesList.add("5:30 a.m.");
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("9:20 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("4:37 a.m.");
                                mTimesList.add("5:37 a.m.");
                                mTimesList.add("6:27 a.m.");
                                mTimesList.add("7:27 a.m.");
                                mTimesList.add("8:27 a.m.");
                                mTimesList.add("9:27 a.m.");
                                mTimesList.add("10:27 a.m.");
                                mTimesList.add("11:27 a.m.");
                                mTimesList.add("12:27 p.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("3:27 p.m.");
                                mTimesList.add("4:27 p.m.");
                                mTimesList.add("5:27 p.m.");
                                mTimesList.add("6:57 p.m.");
                                mTimesList.add("9:31 p.m.");
                                break;
                            case "Malden Underpass":
                                mTimesList.add("4:47 a.m.");
                                mTimesList.add("5:47 a.m.");
                                mTimesList.add("6:37 a.m.");
                                mTimesList.add("7:37 a.m.");
                                mTimesList.add("8:37 a.m.");
                                mTimesList.add("9:37 a.m.");
                                mTimesList.add("10:37 a.m.");
                                mTimesList.add("11:37 a.m.");
                                mTimesList.add("12:37 p.m.");
                                mTimesList.add("2:37 p.m.");
                                mTimesList.add("3:37 p.m.");
                                mTimesList.add("4:37 p.m.");
                                mTimesList.add("5:37 p.m.");
                                mTimesList.add("7:07 p.m.");
                                mTimesList.add("9:41 p.m.");
                                break;
                            case "Quincy Walmart":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Quincy Mall":
                                mTimesList.add("5:05 a.m.");
                                mTimesList.add("6:05 a.m.");
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("7:55 a.m.");
                                mTimesList.add("8:55 a.m.");
                                mTimesList.add("9:55 a.m.");
                                mTimesList.add("10:55 a.m.");
                                mTimesList.add("11:55 a.m.");
                                mTimesList.add("12:55 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("3:55 p.m.");
                                mTimesList.add("4:55 p.m.");
                                mTimesList.add("5:55 p.m.");
                                mTimesList.add("7:25 p.m.");
                                mTimesList.add("9:55 p.m.");
                                break;
                            case "Cedar Grove":
                                mTimesList.add("5:15 a.m.");
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("7:05 a.m.");
                                mTimesList.add("8:05 a.m.");
                                mTimesList.add("9:05 a.m.");
                                mTimesList.add("10:05 a.m.");
                                mTimesList.add("11:05 a.m.");
                                mTimesList.add("12:05 p.m.");
                                mTimesList.add("1:05 p.m.");
                                mTimesList.add("3:05 p.m.");
                                mTimesList.add("4:05 p.m.");
                                mTimesList.add("5:05 p.m.");
                                mTimesList.add("6:05 p.m.");
                                mTimesList.add("7:35 p.m.");
                                mTimesList.add("10:05 p.m.");
                                break;
                            case "Montgomery":
                                mTimesList.add("5:30 a.m.");
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("7:20 a.m.");
                                mTimesList.add("8:20 a.m.");
                                mTimesList.add("9:20 a.m.");
                                mTimesList.add("10:20 a.m.");
                                mTimesList.add("11:20 a.m.");
                                mTimesList.add("12:20 p.m.");
                                mTimesList.add("1:20 p.m.");
                                mTimesList.add("3:20 p.m.");
                                mTimesList.add("4:20 p.m.");
                                mTimesList.add("5:20 p.m.");
                                mTimesList.add("6:20 p.m.");
                                mTimesList.add("7:50 p.m.");
                                mTimesList.add("10:15 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Montgomery":
                                mTimesList.add("5:35 a.m.");
                                mTimesList.add("6:35 a.m.");
                                mTimesList.add("7:35 a.m.");
                                mTimesList.add("8:35 a.m.");
                                mTimesList.add("9:35 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:35 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("1:45 p.m.");
                                mTimesList.add("3:35 p.m.");
                                mTimesList.add("4:35 p.m.");
                                mTimesList.add("5:35 p.m.");
                                mTimesList.add("6:35 p.m.");
                                mTimesList.add("7:55 p.m.");
                                mTimesList.add("10:15 p.m.");
                                break;
                            case "Cedar Grove":
                                mTimesList.add("5:50 a.m.");
                                mTimesList.add("6:50 a.m.");
                                mTimesList.add("7:50 a.m.");
                                mTimesList.add("8:50 a.m.");
                                mTimesList.add("9:50 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("11:50 a.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("3:50 p.m.");
                                mTimesList.add("4:50 p.m.");
                                mTimesList.add("5:50 p.m.");
                                mTimesList.add("6:50 p.m.");
                                mTimesList.add("8:07 p.m.");
                                mTimesList.add("10:26 p.m.");
                                break;
                            case "Quincy Mall":
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:10 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:10 p.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("7:00 p.m.");
                                mTimesList.add("8:17 p.m.");
                                mTimesList.add("10:35 p.m.");
                                break;
                            case "Quincy Walmart":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Malden Underpass":
                                mTimesList.add("6:20 a.m.");
                                mTimesList.add("7:20 a.m.");
                                mTimesList.add("8:22 a.m.");
                                mTimesList.add("9:22 a.m.");
                                mTimesList.add("10:22 a.m.");
                                mTimesList.add("11:32 a.m.");
                                mTimesList.add("12:22 p.m.");
                                mTimesList.add("1:32 p.m.");
                                mTimesList.add("2:32 p.m.");
                                mTimesList.add("4:22 p.m.");
                                mTimesList.add("5:22 p.m.");
                                mTimesList.add("6:22 p.m.");
                                mTimesList.add("7:22 p.m.");
                                mTimesList.add("8:37 p.m.");
                                mTimesList.add("10:52 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:33 a.m.");
                                mTimesList.add("7:33 a.m.");
                                mTimesList.add("8:32 a.m.");
                                mTimesList.add("9:32 a.m.");
                                mTimesList.add("10:32 a.m.");
                                mTimesList.add("11:42 a.m.");
                                mTimesList.add("12:32 p.m.");
                                mTimesList.add("1:42 p.m.");
                                mTimesList.add("2:42 p.m.");
                                mTimesList.add("4:32 p.m.");
                                mTimesList.add("5:32 p.m.");
                                mTimesList.add("6:32 p.m.");
                                mTimesList.add("7:32 p.m.");
                                mTimesList.add("8:47 p.m.");
                                mTimesList.add("11:02 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:55 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("1:55 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:45 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("7:45 p.m.");
                                mTimesList.add("9:00 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("4:15 a.m.");
                                mTimesList.add("5:15 a.m.");
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("9:20 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("4:27 a.m.");
                                mTimesList.add("5:27 a.m.");
                                mTimesList.add("6:27 a.m.");
                                mTimesList.add("8:27 a.m.");
                                mTimesList.add("9:27 a.m.");
                                mTimesList.add("10:27 a.m.");
                                mTimesList.add("12:27 p.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("4:27 p.m.");
                                mTimesList.add("5:27 p.m.");
                                mTimesList.add("6:27 p.m.");
                                mTimesList.add("9:31 p.m.");
                                break;
                            case "Malden Underpass":
                                mTimesList.add("4:37 a.m.");
                                mTimesList.add("5:37 a.m.");
                                mTimesList.add("6:37 a.m.");
                                mTimesList.add("8:37 a.m.");
                                mTimesList.add("9:37 a.m.");
                                mTimesList.add("10:37 a.m.");
                                mTimesList.add("12:37 p.m.");
                                mTimesList.add("2:37 p.m.");
                                mTimesList.add("4:37 p.m.");
                                mTimesList.add("5:37 p.m.");
                                mTimesList.add("6:37 p.m.");
                                mTimesList.add("9:41 p.m.");
                                break;
                            case "Quincy Walmart":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Quincy Mall":
                                mTimesList.add("4:55 a.m.");
                                mTimesList.add("5:55 a.m.");
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("8:55 a.m.");
                                mTimesList.add("9:55 a.m.");
                                mTimesList.add("10:55 a.m.");
                                mTimesList.add("12:55 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("4:55 p.m.");
                                mTimesList.add("5:55 p.m.");
                                mTimesList.add("6:55 p.m.");
                                mTimesList.add("9:55 p.m.");
                                break;
                            case "Cedar Grove":
                                mTimesList.add("5:05 a.m.");
                                mTimesList.add("6:05 a.m.");
                                mTimesList.add("7:05 a.m.");
                                mTimesList.add("9:05 a.m.");
                                mTimesList.add("10:05 a.m.");
                                mTimesList.add("11:05 a.m.");
                                mTimesList.add("1:05 p.m.");
                                mTimesList.add("3:05 p.m.");
                                mTimesList.add("5:05 p.m.");
                                mTimesList.add("6:05 p.m.");
                                mTimesList.add("7:05 p.m.");
                                mTimesList.add("10:05 p.m.");
                                break;
                            case "Montgomery":
                                mTimesList.add("5:20 a.m.");
                                mTimesList.add("6:20 a.m.");
                                mTimesList.add("7:20 a.m.");
                                mTimesList.add("9:20 a.m.");
                                mTimesList.add("10:20 a.m.");
                                mTimesList.add("11:20 a.m.");
                                mTimesList.add("1:20 p.m.");
                                mTimesList.add("3:20 p.m.");
                                mTimesList.add("5:20 p.m.");
                                mTimesList.add("6:20 p.m.");
                                mTimesList.add("7:20 p.m.");
                                mTimesList.add("10:15 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Montgomery":
                                mTimesList.add("5:35 a.m.");
                                mTimesList.add("6:35 a.m.");
                                mTimesList.add("7:35 a.m.");
                                mTimesList.add("9:35 a.m.");
                                mTimesList.add("10:35 a.m.");
                                mTimesList.add("11:35 a.m.");
                                mTimesList.add("1:35 p.m.");
                                mTimesList.add("3:35 p.m.");
                                mTimesList.add("5:35 p.m.");
                                mTimesList.add("6:35 p.m.");
                                mTimesList.add("7:45 p.m.");
                                mTimesList.add("10:15 p.m.");
                                break;
                            case "Cedar Grove":
                                mTimesList.add("5:50 a.m.");
                                mTimesList.add("6:50 a.m.");
                                mTimesList.add("7:50 a.m.");
                                mTimesList.add("9:50 a.m.");
                                mTimesList.add("10:50 a.m.");
                                mTimesList.add("11:50 a.m.");
                                mTimesList.add("1:50 p.m.");
                                mTimesList.add("3:50 p.m.");
                                mTimesList.add("5:50 p.m.");
                                mTimesList.add("6:50 p.m.");
                                mTimesList.add("8:00 p.m.");
                                mTimesList.add("10:26 p.m.");
                                break;
                            case "Quincy Mall":
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("7:00 p.m.");
                                mTimesList.add("8:10 p.m.");
                                mTimesList.add("10:35 p.m.");
                                break;
                            case "Quincy Walmart":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Malden Underpass":
                                mTimesList.add("6:20 a.m.");
                                mTimesList.add("7:20 a.m.");
                                mTimesList.add("8:20 a.m.");
                                mTimesList.add("10:22 a.m.");
                                mTimesList.add("11:22 a.m.");
                                mTimesList.add("12:22 p.m.");
                                mTimesList.add("2:22 p.m.");
                                mTimesList.add("4:22 p.m.");
                                mTimesList.add("6:22 p.m.");
                                mTimesList.add("7:22 p.m.");
                                mTimesList.add("8:32 p.m.");
                                mTimesList.add("10:52 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:33 a.m.");
                                mTimesList.add("7:33 a.m.");
                                mTimesList.add("8:33 a.m.");
                                mTimesList.add("10:32 a.m.");
                                mTimesList.add("11:32 a.m.");
                                mTimesList.add("12:32 p.m.");
                                mTimesList.add("2:32 p.m.");
                                mTimesList.add("4:32 p.m.");
                                mTimesList.add("6:32 p.m.");
                                mTimesList.add("7:32 p.m.");
                                mTimesList.add("8:42 p.m.");
                                mTimesList.add("11:02 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("7:45 p.m.");
                                mTimesList.add("8:55 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Sunday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("4:25 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("5:25 p.m.");
                                mTimesList.add("7:15 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("4:35 a.m.");
                                mTimesList.add("8:52 a.m.");
                                mTimesList.add("12:12 p.m.");
                                mTimesList.add("5:33 p.m.");
                                mTimesList.add("7:24 p.m.");
                                break;
                            case "Malden Underpass":
                                mTimesList.add("4:45 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("12:22 p.m.");
                                mTimesList.add("5:42 p.m.");
                                mTimesList.add("7:32 p.m.");
                                break;
                            case "Quincy Walmart":
                                mTimesList.add("4:57 a.m.");
                                mTimesList.add("9:20 a.m.");
                                mTimesList.add("12:42 p.m.");
                                mTimesList.add("5:53 p.m.");
                                mTimesList.add("7:47 p.m.");
                                break;
                            case "Quincy Mall":
                                mTimesList.add("5:00 a.m.");
                                mTimesList.add("9:23 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("5:56 p.m.");
                                mTimesList.add("7:50 p.m.");
                                break;
                            case "Cedar Grove":
                                mTimesList.add("5:07 a.m.");
                                mTimesList.add("9:31 a.m.");
                                mTimesList.add("12:53 p.m.");
                                mTimesList.add("6:06 p.m.");
                                mTimesList.add("8:03 p.m.");
                                break;
                            case "Montgomery":
                                mTimesList.add("5:20 a.m.");
                                mTimesList.add("9:51 a.m.");
                                mTimesList.add("1:10 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("8:15 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Montgomery":
                                mTimesList.add("5:20 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("1:25 p.m.");
                                mTimesList.add("6:18 p.m.");
                                mTimesList.add("8:15 p.m.");
                                break;
                            case "Cedar Grove":
                                mTimesList.add("5:35 a.m.");
                                mTimesList.add("10:18 a.m.");
                                mTimesList.add("1:43 p.m.");
                                mTimesList.add("6:33 p.m.");
                                mTimesList.add("8:28 p.m.");
                                break;
                            case "Quincy Mall":
                                mTimesList.add("5:42 a.m.");
                                mTimesList.add("10:25 a.m.");
                                mTimesList.add("1:50 p.m.");
                                mTimesList.add("6:40 p.m.");
                                mTimesList.add("8:35 p.m.");
                                break;
                            case "Quincy Walmart":
                                mTimesList.add("5:45 a.m.");
                                mTimesList.add("10:28 a.m.");
                                mTimesList.add("1:53 p.m.");
                                mTimesList.add("6:43 p.m.");
                                mTimesList.add("8:38 p.m.");
                                break;
                            case "Malden Underpass":
                                mTimesList.add("6:05 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("2:08 p.m.");
                                mTimesList.add("6:55 p.m.");
                                mTimesList.add("8:52 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:12 a.m.");
                                mTimesList.add("10:55 a.m.");
                                mTimesList.add("2:16 p.m.");
                                mTimesList.add("7:02 p.m.");
                                mTimesList.add("8:59 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("11:10 a.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i).toString();

        return mTimes;
    }

    protected static String[] getTimes22Q(String mDay, String mDirection, String mTimepoint) {

        ArrayList mTimesList = new ArrayList();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("4:30 a.m.");
                                mTimesList.add("5:30 a.m.");
                                mTimesList.add("5:45 a.m.");
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("1:45 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("3:45 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("5:45 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("7:30 p.m.");
                                mTimesList.add("9:20 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("4:37 a.m.");
                                mTimesList.add("5:37 a.m.");
                                mTimesList.add("5:57 a.m.");
                                mTimesList.add("6:27 a.m.");
                                mTimesList.add("6:57 a.m.");
                                mTimesList.add("7:27 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("8:27 a.m.");
                                mTimesList.add("8:57 a.m.");
                                mTimesList.add("9:27 a.m.");
                                mTimesList.add("9:57 a.m.");
                                mTimesList.add("10:27 a.m.");
                                mTimesList.add("10:57 a.m.");
                                mTimesList.add("11:27 a.m.");
                                mTimesList.add("11:57 a.m.");
                                mTimesList.add("12:27 p.m.");
                                mTimesList.add("12:57 p.m.");
                                mTimesList.add("1:57 p.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("2:57 p.m.");
                                mTimesList.add("3:27 p.m.");
                                mTimesList.add("3:57 p.m.");
                                mTimesList.add("4:27 p.m.");
                                mTimesList.add("4:57 p.m.");
                                mTimesList.add("5:27 p.m.");
                                mTimesList.add("5:57 p.m.");
                                mTimesList.add("6:57 p.m.");
                                mTimesList.add("7:42 p.m.");
                                mTimesList.add("9:31 p.m.");
                                mTimesList.add("11:27 p.m.");
                                break;
                            case "Malden Underpass":
                                mTimesList.add("4:47 a.m.");
                                mTimesList.add("5:47 a.m.");
                                mTimesList.add("6:07 a.m.");
                                mTimesList.add("6:37 a.m.");
                                mTimesList.add("7:07 a.m.");
                                mTimesList.add("7:37 a.m.");
                                mTimesList.add("8:07 a.m.");
                                mTimesList.add("8:37 a.m.");
                                mTimesList.add("9:07 a.m.");
                                mTimesList.add("9:37 a.m.");
                                mTimesList.add("10:07 a.m.");
                                mTimesList.add("10:37 a.m.");
                                mTimesList.add("11:07 a.m.");
                                mTimesList.add("11:37 a.m.");
                                mTimesList.add("12:07 p.m.");
                                mTimesList.add("12:37 p.m.");
                                mTimesList.add("1:07 p.m.");
                                mTimesList.add("2:07 p.m.");
                                mTimesList.add("2:37 p.m.");
                                mTimesList.add("3:07 p.m.");
                                mTimesList.add("3:37 p.m.");
                                mTimesList.add("4:07 p.m.");
                                mTimesList.add("4:37 p.m.");
                                mTimesList.add("5:07 p.m.");
                                mTimesList.add("5:37 p.m.");
                                mTimesList.add("6:07 p.m.");
                                mTimesList.add("7:07 p.m.");
                                mTimesList.add("7:52 p.m.");
                                mTimesList.add("9:41 p.m.");
                                mTimesList.add("11:37 p.m.");
                                break;
                            case "Quincy Mall":
                                mTimesList.add("5:05 a.m.");
                                mTimesList.add("6:05 a.m.");
                                mTimesList.add("6:25 a.m.");
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("7:25 a.m.");
                                mTimesList.add("7:55 a.m.");
                                mTimesList.add("8:25 a.m.");
                                mTimesList.add("8:55 a.m.");
                                mTimesList.add("9:25 a.m.");
                                mTimesList.add("9:55 a.m.");
                                mTimesList.add("10:25 a.m.");
                                mTimesList.add("10:55 a.m.");
                                mTimesList.add("11:25 a.m.");
                                mTimesList.add("11:55 a.m.");
                                mTimesList.add("12:25 p.m.");
                                mTimesList.add("12:55 p.m.");
                                mTimesList.add("1:25 p.m.");
                                mTimesList.add("2:25 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("3:25 p.m.");
                                mTimesList.add("3:55 p.m.");
                                mTimesList.add("4:25 p.m.");
                                mTimesList.add("4:55 p.m.");
                                mTimesList.add("5:25 p.m.");
                                mTimesList.add("5:55 p.m.");
                                mTimesList.add("6:25 p.m.");
                                mTimesList.add("7:25 p.m.");
                                mTimesList.add("8:10 p.m.");
                                mTimesList.add("9:55 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Quincy Walmart":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("8:15 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("11:52 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Quincy Walmart":
                                mTimesList.add("-");
                                mTimesList.add("6:33 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("10:33 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("2:33 p.m.");
                                mTimesList.add("3:33 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:33 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("8:18 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("12:00 a.m.");
                                break;
                            case "Quincy Mall":
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("7:33 a.m.");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("8:33 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("9:33 a.m.");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("11:10 a.m.");
                                mTimesList.add("11:33 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("12:33 p.m.");
                                mTimesList.add("1:10 p.m.");
                                mTimesList.add("1:33 p.m.");
                                mTimesList.add("2:10 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("5:33 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("6:33 p.m.");
                                mTimesList.add("7:00 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:17 p.m.");
                                mTimesList.add("10:35 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Malden Underpass":
                                mTimesList.add("6:20 a.m.");
                                mTimesList.add("6:51 a.m.");
                                mTimesList.add("7:20 a.m.");
                                mTimesList.add("7:51 a.m.");
                                mTimesList.add("8:22 a.m.");
                                mTimesList.add("8:51 a.m.");
                                mTimesList.add("9:22 a.m.");
                                mTimesList.add("9:51 a.m.");
                                mTimesList.add("10:22 a.m.");
                                mTimesList.add("10:51 a.m.");
                                mTimesList.add("11:32 a.m.");
                                mTimesList.add("11:51 a.m.");
                                mTimesList.add("12:22 p.m.");
                                mTimesList.add("12:51 p.m.");
                                mTimesList.add("1:32 p.m.");
                                mTimesList.add("1:51 p.m.");
                                mTimesList.add("2:32 p.m.");
                                mTimesList.add("2:51 p.m.");
                                mTimesList.add("3:51 p.m.");
                                mTimesList.add("4:22 p.m.");
                                mTimesList.add("4:51 p.m.");
                                mTimesList.add("5:22 p.m.");
                                mTimesList.add("5:51 p.m.");
                                mTimesList.add("6:22 p.m.");
                                mTimesList.add("6:51 p.m.");
                                mTimesList.add("7:22 p.m.");
                                mTimesList.add("8:36 p.m.");
                                mTimesList.add("8:37 p.m.");
                                mTimesList.add("10:52 p.m.");
                                mTimesList.add("12:18 a.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:33 a.m.");
                                mTimesList.add("7:01 a.m.");
                                mTimesList.add("7:33 a.m.");
                                mTimesList.add("8:01 a.m.");
                                mTimesList.add("8:32 a.m.");
                                mTimesList.add("9:01 a.m.");
                                mTimesList.add("9:32 a.m.");
                                mTimesList.add("10:01 a.m.");
                                mTimesList.add("10:32 a.m.");
                                mTimesList.add("11:01 a.m.");
                                mTimesList.add("11:42 a.m.");
                                mTimesList.add("12:01 p.m.");
                                mTimesList.add("12:32 p.m.");
                                mTimesList.add("1:01 p.m.");
                                mTimesList.add("1:42 p.m.");
                                mTimesList.add("2:01 p.m.");
                                mTimesList.add("2:42 p.m.");
                                mTimesList.add("3:01 p.m.");
                                mTimesList.add("4:01 p.m.");
                                mTimesList.add("4:32 p.m.");
                                mTimesList.add("5:01 p.m.");
                                mTimesList.add("5:32 p.m.");
                                mTimesList.add("6:01 p.m.");
                                mTimesList.add("6:32 p.m.");
                                mTimesList.add("7:01 p.m.");
                                mTimesList.add("7:32 p.m.");
                                mTimesList.add("8:46 p.m.");
                                mTimesList.add("8:47 p.m.");
                                mTimesList.add("11:02 p.m.");
                                mTimesList.add("12:28 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:15 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("9:45 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:15 a.m.");
                                mTimesList.add("11:55 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("1:55 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("5:45 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("7:45 p.m.");
                                mTimesList.add("9:00 p.m.");
                                mTimesList.add("9:00 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("12:42 a.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("4:15 a.m.");
                                mTimesList.add("5:15 a.m.");
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("4:15 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:20 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("4:27 a.m.");
                                mTimesList.add("5:27 a.m.");
                                mTimesList.add("6:27 a.m.");
                                mTimesList.add("6:57 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("8:27 a.m.");
                                mTimesList.add("8:57 a.m.");
                                mTimesList.add("9:27 a.m.");
                                mTimesList.add("10:27 a.m.");
                                mTimesList.add("10:57 a.m.");
                                mTimesList.add("11:57 a.m.");
                                mTimesList.add("12:27 p.m.");
                                mTimesList.add("12:57 p.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("3:27 p.m.");
                                mTimesList.add("4:27 p.m.");
                                mTimesList.add("4:57 p.m.");
                                mTimesList.add("5:27 p.m.");
                                mTimesList.add("6:27 p.m.");
                                mTimesList.add("7:27 p.m.");
                                mTimesList.add("9:31 p.m.");
                                mTimesList.add("11:24 p.m.");
                                break;
                            case "Malden Underpass":
                                mTimesList.add("4:37 a.m.");
                                mTimesList.add("5:37 a.m.");
                                mTimesList.add("6:37 a.m.");
                                mTimesList.add("7:07 a.m.");
                                mTimesList.add("8:07 a.m.");
                                mTimesList.add("8:37 a.m.");
                                mTimesList.add("9:07 a.m.");
                                mTimesList.add("9:37 a.m.");
                                mTimesList.add("10:37 a.m.");
                                mTimesList.add("11:07 a.m.");
                                mTimesList.add("12:07 p.m.");
                                mTimesList.add("12:37 p.m.");
                                mTimesList.add("1:07 p.m.");
                                mTimesList.add("2:37 p.m.");
                                mTimesList.add("3:37 p.m.");
                                mTimesList.add("4:37 p.m.");
                                mTimesList.add("5:07 p.m.");
                                mTimesList.add("5:37 p.m.");
                                mTimesList.add("6:37 p.m.");
                                mTimesList.add("7:37 p.m.");
                                mTimesList.add("9:41 p.m.");
                                mTimesList.add("11:33 p.m.");
                                break;
                            case "Quincy Mall":
                                mTimesList.add("4:55 a.m.");
                                mTimesList.add("5:55 a.m.");
                                mTimesList.add("6:55 a.m.");
                                mTimesList.add("7:25 a.m.");
                                mTimesList.add("8:25 a.m.");
                                mTimesList.add("8:55 a.m.");
                                mTimesList.add("9:25 a.m.");
                                mTimesList.add("9:55 a.m.");
                                mTimesList.add("10:55 a.m.");
                                mTimesList.add("11:25 a.m.");
                                mTimesList.add("12:25 p.m.");
                                mTimesList.add("12:55 p.m.");
                                mTimesList.add("1:25 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("3:55 p.m.");
                                mTimesList.add("4:55 p.m.");
                                mTimesList.add("5:25 p.m.");
                                mTimesList.add("5:55 p.m.");
                                mTimesList.add("6:55 p.m.");
                                mTimesList.add("7:55 p.m.");
                                mTimesList.add("9:55 p.m.");
                                mTimesList.add("11:48 p.m.");
                                break;
                            case "Quincy Walmart":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("8:30 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("8:00 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("11:51 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Quincy Walmart":
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("7:33 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:33 a.m.");
                                mTimesList.add("9:33 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("11:33 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:33 p.m.");
                                mTimesList.add("1:33 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:03 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:33 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("8:03 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("11:54 p.m.");
                                break;
                            case "Quincy Mall":
                                mTimesList.add("6:00 a.m.");
                                mTimesList.add("7:00 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:00 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("10:00 a.m.");
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("7:00 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("8:10 p.m.");
                                mTimesList.add("10:35 p.m.");
                                mTimesList.add("-");
                                break;
                            case "Malden Underpass":
                                mTimesList.add("6:20 a.m.");
                                mTimesList.add("7:20 a.m.");
                                mTimesList.add("7:51 a.m.");
                                mTimesList.add("8:20 a.m.");
                                mTimesList.add("8:51 a.m.");
                                mTimesList.add("9:51 a.m.");
                                mTimesList.add("10:22 a.m.");
                                mTimesList.add("11:22 a.m.");
                                mTimesList.add("11:51 a.m.");
                                mTimesList.add("12:22 p.m.");
                                mTimesList.add("12:51 p.m.");
                                mTimesList.add("1:51 p.m.");
                                mTimesList.add("2:22 p.m.");
                                mTimesList.add("4:21 p.m.");
                                mTimesList.add("4:22 p.m.");
                                mTimesList.add("5:51 p.m.");
                                mTimesList.add("6:22 p.m.");
                                mTimesList.add("7:22 p.m.");
                                mTimesList.add("8:21 p.m.");
                                mTimesList.add("8:32 p.m.");
                                mTimesList.add("10:52 p.m.");
                                mTimesList.add("12:09 a.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:33 a.m.");
                                mTimesList.add("7:33 a.m.");
                                mTimesList.add("8:01 a.m.");
                                mTimesList.add("8:33 a.m.");
                                mTimesList.add("9:01 a.m.");
                                mTimesList.add("10:01 a.m.");
                                mTimesList.add("10:32 a.m.");
                                mTimesList.add("11:32 a.m.");
                                mTimesList.add("12:01 p.m.");
                                mTimesList.add("12:32 p.m.");
                                mTimesList.add("1:01 p.m.");
                                mTimesList.add("2:01 p.m.");
                                mTimesList.add("2:32 p.m.");
                                mTimesList.add("4:31 p.m.");
                                mTimesList.add("4:32 p.m.");
                                mTimesList.add("6:01 p.m.");
                                mTimesList.add("6:32 p.m.");
                                mTimesList.add("7:32 p.m.");
                                mTimesList.add("8:31 p.m.");
                                mTimesList.add("8:42 p.m.");
                                mTimesList.add("11:02 p.m.");
                                mTimesList.add("12:17 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("7:45 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("9:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:45 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("1:15 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("2:45 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("4:45 p.m.");
                                mTimesList.add("6:15 p.m.");
                                mTimesList.add("6:45 p.m.");
                                mTimesList.add("7:45 p.m.");
                                mTimesList.add("8:45 p.m.");
                                mTimesList.add("8:55 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("12:29 a.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Sunday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("4:25 a.m.");
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("8:40 a.m.");
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("2:15 p.m.");
                                mTimesList.add("5:25 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("4:35 a.m.");
                                mTimesList.add("6:41 a.m.");
                                mTimesList.add("8:52 a.m.");
                                mTimesList.add("10:42 a.m.");
                                mTimesList.add("12:12 p.m.");
                                mTimesList.add("2:27 p.m.");
                                mTimesList.add("5:33 p.m.");
                                mTimesList.add("7:24 p.m.");
                                mTimesList.add("9:24 p.m.");
                                mTimesList.add("11:24 p.m.");
                                break;
                            case "Malden Underpass":
                                mTimesList.add("4:45 a.m.");
                                mTimesList.add("6:49 a.m.");
                                mTimesList.add("9:00 a.m.");
                                mTimesList.add("10:52 a.m.");
                                mTimesList.add("12:22 p.m.");
                                mTimesList.add("2:36 p.m.");
                                mTimesList.add("5:42 p.m.");
                                mTimesList.add("7:32 p.m.");
                                mTimesList.add("9:35 p.m.");
                                mTimesList.add("11:32 p.m.");
                                break;
                            case "Quincy Walmart":
                                mTimesList.add("4:57 a.m.");
                                mTimesList.add("7:05 a.m.");
                                mTimesList.add("9:20 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("12:42 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("5:53 p.m.");
                                mTimesList.add("7:47 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("-");
                                break;
                            case "Quincy Mall":
                                mTimesList.add("5:00 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("9:23 a.m.");
                                mTimesList.add("11:07 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("2:50 p.m.");
                                mTimesList.add("5:56 p.m.");
                                mTimesList.add("7:50 p.m.");
                                mTimesList.add("9:50 p.m.");
                                mTimesList.add("11:47 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Quincy Mall":
                                mTimesList.add("5:42 a.m.");
                                mTimesList.add("-");
                                mTimesList.add("10:25 a.m.");
                                mTimesList.add("11:17 a.m.");
                                mTimesList.add("1:50 p.m.");
                                mTimesList.add("2:50 p.m.");
                                mTimesList.add("6:40 p.m.");
                                mTimesList.add("8:35 p.m.");
                                mTimesList.add("10:25 p.m.");
                                mTimesList.add("11:50 p.m.");
                                break;
                            case "Quincy Walmart":
                                mTimesList.add("5:45 a.m.");
                                mTimesList.add("7:17 a.m.");
                                mTimesList.add("10:28 a.m.");
                                mTimesList.add("11:23 a.m.");
                                mTimesList.add("1:53 p.m.");
                                mTimesList.add("2:55 p.m.");
                                mTimesList.add("6:43 p.m.");
                                mTimesList.add("8:38 p.m.");
                                mTimesList.add("10:33 p.m.");
                                mTimesList.add("11:58 p.m.");
                                break;
                            case "Malden Underpass":
                                mTimesList.add("6:05 a.m.");
                                mTimesList.add("7:42 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("11:38 a.m.");
                                mTimesList.add("2:08 p.m.");
                                mTimesList.add("3:08 p.m.");
                                mTimesList.add("6:55 p.m.");
                                mTimesList.add("8:52 p.m.");
                                mTimesList.add("10:51 p.m.");
                                mTimesList.add("12:13 a.m.");
                                break;
                            case "Capitol Complex":
                                mTimesList.add("6:12 a.m.");
                                mTimesList.add("7:52 a.m.");
                                mTimesList.add("10:55 a.m.");
                                mTimesList.add("11:47 a.m.");
                                mTimesList.add("2:16 p.m.");
                                mTimesList.add("3:16 p.m.");
                                mTimesList.add("7:02 p.m.");
                                mTimesList.add("8:59 p.m.");
                                mTimesList.add("11:00 p.m.");
                                mTimesList.add("12:23 a.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("6:30 a.m.");
                                mTimesList.add("8:10 a.m.");
                                mTimesList.add("11:10 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                mTimesList.add("12:35 a.m.");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i).toString();

        return mTimes;
    }

    protected static String[] getTimes23(String mDay, String mDirection, String mTimepoint) {

        ArrayList mTimesList = new ArrayList();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("5:30 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:20 p.m.");
                                break;
                            case "Lilly St":
                                mTimesList.add("5:39 a.m.");
                                mTimesList.add("7:39 a.m.");
                                mTimesList.add("9:39 a.m.");
                                mTimesList.add("11:39 a.m.");
                                mTimesList.add("3:24 p.m.");
                                mTimesList.add("5:24 p.m.");
                                mTimesList.add("7:24 p.m.");
                                mTimesList.add("9:29 p.m.");
                                break;
                            case "Dutch Rd":
                                mTimesList.add("5:42 a.m.");
                                mTimesList.add("7:42 a.m.");
                                mTimesList.add("9:42 a.m.");
                                mTimesList.add("11:42 a.m.");
                                mTimesList.add("3:27 p.m.");
                                mTimesList.add("5:27 p.m.");
                                mTimesList.add("7:27 p.m.");
                                mTimesList.add("9:32 p.m.");
                                break;
                            case "Coopers Creek":
                                mTimesList.add("5:49 a.m.");
                                mTimesList.add("7:49 a.m.");
                                mTimesList.add("9:49 a.m.");
                                mTimesList.add("11:49 a.m.");
                                mTimesList.add("3:34 p.m.");
                                mTimesList.add("5:34 p.m.");
                                mTimesList.add("7:34 p.m.");
                                mTimesList.add("9:39 p.m.");
                                break;
                            case "Frame Rd to Crossings Mall":
                                mTimesList.add("5:57 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("9:57 a.m.");
                                mTimesList.add("11:57 a.m.");
                                mTimesList.add("3:42 p.m.");
                                mTimesList.add("5:42 p.m.");
                                mTimesList.add("7:42 p.m.");
                                mTimesList.add("9:47 p.m.");
                                break;
                            case "Crossings Mall":
                                mTimesList.add("6:02 a.m.");
                                mTimesList.add("8:02 a.m.");
                                mTimesList.add("10:02 a.m.");
                                mTimesList.add("12:02 p.m.");
                                mTimesList.add("3:47 p.m.");
                                mTimesList.add("5:47 p.m.");
                                mTimesList.add("7:47 p.m.");
                                mTimesList.add("9:52 p.m.");
                                break;
                            case "Frame Rd from Crossings Mall":
                                mTimesList.add("6:07 a.m.");
                                mTimesList.add("8:07 a.m.");
                                mTimesList.add("10:07 a.m.");
                                mTimesList.add("12:07 p.m.");
                                mTimesList.add("3:52 p.m.");
                                mTimesList.add("5:52 p.m.");
                                mTimesList.add("7:52 p.m.");
                                mTimesList.add("9:57 p.m.");
                                break;
                            case "Jordan Creek":
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("8:00 p.m.");
                                mTimesList.add("10:05 p.m.");
                                break;
                            case "Clendenin":
                                mTimesList.add("6:24 a.m.");
                                mTimesList.add("8:24 a.m.");
                                mTimesList.add("10:24 a.m.");
                                mTimesList.add("12:24 p.m.");
                                mTimesList.add("4:09 p.m.");
                                mTimesList.add("6:09 p.m.");
                                mTimesList.add("8:09 p.m.");
                                mTimesList.add("10:14 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Clendenin":
                                mTimesList.add("6:36 a.m.");
                                mTimesList.add("8:36 a.m.");
                                mTimesList.add("10:36 a.m.");
                                mTimesList.add("12:36 p.m.");
                                mTimesList.add("4:21 p.m.");
                                mTimesList.add("6:21 p.m.");
                                mTimesList.add("8:21 p.m.");
                                mTimesList.add("10:21 p.m.");
                                break;
                            case "Jordan Creek":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("6:30 p.m.");
                                mTimesList.add("8:30 p.m.");
                                mTimesList.add("10:30 p.m.");
                                break;
                            case "Frame Rd to Crossings Mall":
                                mTimesList.add("6:53 a.m.");
                                mTimesList.add("8:53 a.m.");
                                mTimesList.add("10:53 a.m.");
                                mTimesList.add("12:53 p.m.");
                                mTimesList.add("4:38 p.m.");
                                mTimesList.add("6:38 p.m.");
                                mTimesList.add("8:38 p.m.");
                                mTimesList.add("10:38 p.m.");
                                break;
                            case "Crossings Mall":
                                mTimesList.add("6:58 a.m.");
                                mTimesList.add("8:58 a.m.");
                                mTimesList.add("10:58 a.m.");
                                mTimesList.add("12:58 p.m.");
                                mTimesList.add("4:43 p.m.");
                                mTimesList.add("6:43 p.m.");
                                mTimesList.add("8:43 p.m.");
                                mTimesList.add("10:43 p.m.");
                                break;
                            case "Frame Rd from Crossings Mall":
                                mTimesList.add("7:03 a.m.");
                                mTimesList.add("9:03 a.m.");
                                mTimesList.add("11:03 a.m.");
                                mTimesList.add("1:03 p.m.");
                                mTimesList.add("4:48 p.m.");
                                mTimesList.add("6:48 p.m.");
                                mTimesList.add("8:48 p.m.");
                                mTimesList.add("10:48 p.m.");
                                break;
                            case "Coopers Creek":
                                mTimesList.add("7:11 a.m.");
                                mTimesList.add("9:11 a.m.");
                                mTimesList.add("11:11 a.m.");
                                mTimesList.add("1:11 p.m.");
                                mTimesList.add("4:56 p.m.");
                                mTimesList.add("6:56 p.m.");
                                mTimesList.add("8:56 p.m.");
                                mTimesList.add("10:56 p.m.");
                                break;
                            case "Dutch Rd":
                                mTimesList.add("7:18 a.m.");
                                mTimesList.add("9:18 a.m.");
                                mTimesList.add("11:18 a.m.");
                                mTimesList.add("1:18 p.m.");
                                mTimesList.add("5:03 p.m.");
                                mTimesList.add("7:03 p.m.");
                                mTimesList.add("9:03 p.m.");
                                mTimesList.add("11:03 p.m.");
                                break;
                            case "Lilly St":
                                mTimesList.add("7:21 a.m.");
                                mTimesList.add("9:21 a.m.");
                                mTimesList.add("11:21 a.m.");
                                mTimesList.add("1:21 p.m.");
                                mTimesList.add("5:06 p.m.");
                                mTimesList.add("7:06 p.m.");
                                mTimesList.add("9:06 p.m.");
                                mTimesList.add("11:06 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (mDirection) {
                    case "Outbound":
                        switch (mTimepoint) {
                            case "Laidley Transit Mall":
                                mTimesList.add("5:30 a.m.");
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("3:15 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:20 p.m.");
                                break;
                            case "Lilly St":
                                mTimesList.add("5:39 a.m.");
                                mTimesList.add("7:39 a.m.");
                                mTimesList.add("9:39 a.m.");
                                mTimesList.add("11:39 a.m.");
                                mTimesList.add("3:24 p.m.");
                                mTimesList.add("5:24 p.m.");
                                mTimesList.add("7:24 p.m.");
                                mTimesList.add("9:29 p.m.");
                                break;
                            case "Dutch Rd":
                                mTimesList.add("5:42 a.m.");
                                mTimesList.add("7:42 a.m.");
                                mTimesList.add("9:42 a.m.");
                                mTimesList.add("11:42 a.m.");
                                mTimesList.add("3:27 p.m.");
                                mTimesList.add("5:27 p.m.");
                                mTimesList.add("7:27 p.m.");
                                mTimesList.add("9:32 p.m.");
                                break;
                            case "Coopers Creek":
                                mTimesList.add("5:49 a.m.");
                                mTimesList.add("7:49 a.m.");
                                mTimesList.add("9:49 a.m.");
                                mTimesList.add("11:49 a.m.");
                                mTimesList.add("3:34 p.m.");
                                mTimesList.add("5:34 p.m.");
                                mTimesList.add("7:34 p.m.");
                                mTimesList.add("9:39 p.m.");
                                break;
                            case "Frame Rd to Crossings Mall":
                                mTimesList.add("5:57 a.m.");
                                mTimesList.add("7:57 a.m.");
                                mTimesList.add("9:57 a.m.");
                                mTimesList.add("11:57 a.m.");
                                mTimesList.add("3:42 p.m.");
                                mTimesList.add("5:42 p.m.");
                                mTimesList.add("7:42 p.m.");
                                mTimesList.add("9:47 p.m.");
                                break;
                            case "Crossings Mall":
                                mTimesList.add("6:02 a.m.");
                                mTimesList.add("8:02 a.m.");
                                mTimesList.add("10:02 a.m.");
                                mTimesList.add("12:02 p.m.");
                                mTimesList.add("3:47 p.m.");
                                mTimesList.add("5:47 p.m.");
                                mTimesList.add("7:47 p.m.");
                                mTimesList.add("9:52 p.m.");
                                break;
                            case "Frame Rd from Crossings Mall":
                                mTimesList.add("6:07 a.m.");
                                mTimesList.add("8:07 a.m.");
                                mTimesList.add("10:07 a.m.");
                                mTimesList.add("12:07 p.m.");
                                mTimesList.add("3:52 p.m.");
                                mTimesList.add("5:52 p.m.");
                                mTimesList.add("7:52 p.m.");
                                mTimesList.add("9:57 p.m.");
                                break;
                            case "Jordan Creek":
                                mTimesList.add("6:15 a.m.");
                                mTimesList.add("8:15 a.m.");
                                mTimesList.add("10:15 a.m.");
                                mTimesList.add("12:15 p.m.");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                mTimesList.add("8:00 p.m.");
                                mTimesList.add("10:05 p.m.");
                                break;
                            case "Clendenin":
                                mTimesList.add("6:24 a.m.");
                                mTimesList.add("8:24 a.m.");
                                mTimesList.add("10:24 a.m.");
                                mTimesList.add("12:24 p.m.");
                                mTimesList.add("4:09 p.m.");
                                mTimesList.add("6:09 p.m.");
                                mTimesList.add("8:09 p.m.");
                                mTimesList.add("10:14 p.m.");
                                break;
                        }
                        break;
                    case "Inbound":
                        switch (mTimepoint) {
                            case "Clendenin":
                                mTimesList.add("6:36 a.m.");
                                mTimesList.add("8:36 a.m.");
                                mTimesList.add("10:36 a.m.");
                                mTimesList.add("12:36 p.m.");
                                mTimesList.add("4:21 p.m.");
                                mTimesList.add("6:21 p.m.");
                                mTimesList.add("8:21 p.m.");
                                mTimesList.add("10:21 p.m.");
                                break;
                            case "Jordan Creek":
                                mTimesList.add("6:45 a.m.");
                                mTimesList.add("8:45 a.m.");
                                mTimesList.add("10:45 a.m.");
                                mTimesList.add("12:45 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("6:30 p.m.");
                                mTimesList.add("8:30 p.m.");
                                mTimesList.add("10:30 p.m.");
                                break;
                            case "Frame Rd to Crossings Mall":
                                mTimesList.add("6:53 a.m.");
                                mTimesList.add("8:53 a.m.");
                                mTimesList.add("10:53 a.m.");
                                mTimesList.add("12:53 p.m.");
                                mTimesList.add("4:38 p.m.");
                                mTimesList.add("6:38 p.m.");
                                mTimesList.add("8:38 p.m.");
                                mTimesList.add("10:38 p.m.");
                                break;
                            case "Crossings Mall":
                                mTimesList.add("6:58 a.m.");
                                mTimesList.add("8:58 a.m.");
                                mTimesList.add("10:58 a.m.");
                                mTimesList.add("12:58 p.m.");
                                mTimesList.add("4:43 p.m.");
                                mTimesList.add("6:43 p.m.");
                                mTimesList.add("8:43 p.m.");
                                mTimesList.add("10:43 p.m.");
                                break;
                            case "Frame Rd from Crossings Mall":
                                mTimesList.add("7:03 a.m.");
                                mTimesList.add("9:03 a.m.");
                                mTimesList.add("11:03 a.m.");
                                mTimesList.add("1:03 p.m.");
                                mTimesList.add("4:48 p.m.");
                                mTimesList.add("6:48 p.m.");
                                mTimesList.add("8:48 p.m.");
                                mTimesList.add("10:48 p.m.");
                                break;
                            case "Coopers Creek":
                                mTimesList.add("7:11 a.m.");
                                mTimesList.add("9:11 a.m.");
                                mTimesList.add("11:11 a.m.");
                                mTimesList.add("1:11 p.m.");
                                mTimesList.add("4:56 p.m.");
                                mTimesList.add("6:56 p.m.");
                                mTimesList.add("8:56 p.m.");
                                mTimesList.add("10:56 p.m.");
                                break;
                            case "Dutch Rd":
                                mTimesList.add("7:18 a.m.");
                                mTimesList.add("9:18 a.m.");
                                mTimesList.add("11:18 a.m.");
                                mTimesList.add("1:18 p.m.");
                                mTimesList.add("5:03 p.m.");
                                mTimesList.add("7:03 p.m.");
                                mTimesList.add("9:03 p.m.");
                                mTimesList.add("11:03 p.m.");
                                break;
                            case "Lilly St":
                                mTimesList.add("7:21 a.m.");
                                mTimesList.add("9:21 a.m.");
                                mTimesList.add("11:21 a.m.");
                                mTimesList.add("1:21 p.m.");
                                mTimesList.add("5:06 p.m.");
                                mTimesList.add("7:06 p.m.");
                                mTimesList.add("9:06 p.m.");
                                mTimesList.add("11:06 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("7:30 a.m.");
                                mTimesList.add("9:30 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("5:15 p.m.");
                                mTimesList.add("7:15 p.m.");
                                mTimesList.add("9:15 p.m.");
                                mTimesList.add("11:15 p.m.");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i).toString();

        return mTimes;
    }

    protected static String[] getTimes19(String mDay, String mDirection, String mTimepoint) {

        ArrayList mTimesList = new ArrayList();

        switch (mDay) {
            case "Monday-Friday":
                switch (mDirection) {
                    case "Loop":
                        switch (mTimepoint) {
                            case "Lee St at Maryland Ave (start route)":
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("2:30 p.m.\n(To Transit Mall only");
                                mTimesList.add("-");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("10:36 a.m.");
                                mTimesList.add("11:36 a.m.");
                                mTimesList.add("12:36 p.m.");
                                mTimesList.add("1:36 p.m.");
                                mTimesList.add("2:36 p.m.\n(End of route)");
                                mTimesList.add("3:06 p.m.");
                                mTimesList.add("4:06 p.m.");
                                mTimesList.add("5:06 p.m.");
                                break;
                            case "Capitol Market (eastbound)":
                                mTimesList.add("10:42 a.m.");
                                mTimesList.add("11:42 a.m.");
                                mTimesList.add("12:42 p.m.");
                                mTimesList.add("1:42 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("4:12 p.m.");
                                mTimesList.add("5:12 p.m.");
                                break;
                            case "California Ave at Washington St":
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "Quarrier St at Capitol St":
                                mTimesList.add("11:08 a.m.");
                                mTimesList.add("12:08 p.m.");
                                mTimesList.add("1:08 p.m.");
                                mTimesList.add("2:08 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:38 p.m.");
                                mTimesList.add("4:38 p.m.");
                                mTimesList.add("5:38 p.m.");
                                break;
                            case "Capitol Market (westbound)":
                                mTimesList.add("11:12 a.m.");
                                mTimesList.add("12:12 p.m.");
                                mTimesList.add("1:12 p.m.");
                                mTimesList.add("2:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:42 p.m.");
                                mTimesList.add("4:42 p.m.");
                                mTimesList.add("5:42 p.m.");
                                break;
                            case "Bigley Ave at Ash St":
                                mTimesList.add("11:20 a.m.");
                                mTimesList.add("12:20 p.m.");
                                mTimesList.add("1:20 p.m.");
                                mTimesList.add("2:20 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:50 p.m.");
                                mTimesList.add("4:50 p.m.");
                                mTimesList.add("5:50 p.m.");
                                break;
                            case "Lee St at Maryland Ave (end route)":
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                break;
                        }
                        break;
                }
                break;
            case "Saturday":
                switch (mDirection) {
                    case "Loop":
                        switch (mTimepoint) {
                            case "Lee St at Maryland Ave (start route)":
                                mTimesList.add("10:30 a.m.");
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("2:30 p.m.\n(To Transit Mall only)");
                                mTimesList.add("-");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                break;
                            case "Laidley Transit Mall":
                                mTimesList.add("10:36 a.m.");
                                mTimesList.add("11:36 a.m.");
                                mTimesList.add("12:36 p.m.");
                                mTimesList.add("1:36 p.m.");
                                mTimesList.add("2:36 p.m.\n(End of route)");
                                mTimesList.add("3:06 p.m.");
                                mTimesList.add("4:06 p.m.");
                                mTimesList.add("5:06 p.m.");
                                break;
                            case "Capitol Market (eastbound)":
                                mTimesList.add("10:42 a.m.");
                                mTimesList.add("11:42 a.m.");
                                mTimesList.add("12:42 p.m.");
                                mTimesList.add("1:42 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:12 p.m.");
                                mTimesList.add("4:12 p.m.");
                                mTimesList.add("5:12 p.m.");
                                break;
                            case "California Ave at Washington St":
                                mTimesList.add("11:00 a.m.");
                                mTimesList.add("12:00 p.m.");
                                mTimesList.add("1:00 p.m.");
                                mTimesList.add("2:00 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:30 p.m.");
                                mTimesList.add("4:30 p.m.");
                                mTimesList.add("5:30 p.m.");
                                break;
                            case "Quarrier St at Capitol St":
                                mTimesList.add("11:08 a.m.");
                                mTimesList.add("12:08 p.m.");
                                mTimesList.add("1:08 p.m.");
                                mTimesList.add("2:08 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:38 p.m.");
                                mTimesList.add("4:38 p.m.");
                                mTimesList.add("5:38 p.m.");
                                break;
                            case "Capitol Market (westbound)":
                                mTimesList.add("11:12 a.m.");
                                mTimesList.add("12:12 p.m.");
                                mTimesList.add("1:12 p.m.");
                                mTimesList.add("2:12 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:42 p.m.");
                                mTimesList.add("4:42 p.m.");
                                mTimesList.add("5:42 p.m.");
                                break;
                            case "Bigley Ave at Ash St":
                                mTimesList.add("11:20 a.m.");
                                mTimesList.add("12:20 p.m.");
                                mTimesList.add("1:20 p.m.");
                                mTimesList.add("2:20 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("3:50 p.m.");
                                mTimesList.add("4:50 p.m.");
                                mTimesList.add("5:50 p.m.");
                                break;
                            case "Lee St at Maryland Ave (end route)":
                                mTimesList.add("11:30 a.m.");
                                mTimesList.add("12:30 p.m.");
                                mTimesList.add("1:30 p.m.");
                                mTimesList.add("2:30 p.m.");
                                mTimesList.add("-");
                                mTimesList.add("4:00 p.m.");
                                mTimesList.add("5:00 p.m.");
                                mTimesList.add("6:00 p.m.");
                                break;
                        }
                        break;
                }
                break;
        }

        String[] mTimes = new String[mTimesList.size()];

        for (int i = 0; i < mTimes.length; i++)
            mTimes[i] = mTimesList.get(i).toString();

        return mTimes;
    }

}