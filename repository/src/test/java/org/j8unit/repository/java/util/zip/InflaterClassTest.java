package org.j8unit.repository.java.util.zip;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class InflaterClassTest
implements org.j8unit.repository.java.util.zip.InflaterClassTests<java.util.zip.Inflater> {

    @Override
    public Class<java.util.zip.Inflater> createNewSUT() {
        return java.util.zip.Inflater.class;
    }

}
