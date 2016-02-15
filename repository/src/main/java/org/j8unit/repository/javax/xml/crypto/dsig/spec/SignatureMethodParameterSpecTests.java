package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable j8unit test interface containing the instance relevant aspects (i.&thinsp;e., test methods targeting the
 * non-{@code static} methods) of {@linkplain javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec interface
 * javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec}. The complementary j8unit test interface containing the
 * class relevant aspects is {@link SignatureMethodParameterSpecClassTests}.
 * </p>
 *
 * @see javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec interface
 *      javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec (the hereby targeted class-under-test class)
 * @see SignatureMethodParameterSpecClassTests SignatureMethodParameterSpecClassTests (the complementary j8unit test
 *      interface containing the class relevant test methods)
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SignatureMethodParameterSpecTests<SUT extends javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec>
extends org.j8unit.repository.java.security.spec.AlgorithmParameterSpecTests<SUT> {

}
