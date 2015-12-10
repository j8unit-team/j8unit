package org.j8unit.repository.javax.management;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultLoaderRepositoryTest
implements org.j8unit.repository.javax.management.DefaultLoaderRepositoryTests<javax.management.DefaultLoaderRepository> {

    @Override
    public javax.management.DefaultLoaderRepository createNewSUT() {
        return new javax.management.DefaultLoaderRepository();
    }

}
