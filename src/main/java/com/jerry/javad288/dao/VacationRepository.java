package com.jerry.javad288.dao;

import com.jerry.javad288.Entities.Vacation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface VacationRepository extends JpaRepository<Vacation, Long> {



}
