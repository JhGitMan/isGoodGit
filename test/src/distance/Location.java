package distance;

import java.math.BigDecimal;

public class Location {
	
	
	
	
	
	
	
	
	
	public static BigDecimal calcDist(LocationSubVo x, LocationSubVo y, String unit) {
		BigDecimal theta = x.getLon().subtract(y.getLon());		
		double dist = Math.sin(deg2rad(x.getLat())) * Math.sin(deg2rad(y.getLat())) + Math.cos(deg2rad(x.getLat())) * Math.cos(deg2rad(y.getLat())) * Math.cos(deg2rad(theta));
				
		dist = Math.acos(dist);
		BigDecimal bdDist = rad2degToBigDecimal(new BigDecimal(Double.toString(dist)));
		bdDist = bdDist.multiply(new BigDecimal("60")).multiply(new BigDecimal(1.1515));
		//dist = dist * 60 * 1.1515;
	         
	    if (unit == "km") {
	    	bdDist = bdDist.multiply(new BigDecimal("1.609344"));
	    } else if(unit == "m"){
	    	bdDist = bdDist.multiply(new BigDecimal("1609.344"));	    	
	    }

		return bdDist;		
	}
	
    // This function converts decimal degrees to radians
    private static double deg2rad(BigDecimal deg) {
    	BigDecimal pi = new BigDecimal(Double.toString(Math.PI));
    	
        return (deg.multiply(pi).divide(new BigDecimal("180"),10,BigDecimal.ROUND_CEILING)).doubleValue();
        //Exception in thread "main" java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
    }
     
    // This function converts radians to decimal degrees
    private static double rad2deg(BigDecimal rad) {
    	BigDecimal pi = new BigDecimal(Double.toString(Math.PI));
        return (rad.multiply(new BigDecimal("180").divide(pi,10,BigDecimal.ROUND_CEILING))).doubleValue();
        //Exception in thread "main" java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
    }
    
    private static BigDecimal rad2degToBigDecimal(BigDecimal rad) {
    	BigDecimal pi = new BigDecimal(Double.toString(Math.PI));
        return (rad.multiply(new BigDecimal("180").divide(pi,10,BigDecimal.ROUND_CEILING)));
        //Exception in thread "main" java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
    }
    
    
    
    
    
        /*double dist = Math.sin(deg2rad(x.getLat())) * Math.sin(deg2rad(y.getLat())) + Math.cos(deg2rad(x.getLat())) * Math.cos(deg2rad(y.getLat())) * Math.cos(deg2rad(theta));
         
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;
         
        if (unit == "km") {
            dist = dist * 1.609344;
        } else if(unit == "m"){
            dist = dist * 1609.344;
        }
 
        return (dist);
    }
     
	
	
	
	
	
	
	
	
	
	
	
 
    // This function converts decimal degrees to radians
    private static double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }
     
    // This function converts radians to decimal degrees
    private static double rad2deg(double rad) {
        return (rad * 180 / Math.PI);
    }*/
	
}
