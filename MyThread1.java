import java.io.*;
import java.util.*;

class MyThread extends Thread {
    public void run()
    {
        System.out.println("Hello All");
    }
}
 
public class MyThread {
    public static void main(String[] args)
    {
        int n = 5; // Number of threads
        for (int i = 0; i < n; i++) {
        MyThread object= new MyThread();
        object.start();
        
        }
    }
}