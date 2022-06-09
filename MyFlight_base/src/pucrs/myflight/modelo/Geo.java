/* implementado por gabriela sussuarana no dia 07/05
*/ 

package pucrs.myflight.modelo;

import java.math.*;

public class Geo {
	private double latitude;
	private double longitude;
	
	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public Geo(){
		
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}

	//Com base nessa fórmula, implemente um método de classe denominado distancia, que recebe dois objetos Geo 
	//como parâmetro e retorna a distância entre eles. Dica: os métodos Math.sin, Math.cos e Math.asin exigem 
	//que os parâmetros sejam especificados em radianos. Porém, como latitude e longitude são geralmente expressas 
	//em graus, use o método Math.toRadians para converter.

	public static double distancia(Geo geo1, Geo geo2){
		double dist = 0; 
		double lat1, lat2, long1, long2;

		lat1 = Math.toRadians(geo1.latitude);
		lat2 = Math.toRadians(geo2.latitude);
		long1 = Math.toRadians(geo1.longitude);
		long2 = Math.toRadians(geo2.longitude);

		dist = 2 * 6371 * Math.asin(Math.sqrt((Math.pow(Math.sin((lat1-lat2)/2),2) + Math.pow(Math.sin((long1 - long2)/2), 2)) * Math.cos(lat1) * Math.cos(lat2)));
		
		return dist;
	}

	public double retornaDistancia(Geo g1){
		double dist = 0;
		double lat1, lat2, long1, long2;
		Geo aeroGuarulhos = new Geo(-23.42978556455937, -46.47300008465766);

		lat1 = Math.toRadians(g1.latitude);
		lat2 = Math.toRadians(aeroGuarulhos.latitude);
		long1 = Math.toRadians(g1.longitude);
		long2 = Math.toRadians(aeroGuarulhos.longitude);

		dist = 2 * 6371 * Math.asin(Math.sqrt((Math.pow(Math.sin((lat1-lat2)/2),2) + Math.pow(Math.sin((long1 - long2)/2), 2)) * Math.cos(lat1) * Math.cos(lat2)));
		
		return dist;
	}
	
}