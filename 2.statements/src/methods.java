public class methods {
    public static void calculatescore(boolean gameover,int score,int levelcompleted,int bonus){
        if(gameover){
            int finalscore = score + (levelcompleted * bonus);
            System.out.println("your final score was "+finalscore);
        }
//      public static int calculatescore(boolean gameover,int score,int levelcompleted,int bonus){int finalscore=0;
//        if(gameover){
//             finalscore = score + (levelcompleted * bonus);
//             return finalscore;
//        }return -1;
    }

    public static void main(String[] args){
//        boolean gameover = true;
//        int score = 800;
//        int levelcompleted = 5;
//        int bonus = 100;

        calculatescore(true,800,5,100);
        calculatescore(true,10000,8,400);

//        System.out.println("your final score is "+calculatescore(true,800,5,100));
//        System.out.println("your final score is "+calculatescore(true,10000,8,400));
    }

}
