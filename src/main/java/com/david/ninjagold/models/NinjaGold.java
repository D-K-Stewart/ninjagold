package com.david.ninjagold.models;

import java.util.ArrayList;

public class NinjaGold {
	
	public Integer gold;
	public ArrayList<String> activities;
	
	public NinjaGold() {
		this.gold = 0;
		this.activities = new ArrayList<String>();
		
	}
	
	public void pushActivity(String activity) {
		activities.add(activity);
	}

	public Integer getGold() {
		return gold;
	}

	public void setGold(Integer gold) {
		this.gold = gold;
	}

	public ArrayList<String> getActivity() {
		return activities;
	}

	public void setActivity(ArrayList<String> activity) {
		this.activities = activity;
	}
		

}
