package com.SchoolManagement.SystemManagement.Controller;

import com.SchoolManagement.SystemManagement.Entity.Admin;
import com.SchoolManagement.SystemManagement.Service.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class AdminController {
    private AdminService adminService;

    @PostMapping("/admin/save")
    public ResponseEntity<Admin> createdUser(@RequestBody Admin admin) {
        Admin createdProduct = AdminService.create();
        return new ResponseEntity<>(createdProduct, HttpStatus.OK);
    }


    @GetMapping("admin/list")
    ResponseEntity<List<Admin>> getList() {
        List<Admin> admins = AdminService.getAll();
        if (admins.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(admins, HttpStatus.OK);
    }
}



