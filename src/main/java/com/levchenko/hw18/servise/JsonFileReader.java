package com.levchenko.hw18.servise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JsonFileReader {
    private static ClassLoader loader = Thread.currentThread().getContextClassLoader();
    private static InputStream resource = loader.getResourceAsStream("hw18.json");
    private static InputStreamReader inputStreamReader = new InputStreamReader(resource);
    private static BufferedReader buff = new BufferedReader(inputStreamReader);
    private static final String[] objectSet = new String[8];
    private static final StringBuilder temp = new StringBuilder();
    private static String line;
    private static final Pattern pattern = Pattern.compile("\"(.*)\"( )?: (\"(.*)\"|\\d+)");

    private static int count = 0;

    public static String[] readJsonFile() throws IOException {
        assert resource != null;


        while ((line = buff.readLine()) != null) {
            Matcher matcher = pattern.matcher(line);



            while (matcher.find()) {

                int start = matcher.start(4);
                int end = matcher.end();
                if(start == -1){
                    start = matcher.start(3);
                }
                temp.append(line, start, end);


                if(!temp.toString().equals("150")) {
                    temp.delete(temp.length() - 1, temp.length());
                }

                objectSet[count] = temp.toString();
                temp.delete(0, temp.length());
                count += 1;


            }


        }


        return objectSet;
    }

    public static void main(String[] args) throws IOException {
        String[] a = JsonFileReader.readJsonFile();
        for (String s : a) {
            System.out.println(s);
        }
    }

    }

