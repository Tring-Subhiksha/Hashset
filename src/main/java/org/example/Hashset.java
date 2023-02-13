package org.example;
import java.util.HashSet;
import java.util.Scanner;
import java.util.logging.Logger;
import java.util.Iterator;

class Medicines{
    String name;
    Medicines(String medicinename){
        this.name=medicinename;
    }
}
public class Hashset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        Logger l=Logger.getLogger("com.api.jar");
        l.info("Enter the size of an array");
        int count=sc.nextInt();
        String[] name=new String[count];
        for(int i=0;i<count;i++){
            l.info("Enter the medicines names:");
            name[i]=sc1.nextLine();
        }

        Medicines s1=new Medicines(name[0]);
        Medicines s2=new Medicines(name[1]);
        Medicines s3=new Medicines(name[2]);
        HashSet<Medicines> med=new HashSet<Medicines>();
        med.add(s1);
        med.add(s2);
        med.add(s3);
        Iterator<Medicines> iterator = med.iterator();
        l.info("Print the  Medicine names using Hashset");
        while (iterator.hasNext()) {
            l.info(iterator.next().name);
        }
        l.info("To remove one item from the hashset");
        l.info(med.remove(s2));
        l.info("To check whether the elements is present or not in hashset");
         l.log(Level.INFO, () ->(med.contains(s2));
        l.info("To clear the elements using Hashset");
        med.clear();
        l.info("To check hashset is empty or not?");
         l.log(Level.INFO, () ->(med.isEmpty());

    }
}
