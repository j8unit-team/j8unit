package org.j8unit.repository.javax.management.loading;

import javax.management.loading.PrivateMLet;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link PrivateMLet
 * public class javax.management.loading.PrivateMLet}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.management.loading.PrivateMLetClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface PrivateMLetTests<SUT extends PrivateMLet>
extends org.j8unit.repository.javax.management.loading.PrivateClassLoaderTests<SUT>, org.j8unit.repository.javax.management.loading.MLetTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.management.loading.PrivateMLet]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.management.loading.PrivateMLet]

}
