package Model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Festival {
    private String navn;
    private LocalDate fraDato;
    private LocalDate tilDato;
    private final ArrayList<Job> jobs = new ArrayList<>();

    public Festival(String navn, LocalDate fraDato, LocalDate tilDato) {
        this.navn = navn;
        this.fraDato = fraDato;
        this.tilDato = tilDato;
    }

    public ArrayList<Job> getJobs() {
        return new ArrayList<>(jobs);
    }

    public Job createJob (String kode, String beskrivelse, LocalDate dato,int timeHonorar, int antalTimer) {
        Job job = new Job(kode,beskrivelse,dato,timeHonorar, antalTimer);
        jobs.add(job);
        return job;
    }

    public int budgetteretJobUdgift() {
        int result = 0;
        for (Job j : jobs) {
            result = j.getTimeHonorar() * j.getAntalTimer();
        }
        return result;
    }

    public int realiseretJobUdgift() {
        int result = 0;
        for (Job j : jobs) {
            for (Vagt v : j.getVagter()) {
                result = v.getTimer() * j.getTimeHonorar();
            }
        }
        return result;
        }

    }
