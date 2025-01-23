package gr.aueb.cf.ch18.knight;


public interface IMission {
    MissionStatus getStatus();
    void setStatus(MissionStatus missionStatus);
    void embark();
}
