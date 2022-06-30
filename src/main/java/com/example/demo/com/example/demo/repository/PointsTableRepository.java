package com.example.demo.com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.com.example.demo.entity.PointsTable;

@Repository
public interface PointsTableRepository extends JpaRepository<PointsTable, Integer> {
	
	@Query(value=" SELECT points from points_table where action=:action order by id desc LIMIT 1", nativeQuery = true)
	Integer pointsByAction(@Param("action") String action);
	
	//show all counts
	
	@Query(value="SELECT COUNT(*) FROM all_about_user",nativeQuery = true)
	Integer numberofusers();
	
	@Query(value="SELECT COUNT(*) FROM files",nativeQuery = true)
	Integer numberofartifacts();
	
	

}
