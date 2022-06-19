package com.irfan.sbet.roomwebapp.data;

import com.irfan.sbet.roomwebapp.models.StaffMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<StaffMember, String> {
}
