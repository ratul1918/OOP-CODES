import java.util.Scanner;

public class Candidate {
    int Rno;
    String name;
    float score;
    String Remarks;

    public void AssignRem(){
        if (score >= 50) {
            Remarks="selected";
        }
        else
            Remarks="not selected";
    }
    public void  Enter(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter roll number: ");
        Rno=sc.nextInt();
        System.out.println("Enter name: ");
        name=sc.next();
        System.out.println("Enter score:");
        score=sc.nextFloat();
        AssignRem();

    }
    public void Display(){
        System.out.println("Roll no: "+Rno);
        System.out.println("name : "+name);
        System.out.println("score : "+score);
        System.out.println("Remarks: "+Remarks);

    }


}
// this is candidate class
