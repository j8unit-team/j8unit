package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrintJobClassTest
implements org.j8unit.repository.java.awt.PrintJobClassTests<java.awt.PrintJob> {

    @Override
    public Class<java.awt.PrintJob> createNewSUT() {
        return java.awt.PrintJob.class;
    }

}
