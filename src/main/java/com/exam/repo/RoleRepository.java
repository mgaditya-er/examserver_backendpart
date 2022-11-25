package com.exam.repo;

import com.exam.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

//1.you have to enter the entitu u are going to use i.e Role
//2. Type of Id of that entity  i.e Long
public interface RoleRepository extends JpaRepository<Role,Long> {
}
