package Model;

public class Vagt {
    private int timer;
    private Frivillig frivillig;
    private Job job;

    public Vagt(int timer , Frivillig frivillig, Job job) {
        this.timer = timer;
        this.job = job;
        frivillig.addVagt(this);

    }

    public Frivillig getFrivillig() {
        return frivillig;
    }
    public void setFrivillig(Frivillig frivillig){
        if(this.frivillig != frivillig){
            Frivillig oldFrivillig = this.frivillig;
            if(oldFrivillig != null){
                oldFrivillig.removeVagt(this);
            }
            this.frivillig = frivillig;
            if(frivillig != null){
                frivillig.addVagt(this);
            }
        }
    }

    public Job getJob() {
        return job;
    }

    public int getTimer() {
        return timer;
    }


}
