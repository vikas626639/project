package com.PhoneBook.Service;

import java.util.List;

import com.PhoneBook.Command.Contect;

public interface ContectService {
	public boolean isSave(Contect c);
	public List<Contect> getAllContect();
	//public void getAllContect();
	public Contect editContectById(Integer id);
	public boolean dltContectById(Integer id);
}
