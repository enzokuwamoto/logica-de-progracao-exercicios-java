package domain;

public class ex18 {
    static void main(String[] args) {
        float altFrancisco = 1.50f; // 2cm por ano
        float altSara = 1.10f; // 3cm por ano
        int anos = 0;

        while (altFrancisco > altSara) {
            altFrancisco += 0.02f;
            altSara += 0.03f;
            anos += 1;
        }

        System.out.println("Anos para Sara ficar mais alta que Francisco: " + anos);


    }
}
