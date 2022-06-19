package com.irfan.sbet.roomwebapp.data;

import com.irfan.sbet.roomwebapp.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {

}
