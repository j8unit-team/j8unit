package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CodecFactoryHelperClassTest
implements org.j8unit.repository.org.omg.IOP.CodecFactoryHelperClassTests<org.omg.IOP.CodecFactoryHelper> {

    @Override
    public Class<org.omg.IOP.CodecFactoryHelper> createNewSUT() {
        return org.omg.IOP.CodecFactoryHelper.class;
    }

}
