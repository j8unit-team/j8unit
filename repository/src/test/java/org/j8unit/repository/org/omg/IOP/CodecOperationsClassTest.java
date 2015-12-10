package org.j8unit.repository.org.omg.IOP;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class CodecOperationsClassTest
implements org.j8unit.repository.org.omg.IOP.CodecOperationsClassTests<org.omg.IOP.CodecOperations> {

    @Override
    public Class<org.omg.IOP.CodecOperations> createNewSUT() {
        return org.omg.IOP.CodecOperations.class;
    }

}
