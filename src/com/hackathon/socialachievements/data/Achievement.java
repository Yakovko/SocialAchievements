package com.hackathon.socialachievements.data;

import java.util.UUID;

import android.graphics.Bitmap;

public class Achievement {
	
	private UUID uuid;
	private Bitmap icon;
	private String description;
	private Category mCategory;
	
	public UUID getUuid() {
		return uuid;
	}
	
	public String getDescription() {
		return description;
	}
	
	public Bitmap getIcon() {
		return icon;
	}

	public Category getmCategory() {
		return mCategory;
	}

	
	
	
	
	
	
	

}


