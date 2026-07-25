/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.timio;
import java.util.Scanner;

/**
 *
 * @author Fatem
 */


public class Timio {
    
    
    public static void main(String[] args) {
        //input task here
        System.out.println("Task?");
        Scanner scan = new Scanner(System.in);
        String task = scan.nextLine();
        
        //input estimated time here
        System.out.println("Estimated time?");
        int tim = scan.nextInt();
        
        //input priority
        System.out.println("Priority? (A, B, C?");
        String prio = scan.nextLine();
        
        // creating that task
        Task task1 = new Task();
        task1.time = tim;
        task1.priority = prio;
        
    }
}
