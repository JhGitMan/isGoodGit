package distance;

import java.math.BigDecimal;

public class LocationSubVo {
 
	BigDecimal lat; //위도
	BigDecimal lon; //경도
	

	public LocationSubVo() {
		super();	
	}
	
	
	public LocationSubVo(BigDecimal lat, BigDecimal lon) {
		super();
		this.lat = lat;
		this.lon = lon;
	}
	
	
	public BigDecimal getLat() {
		return lat;
	}
	public void setLat(BigDecimal lat) {
		this.lat = lat;
	}
	public void setLat(String lat) {
		
		this.lat = new BigDecimal(lat);
	}
	
	
	public BigDecimal getLon() {
		return lon;
	}
	public void setLon(BigDecimal lon) {
		this.lon = lon;
	}
	
	public void setLon(String lon) {
		this.lon = new BigDecimal(lon);
	}
	
	
}
