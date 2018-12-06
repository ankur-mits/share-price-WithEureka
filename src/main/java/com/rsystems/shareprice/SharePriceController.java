package com.rsystems.shareprice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SharePriceController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	Configuration configuration;
	
	@Autowired
	private Environment environment;
	
	@GetMapping(path="/shareprice")
	public SharePrice getSharePrice() {
		
		int port = Integer.parseInt(environment.getProperty("local.server.port"));
		logger.info("Share-Price Port"+port);
		return new SharePrice(configuration.getLowprice(), configuration.getHighprice(), port);
	}
}
