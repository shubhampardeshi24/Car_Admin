package com.car.dao;

import org.springframework.data.repository.CrudRepository;

import com.car.dto.Admin;

public interface AdminDao extends CrudRepository<Admin, Integer> {

}
