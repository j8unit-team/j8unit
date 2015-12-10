package org.j8unit.repository.java.util.zip;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZipEntryTest
implements org.j8unit.repository.java.util.zip.ZipEntryTests<java.util.zip.ZipEntry> {

    @Override
    public java.util.zip.ZipEntry createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.util.zip.ZipEntry] available.");
    }

}
