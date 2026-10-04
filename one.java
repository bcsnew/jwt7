class AgeBelow18Exception extends Exception {
public AgeBelow18Exception(String message) {
super(message);
}
}

class Driver {
String license_no;
String name;
String address;
int age;

public Driver(String license_no, String name, String address, int age) throws AgeBelow18Exception {
if (age < 18) {
throw new AgeBelow18Exception("Age is below 18 years");
}
this.license_no = license_no;
this.name = name;
this.address = address;
this.age = age;
}

public void display() {
System.out.println("Driver Details:");
System.out.println("License No: " + license_no);
System.out.println("Name: " + name);
System.out.println("Address: " + address);
System.out.println("Age: " + age);
}
}

public class one {
public static void main(String[] args) {
try {
Driver d1 = new Driver("MH12-2023001", "Amit Verma", "Pune, Maharashtra", 24);
d1.display();
} catch (AgeBelow18Exception e) {
System.out.println("Exception: " + e.getMessage());
}
try {
Driver d2 = new Driver("MH14-2023002", "Rahul Patil", "Pimpri, Maharashtra", 16);
d2.display();
} catch (AgeBelow18Exception e) {
System.out.println("Exception: " + e.getMessage());
}
}
}
