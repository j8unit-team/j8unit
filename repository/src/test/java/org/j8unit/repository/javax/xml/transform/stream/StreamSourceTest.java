package org.j8unit.repository.javax.xml.transform.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StreamSourceTest
implements org.j8unit.repository.javax.xml.transform.stream.StreamSourceTests<javax.xml.transform.stream.StreamSource> {

    @Override
    public javax.xml.transform.stream.StreamSource createNewSUT() {
        return new javax.xml.transform.stream.StreamSource();
    }

}
