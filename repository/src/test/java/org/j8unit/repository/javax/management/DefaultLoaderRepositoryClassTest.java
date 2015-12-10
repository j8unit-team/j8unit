package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultLoaderRepositoryClassTest
implements org.j8unit.repository.javax.management.DefaultLoaderRepositoryClassTests<javax.management.DefaultLoaderRepository> {

    @Override
    public Class<javax.management.DefaultLoaderRepository> createNewSUT() {
        return javax.management.DefaultLoaderRepository.class;
    }

}
