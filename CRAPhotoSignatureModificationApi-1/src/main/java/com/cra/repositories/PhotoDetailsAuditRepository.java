package com.cra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cra.model.PhotoDetailsAudit;

@Repository
public interface PhotoDetailsAuditRepository extends JpaRepository<PhotoDetailsAudit,Long>{

}
