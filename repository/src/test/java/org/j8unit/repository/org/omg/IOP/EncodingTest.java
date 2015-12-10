package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class EncodingTest
implements org.j8unit.repository.org.omg.IOP.EncodingTests<org.omg.IOP.Encoding> {

    @Override
    public org.omg.IOP.Encoding createNewSUT() {
        return new org.omg.IOP.Encoding();
    }

}
