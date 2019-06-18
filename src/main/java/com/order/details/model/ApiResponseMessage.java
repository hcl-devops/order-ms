package com.order.details.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author semwaln
 * 
 *         <pre>
 *  	Standard response wrapper class for all responses returned from any API
 *         </pre>
 */
@Getter
@Setter
public class ApiResponseMessage implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4553020364838879594L;

	public static final int ERROR = 1;
	public static final int WARNING = 2;
	public static final int INFO = 3;
	public static final int OK = 4;
	public static final int TOO_BUSY = 5;
	public static final int NO_RECORD_FOUND = 6;
	public static final int UNAUTHORIZED_USER = 7;

	@JsonIgnore
	int code;
	@JsonProperty("status")
	String type;
	@JsonProperty("message")
	String message;
	@JsonProperty("data")
	Object data;

	public ApiResponseMessage() {
	}

	public ApiResponseMessage(int code, String message) {
		this.code = code;
		switch (code) {
		case ERROR:
			setType("error");
			break;
		case WARNING:
			setType("warning");
			break;
		case INFO:
			setType("info");
			break;
		case OK:
			setType("ok");
			break;
		case TOO_BUSY:
			setType("too busy");
			break;
		case NO_RECORD_FOUND:
			setType("No Record Found");
			break;
		case UNAUTHORIZED_USER:
			setType("Unauthorized");
			break;
		default:
			setType("unknown");
			break;
		}
		this.message = message;
	}

	public ApiResponseMessage(int code, String message, Object response) {
		this(code, message);
		this.data = response;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public static int getError() {
		return ERROR;
	}

	public static int getWarning() {
		return WARNING;
	}

	public static int getInfo() {
		return INFO;
	}

	public static int getOk() {
		return OK;
	}

	public static int getTooBusy() {
		return TOO_BUSY;
	}

	public static int getNoRecordFound() {
		return NO_RECORD_FOUND;
	}

	public static int getUnauthorizedUser() {
		return UNAUTHORIZED_USER;
	}

}
