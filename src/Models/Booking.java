package Models;

import java.util.Date;

public class Booking{

  private int roomNumber;
  private Customer customer;
  private Date checkIn;
  private Date checkOut;
  private float ownedPrice;

  public Booking(int roomNumber, float ownedPrice, Date checkIn, Date checkOut, String customerName){
    this.roomNumber = roomNumber;
    this.ownedPrice = ownedPrice;
    this.checkIn = checkIn;
    this.checkOut = checkOut;
    // room number is assigned from one of the free rooms
  }

}
