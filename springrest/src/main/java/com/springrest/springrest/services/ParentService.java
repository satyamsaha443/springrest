package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entity.Parent;


public interface ParentService {
public List<Parent> getParent();
	
	public Parent getParent(long parentid);

	public Parent addParent(Parent parent);

	public Parent updateParent(Parent parent);

	

}
