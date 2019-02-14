package br.com.livraria.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author - Everton Ribeiro
 * @email - everton.nrb@gmail.com
 **/
public class ConverterDataUtil {
    public static String formatarData(String data) throws Exception {
        if (data == null || data.equals(""))
            return null;
        String dataFormatada = null;
        try {
            DateFormat df = new SimpleDateFormat("yyyy");
            Date date = df.parse(data);
            dataFormatada = df.format(date);
        } catch (ParseException e) {
            e.printStackTrace();
            throw e;
        }

        return dataFormatada;
    }

    public static java.sql.Date formartarData(Date data) throws Exception {
        if (data == null)
            return null;
        java.sql.Date date = null;
        date = new java.sql.Date(data.getTime());
        return date;
    }

    public static Date strToDate(String data) throws Exception {
        if (data == null)
            return null;
        Date dataFormatada = null;
        try {
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            long timeStamp = dateFormat.parse(data).getTime();
            dataFormatada = new Date(timeStamp);
        } catch (ParseException e) {
            e.printStackTrace();
            throw e;
        }
        return dataFormatada;
    }

}
