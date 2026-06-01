package Area_Volume;
//Main function is Outside The Class
class Area {
    private int length, breadth;
    public int height;

    void SetData(int l, int b) {
        length = l;
        breadth = b;
    }

    int GetArea() {
        System.out.println("Calculating Area....");
        return (length * breadth);
    }

    int GetVolume() {
        System.out.println("Calculating Volume....");
        return (length * breadth * height);
    }
}
public class Main {
    public static void main(String[] args) {
        Area room1 = new Area();
        room1.SetData(10, 20);
        room1.height = 30;
        System.out.println("Area is : " + room1.GetArea());
        System.out.println("Volume is : " + room1.GetVolume());
    }
}