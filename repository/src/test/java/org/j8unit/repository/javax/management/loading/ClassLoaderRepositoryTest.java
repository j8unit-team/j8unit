package org.j8unit.repository.javax.management.loading;

import javax.management.loading.ClassLoaderRepository;
import org.j8unit.runners.J8Unit4;
import org.junit.AssumptionViolatedException;
import org.junit.runner.RunWith;

/**
 * Specific JUnit test class to proof the instance relevant aspects of type {@link ClassLoaderRepository} (by simply
 * reusing the J8Unit test interface {@link org.j8unit.repository.javax.management.loading.ClassLoaderRepositoryTests}).
 */
@RunWith(J8Unit4.class)
public class ClassLoaderRepositoryTest
implements ClassLoaderRepositoryTests<ClassLoaderRepository> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.loading.ClassLoaderRepository]

    @Override
    public ClassLoaderRepository createNewSUT() {
        throw new AssumptionViolatedException("Due to the abstract modifier of this type-under-test [javax.management.loading.ClassLoaderRepository], j8unit does not support a generic way to provide instances.");
    }

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.management.loading.ClassLoaderRepository]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.loading.ClassLoaderRepository]

}
