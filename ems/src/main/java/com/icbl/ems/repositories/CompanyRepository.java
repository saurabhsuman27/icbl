package com.icbl.ems.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.icbl.ems.entities.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, UUID> {

}
