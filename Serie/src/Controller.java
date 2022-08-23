
public class Controller {
	public double serie(double numero) {
		if(numero == 1) {
			return 1;
		}
		
		return (1 / numero) + serie(numero-1);
	}
}
