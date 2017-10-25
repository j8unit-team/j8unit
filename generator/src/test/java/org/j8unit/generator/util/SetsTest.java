package org.j8unit.generator.util;

import static java.util.Arrays.asList;
import static java.util.Collections.emptySet;
import static java.util.Collections.singleton;
import static org.j8unit.generator.util.Sets.merge;
import static org.junit.Assert.assertEquals;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;

public class SetsTest {

    @Test
    public void testSetMerge()
    throws Exception {
        final Set<?> empty = merge(emptySet(), emptySet());
        assertEquals(emptySet(), empty);
        final Set<String> left = merge(singleton("hello"), emptySet());
        assertEquals(singleton("hello"), left);
        final Set<String> right = merge(emptySet(), singleton("world"));
        assertEquals(singleton("world"), right);
        final Set<String> helloWorld = merge(singleton("hello"), singleton("world"));
        assertEquals(new HashSet<>(asList("hello", "world")), helloWorld);
        final Set<String> hello = merge(singleton("hello"), singleton("hello"));
        assertEquals(singleton("hello"), hello);
    }

}
