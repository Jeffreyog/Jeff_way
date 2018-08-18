package foodmenu;
import java.util.Scanner;
enum code{
    code101,code102,code103,code104,code105,code106,code107,code108
}
public class FoodMenu {
    //static String a="y";
    static char res2[]={'y'};
    public void exit(){
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("NEXT CUSTOMER PLEASE");
        System.out.println("DO YOU WISH TO CONTINUE");
        System.out.println("(YES):CONTINUE");
        System.out.println("(NO):EXIT");
        //a=sc.next();
        String res=sc.next().toLowerCase();
        res2=res.toCharArray();
        if (res2[0]=='n'){
            System.out.println("GOODBYE");    
        }
        /*if (a.equalsIgnoreCase("n")){
            System.out.println("GOODBYE");        
        }*/
    }
    public void Menu(){
        while(res2[0]=='y'/*a.equalsIgnoreCase("y")*/){
            Scanner sc=new Scanner(System.in);
            code cc=code.code101;
            System.out.println("===========FOOD MENU===========");
            System.out.println("(code101):RICE AND PLANTAIN");
            System.out.println("(code102):BEANS AND PLANTAIN");
            System.out.println("(code103):SEMO AND EGUSI");
            System.out.println("(code104):BREAD AND TEA");
            System.out.println();
            System.out.print("ENTER YOUR CHOICE: ");
            String food_choice=sc.nextLine();
            System.out.print("ENTER YOUR IDENTITY: ");
            int code_no=sc.nextInt();
            switch(code.valueOf(food_choice)){
                case code101:
                    System.out.println("YOUR CHOICE IS RICE AND PLANTAIN");
                    System.out.println("AND YOUR ID NUMBER IS "+code_no);                    
                    exit();
                    break;
                case code102:
                    System.out.println("YOUR CHOICE IS BEANS AND PLANTAIN");
                    System.out.println("AND YOUR ID NUMBER IS "+code_no);
                    exit();
                    break;
                case code103:
                    System.out.println("YOUR CHOICE IS SEMO AND EGUSI");
                    System.out.println("AND YOUR ID NUMBER IS "+code_no);
                    exit();
                    break;
                case code104:
                    System.out.println("YOUR CHOICE IS BREAD AND TEA");
                    System.out.println("AND YOUR ID NUMBER IS "+code_no);
                    exit();
                    break;
                default:
                    System.out.println("INCORRECT CODE NUMBER");
                    exit();
            }
        }
    }
    public static void main(String[] args) {
        FoodMenu fm=new FoodMenu();
        fm.Menu();        
    }
    
}

