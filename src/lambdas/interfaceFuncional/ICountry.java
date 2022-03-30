package lambdas.interfaceFuncional;

@FunctionalInterface
public interface ICountry {

	public String nameCountry(String country);

	public default String nameHostCountry() {
		return "ARGENTINA";
	}

}
