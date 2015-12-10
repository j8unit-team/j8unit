package org.j8unit.repository.javax.management.loading;

import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

@RunWith(J8Unit4.class)
public class ClassLoaderRepositoryClassTest
implements org.j8unit.repository.javax.management.loading.ClassLoaderRepositoryClassTests<javax.management.loading.ClassLoaderRepository> {

    @Override
    public Class<javax.management.loading.ClassLoaderRepository> createNewSUT() {
        return javax.management.loading.ClassLoaderRepository.class;
    }

}
