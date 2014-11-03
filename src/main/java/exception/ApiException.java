package exception;

public class ApiException extends Exception {

	private static final long serialVersionUID = 6525847635518799294L;
	
	@SuppressWarnings("unused")
	private int code;

	public ApiException(int code, String msg) {
		super(msg);
		this.code = code;
	}
}