package com.jasf.models;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CalculBean {
	
	private int val1;
	private int val2;
	private int res;
	
	public CalculBean() {
		val1=0;
		val2=0;
		res = 0;
	}
	
	public int getVal1() {
		return val1;
	}
	public void setVal1(int val1) {
		this.val1 = val1;
	}
	public int getVal2() {
		return val2;
	}
	public void setVal2(int val2) {
		this.val2 = val2;
	}
	
	public int getRes() {
		return res;
	}

	public void somme() {
		res = val1 + val2;
	}

}
