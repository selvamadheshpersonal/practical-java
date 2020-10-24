/**
 * 
 */
package com.course.practicaljava.api.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Selvakumar
 *
 */
@RestController
@RequestMapping("/api")
public class DefaultRestApi {

	@RequestMapping(value = "/welcome")
	public String welcome() {
		return "Welcome to Spring Boot";
	}
}
