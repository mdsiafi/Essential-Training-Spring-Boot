package com.irfan.sbet.roomwebapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


import com.irfan.sbet.roomwebapp.data.StaffRepository;
import com.irfan.sbet.roomwebapp.models.Position;
import com.irfan.sbet.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

@Service
public class StaffService {
    private StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }
    
    public List<StaffMember> getAllStaff(){
        return staffRepository.findAll();
    }
}