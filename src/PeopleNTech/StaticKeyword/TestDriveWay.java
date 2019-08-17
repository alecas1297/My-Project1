package PeopleNTech.StaticKeyword;

public class TestDriveWay {
    public static void main(String[] args) {
        DriveWay alexDriveWay = new DriveWay();
        alexDriveWay.setDriveWaySize(10);
        System.out.println("Alex's driveway size is: " + alexDriveWay.getDriveWaySize());

        DriveWay gabyDriveWay = new DriveWay();
        gabyDriveWay.setDriveWaySize(12);
        System.out.println("Gaby's driveway size is: " + gabyDriveWay.getDriveWaySize());

        System.out.println("Alex's driveway size is: " + alexDriveWay.getDriveWaySize());

        DriveWay.shapeOfDriveWay();
    }
}
