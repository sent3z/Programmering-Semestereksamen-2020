package Model;

import java.util.ArrayList;

public class Frivillig {

    private String navn;
    private String mobil;
    private int maksAntalTimer;
    private final ArrayList<Vagt> vagter = new ArrayList<>();

    public Frivillig(String navn, String mobil, int maksAntalTimer) {
        this.navn = navn;
        this.mobil = mobil;
        this.maksAntalTimer = maksAntalTimer;
    }

    public ArrayList<Vagt> getVagter() {
        return new ArrayList<>(vagter);
    }

    public void addVagt(Vagt vagt) {
        if (!vagter.contains(vagt)) {
            vagter.add(vagt);
        }
    }

    public void removeVagt(Vagt vagt) {
        if (vagter.contains(vagt)) {
            vagter.remove(vagt);
        }
    }

    public String getNavn() {
        return navn;
    }

    public String getMobil() {
        return mobil;
    }

    public int getMaksAntalTimer() {
        return maksAntalTimer;
    }

    public int ledigeTimer() {
        int result = 0;
        if (vagter.isEmpty()) {
            return maksAntalTimer;
        } else
        for (Vagt v : vagter) {
            result += getMaksAntalTimer() - v.getTimer();
        }
            return result;
        }



    @Override
    public String toString() {
        return navn + mobil + maksAntalTimer;
    }
}