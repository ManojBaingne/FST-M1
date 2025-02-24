package activity;

public class CustomException extends Exception{
	
	private String message = null;

	CustomException(String message ){
		this.message=message;
	}
	
	@Override
	public String getMessage() {
		return message;		
	}
	
	static void ExceptionTest(String str) throws CustomException {
		if(str==null)
		{
			throw new CustomException("String value is null");
		}
		
		else {
			
			System.out.println(str);
		}
	}

}
