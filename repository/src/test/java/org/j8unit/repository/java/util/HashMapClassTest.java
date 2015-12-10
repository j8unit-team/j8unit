package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class HashMapClassTest
implements org.j8unit.repository.java.util.HashMapClassTests<java.util.HashMap> {

    @Override
    public Class<java.util.HashMap> createNewSUT() {
        return java.util.HashMap.class;
    }

}
