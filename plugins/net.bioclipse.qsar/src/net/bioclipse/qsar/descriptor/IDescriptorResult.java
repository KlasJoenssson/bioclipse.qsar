/*******************************************************************************
 * Copyright (c) 2007 Bioclipse Project
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Egon Willighagen - core API and implementation
 *******************************************************************************/

package net.bioclipse.qsar.descriptor;

public interface IDescriptorResult {

	public String  getDescriptorName();
	public Float[] getValues();
	public String[] getLabels();
	
}
