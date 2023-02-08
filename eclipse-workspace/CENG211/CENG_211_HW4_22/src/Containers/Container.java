package Containers;

public class Container {
	private int i = 1;
	private String containerCode;
	private int volume;
	private String serialNumber;
	private Box box ; 
	

	
	public Container(int i, String containerCode, int volume, String serialNumber) {
		this.i = i;
		this.containerCode = containerCode;
		this.volume = volume;
		this.serialNumber = serialNumber;
	}
}
