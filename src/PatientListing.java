import java.util.*; 
import java.io.*;

public class PatientListing { 

	public static HashMap<Integer, PatientInfo> patientList;  
	
	public PatientListing(HashMap<Integer, PatientInfo> patientList) { 
		this.patientList = patientList;
	}
	
	public PatientListing() {  
		patientList = new HashMap<Integer, PatientInfo>();
	}
		
	public static void addPatient(PatientInfo patient, int patientID) { 
		patientList.put(patientID, patient);
	} 
	
	public static void removePatient(PatientInfo patient, int patientID) { 
		patientList.put(patientID, patient);
	} 
	
	public static PatientInfo getPatient(int patientID) { 
		return patientList.get(patientID);
	} 
	
	public static void updatePatientInfo() { 
		
	}
}