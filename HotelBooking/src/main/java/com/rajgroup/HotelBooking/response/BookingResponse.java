package com.rajgroup.HotelBooking.response;

import com.rajgroup.HotelBooking.model.Room;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * Author : adi
 * Created on : 2:34 PM , 11/02/24
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingResponse {

    private Long id;

    private LocalDate checkedInDate;

    private LocalDate checkedOutDate;

    private String guestName;

    private String guestEmail;

    private int numOfAdults;

    private int numOfChildren;

    private int totalNumOfGuests;

    private String bookingConfirmationCode;

    private Room room;

    public BookingResponse(Long id, LocalDate checkedInDate, LocalDate checkedOutDate,
                           String bookingConfirmationCode) {
        this.id = id;
        this.checkedInDate = checkedInDate;
        this.checkedOutDate = checkedOutDate;
        this.bookingConfirmationCode = bookingConfirmationCode;
    }
}
