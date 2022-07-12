//package com.springrest.springrest.services;
//
////import java.util.ArrayList;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.springrest.springrest.dao.IdentifierDao;
//import com.springrest.springrest.entity.Identifier;
//
//
//  @Service
//  public class IdentifierServiceImpl implements IdentifierService {
//	
//	@Autowired
//	private IdentifierDao identifierDao;
//	public IdentifierServiceImpl() {
//	} 
//	@Override
//	public List<Identifier> getIdentifiers() {
//		return identifierDao.findAll();
//	}
//	@SuppressWarnings("deprecation")
//	@Override
//	public Identifier getIdentifier(long identifierId) {
//			return identifierDao.getOne(identifierId);
//		}
//	@SuppressWarnings("deprecation")
//	@Override
//	public Identifier getIdentifier(Long identifierId) {
//		return identifierDao.getOne(identifierId);
//	}
//    @Override
//    public Identifier addIdentifier(Identifier identifier) {
//        identifierDao.save(identifier);
//    	return identifier;
//    } 
//    @Override
//    public Identifier updateIdentifier(Identifier identifier) {
//        identifierDao.save(identifier);
//		return identifier;	
//     }
//    @Override
//    public void deleteIdentifier(long parselong) {
//    	@SuppressWarnings("deprecation")
//		Identifier entity = identifierDao.getOne(parselong);
//    	identifierDao.delete(entity);
//    }
//  }
//
////	List<identifier> list;
////	list = new ArrayList<>();
////	list.add(new identifier(2, "java course", "this is a basic java course"));
////	list.add(new identifier(22, "springboot course", "this is a basic springboot course"));
////	
//	
////	Couses c = null;
////	for(Couses course:list) {
////		if(course.getId() == courseId){
////			c = course;
////			break;
////		}
////	}
//  
////	list.add(course);
//  
////	list.forEach(e -> {
////	if(e.getId() == course.getId()) {
////		e.setTitle(course.getTitle());
////		e.setDecription(course.getDecription());
////	}
////});
//  
//
////	list =this.list.stream().filter(e->e.getId()!=parselong).collect(Collectors.toList()); 
//
