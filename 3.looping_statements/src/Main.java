import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Player[] pObj =new Player[4];
        pObj[0]=new Player(146,"Athul",16,9876543210l);
        pObj[1]=new Player(147,"Athul",16,9876543210l);
        pObj[2]=new Player(148,"Athul",16,9876543210l);
        pObj[3]=new Player(149,"Athul",16,9876543210l);

        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
//        for(int i=0;i< pObj.length;i++) {
//            System.out.println("playerId : "+pObj[i].getPlayerId()+"\nplayername : "+pObj[i].getPlayerName()+"\nplayerage : "+pObj[i].getAge()+"\nplayerNumber "+pObj[i].getPhoneNumber());
//            System.out.println();
//        }
//        return pObj;
//        pObj.findPlayerDetailsById(pObj,id);

       // Player t1=new Player(0,'uu');
        //t1=findPlayerDetailsById(pObj,id);
       // System.out.println(t1);




    }
}
