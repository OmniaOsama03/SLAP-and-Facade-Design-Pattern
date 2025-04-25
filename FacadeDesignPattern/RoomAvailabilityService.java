package FacadeDesignPattern;

class RoomAvailabilityService {
    public boolean isRoomAvailable(String roomType) {
        System.out.println("Checking availability for: " + roomType);
        return true;
    }
}
