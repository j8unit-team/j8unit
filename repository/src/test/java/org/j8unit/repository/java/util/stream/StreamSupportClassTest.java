package org.j8unit.repository.java.util.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StreamSupportClassTest
implements org.j8unit.repository.java.util.stream.StreamSupportClassTests<java.util.stream.StreamSupport> {

    @Override
    public Class<java.util.stream.StreamSupport> createNewSUT() {
        return java.util.stream.StreamSupport.class;
    }

}
