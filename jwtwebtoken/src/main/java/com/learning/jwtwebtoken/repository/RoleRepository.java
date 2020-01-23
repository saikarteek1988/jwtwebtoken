/**
 * 
 */
package com.learning.jwtwebtoken.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.jwtwebtoken.domain.Role;
import com.learning.jwtwebtoken.enums.RoleName;

/**
 * @author Shvintech India LLP
 *
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Optional<Role> findByName(RoleName roleName);

}
