/*	    Wifi Fixer for Android
    Copyright (C) 2010-2013  David Van de Ven

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see http://www.gnu.org/licenses
 */

package org.wahtod.wififixer.prefs;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class PrefConstants {

	/*
	 * Constants for non-UI-tracked preferences
	 */

	public static final String SLPOLICY_DEFAULT = "SLPDEF";
	public static final String STATNOTIF_DEFAULT = "STATNOTIFD";
	public static final String SLPOLICY_KEY = "SLEEP_POLICY";
	public static final String PERF_KEY = "Perf_Mode";
	public static final String WIDGET_KEY = "WIDGET";
	public static final String WIFI_STATE_LOCK = "WFSTATELOCK";
	public static final String LOGGING_MENU = "Logging";
	public static final String HAS_WIDGET = "HASWIDGET";
	public static final String TUTORIAL = "TUTORIAL";
	public static final String SERVICEWARNED = "SWARNED";

	/*
	 * PrefsList enum
	 */

	public static enum Pref {
		WIFILOCK_KEY("WiFiLock"), NOTIF_KEY("Notifications"), DISABLE_KEY(
				"Disable"), LOG_KEY("SLOG"), N1FIX2_KEY("N1FIX2"), SCREEN_KEY(
				"SCREEN"), STATENOT_KEY("StateNotif"), HASWIDGET_KEY(
				"HASWIDGET");

		private String key;
		private static final Map<String, Pref> lookup = new HashMap<String, Pref>();

		static {
			for (Pref p : EnumSet.allOf(Pref.class))
				lookup.put(p.key(), p);
		}

		Pref(String key) {
			this.key = key;
		}

		public String key() {
			return key;
		}

		public static Pref get(final String pstring) {

			return lookup.get(pstring);
		}

	}

	public static final int NUMNETPREFS = 2;

	public static enum NetPref {
		DISABLED_KEY("ENABLEDSTATE"), NONMANAGED_KEY("NONMANAGED");

		private String key;
		private static final Map<String, NetPref> lookup = new HashMap<String, NetPref>();

		static {
			for (NetPref p : EnumSet.allOf(NetPref.class))
				lookup.put(p.key(), p);
		}

		NetPref(String key) {
			this.key = key;
		}

		public String key() {
			return key;
		}

		public static NetPref get(final String pstring) {

			return lookup.get(pstring);
		}

	}

}
