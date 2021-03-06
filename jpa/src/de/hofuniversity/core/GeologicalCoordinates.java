package de.hofuniversity.core;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * 
 * @author Michael Jahn
 *
 */

@Embeddable
public class GeologicalCoordinates implements Serializable
{
    	@Column(name="c_longitude", nullable=false)
    	private double longitude;
    	@Column(name="c_latitude", nullable=false)
    	private double latitude;
    	
	public double getLongitude() {
	    return longitude;
	}

	public void setLongitude(double longitude) {
	    this.longitude = longitude;
	}

	public double getLatitude() {
	    return latitude;
	}

	public void setLatitude(double latitude) {
	    this.latitude = latitude;
	}
	
	@Override
	public String toString() {
	    return this.getLatitude() + ", " + this.getLongitude();
	}
}
