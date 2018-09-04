package report;

public class ReportFormatter {

	String formattedOutput;
	
	public ReportFormatter(Object object, FormatType formatType) {
		
		switch(formatType) {
		
		case XML: 
			// convert to xml
			formattedOutput = convertObjectToXML(object);
			break;
			
		case CSV:
			// convert to csv
			formattedOutput = convertObjectToCSV(object);
			break;
		}
	}

	private String convertObjectToXML(Object object){
		return "XML : <title> "+object.toString() + "</title>";

	}
	
	private String convertObjectToCSV(Object object){

		return "CSV : ,,, "+object.toString() + ",,,";
	}
	
	protected String getFormattedValue(){
		return formattedOutput;
	}
	
}
