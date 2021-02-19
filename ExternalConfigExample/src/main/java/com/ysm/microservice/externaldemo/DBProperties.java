package com.ysm.microservice.externaldemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("db")
public class DBProperties {
		private String connection;
		private String username;
		private String password;
		public String getConnection() {
			return connection;
		}
		public void setConnection(String connection) {
			this.connection = connection;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
}
