package de.informaticum.java8.junit.spring.showcase.di;

import org.junit.Assert;
import org.junit.Test;

import de.informaticum.j8junit.repository.J8UnitTest;
import de.informaticum.java8.junit.spring.showcase.di.Foo;

public interface FooTest extends J8UnitTest<Foo> {
	
    @Test
    public default void testAsString() {
    	final Foo subjectUnderTest = getNewSubjectUnderTest();
        Assert.assertEquals("foo", subjectUnderTest.asString());
    }
}
