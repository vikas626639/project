package com.PhoneBook.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
			Contect_Master entity=null;
			entity=new Contect_Master();
		//copy contect data into the entity class
		BeanUtils.copyProperties(c, entity);
		//use repository
		Contect_Master id = repo.save(entity);
		return true;
	}

	@Override
	public List<Contect> getAllContect() {
		List<Contect_Master> entity = repo.findAll();
		List<Contect> of = new ArrayList<Contect>();
		System.out.println(entity);
		entity.forEach(e->{
			System.out.println(e);
			Contect c=new Contect();
			BeanUtils.copyProperties(e, c);
			System.out.println("after loop");
			System.err.println(c);
			of.add(c);
		});
		return of;
	}

	@Override
	public Contect editContectById(Integer id) {
		Optional<Contect_Master> findById = repo.findById(id);
		if (findById.isPresent()) {
			Contect_Master entity = findById.get();
			Contect c = new Contect();
			BeanUtils.copyProperties(entity, c);
			return c;
		}
		return null;
	}

	@Override
	public boolean dltContectById(Integer id) {
		repo.deleteById(id);
		return true;
	}

	

}
