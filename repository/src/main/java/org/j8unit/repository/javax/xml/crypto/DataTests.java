package org.j8unit.repository.javax.xml.crypto;

import javax.xml.crypto.Data;
import org.j8unit.repository.RepositoryTests;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test {@link Data public
 * abstract interface javax.xml.crypto.Data}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.javax.xml.crypto.DataClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */

@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DataTests<SUT extends Data>
extends RepositoryTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[javax.xml.crypto.Data]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[javax.xml.crypto.Data]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[javax.xml.crypto.Data]

}
