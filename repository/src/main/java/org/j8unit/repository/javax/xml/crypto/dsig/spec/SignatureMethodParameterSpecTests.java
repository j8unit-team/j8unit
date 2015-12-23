package org.j8unit.repository.javax.xml.crypto.dsig.spec;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Reusable J8Unit test interface for {@linkplain javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec interface
 * javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec}, containing all instance relevant test methods
 * (i.&thinsp;e., test methods of non-{@code static} methods). The counterpart J8Unit test interface containing the
 * class relevant test methods is
 * {@link org.j8unit.repository.javax.xml.crypto.dsig.spec.SignatureMethodParameterSpecTests}.
 * </p>
 *
 * @see org.j8unit.repository.javax.xml.crypto.dsig.spec.SignatureMethodParameterSpecClassTests
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 *
 * @j8unit.aim javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface SignatureMethodParameterSpecTests<SUT extends javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec>
extends org.j8unit.repository.java.security.spec.AlgorithmParameterSpecTests<SUT> {

}
