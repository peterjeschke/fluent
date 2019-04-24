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
 * An exception that can occur when using the fluent tools.
 *
 * @author Peter Jeschke
 */
public abstract class FluentException extends Exception {

	private static final long serialVersionUID = 1L;

	public FluentException() {
	}

	@SuppressWarnings("WeakerAccess")
	public FluentException(String message) {
		super(message);
	}

	public FluentException(Throwable cause) {
		super(cause);
	}

	public FluentException(String message,
						   Throwable cause) {
		super(message, cause);
	}
}
