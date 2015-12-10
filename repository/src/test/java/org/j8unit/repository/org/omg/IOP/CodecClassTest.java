package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CodecClassTest
implements org.j8unit.repository.org.omg.IOP.CodecClassTests<org.omg.IOP.Codec> {

    @Override
    public Class<org.omg.IOP.Codec> createNewSUT() {
        return org.omg.IOP.Codec.class;
    }

}
