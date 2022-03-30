package lambdas.flujos.interfacesFuncionales;

import java.util.logging.Level;
import java.util.logging.Logger;

import lambdas.interfaceFuncional.ICountry;

public class MainLambdasInterfacesFuncionales {

	private static final Logger logger = Logger.getLogger(MainLambdasInterfacesFuncionales.class.getName());

	public static void main(String[] args) {

		ICountry testCountry1 = nameCountry -> "Test 1: " + nameCountry;

		logger.log(Level.INFO, () -> testCountry1.nameCountry("VENEZUELA"));
		logger.log(Level.INFO, testCountry1::nameHostCountry);

		ICountry testCountry2 = nameCountry -> "Test 2: " + nameCountry;
		;

		logger.log(Level.INFO, () -> testCountry2.nameCountry("COLOMBIA"));
		logger.log(Level.INFO, testCountry2::nameHostCountry);

	}

}
