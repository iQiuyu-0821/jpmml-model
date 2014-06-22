/*
 * Copyright (c) 2013 Villu Ruusmann
 */
package org.jpmml.model;

import org.dmg.pmml.AbstractSimpleVisitor;
import org.dmg.pmml.PMMLObject;
import org.dmg.pmml.VisitorAction;

public class SourceLocationNullifier extends AbstractSimpleVisitor {

	@Override
	public VisitorAction visit(PMMLObject object){
		object.setSourceLocation(null);

		return VisitorAction.CONTINUE;
	}
}