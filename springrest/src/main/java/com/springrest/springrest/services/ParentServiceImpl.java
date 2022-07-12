package com.springrest.springrest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.ParentDao;
import com.springrest.springrest.entity.Parent;


@Service
public class ParentServiceImpl implements ParentService {
	
	@Autowired
	private ParentDao parentDao;
	public ParentServiceImpl() {
	} 
	@Override
	public List<Parent> getParent() {
		return parentDao.findAll();
	}
//	@SuppressWarnings("deprecation")
//	@Override
//	public Problem_Stage getProblem_Stage(long problem_stageSummary) {
//			return problem_stageDao.getOne(problem_stageSummary);
//		}
//	@SuppressWarnings("deprecation")
//	@Override
//	public Problem_Stage getProblem_Stage(Long problem_stageSummary) {
//		return problem_stageDao.getOne(problem_stageSummary);
//	}
  @Override
  public Parent addParent(Parent parent) {
	  parentDao.save(parent);
  	return parent;
  } 
  @Override
  public Parent updateParent(Parent parent) {
	  parentDao.save(parent);
		return parent;	
   }
@Override
public Parent getParent(long parentid) {
	// TODO Auto-generated method stub
	return null;
}
 
}