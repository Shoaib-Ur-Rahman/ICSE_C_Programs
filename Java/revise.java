import java.io.*;
import java.util.*;
class revise
{
    public static void main(String args[])
    {
    Scanner Sc=new Scanner(System.in);
    System.out.println("School Management System");
    {
        System.out.println("1. Enter Student Details");
        System.out.println("Enter Name: ");
        String name=Sc.next();
        System.out.println("Enter Roll No: ");
        int roll=Sc.nextInt();
        System.out.println("Enter Class: ");
        int cl=Sc.nextInt();
        System.out.println("Enter Section: ");
        char sec=Sc.next(".").charAt(0);
        System.out.println("Following Are The Details Of Student:");
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+roll);
        System.out.println("Class: "+cl);
        System.out.println("Section: "+sec);
    }
    {
        System.out.println("Enter Marks Of Any 5 Subjects: ");
        int s1=Sc.nextInt();
        int s2=Sc.nextInt();
        int s3=Sc.nextInt();
        int s4=Sc.nextInt();
        int s5=Sc.nextInt();
        double Total=(double)(s1+s2+s3+s4+s5);
        double per=(Total/500)*100;
        System.out.println("Total Marks: "+Total);
        System.out.println("Percentage: "+per);
        String grade;
        if(per<=25)
            grade="Fail";
        else if(per>25 && per<=50)
            grade="Pass";
        else if(per>50 && per<=75)
            grade="Average";
        else if(per>75 && per<=90)
            grade="1st Class";
        else
            grade="Distinction";
        System.out.println("Grade: "+grade);
        boolean sub1=false,sub2=false,sub3=false,sub4=false,sub5=false;
        if(s1>s2 && s1>s3 && s1>s4 && s1>s5)
            sub1=true;
        else if (s2>s1 && s2>s3 && s2>s4 && s2>s5)
            sub2=true;
        else if (s3>s1 && s3>s2 && s3>s4 && s3>s5)
            sub3=true;
        else if (s4>s1 && s4>s2 && s4>s3 && s4>s5)
            sub4=true;
        else if (s5>s1 && s5>s2 && s5>s3 && s5>s4)
            sub5=true;
        if (sub1)
            System.out.println("Subject 1 Has The Highest Marks");
        else if (sub2)
            System.out.println("Subject 2 Has The Highest Marks");
        else if (sub3)
            System.out.println("Subject 3 Has The Highest Marks");
        else if (sub4)
            System.out.println("Subject 4 Has The Highest Marks");
        else if (sub5)
            System.out.println("Subject 5 Has The Highest Marks");
        boolean subf1=false, subf2=false, subf3=false, subf4=false, subf5=false;
            if(s1<s2 && s1<s3 && s1<s4 && s1<s5)
            subf1=true;
        else if (s2<s1 && s2<s3 && s2<s4 && s2<s5)
            subf2=true;
        else if (s3<s1 && s3<s2 && s3<s4 && s3<s5)
            subf3=true;
        else if (s4<s1 && s4<s2 && s4<s3 && s4<s5)
            subf4=true;
        else if (s5<s1 && s5<s2 && s5<s3 && s5<s4)
            subf5=true;
        if (subf1)
            System.out.println("Subject 1 Has The Lowest Marks");
        else if (subf2)
            System.out.println("Subject 2 Has The Lowest Marks");
        else if (subf3)
            System.out.println("Subject 3 Has The Lowest Marks");
        else if (subf4)
            System.out.println("Subject 4 Has The Lowest Marks");
        else if (subf5)
            System.out.println("Subject 5 Has The Lowest Marks");
    }
    {
        System.out.println("Enter Tution Fee: ");
        int tution=Sc.nextInt();
        System.out.println("Enter Bus Fee: ");
        int bus=Sc.nextInt();
        System.out.println("Enter Examination Fee: ");
        int exam=Sc.nextInt();
        double totf=tution+bus+exam;
        double dis=1;
        if (totf>50000)
        dis=10/100*totf;
        System.out.println(dis);
        
    }
    }
}