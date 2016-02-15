package org.j8unit.repository.javax.xml.bind;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.bind.DatatypeConverter class javax.xml.bind.DatatypeConverter}.
 * The complementary j8unit test interface containing the class relevant aspects is {@link DatatypeConverterClassTests}.
 * </p>
 *
 * @see javax.xml.bind.DatatypeConverter class javax.xml.bind.DatatypeConverter (the hereby targeted class-under-test
 *      class)
 * @see DatatypeConverterClassTests DatatypeConverterClassTests (the complementary j8unit test interface containing the
 *      class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface DatatypeConverterTests<SUT extends javax.xml.bind.DatatypeConverter>
extends org.j8unit.repository.java.lang.ObjectTests<SUT> {

}
