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

import java.util.List;
import java.util.Map;

/**
 * A function that can be applied in messages.
 * <p>
 * Functions are represented by their name and behaviour.
 *
 * @author Peter Jeschke
 */
public interface FluentFunction {
	/**
	 * Applies this function with a collection of arguments.
	 *
	 * @param positionalArguments all positional arguments
	 * @param arguments           contains all named arguments as (argumentKey, argumentValue)
	 * @return the result of the function
	 */
	String applyFunction(List<String> positionalArguments, Map<String, String> arguments);

	/**
	 * Returns the name of this function
	 *
	 * @return the name of this function
	 */
	String getName();
}
