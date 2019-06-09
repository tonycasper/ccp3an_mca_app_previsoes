package usjt_ccp3anmca_observer;

public class HeatDisplay extends Display{
	
	private double indiceDeCalor;
	
	private double calculaIndiceCalor(double temperature, double humidity, double pressure) {
		humidity = humidity/100;
		double indiceCalor = temperature - (0.55*((1-humidity)*(temperature -14))); 
		return indiceCalor;
	}

	@Override
	public void display() {		
	}
	
	@Override
	public void update(double temperature, double humidity, double pressure) {
		indiceDeCalor = calculaIndiceCalor(temperature,humidity,pressure);
		System.out.println("----- Indice de Calor -----");
		System.out.printf("Indice de Calor: %.2f\n", indiceDeCalor);
	}
}
