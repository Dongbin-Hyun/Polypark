package reporting;

import java.util.ArrayList;
import java.util.HashSet;

public class ReportTypeClass {
	
	
	int dayTicketCount;
	int nightTicketCount;
	int dayAdultCount;
	int dayTeenCount; 
	int dayChildCount;
	int dayOldCount; 
	int daybabyCount;
	int nightAdultCount;
	int nightTeenCount; 
	int nightChildCount; 
	int nightOldCount; 
	int nightbabyCount;
	int dayTicketTotalPrice;
	int nightTicketTotalPrice;
	
	
	HashSet<String> date_hash = new HashSet<>();
	ArrayList<String> date_al = new ArrayList<String>();
	ArrayList<Integer> dateTotalPrice_al = new ArrayList<>();
	
	
	int not_Discount_Count;
	int disable_Discount_Count; 
	int national_merit_Discount_Count; 
	int multichild_Discount_Count; 
	int pregnant_Discount_Count;
}
