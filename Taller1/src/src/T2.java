/**
 * 
 */
package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Tomás Langebaek
 * Implementación implementando Runnable
 */
public class T2 implements Runnable{

	/**
	 * @param n: número entero positivo >=2 para establecer el límite superior del coteo
	 */

	private static InputStreamReader is;

	private static BufferedReader br;

	private int n;

	private static boolean b = true;


	public static void main(String[] args) throws IOException{  


		is = new InputStreamReader(System.in);

		br = new BufferedReader(is);

		String line = br.readLine();

		int N = Integer.parseInt(line);

		Thread t1 = new Thread(new T2(N));

		Thread t2 = new Thread(new T2(N));

		t1.start();
		
		t2.start();
		

	}

	public T2 (int N) {

		this.n = N ;
	}
	
	public void run () {
		if(b) {
			b=false;
			pares(n);
		}
		else {
			impares(n);
		}
	}

	@SuppressWarnings("static-access")
	public void impares(int n) {

		for(int i = 1; i <= n; i+=2) {

			System.out.println(i);
			
			try {
				
				Thread.currentThread().sleep(1000);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}
		}

	}

	@SuppressWarnings("static-access")
	public void pares(int n) {

		for(int i = 2; i <= n; i+=2) {

			System.out.println(i);
			
			try {
				
				Thread.currentThread().sleep(1000);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
			}

		}
		
	}

}
