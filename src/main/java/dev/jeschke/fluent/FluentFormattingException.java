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

/**
 * Gets thrown when a message can't be formatted.
 *
 * @author Peter Jeschke
 */
public final class FluentFormattingException extends FluentException {

	private static final long serialVersionUID = -6821569739385736452L;

	private final FluentFormattingError error;

	public FluentFormattingException(FluentFormattingError error) {
		super(error.toString());
		this.error = error;
	}

	public final FluentFormattingError getError() {
		return error;
	}
}
