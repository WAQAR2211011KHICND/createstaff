package com.xloop.createstaff.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xloop.createstaff.IModelRepository.IStaffRepository;
import com.xloop.createstaff.Model.CreateStaff;

@RestController
@RequestMapping("/creatstaff")
@CrossOrigin("*")
public class StaffController {
    @Autowired
    private IStaffRepository staffRepo;
    public StaffController(){

    }
    @PostMapping("")
    public ResponseEntity<String> addStaff(@RequestBody CreateStaff createStaff){
        staffRepo.save(createStaff);
        return ResponseEntity.ok("Staff Added");
    }
    @PutMapping("")
    public ResponseEntity<String> updateStaff(@RequestBody CreateStaff createStaff){
        if(createStaff.getId() == null){
            return ResponseEntity.status(404).body("Selected User Not Found!");
        }
        staffRepo.save(createStaff);
        return ResponseEntity.ok("Staff Added");
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStaff(@PathVariable Long id){
        staffRepo.deleteById(id);
        return ResponseEntity.ok("Selected Staff Deleted");
    }

    @GetMapping("")
    public List<CreateStaff> viewall(){
        return staffRepo.findAll();
    }
    
}
