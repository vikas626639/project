package com.Ragistration.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class PasswordGeneratorImpl implements PasswordGenerator {
	
	@Override
	public String genRadamText(Integer num) {
		String cap=null,sml=null,dig=null,value=null,smbl=null;
		cap="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		sml="abcdefghijklmnopqrstyz";
		dig="0123456789";
		smbl="@#$%&";
		value=cap+sml+dig+smbl;
		StringBuilder sb=new StringBuilder();
		String txt="";
		char ch=0;
		int index=0;
		
			while(num>0) {
				Random ram=new Random();
				index = ram.nextInt(value.length());
				System.out.println(index);
				ch= value.charAt(index);
				txt=String.valueOf(sb.append(ch));
				num--;
		}
		return txt;
	}

}
