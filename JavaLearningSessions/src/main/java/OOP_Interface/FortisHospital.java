package OOP_Interface;

public class FortisHospital extends MedicalAssociation implements USMedical, UKMedical, IndianMedical {

	// USMedical
	@Override
	public void orthopedicServices_USA() {

		System.out.println("USA -- orthopedicServices");

	}

	@Override
	public void dentalServices_USA() {
		System.out.println("USA -- dentalServices");

	}

	@Override
	public void nueroServices_USA() {
		System.out.println("USA -- nueroServices");

	}

	@Override
	public void ambulanceServices_USA() {
		System.out.println("USA -- ambulanceServices");

	}

	@Override
	public void Services_911_USA() {
		System.out.println("FortisHospital -- USA-- 911 Services");
	}

	// @Override//cannot override

	/*
	 * public static void billing() { System.out.println("Billing"); }
	 */
	// UKMedical
	@Override
	public void physioServices_UKM() {
		System.out.println("UKM -- physioServices");

	}

	@Override
	public void ENTServices_UKM() {
		System.out.println("UKM -- ENTServices");

	}

	@Override
	public void pediatricServices_UKM() {
		System.out.println("UKM -- pediatricServices");

	}

	// IndianMedical
	@Override
	public void emergencyServices_IM() {
		// TODO Auto-generated method stub
		System.out.println("IM -- emergencyServices");
	}

	@Override
	public void cardioServices_IM() {
		System.out.println("IM -- cardioServices");

	}

	@Override
	public void OPTServices_IM() {
		System.out.println("IM -- OPTServices");

	}

	// non overridden methods
	public void medicalInsurance() {
		System.out.println("medicalInsurance");
	}

	public void pathologyServices() {
		System.out.println("pathologyServices");
	}

	// WHO services
	@Override
	public void polioServices_WHO() {
		// TODO Auto-generated method stub

	}

	@Override
	public void test_USA() {
		// TODO Auto-generated method stub

	}

	@Override
	public void medicalTraining() {
		System.out.println("FH-----------------Medical training");
	}

	@Override
	public void emergencyServices_Common() {
		System.out.println("Emergency servoces is common for all interfaces");
		
	}
}
