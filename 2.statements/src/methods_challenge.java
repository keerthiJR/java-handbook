public class methods_challenge {
    public static void displayHighScorePosition(String name,int position){
        System.out.println("i am "+name+" and i got position "+position+" on the high score table");
    }
    public static int calculateHighScorePosition(int score){
        if(score>=1000){
            return 1;
        }else if(score>=500){// && score<1000){                      // else if(score>=50) ---- score <1000 is always true
            return 2;
        }else if(score>=100){ // && score<500){                      // else if(score>=100) ---- score <500 is always true
            return 3;
        }return 4;
    }

//    public static int calculateHighScorePosition(int score){
//        // to eliminate the n number of return statements
//        int position = 4;  // assuming position 4 will be returned
//        if(score>=1000){
//            position=1;
//        }else if(score>=500){// && score<1000){                      // else if(score>=50) ---- score <1000 is always true
//            position=2;
//        }else if(score>=100){ // && score<500){                      // else if(score>=100) ---- score <500 is always true
//            position=3;
//        }return position;
//    }



    public static void main(String[] args){

        int a=(calculateHighScorePosition(1500));
        displayHighScorePosition("keerthi JR",a);
        int b=(calculateHighScorePosition(900));
        displayHighScorePosition("neymar",b);
        int c=(calculateHighScorePosition(400));
        displayHighScorePosition("messi",c);
        int d=(calculateHighScorePosition(50));
        displayHighScorePosition("de bruyne",d);
    }
}
