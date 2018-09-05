
package projectos;

import java.util.Scanner;


public class ProjectOs {

    
    public static void main(String[] args) {
        int numb;
        System.out.println("enter number of process");
        Scanner input = new Scanner(System.in);
        numb=input.nextInt();
       classOs project=new classOs(numb);
       for(int i=0;i<numb;i++)
       {
           int n=i+1;
           System.out.println("enter arrival time for process "+n);
           project.Arrival[i]=input.nextInt();
             System.out.println("enter brust time for process "+n);
           project.brust[i]=input.nextInt();
             System.out.println("enter priority for process "+n);
           project.priority[i]=input.nextInt();
       }
     int process[]= project.process(numb);
       for(int i=0;i<numb;i++)
       {
           System.out.println(process[i]);
       }
    }
    
}
