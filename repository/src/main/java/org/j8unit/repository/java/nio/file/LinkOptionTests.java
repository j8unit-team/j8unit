package org.j8unit.repository.java.nio.file;

import org.j8unit.repository.categories.J8UnitRepository;
import org.junit.experimental.categories.Category;

/**
 * <p>
 * Test class for {@link java.nio.file.LinkOption class java.nio.file.LinkOption}, containing all instance relevant test
 * methods (i.&thinsp;e., test methods of non-{@code static} methods).
 * </p>
 *
 * @param SUT
 *            the type of the subject-under-test
 * @since 0.9.0
 * @see org.j8unit.repository.java.nio.file.LinkOptionClassTests
 */
@FunctionalInterface
@Category(J8UnitRepository.class)
public abstract interface LinkOptionTests<SUT extends java.nio.file.LinkOption>
extends org.j8unit.repository.java.nio.file.OpenOptionTests<SUT>, org.j8unit.repository.java.nio.file.CopyOptionTests<SUT>,
org.j8unit.repository.java.lang.EnumTests<SUT, java.nio.file.LinkOption> {

}
