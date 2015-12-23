package org.j8unit.repository.javax.management;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.management.Query class javax.management.Query}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.javax.management.QueryTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.management.QueryClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.management.Query
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface QueryTests<SUT extends javax.management.Query>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
