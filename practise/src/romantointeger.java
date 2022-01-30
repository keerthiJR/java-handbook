public class romantointeger {
        public int value(char c){
            int n=0;
            switch(c){
                case 'I':
                    n=1;
                    break;
                case 'V':
                    n=5;
                    break;
                case 'X':
                    n=10;
                    break;
                case 'L':
                    n=50;
                    break;
                case 'C':
                    n=100;
                    break;
                case 'D':
                    n=500;
                    break;
                case 'M':
                    n=1000;
                    break;
            }return n;
        }
        public int romanToInt(String s) {
            int num=0;
            for(int i=0;i<s.length();i++){
                char char1=s.charAt(i);
                if(s.length()==1){
                    num=value(char1);
                    break;
                }if(s.length()==(i+1)){
                    int n=value(s.charAt(i));
                    num=num+n;
                    break;
                }char char2=s.charAt(i+1);
                if(char1=='I'&&(char2=='V'||char2=='X')){
                    int n1=value(char1);
                    int n2=value(char2);
                    num=num+(n2-n1);
                    i++;
                }else if(char1=='X'&&(char2=='L'||char2=='C')){
                    int n1=value(char1);
                    int n2=value(char2);
                    num=num+(n2-n1);
                    i++;
                }else if(char1=='C'&&(char2=='D'||char2=='M')){
                    int n1=value(char1);
                    int n2=value(char2);
                    num=num+(n2-n1);
                    i++;
                }else{
                    int n1=value(char1);
                    num=num+n1;
                }
            }return num;
        }
    public static void main(String[] args) {
        romantointeger p1=new romantointeger();
        System.out.println(p1.romanToInt("XVIII"));
    }

    }

