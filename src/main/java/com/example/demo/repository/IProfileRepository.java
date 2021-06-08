package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Profile;

@Repository
public interface IProfileRepository extends JpaRepository<Profile, Integer> {

	List<Profile> findByCode(String code);
}
