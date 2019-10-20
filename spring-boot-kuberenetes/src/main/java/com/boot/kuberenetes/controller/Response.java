package com.boot.kuberenetes.controller;

import java.io.Serializable;

public class Response implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1321221185370915627L;
	
private String name;
private String status;
private String message;


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
}
