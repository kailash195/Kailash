package com.springboot.springsecurity.springSecurityApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.springsecurity.springSecurityApplication.model.Home;

@Repository
public interface HomeRepository extends JpaRepository<Home , Long>{

}
