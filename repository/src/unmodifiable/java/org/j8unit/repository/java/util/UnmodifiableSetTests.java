package org.j8unit.repository.java.util;

import java.util.Set;
import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * @since 0.9.5
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface UnmodifiableSetTests<SUT extends Set<E>, E>
extends UnmodifiableCollectionTests<SUT, E>, SetTests<SUT, E> {
}
