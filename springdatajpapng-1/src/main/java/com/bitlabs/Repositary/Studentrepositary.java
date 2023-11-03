package com.bitlabs.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitlabs.Entity.Student;

public interface Studentrepositary extends JpaRepository<Student, Integer> {

}
