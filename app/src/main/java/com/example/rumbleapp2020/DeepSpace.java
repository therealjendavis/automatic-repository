package com.example.rumbleapp2020;

import java.io.Serializable;

public class DeepSpace implements Serializable {

    private CargoShip cargo = new CargoShip();
    private RocketShip rocket = new RocketShip();
    Info info = new Info();
    void infoSet(){
        info.setAlliance("Red");
        info.setMatch("1");
        info.setTeam(1014);
        info.setNotes("These are test notes");
    }
    private boolean sandStorm = true;
    private int mainStartPosition = 0;
    private boolean mainStart = false;
    private boolean mainDefense = false;
    private int mainBlockedScores = 0;
    private String mainHelpInfo = "Help Text";
    private int mainEndgame = 0;
    private int mainInfoMatch = 1;

    private boolean extrasRedCard = false;
    private boolean extrasYellowCard = false;
    private int extrasFinalScore = 0;

    private  String[][] cacheArray = {null, null, null, null, null, null};
    private  String[][] localArray = {null, null, null, null, null, null};
    private  String settingsDisplay = " ";
    private  int settingsDisplayNum = 0;
    private  char settingsInfoColumn = 'a';
    private  String settingsHelpInfo = "Settings Help Text";

    public static final int HATCH = 0;
    public static final int CARGO = 1;

    public CargoShip getCargo() {
        return cargo;
    }
    public void setCargo(CargoShip cargo) {
        this.cargo = cargo;
    }
    public RocketShip getRocket() {
        return rocket;
    }
    public void setRocket(RocketShip rocket) {
        this.rocket = rocket;
    }
    public int getMainInfoMatch() {
        return mainInfoMatch;
    }
    public void setMainInfoMatch(int mainInfoMatch) {
        this.mainInfoMatch = mainInfoMatch;
    }
    public boolean isSandStorm() {
        return sandStorm;
    }

    public void setSandStorm(boolean sandStorm) {
        this.sandStorm = sandStorm;
    }

    public int getMainStartPosition() {
        return mainStartPosition;
    }

    public void setMainStartPosition(int mainStartPosition) {
        this.mainStartPosition = mainStartPosition;
    }

    public boolean isMainStart() {
        return mainStart;
    }

    public void setMainStart(boolean mainStart) {
        this.mainStart = mainStart;
    }

    public boolean isMainDefense() {
        return mainDefense;
    }

    public void setMainDefense(boolean mainDefense) {
        this.mainDefense = mainDefense;
    }

    public int getMainBlockedScores() {
        return mainBlockedScores;
    }

    public void setMainBlockedScores(int mainBlockedScores) {
        this.mainBlockedScores = mainBlockedScores;
    }

    public String getMainName() {
        return getInfo().getName();
    }

    public void setMainName(String mainName) {
        this.info.name = mainName;
    }

    public int getMainTeam() {
        return getInfo().getTeam();
    }

    public void setMainTeam(int mainTeam) {
        this.info.team = mainTeam;
    }

    public String getMainHelpInfo() {
        return mainHelpInfo;
    }

    public void setMainHelpInfo(String mainHelpInfo) {
        this.mainHelpInfo = mainHelpInfo;
    }

    public int getMainEndgame() {
        return mainEndgame;
    }

    public void setMainEndgame(int mainEndgame) {
        this.mainEndgame = mainEndgame;
    }

    public String getMainAlliance() {
        return getInfo().getAlliance();
    }

    public void setMainAlliance(String mainAlliance) {
        this.info.alliance = mainAlliance;
    }

    public boolean isExtrasRedCard() {
        return extrasRedCard;
    }

    public void setExtrasRedCard(boolean extrasRedCard) {
        this.extrasRedCard = extrasRedCard;
    }

    public boolean isExtrasYellowCard() {
        return extrasYellowCard;
    }

    public void setExtrasYellowCard(boolean extrasYellowCard) {
        this.extrasYellowCard = extrasYellowCard;
    }

    public int getExtrasFinalScore() {
        return extrasFinalScore;
    }

    public void setExtrasFinalScore(int extrasFinalScore) {
        this.extrasFinalScore = extrasFinalScore;
    }

    public String getExtrasNotes() {
        return getInfo().getNotes();
    }

    public void setExtrasNotes(String extrasNotes) {
        this.info.notes = extrasNotes;
    }

    public String[][] getCacheArray() {
        return cacheArray;
    }

    public void setCacheArray(String[][] cacheArray) {
        this.cacheArray = cacheArray;
    }

    public String[][] getLocalArray() {
        return localArray;
    }

    public void setLocalArray(String[][] localArray) {
        this.localArray = localArray;
    }

    public String getSettingsDisplay() {
        return settingsDisplay;
    }

    public void setSettingsDisplay(String settingsDisplay) {
        this.settingsDisplay = settingsDisplay;
    }

    public int getSettingsDisplayNum() {
        return settingsDisplayNum;
    }

    public void setSettingsDisplayNum(int settingsDisplayNum) {
        this.settingsDisplayNum = settingsDisplayNum;
    }

    public char getSettingsInfoColumn() {
        return settingsInfoColumn;
    }

    public void setSettingsInfoColumn(char settingsInfoColumn) {
        this.settingsInfoColumn = settingsInfoColumn;
    }

    public String getSettingsHelpInfo() {
        return settingsHelpInfo;
    }

    public void setSettingsHelpInfo(String settingsHelpInfo) {
        this.settingsHelpInfo = settingsHelpInfo;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }
}
