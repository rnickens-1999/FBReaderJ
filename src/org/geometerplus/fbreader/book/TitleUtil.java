/*
 * Copyright (C) 2009-2013 Geometer Plus <contact@geometerplus.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 */

package org.geometerplus.fbreader.book;

public abstract class TitleUtil {
	public static String firstTitleLetter(Book book) {
		if (book == null) {
			return null;
		}
		return firstLetter(book.getTitle());
	}

	public static String firstLetter(String title) {
		if (title == null) {
			return null;
		}
		title = title.trim();
		if ("".equals(title)) {
			return null;
		}
		for (int i = 0; i < title.length(); ++i) {
			char letter = title.charAt(i);
			if (Character.isLetterOrDigit(letter)) {
				return String.valueOf(Character.toUpperCase(letter));
			}
		}
		return String.valueOf(Character.toUpperCase(title.charAt(0)));
	}
}
