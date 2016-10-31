package org.j8unit.repository.java.awt.print;

import java.awt.print.Printable;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintableClassTest
implements org.j8unit.repository.java.awt.print.PrintableClassTests<Printable> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[java.awt.print.Printable]

    @Override
    public Class<Printable> createNewSUT() {
        return Printable.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[java.awt.print.Printable]

    // J8UNIT-MARKER-[END]-[CLASS]-[java.awt.print.Printable]

}
