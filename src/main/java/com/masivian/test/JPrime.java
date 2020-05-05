package com.masivian.test;

/**
 *
 * @author inghggw
 */
public class JPrime extends Mult {

    int ORD = 2;

    public void setJPrime() {
        JPRIME = true;

        while (N < ORD && JPRIME) {
            this.setMult();
        }
    }

}
