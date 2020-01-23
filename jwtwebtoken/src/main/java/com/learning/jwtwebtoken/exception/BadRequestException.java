/**
 * 
 */
package com.learning.jwtwebtoken.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Shvintech India LLP
 *
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = -306683584613020517L;

	public BadRequestException(String message) {
        super(message);
    }

    public BadRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}
