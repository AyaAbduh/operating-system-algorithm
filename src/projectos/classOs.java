
package projectos;


public class classOs {
   
    protected int priority [];
    protected int Arrival[];
    protected int brust[];
    protected int process[];
    protected static int currenttime;
       
          classOs (int numb){
        priority =new int [numb];
        Arrival  =new int [numb];
         brust  =new int [numb];
         process=new int [numb];
         currenttime=0;
    }
          public void  deleteProcess(int index,int numb){
              int prio=priority[0];
              for(int i=1;i<numb;i++){
              if(priority[i]>prio)
                  prio=priority[i];
              }
              priority[index]=prio+1;
          }
          
          public int firstarrive(int index,int numb){
                int run=Arrival[0];
                for(int i=1;i<numb;i++){
           if(Arrival[i]<run){
        run=Arrival[i];
        index=i;}
    else if(Arrival[i]==run){
        if(priority[i]<priority[index])
        {
            run=Arrival[i];
            index=i; }}}        
  
          return index;
          }
          
    public int[] process (int numb){   
       for(int j=0;j<numb;j++){
        int index=0;
      
 
      if(currenttime==0)
    {
      index=firstarrive(index,numb);
      }
   else if(currenttime!=0){
       int count=0,run=0;
        for(int k=0;k<numb;k++){
        if(currenttime >=Arrival[k]){
           count++;
         run=priority[k]; 
         index=k;
        }}
           
     for(int i=0;i<count;i++){
        if(currenttime >Arrival[i]&&priority[i]<run){       
         run=priority[i];
         index=i;
     }}}
       System.out.println(currenttime);
    currenttime+=brust[index];
         //  System.out.println(index);
           System.out.println(currenttime);
    process[j]=index+1;
    deleteProcess(index,numb);
    
  }return process;
    }}
    
    


