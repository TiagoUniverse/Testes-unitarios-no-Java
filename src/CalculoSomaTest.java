import junit.framework.TestCase;

public class CalculoSomaTest extends TestCase {

	public void testExecutaSoma() {
		//Definindo as vari�veis
		float passValor1 = 10;
		float passValor2 = 5;
		float retornoEsperado = 20;	
		//float retornoEsperado = passValor1 + passValor2;
		
		//Dispara o m�todo executaSoma da classe Calculo e armazena
		// o resultado em uma vari�vel
		
		float retornoFeito = Calculo.ExecutaSoma(passValor1, passValor2);
		
		// Compara o valor retornado com o valor esperado
		assertEquals(retornoEsperado, retornoFeito);
		
		
	}

}
