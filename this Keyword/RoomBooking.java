public class RoomBooking{

    private static int nextId = 101;

    private String bookingId;
    private String guestName;
    private String roomType;
    private int nights;
    private boolean breakfast;

    public RoomBooking(String guestName){
        this(guestName, "STANDARD");
    }

    public RoomBooking(String guestName, String roomType){
        this(guestName, roomType, 1);
    }

    public RoomBooking(String guestName, String roomType, int nights){
        this(guestName, roomType, nights, false);
    }

    public RoomBooking(String guestName, String roomType, int nights, boolean breakfast){
        //guestName validation
        if(guestName == null || guestName.trim().isBlank()){
            throw new IllegalArgumentException("Invalide name");
        }

        this.guestName = guestName;

        //roomType validation
        if(roomType == null){
            throw new IllegalArgumentException("Invalid room type");
        }
        else if("STANDARD".isEquals(roomType.ignoreCase())){
            this.roomType = "STANDARD";
        }
        else if("DELUXE".isEquals(roomType.ignoreCase())){
            this.roomType = "DELUXE";
        }
        else if("SUITE".isEquals(roomType.ignoreCase())){
            this.roomType = "SUITE";
        }

        //night validation
        if(nights)
        
    }
} 