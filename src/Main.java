public class Main {
    public static void main(String[] args) {
        int year = 2021;
        int c = year - 200;
        int d = year + 100;
        for(;c<d;c++){
            if(c%79==0){
                System.out.println("Год: "+c);
            }
        }
    }
}
