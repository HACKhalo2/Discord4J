/*
 *     This file is part of Discord4J.
 *
 *     Discord4J is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Discord4J is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with Discord4J.  If not, see <http://www.gnu.org/licenses/>.
 */

package sx.blah.discord.api.internal.json.event;


import sx.blah.discord.api.internal.json.objects.UserObject;

/**
 * This is sent when a new member joins a guild
 */
public class GuildMemberAddEventResponse {

	/**
	 * The user who joined the guild
	 */
	public UserObject user;

	/**
	 * The roles of the user.
	 */
	public String[] roles;

	/**
	 * Timestamp for when the user joined
	 */
	public String joined_at;

	/**
	 * The guild id the user joined.
	 */
	public String guild_id;
}
