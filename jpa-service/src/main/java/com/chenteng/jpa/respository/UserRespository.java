package com.chenteng.jpa.respository;

import com.chenteng.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserRespository extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User> {
}
