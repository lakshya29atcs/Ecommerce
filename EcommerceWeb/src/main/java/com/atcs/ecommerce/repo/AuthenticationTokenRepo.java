package com.atcs.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticationTokenRepo extends JpaRepository<AuthenticationTokenRepo, Integer> {

}
