/**
* @author Likun Ma
* Assignment4RoomDriver
* /**
*@author Likun Ma 
* Assignment4-room 
* April 7,2015 
* ml20130@email.vccs.edu
*/



public class RoomDrive  {

        public static void main(String[] args) {
                Room room1 = new Room("yellow","wood",1);
                Room room2 = new Room("purple","tile",0);
                Room room3 = new Room("white","carpet",3);
                System.out.println("Room1");
                System.out.println(room1.toString());
                System.out.println("Room2");
                System.out.println(room2.toString());
                System.out.println("Room3");
                System.out.println(room3.toString());
                 
}


}


class Room {


       private String wall_color = "white";
       private String floor = "carpet";
       private int windows = 0;
       //instantiates a new room
       public Room(){
              System.out.println("Create a default room");
}

       //wall_color the wall_color

public Room(String wall_color){
       this.wall_color = wall_color;
       StringBuffer sb = new StringBuffer();
       sb.append("Create a room with "); 
       sb.append(this.wall_color);
       sb.append("wall,");
       sb.append(this.floor);
       sb.append("floor and ");
       sb.append(this.windows);
       sb.append(" windows.");
       System.out.println(sb.toString());
}
       //floor the floor type
       //windows the window number


      public Room(String wall_color, String floor, int windows){
        this.wall_color=wall_color;
        this.floor=floor;
        this.windows=windows;
        StringBuffer sb = new StringBuffer();
        sb.append("Create a room with ");
        sb.append(this.wall_color);
        sb.append(" wall,");
        sb.append(this.floor);
        sb.append(" floor and ");

	}



       public String toString(){

		
           StringBuffer sb = new StringBuffer();
           sb.append("wall_color:");
           sb.append(this.wall_color);
           sb.append("\n");
           sb.append(" floor:");
           sb.append(this.floor);
           sb.append("\n");
           sb.append(" windows:");
           sb.append(this.windows);
           return sb.toString();

	}

        // Gets the wall_color.
//return the wall_color


public String getWall_color() {

	return wall_color;
}

// Sets the wall_color.
//wall_color the new wall color


 public void setWall_color(String wall_color) {
          this.wall_color = wall_color;
}

// Gets the floor type.
//return the floor type



	public String getFloor() {
                return floor;
}

// Sets the floor type
// floor the new floor type

       public void setFloor(String floor) {
                   this.floor = floor;

}

// Gets the window number
// @return the window number

public int getWindows() {
             return windows;
}
 

             // set the window number
// windows the new window number 

public void setWindows(int windows) {
           this.windows = windows;
}

}




























