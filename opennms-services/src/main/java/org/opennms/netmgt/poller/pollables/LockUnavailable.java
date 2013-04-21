/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2006-2012 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2012 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package org.opennms.netmgt.poller.pollables;

/**
 * Represents a LockUnavailable
 *
 * @author <a href="mailto:brozow@opennms.org">Mathew Brozowski</a>
 * @version $Id: $
 */
public class LockUnavailable extends RuntimeException {

    private static final long serialVersionUID = 6054183865580259303L;

    /**
     * <p>Constructor for LockUnavailable.</p>
     */
    public LockUnavailable() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * <p>Constructor for LockUnavailable.</p>
     *
     * @param message a {@link java.lang.String} object.
     */
    public LockUnavailable(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    /**
     * <p>Constructor for LockUnavailable.</p>
     *
     * @param message a {@link java.lang.String} object.
     * @param cause a {@link java.lang.Throwable} object.
     */
    public LockUnavailable(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    /**
     * <p>Constructor for LockUnavailable.</p>
     *
     * @param cause a {@link java.lang.Throwable} object.
     */
    public LockUnavailable(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }

}
