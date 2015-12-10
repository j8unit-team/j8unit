package org.j8unit.repository.java.util.zip;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DeflaterClassTest
implements org.j8unit.repository.java.util.zip.DeflaterClassTests<java.util.zip.Deflater> {

    @Override
    public Class<java.util.zip.Deflater> createNewSUT() {
        return java.util.zip.Deflater.class;
    }

}
