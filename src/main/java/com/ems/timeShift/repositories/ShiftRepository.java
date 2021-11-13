package com.ems.timeShift.repositories;

import com.ems.timeShift.entities.Shift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiftRepository extends JpaRepository <Shift, Long> {

}
