public class flour_pack_problem {
    public static boolean canPack(int bigCount,int smallCount,int goal){
        int big=bigCount*5;
        int small=smallCount;
        int total=big+small;
        if(total==goal){
            return true;
        }else if(total<goal){
            return false;
        }else{int demo=0,temp=goal;
            while(temp%5!=0){
                demo++;
                temp--;
            }if(small>=demo){
                return true;
            }
            //System.out.println(demo+""+temp);
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(canPack(3, 3, 14)); // false
        System.out.println(canPack (1, 0, 4)); // false
        System.out.println(canPack (1, 0, 5)); // true
        System.out.println(canPack (0, 5, 4)); // true
        System.out.println(canPack (2, 2, 12)); // true
        System.out.println(canPack (2, 10, 18)); // true
        System.out.println(canPack (1, 1, 3)); // false
        System.out.println(canPack (1, -1, 3)); // false
        System.out.println(canPack (2, 0, 5)); // true
        System.out.println(canPack (3, 0, 10)); // true
        System.out.println(canPack (5, 1, 2)); // false
        System.out.println(canPack (2, 1, 6)); // true
        System.out.println(canPack (4, 18, 19)); // true
    }
}



//    canPack (1, 0, 4); should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
//        canPack (1, 0, 5); should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
//        canPack (0, 5, 4); should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos.
//        canPack (2, 2, 12); should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 12 kilos.
//        canPack (-3, 2, 12); should return false since bigCount is negative.
