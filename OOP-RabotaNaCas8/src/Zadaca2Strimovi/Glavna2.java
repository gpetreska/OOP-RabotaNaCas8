package Zadaca2Strimovi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Glavna2 {

	public static void main(String[] args) {
		try 
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();

			Recnik r = new Recnik();
			r.vnesiMapa();
			r.translate(s);
		} 

		catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
