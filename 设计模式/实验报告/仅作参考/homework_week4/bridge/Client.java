package bridge;

public class Client {
	public static void main(String[] args) {
		AircraftManufacturer am = null;
		IAircraft ia = null;
		am = (AircraftManufacturer)XMLUtil.getBean("AircraftManufacturer");
		ia = (IAircraft)XMLUtil.getBean("aircraft");
		am.setAircraft(ia);
		am.manufacture();
	}
}
