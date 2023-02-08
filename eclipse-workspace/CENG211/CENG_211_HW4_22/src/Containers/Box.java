package Containers;

public  class Box {
private int number = 1 ;
private String itemCode ;
private int volume ;
private String serialNumber ;

public Box()  {
	itemCode = null ; 
	volume = 0;
	serialNumber = null ; 
}

public Box(int number , String itemCode , int volume , String serialNumber) {
	this.number = number; 
	this.itemCode = itemCode ;
	this.volume = volume ;
	this.serialNumber = serialNumber;
	
}
}
