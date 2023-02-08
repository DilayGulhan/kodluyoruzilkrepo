package MarketShipment;

public abstract class Item {
	private String itemCode;
	private String serialNumber;
	
	public Item() {
		this(null, null);
	}	
	
	public Item(String itemCode, String serialNumber) {
		this.itemCode = itemCode;
		this.serialNumber = serialNumber;
	}
	
	public Item(Item item) {
		itemCode=item.itemCode;
		serialNumber=item.serialNumber;
	}


	public String getItemCode() {
		return itemCode;
	}


	public String getSerialNumber() {
		return serialNumber;
	}


	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}


	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
}
