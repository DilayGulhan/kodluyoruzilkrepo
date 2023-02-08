package Items;

public class Countable {
	private int i = 1;
	private String itemCode;
	private int volume;
	private String serialNumber;
	
	
	public Countable(int i, String itemCode, int volume, String serialNumber) {
		this.i = i;
		this.itemCode = itemCode;
		this.volume = volume;
		this.serialNumber = serialNumber;
	}
}
