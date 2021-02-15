package com.PhoneBook.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.PhoneBook.Entity.Contect_Master;

public interface Contect_Repo extends JpaRepository<Contect_Master, Serializable> {

}
