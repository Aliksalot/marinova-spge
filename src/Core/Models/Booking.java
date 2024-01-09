package Models;

import java.util.Date;

public class Booking implements JSONMapper{

  private int roomNumber;
  private Customer customer;
  private Date checkIn;
  private Date checkOut;
  private float ownedPrice;

  public Booking(int roomNumber, float ownedPrice, Date checkIn, Date checkOut, String customerName){
    // creates new booking
    this.customer = new Customer(customerName);
    this.ownedPrice = ownedPrice;
    this.checkIn = checkIn;
    this.checkOut = checkOut;
    // room number is assigned from one of the free rooms 
    
  }

  public Booking(int roomNumber){
    //This requests for an existing reservation based on room number

  }

  @Override
  public boolean sync(){

    return true;
  }

}
