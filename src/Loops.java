import java.util.Random;

public class Loops {

	public static void main(String[] args) {
		
		String nombre = "Luis";
		String user = "Luis";
		String nombre1 = new String("Luis");
		
		if(nombre==nombre1)
		{
			System.out.println("Son iguales...");
		}else {
			System.out.println("Diferentes");
		}
		
		assert user.equals("Luis1");
		
		Object o = new Object();
		Object o2 = o;
		
		if(o==o2)
		{
			System.out.println("Objetos Iguales");
		}else{
			System.out.println("Objetos diferentes");
		}
		
		Random r = new Random();
		int i = 0;
		boolean banned=false;
		
		whilesalvaje:
		while(!banned)
		{
			System.out.println("Bienvenidos a mi canal de Youtube!" + i);
			i=1;
			whiletranquilo:
			while(i<300)
			{
				System.out.println("Numero bajo");
				
				for(int a = 100; a>0; a=a-13)
				{
					
					System.out.println("a = " + a );
					if(a%3==0)
					{
						System.out.println("Numero suertudo");
					}else {
						break whiletranquilo;
					}
					
					if(i%7==0)
					{
						break whilesalvaje;
					}
				
					
				}
				
				i = i *10;
			}
			
			int n = r.nextInt(1000);
			if(n==200)
			{
				banned=true;
			}
			System.exit(0);
			i++;
		}
		
		int b = 0;
		do {
			System.out.println(b);
			b++;
			if(b>1000)
				break;
		}while(true);
		
	}

}
