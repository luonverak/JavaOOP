package OOP;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainFunc {
   
    public static void main(String[] args) {
       
        Student student = new Student();
        List<Student> list = new ArrayList<>();      
        Scanner scanner = new Scanner(System.in);
        
        int i=0,n=0,op=0;
        
        do
        {
            System.out.println("---------- Student -------------");
            System.out.println("1,  Input");
            System.out.println("2,  Output");
            System.out.println("3,  Search");
            System.out.println("4,  Update");
            System.out.println("5,  Insert");
            System.out.println("6,  Delete");
            System.out.println("7,  Sort");
            System.out.println("8,  Add");
            System.out.println("9,  Exit");
            System.out.print("Choose option on the menu = ");
            op=scanner.nextInt();
            switch(op){
                case 1:{
                    System.out.print("Input number of student = ");
                    n=scanner.nextInt();
                    for(i=0;i<n;i++){
                        student = new Student();
                        student.Input();
                        list.add(student);
                    }
                }break;
                case 2:{
                    for(i=0;i<list.size();i++){
                        System.out.println(list.get(i).toString());
                    }
                }break;
                case 3:{
                    int var;
                    boolean check = false;
                    System.out.print("Search by id = ");var=scanner.nextInt();
                    for(i=0; i<list.size(); i++){
                        if(var==list.get(i).getId()){
                            System.out.println(list.get(i).toString());
                            check=true;
                        }
                    }if(check==false){System.out.println("Not found");}
                    else{System.out.println("Success");}
                }break;
            }
        }while(op!=9);
       
    }
    
}
