
package com.example.demo.Expception;

import org.springframework.http.HttpStatus;


import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourcenotfoundException extends RuntimeException {
	public ResourcenotfoundException(String message) {
		super(message);
	}

}

