package br.com.biel.sistema.utils;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtils {

    public static String localDate4String(LocalDate localDate, String mascara) {

        DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern(mascara);
        String dataEditada = localDate.format(formatadorBarra);

        return dataEditada;
    }

    final static String FORMATO_NORMAL = "yyyy/MM/dd";

    public static LocalDate string4LocalDate(String data, String mascara) {


        DateTimeFormatter formato = DateTimeFormatter.ofPattern(mascara);
        LocalDate localDate = LocalDate.parse(data, formato);

        return localDate;
    }

    //DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public static String localDateTime4String(LocalDateTime localDateTime, String mascara) {

        //LocalDateTime para String
        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern(mascara);
        LocalDateTime dataAgora = localDateTime;
        String dataFormatada = dataAgora.format(formatoBr);
        System.out.println(dataFormatada);

        return dataFormatada;
    }
    public static LocalDateTime string4LocalDateTime(String data, String mascara) {
        //String para LocalDateTime

        DateTimeFormatter formato = DateTimeFormatter.ofPattern(mascara);
        LocalDateTime localDateTime  = LocalDateTime.parse(data, formato);
        System.out.println(localDateTime);
        return localDateTime;
    }


    public static String localDate4HoraFormatadaAgora(){
        LocalDate localDate = LocalDate.now();
        String data = localDate4String(localDate, FORMATO_NORMAL) ;

        return data;

    }

    public static LocalDateTime string4LocalDateT(String data) {
        //String para LocalDateTime

        LocalDateTime localDateTime  = LocalDateTime.parse(data);
        System.out.println(localDateTime);
        return localDateTime;
    }

}


 