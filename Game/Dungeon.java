public class Dungeon {

  // instance variables for rooms
  private Room bathroom;
  private Room mainBedroom;
  private Room westHall;
  private Room livingRoom;
  private Room kitchen;
  private Room eastHall;
  private Room guestBedroom;
  private Room startRoom;


  public Dungeon() {
    // desciptions for rooms
    this.bathroom = new Room("\nYou are in the Bathroom. There is a door east of you.");
    this.mainBedroom = new Room("\nYou are in the Main Bedroom. There is a door north of you.");
    this.westHall = new Room("\nYou are in the West Hall. There are doors north, east, west, and south of you.");
    this.livingRoom = new Room("\nYou are in the Living Room. There are doors east and south of you.");
    this.kitchen = new Room("\nYou are in the Kitchen. There are doors west and south of you.");
    this.eastHall = new Room("\nYou are in the East Hall. There are doors north, east, and west of you.");
    this.guestBedroom = new Room("\nYou are in the Guest Bedroom. There is a door west of you.");

    // exits for rooms
    this.bathroom.setExits(null, westHall, null, null);
    this.mainBedroom.setExits(westHall, null, null, null);
    this.westHall.setExits(livingRoom, eastHall, bathroom, mainBedroom);
    this.livingRoom.setExits(null, kitchen, null, westHall);
    this.kitchen.setExits(null, null, livingRoom, eastHall);

    /*
    this.eastHall.setExits(kitchen, guestBedroom, westHall, null);
    this.guestBedroom.setExits(null, null, eastHall, null);
    this.guestBedroom.setExits(null, null, eastHall, null);
    this.guestBedroom.setExits(null, null, eastHall, null);
    this.guestBedroom.setExits(null, null, eastHall, null);
    this.guestBedroom.setExits(null, null, eastHall, null);
    this.guestBedroom.setExits(null, null, eastHall, null);
    this.guestBedroom.setExits(null, null, eastHall, null);
    this.guestBedroom.setExits(null, null, eastHall, null);
    */


    // starting room
    this.startRoom = this.bathroom;
    
  } // end of constructor

  // starting room method
  public Room getRoom0() {

    return this.startRoom;

  } // end of getRoom0

} // end of class
