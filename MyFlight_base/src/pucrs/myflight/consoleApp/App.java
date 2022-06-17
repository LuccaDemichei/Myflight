package pucrs.myflight.consoleApp;

import pucrs.myflight.modelo.*;
import java.time.LocalDateTime;
import java.time.Duration;

public class App {

	public static void main(String[] args) {
		System.out.println("\nMyFlight project...\n");
		/*	Instanciação do Gerenciador de Aeronaves
		 *	Criação de quatroo aeronaves
		 *	Adicionadas no objeto do gerenciador
		 *	Utilização dos metodos para listar e buscar uma aeronave por um código específico 
		 */	
		GerenciadorAeronaves gerAeronave = new GerenciadorAeronaves();
		Aeronave aeronave1 = new Aeronave("733", "Boeing 737-300");
		Aeronave aeronave2 = new Aeronave("046", "Curtiss C-46");
		Aeronave aeronave3 = new Aeronave("300", "Airbus A300");
		Aeronave aeronave4 = new Aeronave("380", "Airbus Industrie A380");
		gerAeronave.adicionar(aeronave1);
		gerAeronave.adicionar(aeronave2);
		gerAeronave.adicionar(aeronave3);
		gerAeronave.adicionar(aeronave4);

		gerAeronave.listarTodas();
		System.out.print("\n");
		gerAeronave.buscarPorCodigo("046");
		System.out.print("\n");
		System.out.print("\n");

		/*	Instanciação do Gerenciador de Aeroportos
		 *	Criação de seis aeroportos e criacão de seis geolocalizações
		 *	Adicionados no objeto do gerenciador
		 *	Utilização dos metodos para listar e buscar um aeroporto por um código específico 
		 */
		GerenciadorAeroportos gerAeroporto = new GerenciadorAeroportos();
		Aeroporto aeroporto1 = new Aeroporto("1-001", "Porto Alegre International Airport Salgado Filho", new Geo(-29.993512643922035, -51.17532548506502));
		Aeroporto aeroporto2 = new Aeroporto("2-002", "Montevideo International Airport Carrasco", new Geo(-34.8366915029989, -56.01612615812663));
		Aeroporto aeroporto3 = new Aeroporto("1-003", "Florianópolis International Airport Hercílio Luz", new Geo(-27.670089477275823, -48.54597643080129));
		Aeroporto aeroporto4 = new Aeroporto("3-004", "Melbourne Airport", new Geo(-37.670358547719864, 144.84309218819078));
		Aeroporto aeroporto5 = new Aeroporto("4-005","Montréal-Pierre Elliott Trudeau International Airport", new Geo(45.46586134025556, -73.74488836189221));
		Aeroporto aeroporto6 = new Aeroporto("1-004", "GRU Airport", new Geo(-23.430622305557424, -46.4730430019366));
		gerAeroporto.adicionar(aeroporto1);
		gerAeroporto.adicionar(aeroporto2);
		gerAeroporto.adicionar(aeroporto3);
		gerAeroporto.adicionar(aeroporto4);
		gerAeroporto.adicionar(aeroporto5);
		gerAeroporto.adicionar(aeroporto6);

		gerAeroporto.listarTodos();
		System.out.print("\n");
		gerAeroporto.buscarPorCodigo("1-003");
		System.out.print("\n");
		System.out.print("\n");

		/*	Instanciação do Gerenciador de Cias
		 *	Criação de quatro Companhias aereas
		 *	Adicionados no objeto do gerenciador
		 *	Utilização dos metodos para listar e buscar uma cia aerea por um codigo
		*/

		GerenciadorCias gerCias = new GerenciadorCias();
		CiaAerea cia1 = new CiaAerea("RG", "Varig");
		CiaAerea cia2 = new CiaAerea("AD", "Azul Linhas Aéreas");
		CiaAerea cia3 = new CiaAerea("G3", "Gol Linhas Aéreas SA");
		CiaAerea cia4 = new CiaAerea("AA", "American Airlines");

		gerCias.adicionar(cia1);
		gerCias.adicionar(cia2);
		gerCias.adicionar(cia3);
		gerCias.adicionar(cia4);

		System.out.println("Lista de Companhias Aereas: ");
        System.out.println("----------------------------");
		gerCias.listarTodas();
		System.out.print("\n");
		gerCias.buscarCodigo("RG");
		System.out.print("\n");
		gerCias.buscarNome("Gol Linhas Aéreas SA");
		System.out.print("\n");
		System.out.print("\n");

		/*	Instanciação do Gerenciador de Rotas
		 *	Adicionados no objeto do gerenciador
		 *	Utilização dos metodos para listar e buscar uma Rota por uma origem de Voo
		*/

		GerenciadorRotas gerRotas = new GerenciadorRotas();
		Rota rota1 = new Rota(cia1, aeroporto1, aeroporto2, aeronave1);
		Rota rota2 = new Rota(cia2, aeroporto2, aeroporto4, aeronave2);
		Rota rota3 = new Rota(cia3, aeroporto3, aeroporto4, aeronave3);
		Rota rota4 = new Rota(cia1, aeroporto2, aeroporto1, aeronave2);
		Rota rota5 = new Rota(cia1, aeroporto1, aeroporto3, aeronave1);
		Rota rota6 = new Rota(cia2, aeroporto3 , aeroporto6, aeronave2);
		Rota rota7 = new Rota(cia4, aeroporto6, aeroporto5, aeronave4);
		Rota rota8 = new Rota(cia2, aeroporto1, aeroporto6, aeronave4);

		gerRotas.adicionar(rota1);
		gerRotas.adicionar(rota2);
		gerRotas.adicionar(rota3);
		gerRotas.adicionar(rota4);
		gerRotas.adicionar(rota5);
		gerRotas.adicionar(rota6);
		gerRotas.adicionar(rota7);
		gerRotas.adicionar(rota8);


		gerRotas.listarTodas();
		System.out.print("\n");
		gerRotas.buscarPorOrigem(aeroporto3);
		System.out.print("\n");
		System.out.print("\n");

		/*	Instanciação do Gerenciador de Voos
		 *	Criação de três horários locais e três tempos de duração de voo
		 *	Criação de três voos
		 *  'voo4' instanciado para testar o conceito de sobrecarga
		 *	Adicionados no objeto do gerenciador
		 *	Utilização dos metodos para listar e buscar um aeroporto por um código específico 
		*/
		GerenciadorVoos gerVoos = new GerenciadorVoos();

		LocalDateTime datahora1 = LocalDateTime.of(2022, 05, 18, 8, 40);
		LocalDateTime datahora2 = LocalDateTime.of(2022, 05, 20, 14, 27);
		LocalDateTime datahora3 = LocalDateTime.of(2022, 05, 20, 21, 56);

		Duration duracao1 = Duration.ofMinutes(88);
		Duration duracao2 = Duration.ofMinutes(1200);
		Duration duracao3 = Duration.ofMinutes(620);
		Duration duracao4 = Duration.ofMinutes(840);

		Voo voo1 = new Voo(rota1, datahora1, duracao1);
		Voo voo2 = new Voo(rota2, datahora2, duracao2);
		Voo voo3 = new Voo(rota3, datahora3, duracao3);

		Voo voo4 = new Voo(rota2, duracao3);
		Voo voo10 = new Voo(rota6, duracao4);

		gerVoos.adicionar(voo1);
		gerVoos.adicionar(voo2);
		gerVoos.adicionar(voo3);
		gerVoos.adicionar(voo4);
		gerVoos.adicionar(voo10);

		gerVoos.listarTodos();
		System.out.print("\n");
		gerVoos.buscarPorData(datahora1);
		System.out.print("\n");

		/*
		 *	Teste dos metodos `distancia` e `retornaDistancia` criados na classe 'Geo' 
		 */

		double distanciaStatic = Geo.distancia(aeroporto1.getLocal(), aeroporto4.getLocal());
		System.out.println("Distancia entre os aeroportos " + aeroporto1.getNome() + " e " + aeroporto4.getNome() + " : " + distanciaStatic);
		System.out.print("\n");
		Geo gerGeo = new Geo();
		double distancia = gerGeo.retornaDistancia(aeroporto1.getLocal());
		System.out.println("Distancia entre os aeroportos de " + aeroporto1.getNome() + " e Guarulhos: " + distancia);
		System.out.println("\n");

		/*
		 *  Teste dos metodos implementados provenientes das interfaces implementadas nas classes Aeronave, Aeroporto e Rota
		 */

		System.out.println("Quantidade de objetos 'Aeronave': " + aeronave3.qntdObjetos() + "\n");
		System.out.println("Mostrando os aeroportos por ordem alfabetica: ");
		gerAeroporto.ordenaAeroportosNome();
		System.out.println();
		System.out.println("Mostrando as rotas pela ordem alfabetica das companhias aereas: ");
		gerRotas.ordenaRotaNomeCiaAerea();
		System.out.println("\n");

		/*
		* Novos voos instanciados para testar a subclasse 'VooEscalas'
		 */
		System.out.println("Voos com uma escala: ");
		VooEscalas voo5 = new VooEscalas(rota1, rota2, datahora1, duracao2);
		VooEscalas voo6 = new VooEscalas(rota4, rota5, datahora3, duracao1);
		gerVoos.adicionar(voo5);
		gerVoos.adicionar(voo6);
		System.out.println("Rota final do Voo5: " + voo5.getRotaFinal());
		System.out.println("Rota final do Voo6: " + voo6.getRotaFinal() + "\n");
		System.out.println("Trajeto completo do Voo5: " + voo5 + "\n");
		System.out.println("Trajeto completo do Voo6: " + voo6);
		System.out.println("\n");

		/*
		* Novos voos instanciados para testar a subclasse 'VooVariasEscalas'
		 */
		System.out.println("Voos com varias escalas: ");
		VooVariasEscalas voo7 = new VooVariasEscalas(rota4, rota5 , rota3, datahora1, duracao2);
		VooVariasEscalas voo8 = new VooVariasEscalas(rota4, rota8 , rota7, datahora3, duracao3);
		VooVariasEscalas voo9 = new VooVariasEscalas(rota4, rota5 , rota6, rota7, datahora3, duracao4);
		gerVoos.adicionar(voo7);
		gerVoos.adicionar(voo8);
		gerVoos.adicionar(voo9);
		System.out.println("Trajeto completo do Voo7: " + voo7 + "\n");
		System.out.println("Trajeto completo do Voo8: " + voo8);
		System.out.println("Trajeto completo do Voo9: " + voo9);

	}
}