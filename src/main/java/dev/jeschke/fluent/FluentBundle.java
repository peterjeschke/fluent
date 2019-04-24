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
import java.util.Optional;

/**
 * A bundle that contains all translations for a single language.
 *
 * @author Peter Jeschke
 */
public interface FluentBundle {
	/**
	 * Returns a new FluentBundle with the added messages.
	 *
	 * @param messages the messages to add to this bundle
	 * @return a FluentBundle with the added messages
	 */
	FluentBundle withMessages(Map<String, FluentMessage> messages);

	/**
	 * Returns a new FluentBundle with the added functions.
	 *
	 * @param functions the functions to add to this bundle
	 * @return a FluentBundle with the added functions
	 */
	FluentBundle withFunctions(Map<String, FluentFunction> functions);

	/**
	 * Indicates whether this bundle contains a message with the given ID.
	 *
	 * @param messageId a fluent message id
	 * @return {@code true}, if the message exists
	 */
	boolean hasMessage(String messageId);

	/**
	 * Returns the {@link FluentMessage} for the given ID
	 *
	 * @param messageId a messageId that's part of this bundle
	 * @return {@link Optional#empty()} if the messageId does not exist, or an {@link Optional} that contains the message
	 */
	Optional<FluentMessage> getMessage(String messageId);
}
