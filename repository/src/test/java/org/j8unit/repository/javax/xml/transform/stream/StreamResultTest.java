package org.j8unit.repository.javax.xml.transform.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StreamResultTest
implements org.j8unit.repository.javax.xml.transform.stream.StreamResultTests<javax.xml.transform.stream.StreamResult> {

    @Override
    public javax.xml.transform.stream.StreamResult createNewSUT() {
        return new javax.xml.transform.stream.StreamResult();
    }

}
