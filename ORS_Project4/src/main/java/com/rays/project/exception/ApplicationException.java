package com.rays.project.exception;

/**
 * ApplicationException is propogated from Service classes when an business
 * logic exception occurered.
 * 
 * @author Rahul Goswami
 *
 */

public class ApplicationException extends Exception {

	public ApplicationException(String msg) {
		super(msg);
	}

}
