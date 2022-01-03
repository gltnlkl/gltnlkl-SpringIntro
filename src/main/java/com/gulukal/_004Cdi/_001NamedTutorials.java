package com.gulukal._004Cdi;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named(value="namedCdi")
@RequestScoped
public class _001NamedTutorials implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String adi;

	// parametresiz constructer
	public _001NamedTutorials() {
		this.adi = "Gulten Ulukal";

	}

	//parametreli constructer
	public _001NamedTutorials(String adi) {
		super();
		this.adi = adi;
	}

	//toString
	@Override
	public String toString() {
		return "_001NamedTutorials [adi=" + adi + "]";
	}

	//getter and setter
	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

}
