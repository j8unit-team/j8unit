package org.j8unit.repository.java.lang.reflect;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain java.lang.reflect.Proxy class java.lang.reflect.Proxy}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is
 * {@link org.j8unit.repository.java.lang.reflect.ProxyTests}.
 * </p>
 *
 * @see org.j8unit.repository.java.lang.reflect.ProxyClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim java.lang.reflect.Proxy
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface ProxyTests<SUT extends java.lang.reflect.Proxy>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
