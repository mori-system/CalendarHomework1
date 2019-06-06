package com.mori;

import static java.util.Calendar.DAY_OF_MONTH;
import java.util.GregorianCalendar;

public class Calendar {

    public static Object IsLeapYear(int i) {
	
	if (i % 4 == 0) {
	    
	    if (i % 100 == 0) {
		
		if (i % 400 == 0) {
		    
		    return true;
		}
		
		return false;
	    }
	    
	    return true;
	    
	}else {
	    
	    return false;
	}
    }

    public static Object GetDaysInMonth(int year, int month) {
	
	GregorianCalendar cld = new GregorianCalendar (year, month-1, 1);
	
	int days = cld.getActualMaximum(DAY_OF_MONTH);

	if (year > 9999) {
	    
	    return -1;
	
	}else if (month < 1 || month > 12) {
	    
	    return -1;
	}

	return days;
    }
}
