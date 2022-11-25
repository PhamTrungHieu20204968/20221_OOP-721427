
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered >= MAX_NUMBERS_ORDERED) {
			System.out.println("Your cart is fulled");
		} else {
			itemOrdered[qtyOrdered] = disc;
			System.out.println("add successfull!");
			qtyOrdered++;
		}
	}


		if (qtyOrdered + 2 >= MAX_NUMBERS_ORDERED) {
			System.out.println("Your cart will overload");
		} else {
			itemOrdered[qtyOrdered] = dvd1;
			qtyOrdered++;
			itemOrdered[qtyOrdered] = dvd2;

			qtyOrdered++;
			System.out.println("add successfull!");
		}
	}


	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == 0) {
			System.out.println("Your cart is empty");
		} else {
			for (int i = 0; i < qtyOrdered; i++) {
				if (itemOrdered[i] == disc) {
					for (int j = i; j < qtyOrdered - 1; j++) {
						itemOrdered[j] = itemOrdered[j + 1];
					}
					break;
				}
			}
			System.out.println("remove successfull!");
			qtyOrdered--;
		}
	}

	public float totalCost() {
		float total = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			total = (float) total + this.itemOrdered[i].getCost();
		}
		return total;
	}

	public void displayCart() {
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.println(itemOrdered[i].toString());
		}
	}
	
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for (int i = 0; i < qtyOrdered; i++) {
			System.out.print(i+1 +".");
			System.out.println(itemOrdered[i].toString());
		}	
		System.out.println("***************************************************");
	}
	
	public void searchById(int id) {
		boolean found = false;
		for (int i = 0; i < qtyOrdered; i++) {
			if(itemOrdered[i].getId() == id) {
				found = true;
				System.out.println(itemOrdered[i].toString());
			}
		}
		
		if(found == false) System.out.println("Not Found!");
	}
	
	public void searchByTitle(String title) {
		boolean found = false;
		for (int i = 0; i < itemOrdered.length; i++) {
			if(itemOrdered[i].getTitle() == title) {
				found = true;
				itemOrdered[i].toString();
			}
		}
		
		if(found == false) System.out.println("Not Found!");
	}
}
