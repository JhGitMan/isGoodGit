package test;

import distance.Location;
import distance.LocationSubVo;

public class test2 {

	public static void main(String[] args) throws Exception {
		Location l = new Location();
		
		LocationSubVo x = new LocationSubVo();
		LocationSubVo y = new LocationSubVo();
		
		x.setLat("38.56705910");
		x.setLon("128.3933973");
		
		y.setLat("38.56098550");
		y.setLon("128.4000921");
		
		System.out.println(l.calcDist(x, y, "m"));
		
		
		
	}
}
/*<trkpt lat="38.56705910" lon="128.3933973">
<ele>15.000000</ele>
<time>2010-01-01T00:00:00Z</time>
</trkpt>
<trkpt lat="38.56098550" lon="128.4000921">
<ele>27.600000</ele>
<time>2010-01-01T00:03:33Z</time>
</trkpt>
<trkpt lat="38.55766330" lon="128.4022808">
<ele>24.900000</ele>
<time>2010-01-01T00:05:13Z</time>
</trkpt>
<trkpt lat="38.55356900" lon="128.4031391">
<ele>19.100000</ele>
<time>2010-01-01T00:07:04Z</time>
</trkpt>
<trkpt lat="38.55236070" lon="128.4031391">
<ele>29.600000</ele>
<time>2010-01-01T00:07:36Z</time>
</trkpt>
*/
