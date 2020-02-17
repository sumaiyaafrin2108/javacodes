package lab5;

public class Vehicle {
	String licenseplate;

	public Vehicle() {
		super();
	}

	public Vehicle(String licenseplate) {
		super();
		this.licenseplate = licenseplate;
	}

	public String getLicenseplate() {
		return licenseplate;
	}

	public void setLicenseplate(String licenseplate) {
		this.licenseplate = licenseplate;
	}

	@Override
	public String toString() {
		return "Vehicle [licenseplate=" + licenseplate + "]";
	}
	

}