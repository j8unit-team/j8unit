package org.j8unit.repository.java.util.zip;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DeflaterTest
implements org.j8unit.repository.java.util.zip.DeflaterTests<java.util.zip.Deflater> {

    @Override
    public java.util.zip.Deflater createNewSUT() {
        return new java.util.zip.Deflater();
    }

}
