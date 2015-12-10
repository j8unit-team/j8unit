package org.j8unit.repository.java.lang.instrument;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClassFileTransformerClassTest
implements org.j8unit.repository.java.lang.instrument.ClassFileTransformerClassTests<java.lang.instrument.ClassFileTransformer> {

    @Override
    public Class<java.lang.instrument.ClassFileTransformer> createNewSUT() {
        return java.lang.instrument.ClassFileTransformer.class;
    }

}
