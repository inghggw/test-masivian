package com.masivian.test;

/**
 *
 * @author inghggw
 */
public class PrinterRefactor {

    final int M = 1000;  
    final int ORDMAX = 30;
    int P[] = new int[M + 1];
    int J = 1;
    int K = 1;
    boolean JPRIME;
    int ORD = 2;
    int SQUARE = 9;
    int N = 0;
    int MULT[] = new int[ORDMAX + 1];

    public static void main(String[] args) {
        PrinterRefactor printer = new PrinterRefactor();
        printer.print();
    }

    public void print() {
        P[1] = 2;
        this.setMargen();

        Page p = new Page();
        p.printPage(M, P);
    }

    public void setMargen() {

        while (K < M) {
            this.setDimension();
            K++;
            P[K] = J;
        }
    }

    public void setDimension() {
        do {
            J += 2;

            if (J == SQUARE) {
                ORD++;
                SQUARE = P[ORD] * P[ORD];
                MULT[ORD - 1] = J;
            }

            N = 2;
            this.setJPrime();
        } while (!JPRIME);
    }

    public void setJPrime() {
        JPRIME = true;

        while (N < ORD && JPRIME) {
            this.setMult();
        }
    }

    public void setMult() {

        while (MULT[N] < J)
            MULT[N] += P[N] + P[N];

        if (MULT[N] == J)
            JPRIME = false;

        N++;
    }

}
