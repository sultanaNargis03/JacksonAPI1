package com.telusko.main;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.telusko.pojo.Implementers;

public class LaunchJackson 
{
	public static void main(String[] args) throws JsonProcessingException 
	{
		Implementers  imp=new Implementers();
		imp.setId(1);
		imp.setName("Nargis");
		imp.setCity("Kolkata");
		//System.out.println(imp);
		
		Implementers  imp2=new Implementers();
		imp2.setId(2);
		imp2.setName("Tamim");
		imp2.setCity("Bengaluru");
		
		Implementers  imp3=new Implementers();
		imp3.setId(3);
		imp3.setName("Dona");
		imp3.setCity("Bengaluru");
		
		List<Implementers> list=new ArrayList<>();
		list.add(imp);
		list.add(imp2);
		list.add(imp3);
		
		ObjectMapper mapper=new ObjectMapper();
		
		//String json=mapper.writeValueAsString(imp);
		String json=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
		System.out.println(json);
	}
}
