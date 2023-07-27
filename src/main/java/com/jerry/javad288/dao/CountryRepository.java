package com.jerry.javad288.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jerry.javad288.Entities.Country;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface CountryRepository extends JpaRepository<Country, Long> {



}
