package com.cra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cra.model.SingnatureDetailsAudit;

@Repository
public interface SingnatureDetailsAuditRepository extends JpaRepository<SingnatureDetailsAudit, Long> {

}
