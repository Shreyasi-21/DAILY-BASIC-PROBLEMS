public class Duplicate

{  

    public static void main(String[] args) 

    {   

        int [] a1 = new int [] {1,2,3,7,9,7,8,9};   

        System.out.println("Duplicate elements in given array: ");  


        for(int i = 0; i < a1.length; i++) 

        {  

            for(int j = i + 1; j < a1.length; j++) 

            {  

                if(a1[i] == a1[j])  

                    System.out.println(a1[j]);  

            }  

        }  

    }  

}  
