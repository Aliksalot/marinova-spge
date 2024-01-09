package Models;

public class Room{

  private boolean isTaken;
  private int roomNumber;
  private int price;

  public Room(boolean isTaken, int roomNumber, int price ){
    this.isTaken = isTaken;
    this.roomNumber = roomNumber;
    this.price = price;
  }

  public boolean isTaken(){
    return this.isTaken;
  }

  public int getRoomNumber(){
    return this.roomNumber;
  }

  public int getPrice(){
    return this.price;
  }
  
}