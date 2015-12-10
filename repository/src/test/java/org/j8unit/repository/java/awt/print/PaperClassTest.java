package org.j8unit.repository.java.awt.print;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PaperClassTest
implements org.j8unit.repository.java.awt.print.PaperClassTests<java.awt.print.Paper> {

    @Override
    public Class<java.awt.print.Paper> createNewSUT() {
        return java.awt.print.Paper.class;
    }

}
