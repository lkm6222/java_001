package parking;

import memberMng.MemeberService;

public class ParkingController {

	public static void main(String[] args) {
		
		ParkingService parkingService = new ParkingService();
		
		parkingService.startProgram();
	}
}
