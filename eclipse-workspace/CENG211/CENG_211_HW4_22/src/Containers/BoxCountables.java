package Containers;

public class BoxCountables extends Box {
	
	private int numberOfItems;
	
	

	
	public BoxCountables(int i, String boxCode, int numberOfItems, int volume, String serialNumber) {
		super(i , boxCode , volume , serialNumber );
		this.numberOfItems = numberOfItems;
	}
}
