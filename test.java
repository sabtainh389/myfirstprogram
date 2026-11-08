
import java.util.Scanner;
public class test{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
                int english = input.nextInt() ;
                int Math = input.nextInt() ;
                int Physics = input.nextInt() ;
                int Computer = input.nextInt() ;
                int Chemistery = input.nextInt() ;
          double Persantage;
                                   Persantage = (english + Math + Physics + Computer + Chemistery) / 500.0 * 100;

                     if(english<0||english>100||Math>100||Math<0||Physics>100||Physics<0||Computer>100||Computer<0||Chemistery>100||Chemistery<0){
System.out.println("Invaid");
                     }
                     else if(english<33||Math<33||Physics<33||Computer<33||Chemistery<33){
                        System.out.println("Fail");
                     }
    //  else if(english>=33||Math>=33||Physics>=33||Computer>=33||Chemistery>=33){
else if(Persantage>=90){
    System.out.println(+Persantage+"%  A+ Grade");
    System.out.println( "Full Scolership");
}
   else if(Persantage>=80 &&Persantage<90){
    System.out.println(+Persantage+"% A  Grade");
    System.out.println("Half Scalership");
}
else if (Persantage >= 70 && Persantage < 80) {
    System.out.println(+Persantage+"% B Grade");
}

  else if (Persantage >= 60 && Persantage < 70) {
    System.out.println(+Persantage+"% C Grade");
}
else if(Persantage>=50&&Persantage<60)
{
    System.out.println(+Persantage+"% D plus Grade");
}
else if(Persantage<50){
    System.out.println(+Persantage+"% E Grade");
}
            }
}
