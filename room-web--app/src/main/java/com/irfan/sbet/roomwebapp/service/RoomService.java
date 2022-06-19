package com.irfan.sbet.roomwebapp.service;

import java.util.ArrayList;
import java.util.List;

import com.irfan.sbet.roomwebapp.data.RoomRepository;
import com.irfan.sbet.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    private RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }

    public Room getById(long id) {
        return roomRepository.findById(id).get();
    }
}