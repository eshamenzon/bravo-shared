
package com.peter;

import org.apache.commons.lang3.builder.ToStringBuilder;


public class Main{

    public Main(String name){
	   this.name  =  name;
	}

    private String name;
	
	public String getName(){
	   return name;
	}
	
	public String doIt(){
	   return ToStringBuilder.reflectionToString(this);
	}
}