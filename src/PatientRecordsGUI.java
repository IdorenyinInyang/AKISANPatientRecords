
public class PatientRecordsGUI { 
	
	 private static PatientRecordsGUI instance = null;
	   private PatientRecordsGUI() {
	      // Exists only to defeat instantiation.
	   }

	   public static PatientRecordsGUI getInstance() {
	      if(instance == null) {
	         instance = new PatientRecordsGUI(); 
	         GUI();
	      }
	      return instance;
	   } 
	   
	   public static void GUI() { 
		   
	   }

}
