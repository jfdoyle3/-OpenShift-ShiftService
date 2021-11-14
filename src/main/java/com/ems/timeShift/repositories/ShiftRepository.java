package com.ems.timeShift.repositories;

import com.ems.timeShift.entities.Shift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShiftRepository extends JpaRepository <Shift, Long> {



    @Query("select c from  c where c.name like %?1")
    List<String> findByName(String chars);

}
