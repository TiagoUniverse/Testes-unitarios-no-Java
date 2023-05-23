import junit.framework.TestCase;

public class CalculoSubtracaoTest extends TestCase {

	public void testExecutaSubtracao() {
		//Definindo as vari�veis
				float passValor1 = 10;
				float passValor2 = 5;
				float retornoEsperado = 5;	
				//float retornoEsperado = passValor1 + passValor2;
				
				//Dispara o m�todo executaSoma da classe Calculo e armazena
				// o resultado em uma vari�vel
				
				float retornoFeito = Calculo.ExecutaSubtracao(passValor1, passValor2);
				
				// Compara o valor retornado com o valor esperado
				assertEquals(retornoEsperado, retornoFeito);
	}

}
