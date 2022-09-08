package com.genexus.properties;

import com.genexus.internet.*;

public class GXObjectProperties
{
	private Location location = null;
	private String errorMessage = "";
	private int errorCode = 0;
	private int statusCode = 0;
	
	public Location getLocation()
	{
		return location; 
	}
	public void setLocation(Location value)
	{
		location = value;
	}

	public int getErrorCode()
	{
		return errorCode; 
	}
	public void setErrorCode(int value)
	{
		errorCode = value;
	}

	public int getStatusCode()
	{
		return statusCode; 
	}
	public void setStatusCode(int value)
	{
		statusCode = value;
	}

	public String getErrorMessage()
	{
		return errorMessage; 
	}
	public void setErrorMessage(String value)
	{
		errorMessage = value;
	}
}