package org.j8unit.repository.java.awt;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class FileDialogTest
implements org.j8unit.repository.java.awt.FileDialogTests<java.awt.FileDialog> {

    @Override
    public java.awt.FileDialog createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.awt.FileDialog] available.");
    }

}
