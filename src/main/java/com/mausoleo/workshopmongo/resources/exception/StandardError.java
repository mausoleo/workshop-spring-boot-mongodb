package com.mausoleo.workshopmongo.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
    
	public StandardError() {
		super();
	}
	
	public StandardError(Long timestamp, Integer status, String error, String messagem, String path) {
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
		this.message = messagem;
		this.path = path;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessagem() {
		return message;
	}

	public void setMessagem(String messagem) {
		this.message = messagem;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
