package programa;

import com.lins.veiculo.Carro;
import com.lins.veiculo.Motor;

public class Modulo {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Motor motor1 = new Motor();
		
		carro1.setMotor(motor1);
		
		carro1.ligarMotor();
		
		carro1.desligarMotor();		
				
		System.out.println("Motor ligado = " + carro1.checkOn());
		
	}

}
