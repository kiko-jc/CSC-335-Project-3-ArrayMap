package model;

public class PunchCard {
	
	private int numVisits;
	
	public void punchCard() {
		this.numVisits = 1;
	}
	
	public void addVisit() {
		this.numVisits += 1;
	}
	
	public boolean isNthVisit(int n) {
		if (numVisits % n == 0) {
			return true;
		}
		return false;
	}
}
