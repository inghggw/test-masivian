package com.masivian.test;

/**
 *
 * @author inghggw
 */
public class Margin extends Dimension {

    int K = 1;

    public void setMargin() {
        POSITION[1] = 2;

        while (K < MARGIN) {
            this.setDimension();
            K++;
            POSITION[K] = J;
        }
    }
}
