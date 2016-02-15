package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.crypto.dsig.spec.C14NMethodParameterSpec interface
 * javax.xml.crypto.dsig.spec.C14NMethodParameterSpec}. The complementary j8unit test interface containing the class
 * relevant aspects is {@link C14NMethodParameterSpecClassTests}.
 * </p>
 *
 * @see javax.xml.crypto.dsig.spec.C14NMethodParameterSpec interface javax.xml.crypto.dsig.spec.C14NMethodParameterSpec
 *      (the hereby targeted class-under-test class)
 * @see C14NMethodParameterSpecClassTests C14NMethodParameterSpecClassTests (the complementary j8unit test interface
 *      containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface C14NMethodParameterSpecTests<SUT extends javax.xml.crypto.dsig.spec.C14NMethodParameterSpec>
extends TransformParameterSpecTests<SUT> {

}
