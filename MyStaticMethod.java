public class MyStaticMethod{
    public static int returnQ(double x, Double y){
        if(x>0 && y>0){
            return 1;
        }
        if(x<0 && y>0){
            return 2;
        }
        if(x<0 && y<0){
            return 3;
        }
        if(x>0 && y<0){
            return 4;
        }
        return 0;
    }
    public static Boolean isVowel(String str){
        str = str.toLowerCase();
        if(str.length() > 1){
            return false;
        }
        else if(str.equals("a") | str.equals("e")|str.equals("i")|str.equals("o")|str.equals("u")){
            return true;
        }
        else{
            return false;
        }
    }
}