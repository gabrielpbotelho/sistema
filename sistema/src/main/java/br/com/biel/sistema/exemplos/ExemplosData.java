/*package br.com.biel.sistema.exemplos;

import java.util.Calendar;

//public class Exemplos {

    // EXEMPLOS de tipos de data  CLASSE CALENDAR

    //Hora atual
    Calendar c = Calendar.getInstance();
    System.out.println("Data e Hora atual: " +c.getTime());
    -----------------------------------------------------
    //Dia da semana mês e ano
    Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 1995);
		c.set(Calendar.MONTH, Calendar.MARCH);
		c.set(Calendar.DAY_OF_MONTH, 20);

		System.out.println("Data/Hora atual: "+c.getTime());
		System.out.println("Ano: "+c.get(Calendar.YEAR));
		System.out.println("Mês: "+c.get(Calendar.MONTH));
		System.out.println("Dia do Mês: "+c.get(Calendar.DAY_OF_MONTH));
    ---------------------------------------------------------
	//public class Msg_Boas_Vindas_Calendar

	    Calendar c1 = Calendar.getInstance();
		int hora = c1.get(Calendar.HOUR_OF_DAY);

		if(hora > 6 && hora < 12){
			System.out.println("Bom Dia");
		}else if(hora > 12 && hora < 18){
		System.out.println("Boa Tarde");
		}else{
			System.out.println("Boa Noite");
		}
	------------------------------------------------------------
	DateFormat
	Essa classe permite converter informações do tipo String para
	data do tipo Date, permitindo seguir um formato. Consegue-se trabalhar
	ao contrário, convertendo um dado do tipo Date para uma String.
	Por ser uma classe abstrata, não é possível instanciá-la,
	por isso deve ser usado para método estático getDateInstance().
    Sempre quando declarado é preciso importar o pacote java.text.

	Abaixo são mostrados alguns exemplos dos métodos de formatação das datas

	Calendar c = Calendar.getInstance();
	c.set(2013, Calendar.FEBRUARY, 28);
	Date data = c.getTime();
	System.out.println("Data atual sem formatação: "+data);

	//Formata a data
	DateFormat formataData = DateFormat.getDateInstance();
	System.out.println("Data atual com formatação: "+ formataData.format(data));

	//Formata Hora
    DateFormat hora = DateFormat.getTimeInstance();
	System.out.println("Hora formatada: "+hora.format(data));

	//Formata Data e Hora
	DateFormat dtHora = DateFormat.getDateTimeInstance();
	System.out.println(dtHora.format(data));
	--------------------------------------------------------------

	Calendar c = Calendar.getInstance();
	Date data = c.getTime();

	DateFormat f = DateFormat.getDateInstance(DateFormat.FULL); //Data COmpleta
	System.out.println("Data brasileira: "+f.format(data));

	f = DateFormat.getDateInstance(DateFormat.LONG);
	System.out.println("Data sem o dia descrito: "+f.format(data));

	f = DateFormat.getDateInstance(DateFormat.MEDIUM);
	System.out.println("Data resumida 1: "+f.format(data));

	f = DateFormat.getDateInstance(DateFormat.SHORT);
	System.out.println("Data resumida 2: "+f.format(data));
    --------------------------------------------------------------

    Conversões
    Às vezes é preciso transformar um texto em uma data ou vice versa, para isso abaixo é exibida
    a função parse e a classe SimpleDateFormat. Geralmente a classe SimpleDateFormat é mais usada
    quando trata-se de formatação de datas, pois já no seu construtor, quando instanciada, permite
    passar como argumento o formato da data desejada, como apresentada nos exemplos abaixo

    Calendar c = Calendar.getInstance();
	Date data = c.getTime();
	DateFormat f = DateFormat.getDateInstance();

	Date data2 = f.parse("12/01/1995");
	System.out.println(data2);

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	System.out.println("Data formatada: "+sdf.format(data));

	//Converte Objetos
	System.out.println(“Data convertida: ”+sdf.parse("02/08/1970"));
    -------------------------------------------------------------------------

    Internacionalização das datas
    O Java oferece a classe Locale, que permite definir de qual país deseja-se obter o retorno das
    informações, como data e hora. Nos exemplos acima não foi necessário instanciar essa classe,
    pois já é detectado automaticamente do computador quais são as configurações regionais.
    Na Listagem 9 é mostrado como formatar data e hora de acordo com outros países.

    Calendar c = Calendar.getInstance();
	Date data = c.getTime();

	Locale brasil = new Locale("pt", "BR"); //Retorna do país e a língua
	Locale eua = Locale.US;
	Locale italia = Locale.ITALIAN;

	DateFormat f2 = DateFormat.getDateInstance(DateFormat.FULL, brasil);
	System.out.println(“Data e hora brasileira: ”+f2.format(data));

	DateFormat f3 = DateFormat.getDateInstance(DateFormat.FULL, eua);
	System.out.println(“Data e hora americana: ”+f3.format(data));

	DateFormat f4 = DateFormat.getDateInstance(DateFormat.FULL, italia);
	System.out.println(“Data e hora italiana: ”+f4.format(data));
    ------------------------------------------------------------------------------






    LocalDate e LocalDateTime

    A forma mais simples de formatar LocalDate e LocalDateTime é usando a classe DateTimeFormatter .


}*/
