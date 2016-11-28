package org.j8unit.repository.javax.management.loading;

import javax.management.loading.ClassLoaderRepository;
import org.j8unit.runners.J8Unit4;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the type relevant aspects of type {@link ClassLoaderRepository} (by simply reusing
 * the J8Unit test interface {@link org.j8unit.repository.javax.management.loading.ClassLoaderRepositoryClassTests}).
 */
@RunWith(J8Unit4.class)
public class ClassLoaderRepositoryClassTest
implements ClassLoaderRepositoryClassTests<ClassLoaderRepository> {

    // J8UNIT-MARKER-[BEGIN]-[CLASS]-[javax.management.loading.ClassLoaderRepository]

    @Override
    public Class<ClassLoaderRepository> createNewSUT() {
        return ClassLoaderRepository.class;
    }

    // J8UNIT-MARKER-[MANUAL]-[CLASS]-[javax.management.loading.ClassLoaderRepository]

    // J8UNIT-MARKER-[END]-[CLASS]-[javax.management.loading.ClassLoaderRepository]

}
