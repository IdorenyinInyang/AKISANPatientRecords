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
	
	public static void updatePatientInfoFName(int patientID, String fName) {
		PatientInfo patient = patientList.get(patientID);  // getting specified patient in HashMap
		patient.setFName(fName);  // setting first name of specified object
		patient = patientList.replace(patientID, patient); // placing renewed value into HashMap
	}
}