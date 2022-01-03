package com.gulukal._004Cdi;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@Builder
 

// cdi bean yapisi
@Named(value="personCdi")
@ApplicationScoped
public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int    personId;
	private String personName;
	private String personSurname;

	public Person() {
		this.personName = "Gulten";
	}

}
