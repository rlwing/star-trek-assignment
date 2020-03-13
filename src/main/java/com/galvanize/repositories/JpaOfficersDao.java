package com.galvanize.repositories;

import com.galvanize.entities.Officer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaOfficersDao extends JpaRepository<Officer, Long> {
}
