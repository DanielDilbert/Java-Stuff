import java.security.SecureRandom;

public class Room {

  // instance variables for directions
  private Room north;
  private Room east;
  private Room west;
  private Room south;

  // instance variables for desciptions, exits, and toString
  private String itsDescription;
  private String itsExit;
  private String toString;

  SecureRandom randomChance = new SecureRandom();

  public Room(String description) {

    this.itsDescription = description;
    this.north = null;
    this.east = null;
    this.west = null;
    this.south = null;

  } // end of constructor

  public void setNorth(Room north) {

    this.north = north;

  } // end of setNorth

  public void setEast(Room east) {

    this.east = east;

  } // end of setEast

  public void setWest(Room west) {

    this.west = west;

  } // end of setWest

  public void setSouth(Room south) {

    this.south = south;

  } // end of setSouth

  public void setExits(Room n, Room e, Room w, Room s) {

    setNorth(n);
    setEast(e);
    setWest(w);
    setSouth(s);

  } // end of setExits

  public Room getNorth() {

    return this.north;

  } // end of getNorth

  public Room getEast() {

    return this.east;

  } // end of getEast

  public Room getWest() {

    return this.west;

  } // end of getWest

  public Room getSouth() {

    return this.south;

  } // end of getSouth

  public String getDescriptions() {

    return itsDescription;

  } // end of getDescriptions

  public String getExits() {

    return itsExit;

  } // end of getExits

  public String toString() {

    return itsDescription;

  } // end of toString

} // end of class
