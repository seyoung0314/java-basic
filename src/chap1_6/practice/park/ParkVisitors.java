package chap1_6.practice.park;

public class ParkVisitors {
    static ParkEntry[] visitorList;

    public ParkVisitors() {
        visitorList = new ParkEntry[]{

        };
    }


    public static void addVisitor(String visitor) {
        ParkEntry newVisitor = new ParkEntry(visitor);
        ParkEntry[] temp = new ParkEntry[visitorList.length + 1];
        for (int i = 0; i < visitorList.length; i++) {
            temp[i] = visitorList[i];
        }
        temp[temp.length-1] = newVisitor;
        visitorList = temp;
        temp = null;
    }

}
