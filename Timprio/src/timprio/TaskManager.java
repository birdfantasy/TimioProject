/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timprio;
import java.util.*;

/**
 *
 * @author Fatem
 */
public class TaskManager {
    
    private List<Task> tasks = new ArrayList<>();
    
    //creating tasks
    public void addTask(Task task) {
        tasks.add(task);
    }
    
    //sort by priority
    public void sortPriority(boolean order) {
        if (order) {
            tasks.sort((a,c) -> a.getPriority() - c.getPriority());
        } else {
            tasks.sort((a,c) -> c.getPriority() - a.getPriority());
        }
    }
    
    //sort by time
    public void sortTime(boolean order) {
        if (order) {
            tasks.sort((a, b) -> Integer.compare(a.getTime(), b.getTime()));
        } else {
            tasks.sort((a, b) -> Integer.compare(b.getTime(), a.getTime()));
        }
    }
    
    //showing tasks
    public void displayTasks() {
        System.out.println("Priority: \tTask:\t\tEstimated Time:");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
    
    public void displayTaskindex() {
        System.out.println("Index\tTask:");
        int i=0;
        for (Task task : tasks) {
            System.out.println(i+". " + task.getName());
            i++;
        }
    }
    
    
    //remove a task
    public void removeTask(int index) {
        int i=0;
        for (Task task : tasks) {
            //System.out.println(i+". " + task.getName());
            
            if (i==index) {
                tasks.remove(i);
            }
            
            i++; 
            
        }
    }
    
}
