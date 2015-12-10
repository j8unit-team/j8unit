package org.j8unit.repository.org.omg.IOP.CodecPackage;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class TypeMismatchClassTest
implements org.j8unit.repository.org.omg.IOP.CodecPackage.TypeMismatchClassTests<org.omg.IOP.CodecPackage.TypeMismatch> {

    @Override
    public Class<org.omg.IOP.CodecPackage.TypeMismatch> createNewSUT() {
        return org.omg.IOP.CodecPackage.TypeMismatch.class;
    }

}
