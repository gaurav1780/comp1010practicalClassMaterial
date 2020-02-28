package lectureCodes.week03.classesObjects1.toStaticOrNotToStatic;

public class TicketingClient {

	public static void main(String[] args) {
		TicketRegister r1 = new TicketRegister("Bender");
		TicketRegister r2 = new TicketRegister("Leela");
		/*
		 * r1 and r2 have their own names but they 
		 * share ticketsSold variables and CAPACITY final 
		 */
		System.out.println(r1);
		System.out.println(r2);
		System.out.println();
		r1.sellTickets(5);
		System.out.println();
		System.out.println(r1);
		System.out.println(r2);
		System.out.println();
		r2.sellTickets(3);
		System.out.println();
		System.out.println(r1);
		System.out.println(r2);
		System.out.println();
		r2.sellTickets(16);
		System.out.println();
		System.out.println(r1);
		System.out.println(r2);		
	}

}
