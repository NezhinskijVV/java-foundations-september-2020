package ru.itsjava.object;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Класс Telephone должен:")
public class TelephoneTest {

    public static final String DEFAULT_NUMBER = "89119085531";
    public static final String DEFAULT_BRAND = "Iphone";
    public static final int DEFAULT_PRICE = 70_000;

    @DisplayName("иметь корректный конструктор")
    @Test
    public void shouldHaveCorrectAllArgsConstructor() {
        var telephone =
                new Telephone(DEFAULT_NUMBER, DEFAULT_BRAND, DEFAULT_PRICE);
//        Assertions.assertEquals("89119085531", telephone.getPhoneNumber());
//        Assertions.assertEquals("Iphone", telephone.getBrand());
//        Assertions.assertEquals(70_000, telephone.getPrice());

        assertAll("telephone",
                () -> assertEquals(DEFAULT_NUMBER, telephone.getPhoneNumber()),
                () -> assertEquals(DEFAULT_BRAND, telephone.getBrand()),
                () -> assertEquals(DEFAULT_PRICE, telephone.getPrice())
        );
    }

}
