/*******************************************************************************
 * Copyright (c) 2007-2013 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributor:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.vpe.browsersim.model.preferences;

import java.util.Observable;

import org.eclipse.swt.graphics.Point;

/**
 * 
 * @author Konstantin Marmalyukov (kmarmaliykov)
 *
 */

public class SpecificPreferences extends Observable {
	public static final int ORIENTATION_PORTRAIT = 0;
	public static final int ORIENTATION_LANDSCAPE = 90;
	public static final int ORIENTATION_PORTRAIT_INVERTED = 180;
	public static final int ORIENTATION_LANDSCAPE_INVERTED = -90;
	
	private String selectedDeviceId;
	private boolean useSkins;
	private int orientationAngle;
	private Point location;

	public SpecificPreferences(String selectedDeviceId, boolean useSkins, int orientationAngle, Point location) {
		this.selectedDeviceId = selectedDeviceId;
		this.useSkins = useSkins;
		this.orientationAngle = orientationAngle;
		this.location = location;
	}

	public String getSelectedDeviceId() {
		return selectedDeviceId;
	}

	public void setSelectedDeviceId(String selectedDeviceId) {
		if (!this.selectedDeviceId.equals(selectedDeviceId)) {
			this.selectedDeviceId = selectedDeviceId;
			setChanged();
		}
	}

	public boolean getUseSkins() {
		return useSkins;
	}

	public void setUseSkins(boolean useSkins) {
		if (this.useSkins != useSkins) {
			this.useSkins = useSkins;
			setChanged();
		}
	}
	
	public int getOrientationAngle() {
		return orientationAngle;
	}

	public void setOrientationAngle(int orientationAngle) {
		if (this.orientationAngle != orientationAngle) {
			this.orientationAngle = orientationAngle;
			setChanged();
		}
	}

	public Point getLocation() {
		return location;
	}

	public void setLocation(Point location) {
		this.location = location;
	}

	public void copyProperties(SpecificPreferences sp) {
		setSelectedDeviceId(sp.getSelectedDeviceId());
		setUseSkins(sp.getUseSkins());
		setOrientationAngle(sp.getOrientationAngle());
		setLocation(sp.getLocation());
	}
}
