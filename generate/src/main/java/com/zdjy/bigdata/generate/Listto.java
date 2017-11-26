package com.zdjy.bigdata.generate;

import java.util.List;
import java.util.Random;

public class Listto<T> {
public	Random RANDOM=new Random();
	
	
	
	public T generate(List<T> t) {
		// TODO Auto-generated method stub
		
		T temp;
		
		try {
		
		 temp=t.get(RANDOM.nextInt(t.size()));	
		 return temp;
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
