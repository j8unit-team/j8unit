package org.j8unit.repository.javax.management.loading;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class PrivateClassLoaderClassTest
implements org.j8unit.repository.javax.management.loading.PrivateClassLoaderClassTests<javax.management.loading.PrivateClassLoader> {

    @Override
    public Class<javax.management.loading.PrivateClassLoader> createNewSUT() {
        return javax.management.loading.PrivateClassLoader.class;
    }

}
