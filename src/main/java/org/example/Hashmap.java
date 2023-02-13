package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Logger;
    public class Hashmap {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Scanner sc1=new Scanner(System.in);
            Logger l=Logger.getLogger("com.api.jar");
            l.info("Enter the size of an array");
            int count=sc.nextInt();
            int[] id=new int[count];
            String[] name=new String[count];
            Double[] price=new Double[count];
            for(int i=0;i<count;i++){
                l.info("Enter the Medicines id Number");
                id[i]=sc.nextInt();
                l.info("Enter the Medicines names:");
                name[i]=sc1.nextLine();
                l.info("Enter the Medicine Price");
                price[i]=sc.nextDouble();
            }

            HashMap<Integer,String> med=new HashMap<Integer,String>();
            med.put(id[0],name[0]);
            med.put(id[1],name[1]);
            med.put(id[2],name[2]);
            l.info("Print the elements using Hashmap");
            System.out.println("Iterating Hashmap...");
            for(Map.Entry m : med.entrySet()) {
                System.out.println(m.getKey()+" "+m.getValue());
            }
            l.info("Print the initial elements of hashmap" +med);
            med.putIfAbsent(103, "Acetaminophen");
            System.out.println("After putIfAbsent() method print the elements using hashmap");
            for(Map.Entry m:med.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
            }
            HashMap<Integer,String> med1=new HashMap<Integer,String>();
            med1.put(104,"Ravi");
            System.out.println("Updating the elements using Hashmap ");
            for(Map.Entry m:med1.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
            }
            System.out.println("Give the remove elements using hashmap");
            int n=sc.nextInt();
            med.remove(n);
            System.out.println("After removing the list of elements using hashmap key "+med);
            System.out.println("Enter the name to remove");
            String name1=sc1.nextLine();
            med.remove(n, name1);
            System.out.println("After removing the list of elements using hashmap key value pair: "+med);
            System.out.println("To clear the elements using Hashmap");
            med.clear();
            System.out.println("To check hashmap is empty or not?");
            System.out.println(med.isEmpty());
        }
    }