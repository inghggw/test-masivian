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
    int M;
    int P[];

    @Override
    public void printPage(int M, int P[]) {
        this.M = M;
        this.P = P;

        while (PAGEOFFSET <= this.M) {

            outPrint();
            rowOffSet();

            System.out.println("\f");
            PAGENUMBER++;
            PAGEOFFSET += RR * CC;
        }
    }
    
    public void outPrint() {
        System.out.print("The First ");
        System.out.print(Integer.toString(M));
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
            if (ROWOFFSET + C * RR <= M)
                System.out.printf("%10d", P[ROWOFFSET + C * RR]);
        System.out.println();
    }
}
