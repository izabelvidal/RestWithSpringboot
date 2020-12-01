package br.com.bel.exception;

import java.io.Serializable;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperationExecption extends RuntimeException implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public UnsupportedMathOperationExecption(String exception) {
		super(exception);
	}

}
