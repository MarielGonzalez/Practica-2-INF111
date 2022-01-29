import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   		while (true) {
			System.out.println("Igrese el nombre de la marca, kilometraje, año y la placa");
			Scanner sc = new Scanner (System.in);
			String Dato = sc.next();
			int pos1 = Dato.indexOf(",");
			int pos2 = Dato.indexOf("-");
			int pos3 = Dato.indexOf("/");
			String Marca = Dato.substring(0,pos1);
			String Kilo = Dato.substring(pos1+1,pos2);
			String añl = Dato.substring(pos2+1,pos3);
			String placa = Dato.substring(pos3+1,Dato.length());
			String Tc= placa.substring(0,1);
			int año = Integer.parseInt(añl);
			System.out.println(año);
			if (Tc == "G"){
     		break;
      }
         else{
	     			/*do 
	     		  /*Random rnd = new Random();
		  		  *while(int i = 1; i<=3; i++)		 		   *System.out.println(rnd.nextInt(100-1+1)+10)*;
         */
         int R = 0;
        int R1 = 0;
        int R2 = 0;
        int R3 = 0;
          while (true) {
				  
				  R1 = (int) (Math.random()*100);
				  R2 = (int) (Math.random()*100);
				  R3 = (int) (Math.random()*100);
				  if (R1 <= 3 && R1 <=10) {
				  R = R1;
				  break;
				  }
				  else if(R2 >= 3 && R2 <= 10){
					  R = R2;
					  break;
				  }
				  else if(R2 >= 3 && R2 <= 10) {
					  R = R3;
					  break;
					  
		  }
		   
		
	}
				System.out.println(R3);
				System.out.println(R2);
				System.out.println(R1);
				System.out.println(R);
		}
     		}
  }
}
