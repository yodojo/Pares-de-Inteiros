import javax.xml.ws.ServiceMode;

import junit.framework.Assert;

import org.junit.Test;


public class CalculadorDeParesTest {
	
	private CalculadorDePares calculador;
	
	public CalculadorDeParesTest() {
		calculador = new CalculadorDePares();
	}

	@Test
	public void testaSeAQuantidadeDeDigitosDoPrimeiroNumeroEMaiorQueOSegundo(){
		Assert.assertTrue(calculador.verificaSeQuantidadeDeDigitosValidos(21,1));
	}

	@Test
	public void testaSeAQuantidadeDeDigitosDoSegundoNumeroEMaiorQueOPrimeiro(){
		Assert.assertFalse(calculador.verificaSeQuantidadeDeDigitosValidos(1,21));
	}

	@Test
	public void testaSeAQuantidadeDeDigitosSaoIguaisProsDoisNumeros(){
		Assert.assertFalse(calculador.verificaSeQuantidadeDeDigitosValidos(21,21));
	}
	
	
	@Test
	public void testaSeRemoverUmDigitoDoPrimeiroIgualAoSegundo(){
		Assert.assertTrue(calculador.verificaSePrimeiroNumeroMenosUmDigitoIgualSegundo(21,1));
	}
	
	@Test
	public void testaSeRemoverUmDigitoDoPrimeiroIgualAoSegundoTeste2(){
		Assert.assertTrue(calculador.verificaSePrimeiroNumeroMenosUmDigitoIgualSegundo(543,53));
	}
	
	
}
