package net.gbcoder.school.beans;

import java.io.Serializable;
import java.util.Date;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class MyComponant implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4857687061133328006L;
	Date dob=new Date();

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
}
