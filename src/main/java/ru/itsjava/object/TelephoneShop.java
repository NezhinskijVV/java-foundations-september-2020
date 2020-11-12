package ru.itsjava.object;

public class TelephoneShop {

    public static void main(String[] args) {
        Telephone vitaliyPhone =
                new Telephone("89119085531",
                        "Iphone", 60.0);

        Telephone dashaPhone =
                new Telephone("899999999",
                        "Iphone", 60.0);

        Telephone vitaliyPhone2 =
                new Telephone("89119085531",
                        "Iphone", 60.0);
        vitaliyPhone.equals(new Object());

        System.out.println("vitaliyPhone.equals(dashaPhone) = "
                + vitaliyPhone.equals(dashaPhone));

        System.out.println("vitaliyPhone.equals(vitaliyPhone2) = "
                + vitaliyPhone.equals(vitaliyPhone2));

        System.out.println("new Object().hashCode() = "
                + new Object().hashCode());

        System.out.println("vitaliyPhone.toString() = " + vitaliyPhone.toString());

    }
}
