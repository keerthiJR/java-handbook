public class statements {
    public static void main(String args[]){
        boolean name = true;
        if(name == true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        int a=10,b=20;

        if((a > b) && (a < b)){
            System.out.println("yeahh! its 10");
        }else{
            System.out.println("nah ! its not 10");
        }

        if((a > b) || (a < b)){
            System.out.println("yeahh! its 10");
        }else{
            System.out.println("nah ! its not 10");
        }

        // Diff btw assignment operator and == operator

        int z=10;
        if(z==10){System.out.println("hello");}
        boolean z1=false;
        if(z1==true){System.out.println("hi");}else{System.out.println("hello");}
        if(z1=true){System.out.println("hello");}                     // its satisfies only for boolean

        boolean iscar = false;
        if(!iscar == true){
            System.out.println("it is a car");
        }else{
            System.out.println("its not a car");
        }

        boolean wascar=true;
        boolean z11= wascar?true:false;
        if(z11){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        int m1 = 10;
        boolean m2 = (m1 == 10) ? true : false ;
        if(m2){System.out.println("true");
        }else {
        System.out.println("false");
        }

    }
}
