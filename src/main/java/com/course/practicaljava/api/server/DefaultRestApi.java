/**
 * 
 */
package com.course.practicaljava.api.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Selvakumar
 *
 */
@RestController
@RequestMapping("/api")
public class DefaultRestApi {

	Logger LOGGER = LoggerFactory.getLogger(DefaultRestApi.class);

	@RequestMapping(value = "/welcome")
	public String welcome() {
		LOGGER.debug("Welcome");
		return "Welcome to Spring Boot";
	}
}
