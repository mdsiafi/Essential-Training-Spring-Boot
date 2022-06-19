package com.irfan.sbet.roomwebapp.controllers;


import com.irfan.sbet.roomwebapp.models.StaffMember;
import com.irfan.sbet.roomwebapp.service.StaffService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {

    private final StaffService staffService;

    public StaffRestController(StaffService staffService) {
        this.staffService = staffService;
    }

@GetMapping
    public List<StaffMember> getAllStaffMember() {
        return staffService.getAllStaff();
    }
}

