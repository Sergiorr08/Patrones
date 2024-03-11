package procedimientos;

public class Potencia implements Procedimientos{

	@Override
	public int operar(int a, int b) {
		Double k=Double.valueOf(a);
		Double l=Double.valueOf(b);
		Double w= Math.pow(k, l);
		return w.intValue();
	}

}
