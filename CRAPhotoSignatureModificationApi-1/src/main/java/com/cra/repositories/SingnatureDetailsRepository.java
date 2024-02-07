package com.cra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cra.model.SingnatureDetails;

@Repository
public interface SingnatureDetailsRepository extends JpaRepository<SingnatureDetails, Long>{

}
