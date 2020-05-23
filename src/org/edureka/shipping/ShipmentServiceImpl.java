package org.edureka.shipping;
import java.util.Scanner;

public class ShipmentServiceImpl implements IShipment {

	@Override
	public boolean addShipment() {
		Shipment shipment;
		int resId;
		
		Scanner in = new Scanner(System.in);
	     
	      System.out.println("Enter a resource id: ");
	      resId = in.nextInt();
	      //shipment.setResourceId(resId);
	      
	      //System.out.println("You entered integer " + a);
		
		return false;
	}

	@Override
	public boolean deleteShipment() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getShipment() {
		//Shipment ship;
		//ship.getChargeAmount();
		
		return false;
	}

}
