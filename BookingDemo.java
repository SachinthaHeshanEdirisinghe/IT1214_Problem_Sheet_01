import java.util.Scanner;

class Ticket{
	private int ticketNumber;
	private String customerName;
	private int seatNumber;
	
	Ticket(int ticketNumber,String customerName,int seatNumber){
		this.ticketNumber=ticketNumber;
		this.customerName=customerName;
		this.seatNumber=seatNumber;
	}
	public int getTicketNumber(){
		return ticketNumber;
	}
	public String getCustomerName(){
		return customerName;
	}
	public int getSeatNumber(){
		return seatNumber;
	}
	public void setTicketNumber(int ticketNumber){
		this.ticketNumber=ticketNumber;
	}
	public void setCustomerName(String customerName){
		this.customerName=customerName;
	}
	public void setSeatNumber(int seatNumber){
		this.seatNumber=seatNumber;
	}
	
}
class Theater{
	Ticket []seats=new Ticket[10];
	int seatCount=0;
	/*public boolean checkAvailability(int seatNumber){
		boolean booked=false;
		for(int i=0;i<seatCount+1;i++){
				if(seats[i].getSeatNumber()==seatNumber){
					System.out.println("Already booked...");
					booked=true;
				}
		}
		return booked;
	}*/
	
	public void reserveSeat(Ticket ticket){
		if(seatCount<10){
			//if(checkAvailability(ticket.getSeatNumber())){
				seats[seatCount]=ticket;
				seatCount++;
			
		}
	}
	public void removeSeat(int ticketNumber){
		for(int i=0;i<seatCount+1;i++){
			if(seats[i].getTicketNumber()==ticketNumber){
				seats[i]=null;
				seatCount--;
			}
			
		}
	}
	public void display(){
		for(int i=0;i<seatCount+1;i++){
			if(seats[i]!=null){
				System.out.println("Ticket Number :"+seats[i].getTicketNumber()+", Name :"+seats[i].getCustomerName()+", Seat Number :"+seats[i].getSeatNumber());
			}
		}
	}
	
	
	
}
class BookingDemo{
	public static void main(String []args){
		Theater cinema=new Theater();
		cinema.reserveSeat(new Ticket(1,"heshan",1));
		cinema.reserveSeat(new Ticket(2,"Gihan",2));
		cinema.reserveSeat(new Ticket(3,"Thanuk",3));
		cinema.display();
		cinema.removeSeat(2);
		cinema.display();
	}
}