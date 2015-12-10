package org.j8unit.repository.java.util.zip;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InflaterTest
implements org.j8unit.repository.java.util.zip.InflaterTests<java.util.zip.Inflater> {

    @Override
    public java.util.zip.Inflater createNewSUT() {
        return new java.util.zip.Inflater();
    }

}
