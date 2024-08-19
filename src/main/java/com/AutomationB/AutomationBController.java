package com.AutomationB;

import org.springframework.web.bind.annotation.GetMapping;

public class AutomationBController {
	@GetMapping(value = "view")
	public String Getdata() {
		return "I'm jeeva the developer  \r\n   " + "creative wings to design   \r\n"
				+ "Hoping it reaches     \r\n";
}
}

