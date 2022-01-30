

public class switch_statement {
    public static void main(String[] srgs){
       
        int switchnum=2;
        char switchchar='A';
        String name="KEERTHI";
        
        switch(switchnum){                   // uses only byte, short, int, char, String
            case 1:
                System.out.println("I am "+switchnum);
                break;
            case 2:
                System.out.println("I am "+switchnum);
                break;
            case 3: case 4: case 5:
                System.out.println("I am either 3 or 4 or 5");
                System.out.println("yeahh ! I am "+switchnum);
                break;
            default:
                System.out.println("i am alien");
        }
        switch(switchchar){                      
            case 'A':
                System.out.println("I am "+switchchar);
                break;
            case 'B':
                System.out.println("I am "+switchchar);
                break;
            case 'C':
                System.out.println("I am "+switchchar);
                break;
            case 'D':
                System.out.println("I am "+switchchar);
            default:
                System.out.println("No char found");
        }

        switch(name.toLowerCase()){
            case "keerthi":
                System.out.println("I am "+name);
                break;
            case "neymar":
                System.out.println("I am "+name);
                break;
            case "messi":
                System.out.println("I am "+name);
                break;
            case "vasan":
                System.out.println("I am "+name);
            default:
                System.out.println("No name found");
        }

    }
}
