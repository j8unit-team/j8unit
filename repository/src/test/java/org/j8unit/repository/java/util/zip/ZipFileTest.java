package org.j8unit.repository.java.util.zip;

import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ZipFileTest
implements org.j8unit.repository.java.util.zip.ZipFileTests<java.util.zip.ZipFile> {

    @Override
    public java.util.zip.ZipFile createNewSUT() {
        throw new AssumptionViolatedException("There is no default constructor for [java.util.zip.ZipFile] available.");
    }

}
