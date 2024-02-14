package com.rajgroup.HotelBooking.repository;

import com.rajgroup.HotelBooking.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Author : adi
 * Created on : 8:47 PM , 08/02/24
 */
public interface RoomRepository extends JpaRepository<Room, Long> {

    @Query("SELECT DISTINCT r.roomType FROM Room r")
    List<String> findDistinctRoomTypes();
}
