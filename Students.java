import java.util.*;
public class Students {
    String name;
    int rollNo;
    int mathMarks;
    int phyMarks;
    int chemMarks;

    static Scanner sc = new Scanner(System.in);

    public void getDetails() {
        System.out.println("Name : "+name);
        System.out.println("Roll Number : "+rollNo);
        System.out.println("Maths Marks : " + mathMarks);
        System.out.println("Physics Marks : " + phyMarks);
        System.out.println("Chemistry Marks : " + chemMarks);

        int total = mathMarks + phyMarks + chemMarks;
        float per = (total /3);
        System.out.println("Your Percentage is : " + per);

        if(per>90.00){
            System.out.println(" has passed with grade A+");
        }
        else if(per<=90.00 && per>80.00){
            System.out.println(" has passed with grade A");
        }
        else if(per<=80.00 && per>70.00){
            System.out.println(" has passed with grade B+");
        }
        else if(per<=70.00 && per>60.00){
            System.out.println(" has passed with grade B");
        }
        else if(per<=60.00 && per>50.00){
            System.out.println(" has passed with grade C+");
        }
        else if(per<=50.00 && per>40.00){
            System.out.println(" has passed with grade C");
        }
        else if(per<=40.00 && per>30.00){
            System.out.println(" has passed with grade D");
        }
        else if(per<=30.00){
            System.out.println(" You are failed");
        }
    }

    public void getInfo(){
        System.out.println("Enter Name : ");
        name = sc.nextLine();
        System.out.println("Enter  Roll Number : ");
        rollNo=sc.nextInt();
        System.out.println("Enter Maths marks : ");
        mathMarks = sc.nextInt();
        System.out.println("Enter Physics marks : ");
        phyMarks = sc.nextInt();
        System.out.println("Enter Chemistry marks : ");
        chemMarks = sc.nextInt();
    }

    public static void main(String[] args) {
        Students s = new Students();
        s.getInfo();
        s.getDetails();
    }
}
