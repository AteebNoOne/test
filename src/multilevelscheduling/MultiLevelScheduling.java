/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multilevelscheduling;

import java.util.Scanner;

public class MultiLevelScheduling {
    private final String proc_name;
    private final int proc_id;
    private final int proc_burst;
    private final int proc_arrival;

    // constructor
    public MultiLevelScheduling(String proc_name, int proc_id, int proc_burst, int proc_arrival) {
        this.proc_name = proc_name;
        this.proc_id = proc_id;
        this.proc_burst = proc_burst;
        this.proc_arrival = proc_arrival;        
    }

    // getter
    public String getName() {
        return proc_name;
    }
    public int getID() {
        return proc_id;
    }
    public int getBurst() {
        return proc_burst;
    }
    public int getArrival() {
        return proc_arrival;
    }    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int burstinp,arrivalinp;
        System.out.print("Burst time:");
        burstinp = input.nextInt();
        System.out.print("Arrival time:");
        arrivalinp = input.nextInt();
        MultiLevelScheduling[] array = new MultiLevelScheduling[4];  // new stands for create an array object
        array[0] = new MultiLevelScheduling("System.exe",16417,(burstinp),(arrivalinp)); // new stands for create an employee object     
        System.out.println("Process name \tProcess ID \tBurst time \tArrival time");
        for (MultiLevelScheduling array1 : array) {
            System.out.println(array1.getName() + "\t" + array1.getID() + "\t\t" + array1.getBurst() + "\t\t" + array1.getArrival());
        }
        /** Scanner input = new Scanner(System.in);
        int proc_count;
        proc_count = input.nextInt();
        int [] burst;
        burst = new int [proc_count];
        for(int i=0;i<proc_count;i++){
        System.out.print("Burst Time:");
        burst[i]=input.nextInt();
        }
        int temp;
        for (int i = 0; i < burst.length-1; i++)
        {
        if(burst[i] > burst[i+1])
        {
        temp=burst[i];
        burst[i]=burst[i+1];
        burst[i+1]=temp;
        i=-1;
        }
        }
        System.out.println("Reordering by Shortest Job First...");
        for(int i=0;i<proc_count;i++){
        System.out.println("Process "+(i+1)+" Burst time:"+burst[i]);
        }*/
    
            /** Scanner input = new Scanner(System.in);
            int proc_count;
            proc_count = input.nextInt();
            int [] burst;
            burst = new int [proc_count];
            for(int i=0;i<proc_count;i++){
            System.out.print("Burst Time:");
            burst[i]=input.nextInt();
            }
            int temp;
            for (int i = 0; i < burst.length-1; i++)
            {
            if(burst[i] > burst[i+1])
            {
            temp=burst[i];
            burst[i]=burst[i+1];
            burst[i+1]=temp;
            i=-1;
            }
            }
            System.out.println("Reordering by Shortest Job First...");
            for(int i=0;i<proc_count;i++){
            System.out.println("Process "+(i+1)+" Burst time:"+burst[i]);
            }*/
        
    }

}


