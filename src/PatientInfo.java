
public class PatientInfo { 
	
	//declaring instance variables for patients
	private String fName, lName;  
	private String address; 
	private String gender;   
	private String homeMedication; 
	private String presentComplaints;
	
	private int age;   
	private int phoneNum;
	private int pulse;  
	private int respiration;
	
	private double temperature; 
	
	public PatientInfo() { 
		fName = null; lName = null; address = null; gender = null; homeMedication = null; presentComplaints = null; 
		age = 0; phoneNum = 0;
	
	}

	
	public PatientInfo(String fName, String lName, String address, String gender, String homeMedication, 
			String presentComplaints, int age, int phoneNum, int pulse, int respiration, double temperature) { 
		this.fName = fName; 
		this.lName = lName; 
		this.address = address; 
		this.gender = gender; 
		this.homeMedication = homeMedication; 
		this.presentComplaints = presentComplaints; 
		this.age = age; 
		this.phoneNum = phoneNum; 
		this.pulse = pulse; 
		this.respiration = respiration; 
		this.temperature = temperature;	
	} 
	

	public String getFName() { 
		return fName;
	} 
	
	public String getLName() { 
		return lName;
	} 
	
	public void setFName(String fName) { 
		this.fName = fName;
	} 
	
	public void setLName(String lName) { 
		this.lName = lName;
	} 
	
	public String getAddress() { 
		return address;
	} 
	
	public void setAddress(String address) { 
		this.address = address;
	} 
	
	public String getGender() { 
		return gender;
	} 
	
	public void setGender(String gender) { 
		this.gender = gender;
	} 
	
	public String getMeds() { 
		return homeMedication; 
	} 
	
	public void setMeds(String homeMedication) { 
		this.homeMedication = homeMedication; 
	}  
	
	public int getAge() { 
		return age; 
	} 
	
	public void setAge(int age) { 
		this.age = age;
	} 
	
	public int getPhoneNum() { 
		return phoneNum;
	} 
	
	public void setPhoneNum(int phoneNum) { 
		this.phoneNum = phoneNum;
	} 
	
	public int getPulse() { 
		return pulse;
	} 
	
	public void setPulse(int pulse) { 
		this.pulse = pulse;
	}
	
	public int getRespiration() { 
		return respiration;
	} 
	
	public void setRespiration(int respiration) { 
		this.respiration = respiration;
	} 
	
	public double getTemperature() { 
		return temperature; 
	} 
	
	public void setTemperature(double temperature) { 
		this.temperature = temperature;
	} 
	
	public String toString() { 
		return fName+", "+lName+System.lineSeparator()+address+System.lineSeparator()
		+pulse+System.lineSeparator()+respiration+System.lineSeparator()+temperature+" degrees"+System.lineSeparator();
	}
	
}