package com.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.ShopHatPojo;

@Repository
public interface LoginRepo extends JpaRepository<ShopHatPojo, Integer>{
	Optional<ShopHatPojo> findByIdAndPass(int id, String pass);         // added for login using pass and id
	Optional<ShopHatPojo> findByMonoAndPass(long mono,String pass);    // added for loogin using pass and mobile No
	Optional<ShopHatPojo> findByMono(long mono);                       // added for check mobile no exest or not

}
