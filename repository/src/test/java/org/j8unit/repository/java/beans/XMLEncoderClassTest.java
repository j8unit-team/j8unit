package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class XMLEncoderClassTest
implements org.j8unit.repository.java.beans.XMLEncoderClassTests<java.beans.XMLEncoder> {

    @Override
    public Class<java.beans.XMLEncoder> createNewSUT() {
        return java.beans.XMLEncoder.class;
    }

}
