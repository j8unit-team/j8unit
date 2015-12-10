package org.j8unit.repository.javax.xml.ws;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class HolderTest<T>
implements org.j8unit.repository.javax.xml.ws.HolderTests<javax.xml.ws.Holder<T>, T> {

    @Override
    public javax.xml.ws.Holder<T> createNewSUT() {
        return new javax.xml.ws.Holder();
    }

}
