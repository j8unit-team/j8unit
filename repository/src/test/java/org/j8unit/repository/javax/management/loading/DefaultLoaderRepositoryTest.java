package org.j8unit.repository.javax.management.loading;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultLoaderRepositoryTest
implements org.j8unit.repository.javax.management.loading.DefaultLoaderRepositoryTests<javax.management.loading.DefaultLoaderRepository> {

    @Override
    public javax.management.loading.DefaultLoaderRepository createNewSUT() {
        return new javax.management.loading.DefaultLoaderRepository();
    }

}
