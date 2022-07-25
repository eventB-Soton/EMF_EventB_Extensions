/*******************************************************************************
 * Copyright (c) 2011, 2018 University of Southampton.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    University of Southampton - initial API and implementation
 *******************************************************************************/
package ac.soton.eventb.emf.core.extension.navigatore.sorter;

import java.text.Collator;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;

/**
 * A sorter that does not sort at all. The elements are sorted by the CNF
 * alphabetically by default, which we do not want. This overrides the sorting
 * and keeps them in the order they appear.
 * 
 * For that, we suppose that the sorting algorithm used by the CNF is stable and
 * just say that all elements are equal.
 * 
 * COPIED FROM fr.systerel.internal.explorer.navigator.sorters
 */
public class AntiSorter extends ViewerComparator {

	public AntiSorter() {
		// do nothing
	}

	public AntiSorter(Collator collator) {
		super(collator);
	}

	/**
	 * All elements are equal, so that they do not get sorted.
	 */
	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		return 0;
	}

}
