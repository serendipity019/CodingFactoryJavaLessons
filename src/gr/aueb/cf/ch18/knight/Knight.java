package gr.aueb.cf.ch18.knight;

public class Knight implements IKnight, Runnable{
    private final String name;

    public Knight(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void embarkOnMission(IMission mission) {
        System.out.println(getName());
        //mission.setStatus(MissionStatus.STARTED); //we put this eventually inside the run method.
        mission.embark();
    }

    @Override
    //Here we lock the threads to run one by one. We make it thread safe
    public void run() {
        synchronized (IKnight.missions) {
            for (IMission mission : IKnight.missions) {
                if (mission.getStatus() == MissionStatus.NOT_STARTED) {
                    mission.setStatus(MissionStatus.STARTED);
                    this.embarkOnMission(mission);
                    break;
                }
            }
        }
    }
}
