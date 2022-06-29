package com.atcs.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.atcs.ecommerce.entity.AuthenticationToken;

@Repository
public interface AuthenticationTokenRepo extends JpaRepository<AuthenticationToken, Integer> {

}
