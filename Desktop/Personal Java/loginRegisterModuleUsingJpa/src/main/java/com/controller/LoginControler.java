package com.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.ShopHatPojo;
import com.service.LoginService;

@RestController                     // if we add @RestController we dont need to addd @ResponseBody
@CrossOrigin(origins = "http://localhost:4200")  // Allow Angular frontend
public class LoginControler {
	@Autowired
	LoginService ls;
	@PostMapping("/add")         // this is simple add method
	
	public void add(@RequestBody ShopHatPojo o) {
		ls.add(o);
	}
	@GetMapping("/show")
	                        //If you're returning plain text or data Add @ResponseBody below @getMapping if you're returning data, not a JSP or HTML view:
	public  List<ShopHatPojo>  show() {
		return ls.show();
	}
	@DeleteMapping("/delet/{id}")
	public String delet(@PathVariable("id") int id) {         // we use @RequestParam("id") for http://localhost:8080/delet?id=1
		ls.delet(id);                                         // we use @PathVariable for http://localhost:8080/delet/5
		return "delet sucess";
	}
	
	@PostMapping("/login")
	 public ResponseEntity<?> login(@RequestBody Map<String, String> data) {
        int id = Integer.parseInt(data.get("id"));
        String pass = data.get("pass");

        ShopHatPojo pojo = ls.login(id, pass);
        if (pojo != null) {
            return ResponseEntity.ok(pojo);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }
	
	@PostMapping("/loginByMono")
	 public ResponseEntity<?> loginByMono(@RequestBody Map<String, String> data) {
	        long mono = Long.parseLong(data.get("mono"));
	        String pass = data.get("pass");

	        ShopHatPojo pojo = ls.loginByMono(mono, pass);
	        if (pojo != null) {
	            return ResponseEntity.ok(pojo);
	        } else {
	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
	        }
	    }
	
	@PostMapping("/addvalid")
	public ResponseEntity<String> addvalid(@RequestBody ShopHatPojo o) {
	    String result = ls.addvalid(o);
	    if (result.contains("already")) {
	        return ResponseEntity.status(HttpStatus.CONFLICT).body(result); // 409 Conflict
	    }
	    return ResponseEntity.ok(result);
	}
	
	
	@PutMapping("/update/{id}")
	public ResponseEntity<?> updateProfile(@PathVariable int id, @RequestBody ShopHatPojo updatedUser) {
	    ShopHatPojo updated = ls.updateProfile(id, updatedUser);
	    if (updated != null) {
	        return ResponseEntity.ok(updated);
	    } else {
	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
	    }
	}



}
