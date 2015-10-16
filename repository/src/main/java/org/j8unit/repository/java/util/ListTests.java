package org.j8unit.repository.java.util;

import java.util.List;

@FunctionalInterface
public abstract interface ListTests<L extends List<E>, E>
extends CollectionTests<L, E> {
}
