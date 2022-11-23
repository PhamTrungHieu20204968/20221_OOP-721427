
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
}
