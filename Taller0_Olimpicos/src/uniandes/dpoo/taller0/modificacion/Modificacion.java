package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion

/** Modificación 2
 * 
 */
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		
	System.out.println("Hola, mundo!");
	CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("data/atletas.csv");
	System.out.println("El pais con más medallas es:"+ calc.paisConMasMedallistas());
	
	}
}