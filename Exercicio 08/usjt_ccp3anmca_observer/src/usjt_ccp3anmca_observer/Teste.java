package usjt_ccp3anmca_observer;

public class Teste {

	public static void main(String[] args) {
		WeatherData estacaoMonitoramento = new WeatherData();
		CurrentConditionsDisplay d1 = new CurrentConditionsDisplay();
		StatsDisplay d2 = new StatsDisplay();
		ForecastDisplay d3 = new ForecastDisplay();
		HeatDisplay d4 = new HeatDisplay();
		estacaoMonitoramento.registerObserver(d1);
		estacaoMonitoramento.registerObserver(d2);
		estacaoMonitoramento.registerObserver(d3);
		estacaoMonitoramento.registerObserver(d4);
		estacaoMonitoramento.iniciar();

	}

}
