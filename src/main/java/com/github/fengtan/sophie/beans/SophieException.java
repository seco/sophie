/**
 * Sophie - A Solr browser and administration tool
 * 
 * Copyright (C) 2016 fengtan<https://github.com/fengtan>
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.fengtan.sophie.beans;

/**
 * Exception specific to Sophie.
 */
public class SophieException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * Create an exception and specify a message.
     * 
     * @param msg
     *            Message.
     */
    public SophieException(String msg) {
        super(msg);
    }

    /**
     * Create an exception caused by a Throwable and specify a message.
     * 
     * @param msg
     *            Message.
     * @param cause
     *            Cause of the exception.
     */
    public SophieException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
