package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;
import org.omg.IOP.Codec;

@RunWith(J8Unit4.class)
public class CodecClassTest
implements org.j8unit.repository.org.omg.IOP.CodecClassTests<Codec> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[org.omg.IOP.Codec]

    @Override
    public Class<Codec> createNewSUT() {
        return Codec.class;
    }

    // J8UNIT-MARKER-[END]-[CLASS]-[org.omg.IOP.Codec]

}
