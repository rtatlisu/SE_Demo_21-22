package de.uni.koeln.se.state;

//import de.uni.koeln.se.main.Main;

public class Elevator{
	
	public static int current_Floor=5;
    int dest_Floor;
	
	
	private Elv_States State = new Elv_States();
	
	public Elevator (int dest_floor)  {
		
	this.dest_Floor=dest_floor;
	System.out.println("*** Destination floor is: "+ dest_Floor);
	

    //Moving up	
	if(current_Floor < dest_Floor) {
		System.out.println("State: " + State.Moving_up);
		try 
		{	
			while(current_Floor != dest_floor) {
		       Thread.sleep(2000);
		       current_Floor++;
		       System.out.println("Floor: " + current_Floor);  
			}
			Thread.sleep(1000);
			arrive_atFloor();
		}
		
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		
	}
	
	
	//Moving down
	else if (current_Floor > dest_Floor) {
		System.out.println("State: " + State.Moving_down);
		try 
		{
			while(current_Floor != dest_floor) {
		       Thread.sleep(2000);
		       current_Floor--;
		       System.out.println("Floor: " + current_Floor);	    
			}
			Thread.sleep(1000);
			arrive_atFloor();
		}
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
	}
	
	
	//No movement
	else if (current_Floor == dest_Floor) {
		try 
		{
			Thread.sleep(1000);
			System.out.println("'I already seem to be on floor " + dest_Floor + "' *exiting*");	
		}
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}
		
	}
	
	
	  

 }

	private void arrive_atFloor() {
		try 
		{   Thread.sleep(1000);
		    System.out.println("State: " + State.Idle);
		    Thread.sleep(1000);
		    System.out.println("*Ding* - arrived on floor " + current_Floor );
		
			Thread.sleep(1000);
			System.out.print("*exiting*");
		}
		catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}

	}

	
}
