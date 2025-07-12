package utils;

import com.github.javafaker.Faker;

public class FakerGenerator {
    private static final Faker faker = new Faker();

    public static String gerarEmail() {
        return faker.internet().emailAddress();
    }

    public static String gerarNomeUsuario() {
        return faker.internet().emailAddress();
    }

    public static String gerarSenha() {
        return faker.internet().password(8, 12);
    }

    public static String gerarNomeCompleto() {
        return faker.name().fullName();
    }
}
