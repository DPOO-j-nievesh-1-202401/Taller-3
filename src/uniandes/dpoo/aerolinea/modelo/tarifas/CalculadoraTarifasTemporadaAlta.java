package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas
{
	
	protected final static int COSTO_POR_KM_NATURAL = 600;
	protected final static int COSTO_POR_KM_CORPORATIVO = 900;
	protected final static double DESCUENTO_PEQ = 0.02;
	protected final static double DESCUENTO_MEDIANAS = 0.1;
	protected final static double DESCUENTO_GRANDE = 0.2;


	@Override
	protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		return 0;
	}
	@Override
	protected double calcularPorcentajeDescuento(Cliente cliente) {
		return 0;
	}

}
