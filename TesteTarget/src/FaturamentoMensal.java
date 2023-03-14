import java.text.DecimalFormat; //biblioteca para transformar o decimal

public class FaturamentoMensal {
	public static void main(String[] args) {
		
		
		double sp =  67836.43;
		double rj =  36678.66;
		double mg =  29229.88;
		double es =  27165.48;
		double outros =  19849.53;
		double total =  sp + rj + mg + es + outros;
		DecimalFormat formatador = new DecimalFormat(".00");  //deixa as casas decimais dois zero após o ponto.
		
		
		System.out.println("O valor Total e " + formatador.format(total));
		System.out.println("A porcentagem de SP e " + formatador.format((sp*100) /total)+ "%");
		System.out.println("A porcentagem de RJ e " + formatador.format((rj*100) /total)+ "%");
		System.out.println("A porcentagem de MG e " + formatador.format((mg*100) /total)+ "%");
		System.out.println("A porcentagem de ES e " + formatador.format((es*100) /total)+ "%");
		System.out.println("A porcentagem de Outros e " + formatador.format((outros*100) /total)+ "%");
		
	}
}
