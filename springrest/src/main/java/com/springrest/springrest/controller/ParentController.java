package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entity.Parent;
import com.springrest.springrest.services.ParentService;

@RestController
public class ParentController {
	@Autowired
	private ParentService parentService;
	
	
	@GetMapping("/home")
	public String home() {
		
		
		return "this is home page";
	}
    //get the courses
	@GetMapping("/stages")
	public List<Parent> getParent(){
		return this.parentService.getParent() ;
		
	}
	
//	@GetMapping("/stages/{stageSummary}")
//	public Problem_Stage getProblem_Stage(@PathVariable String problem_stageSummary) {
//		return this.parentService.getParent(Long.parseLong(problem_stageSummary));
//	}
	
	@PostMapping("/stagesas")
	public Parent addParent(@RequestBody Parent parent) {
		return this.parentService.addParent(parent);
		
	}
//	
//	@PutMapping("/stages")
//	public Problem_Stage updateProblem_Stage(@RequestBody Problem_Stage problem_stage) {
//		return this.problem_stageService.updateProblem_Stage(problem_stage);
//	}
//	
//	@DeleteMapping("/stages/{stageSummary}")
//	public ResponseEntity<HttpStatus> deleteProblem_Stage(@PathVariable String problem_stageSummary){
//		try {
//			this.problem_stageService.deleteProblem_Stage(Long.parseLong(problem_stageSummary));
//			return new ResponseEntity<>(HttpStatus.OK);
//		}catch(Exception e) {
//			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
		
	//}
	
}
