package org.j8unit.repository.java.security.acl;

import java.security.acl.LastOwnerException;
import org.j8unit.repository.categories.J8UnitRepository;
import org.j8unit.repository.java.lang.ExceptionTests;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects &ndash;&nbsp;i.&thinsp;e., test methods
 * targeting the non-{@code static} behaviour&nbsp;&ndash; of the hereby targeted type-under-test
 * {@link LastOwnerException public class java.security.acl.LastOwnerException}.
 * </p>
 *
 * <p>
 * j8unit strongly encourages you to not only test the instances behaviour but also to test the type constraints. For
 * this purpose, j8unit also provides a complementary test interface containing the class/type relevant aspects (see
 * {@link org.j8unit.repository.java.security.acl.LastOwnerExceptionClassTests}).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LastOwnerExceptionTests<SUT extends LastOwnerException>
extends ExceptionTests<SUT> {

    // J8UNIT-MARKER-[BEGIN]-[INSTANCE]-[java.security.acl.LastOwnerException]

    // J8UNIT-MARKER-[MANUAL]-[INSTANCE]-[java.security.acl.LastOwnerException]

    // J8UNIT-MARKER-[END]-[INSTANCE]-[java.security.acl.LastOwnerException]

}
