package com.levchenko.hw18;

import com.levchenko.hw18.model.Box;
import com.levchenko.hw18.servise.CreateBoxObj;
import com.levchenko.hw18.servise.JsonFileReader;
import com.levchenko.hw18.servise.XmlFileReader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Box xmlBox = CreateBoxObj.createNewBoxXml(XmlFileReader.readXmlFile());
        Box jsonBox = CreateBoxObj.createNewBoxJson(JsonFileReader.readJsonFile());
        System.out.println(xmlBox.toString());
        System.out.println(jsonBox.toString());
    }
}
