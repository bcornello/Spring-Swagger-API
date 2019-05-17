package net.guides.springboot2.springboot2swagger2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/*
 * Used for logging errors.
 * 
 * Referenced in API end point methods.
 * 
 * For example, when trying to find an employee
 * with a non-existing id, this class is referenced
 * to output this error message:
 * "Employee not found for this id :: 553"
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String message){
	    super(message) ;
    }
}
