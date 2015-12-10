package org.j8unit.repository.javax.activation;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class MimetypesFileTypeMapTest
implements org.j8unit.repository.javax.activation.MimetypesFileTypeMapTests<javax.activation.MimetypesFileTypeMap> {

    @Override
    public javax.activation.MimetypesFileTypeMap createNewSUT() {
        return new javax.activation.MimetypesFileTypeMap();
    }

}
