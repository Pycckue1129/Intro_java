package org.example.cw4;

//4) Напишите интерфейс Converter для конвертации из градусов по Цельсию в
//  Кельвины, Фаренгейты. У классов наследников необходимо переопределить
//  метод интерфейса, для валидного перевода величин. Метод для конвертации назовите "convertValue".

import org.example.cw4.model.Celsius;
import org.example.cw4.model.Fahrenheit;
import org.example.cw4.model.Kelvin;

public class Ex4 {
    public static void main(String[] args) {
        Double t = 100.0;
        Double tFar = new Fahrenheit().convert(t);
        System.out.println(tFar);
        Double tKel = new Kelvin().convert(-273.0);
        System.out.println(tKel);
        Double tCelsius = new Celsius().convert(t);
        System.out.println(tCelsius);
    }
}
