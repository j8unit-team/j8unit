package org.j8unit.repository.java.util;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
@SuppressWarnings("rawtypes")
public class ServiceLoaderClassTest
implements org.j8unit.repository.java.util.ServiceLoaderClassTests<java.util.ServiceLoader> {

    @Override
    public Class<java.util.ServiceLoader> createNewSUT() {
        return java.util.ServiceLoader.class;
    }

}
