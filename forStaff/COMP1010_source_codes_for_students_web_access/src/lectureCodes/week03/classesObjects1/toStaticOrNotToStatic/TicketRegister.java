package lectureCodes.week03.classesObjects1.toStaticOrNotToStatic;

public class TicketRegister {
	/**
	 * static variable or class variable is stored in memory for the class.
	 * no matter how many instances of that class are created, they all share
	 * the same static variable. they (the instances) may each modify it.
	 */
	public static int ticketsSold = 0;
	public static final int CAPACITY = 20;
	public String registrarName; //different for each instance of the class
	
	public TicketRegister(String name) {
		registrarName = name;
	}
	
	public boolean sellTickets(int n) {
		if(n <= getTicketsRemaining()) {
			ticketsSold+=n;
			System.out.println(registrarName+" sold "+n+" tickets, "+getTicketsRemaining()+" left");
			return true;
		}
		else {
			System.out.println(registrarName+" - Requested tickets: "+n+". Remaining tickets: "+getTicketsRemaining());
			return false;
		}
	}
	
	public String toString() {
		return registrarName+" has "+getTicketsRemaining()+" left to sell";
	}
	
	public static int getTicketsSold() {
		return ticketsSold;
	}
	
	public static int getTicketsRemaining() {
		return CAPACITY - ticketsSold;
	}
}
