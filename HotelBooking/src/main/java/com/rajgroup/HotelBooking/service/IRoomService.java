package com.rajgroup.HotelBooking.service;

import com.rajgroup.HotelBooking.model.Room;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

/**
 * Author : adi
 * Created on : 8:50 PM , 08/02/24
 */
public interface IRoomService {

    Room addNewRoom(MultipartFile photo, String roomType, BigDecimal roomPrice) throws IOException, SQLException;

    List<String> getAllRoomTypes();
}
