package com.masivian.test;

/**
 *
 * @author inghggw
 */
public class PrinterRefactor extends Margin {

    public static void main(String[] args) {
        PrinterRefactor printer = new PrinterRefactor();
        printer.print();
    }

    public void print() {
        
        this.setMargin();

        Page p = new Page();
        p.printPage(MARGIN, POSITION);
    }
}
