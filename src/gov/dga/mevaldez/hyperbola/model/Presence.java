package gov.dga.mevaldez.hyperbola.model;

public class Presence {

	public Presence ONLINE;
	public Presence AWAY;
	public Presence DO_NOT_DISTURB;
	public Presence INVISIBLE;
	private String value;
	
	private Presence() {}
	
	@Override
	public String toString() {
		
		return value;
	}

}
