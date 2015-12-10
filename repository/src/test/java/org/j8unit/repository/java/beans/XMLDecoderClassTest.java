package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLDecoderClassTest
implements org.j8unit.repository.java.beans.XMLDecoderClassTests<java.beans.XMLDecoder> {

    @Override
    public Class<java.beans.XMLDecoder> createNewSUT() {
        return java.beans.XMLDecoder.class;
    }

}
