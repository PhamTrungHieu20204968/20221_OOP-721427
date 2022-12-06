package hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Store {
	private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[20];
	private int qtyStored = 0;
	
	public void addDVD(DigitalVideoDisc disc) {
		if (qtyStored >= 20) {
			System.out.println("Your store is fulled");
		} else {
			itemsInStore[qtyStored] = disc;
			System.out.println("add successfull!");
			qtyStored++;
		}
	}
	
	public void removeDVD(DigitalVideoDisc disc) {
		if (qtyStored == 0) {
			System.out.println("Your cart is empty");
		} else {
			for (int i = 0; i < qtyStored; i++) {
				if (itemsInStore[i] == disc) {
					for (int j = i; j < qtyStored - 1; j++) {
						itemsInStore[j] = itemsInStore[j + 1];
					}
					break;
				}
			}
			System.out.println("remove successfull!");
			qtyStored--;
		}
	}
	
}
