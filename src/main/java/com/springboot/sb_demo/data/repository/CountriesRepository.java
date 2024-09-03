package com.springboot.sb_demo.data.repository;

import com.springboot.sb_demo.data.entity.Countries;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountriesRepository extends JpaRepository<Countries,Long> {


}
