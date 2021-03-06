/*
 * Copyright (c) 2013 KNIME.com AG, Zurich, Switzerland
 */
package org.dmg.pmml;

import java.util.List;

/**
 * <p>
 * A marker interface for PMML elements that specify {@link Extension} child elements.
 * </p>
 */
public interface HasExtensions {

	boolean hasExtensions();

	List<Extension> getExtensions();

	HasExtensions addExtensions(Extension... extensions);
}
