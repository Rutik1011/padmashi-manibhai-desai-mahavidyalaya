package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.ShopHatPojo;
import com.repo.LoginRepo;

@Service
public class LoginService {
	@Autowired
	LoginRepo lr;
	public String addvalid(ShopHatPojo o) {       //validation add method
        // check if mobile already exists
        if (lr.findByMono(o.getMono()).isPresent()) {
            return "Mobile number already registered!";
        }
        lr.save(o);// only save if not already there
        return "Registration successful!";
    }
	
	public void add(ShopHatPojo o) {         //normal add method
		lr.save(o);
	}
	
	public List<ShopHatPojo> show(){
		List<ShopHatPojo> list=lr.findAll();
		return list;
	}
	
	public void delet(int id) {
		lr.deleteById(id);
	}
	
	public ShopHatPojo login(int id, String pass) {
		 return lr.findByIdAndPass(id, pass).orElse(null);
	}
	
	public ShopHatPojo loginByMono(long mono,String pass) {
		return lr.findByMonoAndPass(mono, pass).orElse(null);
	}
	
	
	public ShopHatPojo updateProfile(int id, ShopHatPojo updatedUser) {
	    return lr.findById(id).map(user -> {
	        user.setNm(updatedUser.getNm());
	        user.setEmail(updatedUser.getEmail());
	        user.setAddr(updatedUser.getAddr());
	        user.setPass(updatedUser.getPass());
	        user.setMono(updatedUser.getMono());
	        return lr.save(user);
	    }).orElse(null);
	}

}
