package org.j8unit.repository.javax.xml.stream;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class StreamFilterClassTest
implements org.j8unit.repository.javax.xml.stream.StreamFilterClassTests<javax.xml.stream.StreamFilter> {

    @Override
    public Class<javax.xml.stream.StreamFilter> createNewSUT() {
        return javax.xml.stream.StreamFilter.class;
    }

}
