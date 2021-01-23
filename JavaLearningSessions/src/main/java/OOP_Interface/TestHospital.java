package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fs = new FortisHospital();
		fs.ambulanceServices_USA();
		fs.cardioServices_IM();
		fs.dentalServices_USA();
		fs.emergencyServices_IM();
		fs.ENTServices_UKM();
		fs.medicalInsurance();
		fs.nueroServices_USA();
		fs.orthopedicServices_USA();
		fs.OPTServices_IM();
		fs.pathologyServices();
		fs.physioServices_UKM();
		System.out.println(fs.min_free);
		fs.Services_911_USA();//overrideen default method
		fs.medicalTraining();
		fs.polioServices_WHO();


		System.out.println("************************");

		// Top Casting:
		USMedical us = new FortisHospital();
		us.ambulanceServices_USA();
		us.dentalServices_USA();
		us.nueroServices_USA();
		us.orthopedicServices_USA();
		System.out.println(us.min_free);
		us.Services_911_USA();
		USMedical.billing_USA();//cannot access with refrence variable
		

		System.out.println("************************");
		//FortisHospital fs2=new USMdedical();//downcasting not allowed
		
		// DownCasting Explicitly:
		FortisHospital fs1 = (FortisHospital) us;
		fs1.ambulanceServices_USA();
		fs1.cardioServices_IM();
		fs1.dentalServices_USA();
		fs1.emergencyServices_IM();
		fs1.ENTServices_UKM();
		fs1.nueroServices_USA();
		fs1.medicalInsurance();
		fs1.polioServices_WHO();
		fs1.orthopedicServices_USA();
		fs1.OPTServices_IM();
		fs1.pathologyServices();
		fs1.physioServices_UKM();
		fs1.Services_911_USA();
		fs1.medicalTraining();
		System.out.println(fs1.min_free);
		
		

	}

}
