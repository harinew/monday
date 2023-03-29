package com.example.MONDAY;

import java.beans.JavaBean;

import org.springframework.stereotype.Service;

import lombok.Data;

@Data
public class Beanc {
 private int no;
 private String name;
	
	 public Beanc(int no, String name) { super(); this.no = no; this.name = name;
	 } public int getNo() { return no; } public void setNo(int no) { this.no = no;
	  } public String getName() { return name; } public void setName(String name) {
	 this.name = name; }
	 
	 @Override public String toString() { return "Beanc [no=" + no + ", name=" +
	 name + "]"; }
	 
 
}
