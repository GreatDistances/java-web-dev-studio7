package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        DVD fitzcarraldo = new DVD("Fitzcarraldo", "Feature Film", 20, true);
        DVD blankDVD = new DVD(null,null,0,false);
        CD weatherReport = new CD("Slom - Weather Report", "EP", 8, true);
        CD blankCD = new CD(null, null, 0, false);

        // TODO: Call each CD and DVD method to verify that they work as expected.

        System.out.print("\n");
        fitzcarraldo.spinDisc();
        fitzcarraldo.readDisc();
        fitzcarraldo.writeDisc();
        System.out.print("\n");
        blankDVD.spinDisc();
        blankDVD.readDisc();
        blankDVD.writeDisc();
        System.out.print("\n");
        weatherReport.spinDisc();
        weatherReport.readDisc();
        weatherReport.writeDisc();
        System.out.print("\n");
        blankCD.spinDisc();
        blankCD.readDisc();
        blankCD.writeDisc();

    }
}
