package srl.neotech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import srl.neotech.entity.Person;

public interface PersonJPARepository extends JpaRepository<Person, Integer>{

}
