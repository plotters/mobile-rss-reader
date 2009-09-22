/*
 * RssItunesFeed.java
 *
 * Copyright (C) 2007-2008 Tommi Laukkanen
 * Copyright (C) 2007-2008 Irving Bunton
 * http://www.substanceofcode.com
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
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */
// Expand to define itunes define
@DITUNESDEF@
// Expand to define logging define
@DLOGDEF@
// Expand to define test define
@DTESTDEF@
//#ifdef DTEST
package com.substanceofcode.rssreader.businessentities;

import com.substanceofcode.utils.Base64;
import com.substanceofcode.utils.StringUtil;
import java.io.UnsupportedEncodingException;
import java.util.*;

/**
 * RssItunesFeedInfo interface contains one RSS Itunes feed's properties.
 * Properties include name and subtitle and summary.
 *
 * @author Irving Bunton
 */
public interface RssItunesFeedInfo extends RssFeedInfo {
    
    /** Creates a new instance of RSSBookmark */
    /** Return record store string */
    String getStoreString(boolean serializeItems, boolean encoded);

	//#ifdef DTEST
	/** Compare feed to an existing feed.  **/
	boolean equals(RssFeedInfo feed);
	//#endif
    
    void setDescription(String description);

    String getDescription();

    void setLanguage(String language);

    String getLanguage();

    void setAuthor(String author);

    String getAuthor();

    void setSubtitle(String subtitle);

    String getSubtitle();

    void setSummary(String summary);

    String getSummary();

    void setExplicit(String explicit);

    String getExplicit();

    void setItunes(boolean itunes);

    boolean isItunes();

    void setTitle(String title);

    String getTitle();

}
//#endif
