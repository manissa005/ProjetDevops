package com.kenkogroup.kenko.registration.Repo;

import com.kenkogroup.kenko.registration.Dto.UserDTO;
import com.kenkogroup.kenko.registration.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

}
