package Storage;

import Model.Festival;
import Model.Frivillig;

import java.util.ArrayList;

public class Storage {

    private static ArrayList<Festival> festivaller = new ArrayList<>();
    private static ArrayList<Frivillig> frivillige = new ArrayList<>();

    //--------------------------------------

    public static void addFestival(Festival festival) {
        festivaller.add(festival);
    }

    public static ArrayList<Festival> getFestivaller() {
        return new ArrayList<>(festivaller);
    }

    //--------------------------------------

    public static ArrayList<Frivillig> getFrivillige() {
        return new ArrayList<>(frivillige);
    }

    public static void addFrivillig(Frivillig frivillig) {
        frivillige.add(frivillig);

    }


}
