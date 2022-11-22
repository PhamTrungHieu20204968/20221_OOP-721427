
public class TestPassingParameter {
	
	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cindereDVD = new DigitalVideoDisc("Cinderella");
		
		newSwap(jungleDVD,cindereDVD);
		System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("Cinderella dvd title: " + cindereDVD.getTitle());
		
		changeTitle(jungleDVD,cindereDVD.getTitle());
		System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
	}
	
	public static void newSwap(DigitalVideoDisc o1,DigitalVideoDisc o2) {
		DigitalVideoDisc tmp = new DigitalVideoDisc(o1);
		o1 = new DigitalVideoDisc(o2);
		o2 = new DigitalVideoDisc(tmp);
		
	}
	
	public static void changeTitle(DigitalVideoDisc dvd,String title){
		String oldTitle= dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
	
	public static void swap(Object o1,Object o2) {
		Object tmp = o1;
		o1=o2;
		o2=tmp;
	}
	

}
