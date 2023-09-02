package ejercicios;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //ejercicio1(7)
		int x=1, y=2, z=3;
		if(++x > y++ || x-- > 0)
			z++;
		else 
			z--;
		System.out.println(x+" "+y+""+z);
 //result: 1 34
	}

}
