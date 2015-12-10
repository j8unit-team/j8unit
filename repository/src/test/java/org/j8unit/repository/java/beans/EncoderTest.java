package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EncoderTest
implements org.j8unit.repository.java.beans.EncoderTests<java.beans.Encoder> {

    @Override
    public java.beans.Encoder createNewSUT() {
        return new java.beans.Encoder();
    }

}
