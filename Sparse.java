import java.util.Scanner; 
public class Sparse 
{ 
    public static void main(String[] args) 
    { 
        
        int m, n;  
       
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of rows ");   
      
        m = sc.nextInt();   
        System.out.println("Enter the number of columns ");  
        
        n = sc.nextInt();   
      
        int a[][] = new int[m][n];   
        System.out.println("Enter all the values of matrix "); 
        
        for (int i = 0; i < m; i++) 
        { 
            for (int j = 0; j < n; j++) 
            { 
                a[i][j] = sc.nextInt();                 
            } 
        }    
      
        
        for (int i = 0; i < m; i++) 
        { 
            for (int j = 0; j < n; j++) 
            { 
                    System.out.print(a[i][j] + " "); 
            } 
            System.out.println(""); 
        } 
        int size= m*n;   
        int count=0;       
         
        for(int i = 0; i < m; i++)
        {    
            for(int j = 0; j < n; j++)
            {    
                if(a[i][j] == 0)    
                    count++;    
            }    
        }        
        if(count>(size/2))
        System.out.println("It is a sparse matrix");
        else
        System.out.println("It is not a sparse matrix");           
    } 
}
