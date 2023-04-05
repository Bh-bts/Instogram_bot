package com.Utils.Properties;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesClass {

	public static Properties a;

	public static Properties fileConfig() throws IOException {

		String projectPath = System.getProperty("user.dir");
		File file = new File(projectPath + "/src/main/resources/config.properties");

		FileReader reader = new FileReader(file);

		Properties props = new Properties();
		props.load(reader);

		return a = props;

	}

	public static String setUserName() throws IOException {

		fileConfig();
		String userName = a.getProperty("user_name");
		return userName;

	}

	public static String setPassword() throws IOException {

		fileConfig();
		String password = a.getProperty("password");
		return password;

	}

	public static String setSession() throws IOException {

		fileConfig();
		String session = a.getProperty("session_id");
		return session;

	}

	public static String setBrowser() throws IOException {

		fileConfig();
		String browser = a.getProperty("browser");
		return browser;

	}

	public static String setURL() throws IOException {

		fileConfig();
		String url = a.getProperty("url");
		return url;
	}

}
