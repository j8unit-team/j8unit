package org.j8unit.repository.java.util.stream;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.util.stream.Collectors class java.util.stream.Collectors},
 * containing all instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The
 * counterpart J8Unit test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.util.stream.CollectorsTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.util.stream.CollectorsClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.util.stream.Collectors
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface CollectorsTests<SUT extends java.util.stream.Collectors>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
