package com.masivian.test;

/**
 *
 * @author inghggw
 */
public class Page implements PageInterface {

    int PAGENUMBER = 1;
    int PAGEOFFSET = 1;
    int ROWOFFSET = 0;
    int C = 0;
    final int RR = 50;
    final int CC = 4;
    int MARGEN;
    int POSITION[];

    @Override
    public void printPage(int MARGEN, int POSITION[]) {
        this.MARGEN = MARGEN;
        this.POSITION = POSITION;

        while (PAGEOFFSET <= this.MARGEN) {

            outPrint();
            rowOffSet();

            System.out.println("\f");
            PAGENUMBER++;
            PAGEOFFSET += RR * CC;
        }
    }
    
    public void outPrint() {
        System.out.print("The First ");
        System.out.print(Integer.toString(MARGEN));
        System.out.print(" Prime Numbers === Page ");
        System.out.print(Integer.toString(PAGENUMBER));
        System.out.println("\n");
    }

    public void rowOffSet() {
        for (ROWOFFSET = PAGEOFFSET; ROWOFFSET <= PAGEOFFSET + RR - 1; ROWOFFSET++) {
            endRow();
        }
    }

    public void endRow() {
        for (C = 0; C <= CC - 1; C++)
            if (ROWOFFSET + C * RR <= MARGEN)
                System.out.printf("%10d", POSITION[ROWOFFSET + C * RR]);
        System.out.println();
    }
}
