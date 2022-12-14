package Controller;

import Model.*;
import Storage.Storage;

import java.time.LocalDate;

public class Controller {
    public static Festival createFestival(String navn, LocalDate fraDato, LocalDate tilDato) {
        Festival festival = new Festival(navn, fraDato, tilDato);
        Storage.addFestival(festival);
        return festival;
    }

    public static Frivillig createFrivillig(String navn, String mobil, int maksAntalTimer) {
        Frivillig frivillig = new Frivillig(navn, mobil, maksAntalTimer);
        Storage.addFrivillig(frivillig);
        return frivillig;
    }

    public static FrivilligForening createFrivilligForening(String navn, String mobil, int maksAntalTimer, String foreningsNavn, int antalPersoner) {
        FrivilligForening frivilligForening = new FrivilligForening(navn, mobil, maksAntalTimer, foreningsNavn, antalPersoner);
        Storage.addFrivillig(frivilligForening);
        return frivilligForening;
    }

    public static Vagt tagVagt(Job job, Frivillig frivillig, int timer) {
        Vagt vagt = job.createVagt(timer, frivillig);
        if (frivillig.ledigeTimer() < timer) {
            throw new RuntimeException("Not enough avaiable hours");
        }
        return vagt;

    }

    public static void initStorage() {
        Festival northside = createFestival("NorthSide", LocalDate.of(2020, 6,4), LocalDate.of(2020,6,6));

        createFrivillig("Jane Jensen", "12345677", 20);
        createFrivillig("Lone Hansen", "78787878", 25);
        createFrivillig("Anders Mikkelsen", "55555555", 10);

        createFrivilligForening("Christian Madsen ", "23232323", 100, "Erhvervsakademi Aarhus", 40 );

        northside.createJob("T1", "Rengøring af toilet", LocalDate.of(2020,6,4), 100, 5);
        northside.createJob("T2", "Rengøring af toilet", LocalDate.of(2020,6,4), 100, 5);
        northside.createJob("T3", "Rengøring af toilet", LocalDate.of(2020,6,4), 100, 5);
        northside.createJob("T4", "Rengøring af toilet", LocalDate.of(2020,6,5), 100, 5);
        northside.createJob("T5", "Rengøring af toilet", LocalDate.of(2020,6,5), 100, 5);
        northside.createJob("T6", "Rengøring af toilet", LocalDate.of(2020,6,5), 100, 5);
        northside.createJob("T7", "Rengøring af toilet", LocalDate.of(2020,6,6), 100, 5);
        northside.createJob("T8", "Rengøring af toilet", LocalDate.of(2020,6,6), 100, 5);
        northside.createJob("T9", "Rengøring af toilet", LocalDate.of(2020,6,6), 100, 5);
    }

    public static void init(){
        initStorage();
    }
}

