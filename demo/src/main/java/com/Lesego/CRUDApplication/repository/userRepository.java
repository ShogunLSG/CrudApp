package com.Lesego.CRUDApplication.repository;

import com.Lesego.CRUDApplication.entity.user;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface userRepository extends JpaRepository<user, Long> {

}
