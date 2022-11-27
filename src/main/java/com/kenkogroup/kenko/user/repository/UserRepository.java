/*package com.kenkogroup.kenko.user.repository;

import com.kenkogroup.kenko.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
    List<User> findByFirstname(String firstname);
    List<User> findByLastname(String lastname);
    List<User> findByAge(int age);
    List<User> findBySexe(User.Sexe sexe);
    List<User> findByUserCat(User.UserCategory userCategory);
    List<User> findBySize(float size);
    List<User> findByWeight(float size);

}
*/