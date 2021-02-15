package com.PhoneBook.Service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PhoneBook.Command.Contect;
import com.PhoneBook.Entity.Contect_Master;
import com.PhoneBook.Repository.Contect_Repo;
@Service
public class ContectServiceImpl implements ContectService{
	
	//inject the repository 
	@Autowired
	private Contect_Repo repo;

	@Override
	public boolean isSave(Contect c) {
		//create the object of Entity class
		Contect_Master entity=new Contect_Master();
		//copy contect data into the entity class
		BeanUtils.copyProperties(c, entity);
		//use repository
		repo.save(entity);
		return true;
	}

	@Override
	public List<Contect> getAllContect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contect editContectById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contect dltContectById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contect updtContectByid(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
