package com.sparsh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args)
			throws IOException, URISyntaxException
	{

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				App.class.getResourceAsStream("/application.properties")));

		String line = reader.readLine();
		System.out.println(line);
	}
}
