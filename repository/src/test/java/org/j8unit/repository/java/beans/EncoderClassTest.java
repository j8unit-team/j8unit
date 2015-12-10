package org.j8unit.repository.java.beans;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EncoderClassTest
implements org.j8unit.repository.java.beans.EncoderClassTests<java.beans.Encoder> {

    @Override
    public Class<java.beans.Encoder> createNewSUT() {
        return java.beans.Encoder.class;
    }

}
