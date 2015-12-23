package org.j8unit.repository.javax.xml.ws;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.ws.Holder class javax.xml.ws.Holder}, containing all
 * instance relevant test methods (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit
 * test interface containing the class relevant test methods is {@link org.j8unit.repository.javax.xml.ws.HolderTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.ws.HolderClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.ws.Holder
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface HolderTests<SUT extends javax.xml.ws.Holder<T>, T>
extends org.j8unit.repository.java.io.SerializableTests<SUT>, org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
