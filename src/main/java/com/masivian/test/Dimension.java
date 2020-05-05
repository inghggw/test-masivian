package com.masivian.test;

/**
 *
 * @author inghggw
 */
public class Dimension extends JPrime {

    int SQUARE = 9;

    public void setDimension() {
        do {
            J += 2;

            if (J == SQUARE) {
                ORD++;
                SQUARE = POSITION[ORD] * POSITION[ORD];
                MULT[ORD - 1] = J;
            }

            N = 2;
            this.setJPrime();
        } while (!JPRIME);
    }
}
