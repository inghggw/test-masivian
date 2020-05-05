package com.masivian.test;

/**
 *
 * @author inghggw
 */
public class Mult {

    int N = 0;
    int J = 1;
    boolean JPRIME;
    final int ORDMAX = 30;
    final int MARGIN = 1000;
    int MULT[] = new int[ORDMAX + 1];    
    int POSITION[] = new int[MARGIN + 1];
    
    public void setMult() {

        while (MULT[N] < J)
            MULT[N] += POSITION[N] + POSITION[N];

        if (MULT[N] == J)
            JPRIME = false;

        N++;
    }
}
