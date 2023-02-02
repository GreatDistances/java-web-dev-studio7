package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    final double capacityMinGB = 4.7;
    final double capacityMaxGB = 17;
    final int diameterMm = 120;
    final int spinRpmMax = 32000;

    public DVD(String name, String contents, int numTracks, boolean writeProtected) {
        super(name, contents, numTracks, writeProtected);
    }

    @Override
    public void spinDisc() {
        System.out.println("The " + getClass().getSimpleName() + " " + this.getName() + " is spinning at " + spinRpmMax + " rpm.");
    }

    @Override
    public void writeDisc() {
        if (isWriteProtected()) {
            System.out.println("ERROR, " + getClass().getSimpleName() + " " + getName() + " is read-only.");
        } else {
            System.out.println("Writing data to the " + getClass().getSimpleName() + " " + getName() + ". " +
                    capacityMaxGB + " storage available on disc.");
        }
    }
}
