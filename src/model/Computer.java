package model;

import java.util.ArrayList;

public class Computer {

    private String serialNumber;
    private boolean nextWindow;
    private ArrayList<> incidentList = new ArrayList<>();

    public Computer(String serialNumber, boolean nextWindow) {

        this.serialNumber = serialNumber;
        this.nextWindow = nextWindow;

    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public boolean getNextWindow() {
        return nextWindow;
    }

    public void setNextWindow(boolean nextWindow) {
        this.nextWindow = nextWindow;
    }

    public ArrayList<> getIncidentList() {
        return incidentList;
    }

    public void setIncidentList(ArrayList<> incidentList) {
        this.incidentList = incidentList;
    }

    public void addIncident(LocalDate dateReport, String description) {
        
        incidentList.add(new Incident());

    }

}
