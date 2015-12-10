package org.j8unit.repository.java.awt.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintableClassTest
implements org.j8unit.repository.java.awt.print.PrintableClassTests<java.awt.print.Printable> {

    @Override
    public Class<java.awt.print.Printable> createNewSUT() {
        return java.awt.print.Printable.class;
    }

}
