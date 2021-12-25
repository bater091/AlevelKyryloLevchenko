package com.levchenko.hw18.servise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XmlFileReader {

    private static ClassLoader loader = Thread.currentThread().getContextClassLoader();
    private static InputStream resource = loader.getResourceAsStream("hw18.xml");
    private static InputStreamReader inputStreamReader = new InputStreamReader(resource);
    private static BufferedReader buff = new BufferedReader(inputStreamReader);
    private static final String[] objectSet = new String[8];
    private static final StringBuilder temp = new StringBuilder();
    private static String line;
    private static final Pattern patternFirst = Pattern.compile("(\".+?\")");
    private static final Pattern patternSecond = Pattern.compile("(>.+?<)");
    private static int count = 0;

    public static String[] readXmlFile() throws IOException {
        assert resource != null;


        while ((line = buff.readLine()) != null) {
            Matcher matcherFist = patternFirst.matcher(line);


            while (matcherFist.find()) {

                int start = matcherFist.start();
                int end = matcherFist.end();
                temp.append(line.substring(start, end));
                temp.delete(0, 1);
                temp.delete(temp.length() - 1, temp.length());


                if (!temp.toString().equals("1.0") && !temp.toString().equals("UTF-8")) {


                    objectSet[count] = temp.toString();
                    temp.delete(0, temp.length());
                    count += 1;
                } else {
                    temp.delete(0, temp.length());
                }

            }


        }

        resource = loader.getResourceAsStream("hw18.xml");
        assert resource != null;
        inputStreamReader = new InputStreamReader(resource);
        buff = new BufferedReader(inputStreamReader);


        count = 3;
        while ((line = buff.readLine()) != null) {
            Matcher matcherSecond = patternSecond.matcher(line);

            while (matcherSecond.find()) {

                int start = matcherSecond.start();
                int end = matcherSecond.end();
                temp.append(line.substring(start, end));
                temp.delete(0, 1);
                temp.delete(temp.length() - 1, temp.length());


                objectSet[count] = temp.toString();
                temp.delete(0, temp.length());
                count += 1;

            }

        }


        return objectSet;
    }

    public static void main(String[] args) throws IOException {
        String[] f = XmlFileReader.readXmlFile();
        for (String s : f) {
            System.out.println(s);
        }
    }

}


