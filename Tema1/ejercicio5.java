public class ejercicio5 {
  public static void main(String[] args) {

      String ed = "\033[31mED";
      String lm = "\033[32mLM";
      String sinf = "\033[33mSINF";
      String pro = "\033[34mPRO";
      String bbdd = "\033[35mBBDD";
      String fol = "\033[36mFOL";
      String recreo = "\033[37m- R - E - C - R - E - O -";
    System.out.printf("%10s %10s %10s %10s %10s\n", "LUNES", "MARTES", "MIERCOLES" , "JUEVES", "VIERNES"); 
    System.out.printf("%10s %10s %10s %10s %10s\n", ed,pro,pro,pro,fol ); 
    System.out.printf("%10s %10s %10s %10s %10s\n", lm,pro,pro,pro,fol ); 
    System.out.printf("%10s %10s %10s %10s %10s\n", lm,pro,ed,pro,fol ); 
          System.out.printf("%45s\n",recreo); 
    System.out.printf("%10s %10s %10s %10s %10s\n", sinf,bbdd,ed,bbdd,sinf ); 
    System.out.printf("%10s %10s %10s %10s %10s\n", sinf,bbdd,lm,bbdd,sinf ); 
    System.out.printf("%10s %10s %10s %10s %10s\n", sinf,bbdd,lm,bbdd,sinf ); 


                    
  }
}
