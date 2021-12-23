package com.levchenko.hw17;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DatesString {
    static List<String> list = new ArrayList<>();


    public static void main(String[] args) throws ParseException {
        list.add("05/04/2019");
        list.add("12/01/2021");
        list.add("10/12/2019");
        list.add("08/09/2019");


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");


        Boolean result = list.stream().


                map(data -> LocalDate.parse(data, formatter)).
                anyMatch(localDate -> localDate.getYear() == 2021);
        System.out.println(result);


    }
}
