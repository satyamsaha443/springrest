package com.springrest.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entity.Parent;

public interface ParentDao extends JpaRepository <Parent, Long> {

}
