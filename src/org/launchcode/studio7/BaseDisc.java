package org.launchcode.studio7;

public abstract class BaseDisc {

    private String name;
    private String contents;
    //private double capacityMinGB;
    //private double capacityMaxGB;
    private double spinMaxRpm;
    private int numTracks;
    private boolean writeProtected;

    // default constructor
    public BaseDisc() {
    }

    public BaseDisc(String name, String contents, int numTracks, boolean writeProtected) {
        this.name = name;
        this.contents = contents;
        this.numTracks = numTracks;
        this.writeProtected = writeProtected;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public double getSpinMaxRpm() {
        return spinMaxRpm;
    }

    public void setSpinMaxRpm(double spinMaxRpm) {
        this.spinMaxRpm = spinMaxRpm;
    }

    public int getNumTracks() {
        return numTracks;
    }

    public void setNumTracks(int numTracks) {
        this.numTracks = numTracks;
    }

    public boolean isWriteProtected() {
        return writeProtected;
    }

    public void setWriteProtected(boolean writeProtected) {
        this.writeProtected = writeProtected;
    }

    public void spinDisc() {
        System.out.println("The " + getClass().getSimpleName() + " " + name + " is spinning.");
    }

    public void writeDisc() {
        if (isWriteProtected()) {
            System.out.println("ERROR, " + getClass().getSimpleName() + " " + name + " is read-only.");
        } else {
            System.out.println("Writing data to the " + getClass().getSimpleName() + " " + name + ".");
        }
    }

        public void readDisc() {
            if (getNumTracks() == 0) {
                System.out.println("ERROR, no data on disc to read.");
            } else {
                System.out.println("Reading data from the " + getClass().getSimpleName() + " " + name + ". " +
                        getNumTracks() + " tracks available on disc.");
            }
        }
    }
