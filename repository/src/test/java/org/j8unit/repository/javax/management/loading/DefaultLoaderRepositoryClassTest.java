package org.j8unit.repository.javax.management.loading;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class DefaultLoaderRepositoryClassTest
implements org.j8unit.repository.javax.management.loading.DefaultLoaderRepositoryClassTests<javax.management.loading.DefaultLoaderRepository> {

    @Override
    public Class<javax.management.loading.DefaultLoaderRepository> createNewSUT() {
        return javax.management.loading.DefaultLoaderRepository.class;
    }

}
