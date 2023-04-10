package com.rays.project.exception;

/**
 * DatabaseException is propogated by DAO classes when an unhandled Database
 * exception occurred.
 * 
 * @author Rahul Goswami
 *
 */

public class DatabaseException extends Exception {

	public DatabaseException(String msg) {
		super(msg);
	}

}
