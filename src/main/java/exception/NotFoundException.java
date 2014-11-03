package exception;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NotFoundException {

	private int code;
	private String msg;

	public NotFoundException() {
		super();
	}
	
	public NotFoundException(int code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	@XmlElement
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@XmlElement
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}