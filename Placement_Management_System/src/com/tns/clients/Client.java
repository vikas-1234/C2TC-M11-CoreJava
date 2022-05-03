package com.tns.clients;
import com.tns.entity.Placement;
import com.tns.service.*;

public class Client {

	public static void main(String[] args) {
		
		PlacementService service = new PlacementServiceImpl();
		Placement placement = new Placement();

		//crude Operation 
		placement.setidLong(205l);
		placement.setname("Tejashree");
		placement.setcollege("TSSM's BSCOER");
		placement.setdate("24 January");
		placement.setqualification("BE");
		placement.setyear(2017l);
		service.addPlacement(placement);
		
		/*// Retrieve Operation
		placement = service.findPlacementByid(205);
		System.out.print("ID:"+ placement.getid());
		System.out.println("Name:"+placement.getname());
		System.out.println("College Name :" + placement.getcollege());
		System.out.println("Date : " + placement.getdate());
		System.out.println("Qualification : " + placement.getqualification());
		System.out.println("Year : " + placement.getyear());
		
		// Update Operation
		placement = service.findPlacementByid(205);
		placement.setidLong(506l);
        placement.setname("Rudra");
        placement.setcollege("SSVPM");
        placement.setdate("28 August");
        placement.setqualification("BSC");
        placement.setyear(2018l);
        service.updatePlacement(placement);
        
      //at this breakpoint, we have updated record added in first section
        placement = service.findPlacementByid(205);
      	System.out.print("ID:"+placement.getid());
      	System.out.println("Name:"+placement.getname());
      	System.out.println("College Name :" + placement.getcollege());
		System.out.println("Date : " + placement.getdate());
		System.out.println("Qualification : " + placement.getqualification());
		System.out.println("Year : " + placement.getyear());
      	
		// Delete Operation
		placement = service.findPlacementByid(205);
		service.removePlacement(placement);
		System.out.println("Done.....");
		*/
	}

}
