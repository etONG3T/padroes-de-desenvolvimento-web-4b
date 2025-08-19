package br.edu.unifio;

import org.apache.commons.lang3.RandomStringUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String senha = RandomStringUtils.insecure().nextAlphabetic(8);
        System.out.println(senha);
    }
}