package com.yash.spring.assingment.SpringAssingment;

public class PrintMessage {
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

@Override
public String toString() {
	return "PrintMessage [message=" + message + "]";
}

}
