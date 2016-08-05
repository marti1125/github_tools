package com.github;

import java.io.IOException;

import org.kohsuke.github.GitHub;

public class GithubUtil {
	
	public GitHub connect() throws IOException{
		return GitHub.connect("login","token");
	}
	
}
