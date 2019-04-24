/*
 * Copyright 2019 Peter-René Jeschke
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.jeschke.fluent;

import java.util.Map;
import java.util.Set;

/**
 * A message than contains a translation for a specific text.
 *
 * @author Peter Jeschke
 */
public interface FluentMessage {
	/**
	 * Formats a message, using no options.
	 *
	 * @return the formatted message
	 * @throws FluentFormattingException if the message couldn't be formatted
	 */
	String format() throws FluentFormattingException;

	/**
	 * Formats a message with the given options.
	 * <p>
	 * Options that are given in the map but are not used in the message will be ignored. Options that are used in the message but are absent in the options will cause an exception.
	 *
	 * @param options options that will be used to augment the message. Contains the key-value-pairs as (optionName, optionValue)
	 * @return the formatted message
	 * @throws FluentFormattingException if the message couldn't be formatted
	 */
	String format(Map<String, String> options) throws FluentFormattingException;

	/**
	 * Formats a message, using no options.
	 * <p>
	 * An alternative approach to {@link #format(Map)} that tries to return a message at all costs and
	 * adds errors into the supplied set instead.
	 *
	 * @param errors all errors that might have happened during formatting. Adding elements must be
	 *               allowed
	 * @return the formatted message
	 */
	String format(Set<FluentFormattingError> errors);

	/**
	 * Formats a message with the given options.
	 * <p>
	 * An alternative approach to {@link #format(Map)} that tries to return a message at all costs and
	 * adds errors into the supplied set instead.
	 * <p>
	 * Options that are given in the map but are not used in the message will be ignored. Options that are used in the message but are absent in the options will add an error.
	 *
	 * @param options options that will be used to augment the message. Contains the key-value-pairs as (optionName, optionValue)
	 * @param errors  all errors that might have happened during formatting. Adding elements must be
	 *                allowed
	 * @return the formatted message
	 */
	String format(Map<String, String> options, Set<FluentFormattingError> errors);
}
