package br.com.open.api.exceptions;

public class StandardError {

	private Long timeStamp;
	private Integer status;
	private String msg;

	public StandardError(Long timeStamp, Integer status, String msg) {
		super();
		this.timeStamp = timeStamp;
		this.status = status;
		this.msg = msg;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
