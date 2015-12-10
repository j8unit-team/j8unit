package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CodecFactoryClassTest
implements org.j8unit.repository.org.omg.IOP.CodecFactoryClassTests<org.omg.IOP.CodecFactory> {

    @Override
    public Class<org.omg.IOP.CodecFactory> createNewSUT() {
        return org.omg.IOP.CodecFactory.class;
    }

}
