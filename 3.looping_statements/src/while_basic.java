public class while_basic {
    public static boolean isEvenNumber(int num){
        if(num%2==0){
            return true;
        }return false;
    }

                                                       // break and continue

                                 /*   break - it terminates out of the loop
                                      continue - it will not terminate the loop, it forces the next iteration of the loop*/


    public static void main(String[] args){

//        for(int i=1;i<6;i++){
//            System.out.println("count num: "+i);            // for loop
//        }
//        System.out.println("\n");
//
//        int i=1;
//        while(i<6){
//            System.out.println("count num: "+i);
//            i++;                                            // while loop
//        }
//        System.out.println("\n");
//
//        int j=1;
//        do{
//            System.out.println("count num: "+j);
//            j++;                                           // Do-While loop
//        }while(j<6);

        int start=2,end=20;
        int sum=0,result=0;
        while(start<=end){
            start++;
            if(!isEvenNumber(start)){
                continue;
            }result++;
            sum+=start;
            System.out.println("even number is "+start);
            if(result==5){

                break;
            }



        }System.out.println("total number of even numbers :"+result);
        System.out.println("total sum of number of even numbers are :"+sum);





    }
}
