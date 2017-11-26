package com.zdjy.bigdata.generate.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Dome {

	/**
     * 获取count个随机数
     * @param count 随机数个数
     * @return
     */
    public static String game(int count){
        StringBuffer sb = new StringBuffer();
        String str="0123456789";
        
        
        Random r = new Random();
        for(int i=0;i<count;i++){
            int num = r.nextInt(str.length());
            sb.append(str.charAt(num));
            str = str.replace((str.charAt(num)+""), "");
        }
        return sb.toString();
    }
    public static String gameSex(String sex){
        StringBuffer sb = new StringBuffer();
        String str="";
        if("M".equals(sex)){
        	str="13579";
        }else{
        	str="02468";
        }
        
        
        
        Random r = new Random();
        
            int num = r.nextInt(str.length());
            sb.append(str.charAt(num));
            str = str.replace((str.charAt(num)+""), "");
        
        return sb.toString();
    }
    
    public static Date randomDateBetweenMinAndMax(Integer Year1,Integer month1,Integer day1,Integer Year2,Integer month2,Integer day2){ 
    	int temp=0;
    	if(Year1>Year2){
    		temp=Year2;
    		Year2=Year1;
    		Year1=temp;
    	}
    	if(Year1==Year2&&month1!=month2){
    		if(month1<month2){
    			temp=month2;
    			month2=month1;
    			month1=temp;
    			
    		}
    		
    	}
    	
    	if(Year1==Year2&&month1==month2&&day1<day2){
    		temp=day2;
			day2=day1;
			day1=temp;
    	}
    	if(day1<=0){
    		day1=1;
    		
    	}
    	if(day2<=0){
    		day2=1;
    		
    	}
    	if(day1>28){
    		day2=1;
    		
    	}
    	if(day2>28){
    		day2=1;
    		
    	}
    	
        Calendar calendar = Calendar.getInstance();  
        //注意月份要减去1  
        calendar.set(Year1,month1,day1);  
        calendar.getTime().getTime();  
        //根据需求，这里要将时分秒设置为0  
        calendar.set(Calendar.HOUR_OF_DAY, 0);  
        calendar.set(Calendar.MINUTE, 0);  
        calendar.set(Calendar.SECOND,0);  
        long min = calendar.getTime().getTime();;  
        calendar.set(Year2,month2,day2);  
        calendar.set(Calendar.HOUR_OF_DAY,0);  
        calendar.set(Calendar.MINUTE,0);  
        calendar.set(Calendar.SECOND,0);  
        calendar.getTime().getTime();  
        long max = calendar.getTime().getTime();  
        //得到大于等于min小于max的double值  
        double randomDate = Math.random()*(max-min)+min;  
        //将double值舍入为整数，转化成long类型  
        calendar.setTimeInMillis(Math.round(randomDate));  
        return calendar.getTime();  
    } 
}
