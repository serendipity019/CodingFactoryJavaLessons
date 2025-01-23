package gr.aueb.cf.ch18.knight;

@FunctionalInterface
public interface IKnight {
    IMission[] missions = {
            new KillTheDragonMission(),
            new SaveThePrincessMission(),
            new KillTheDragonMission()
    };

    void embarkOnMission(IMission mission);
}
