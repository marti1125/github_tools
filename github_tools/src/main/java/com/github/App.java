/**
 * This copy of Woodstox XML processor is licensed under the
 * Apache (Software) License, version 2.0 ("the License").
 * See the License for details about distribution rights, and the
 * specific rights regarding derivate works.
 *
 * You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/
 *
 * A copy is also included in the downloadable source code package
 * containing Woodstox, in file "ASL2.0", under the same directory
 * as this file.
 */
package com.github;

import org.jooby.Jooby;
import org.kohsuke.github.GitHub;

import org.jooby.json.Jackson;

/**
 * @author jooby generator
 */
public class App extends Jooby {

  {
	
	use(new Jackson());
	  
    get("/", () -> "Hello World!");
    get("/repositories", rsp -> {
    	//GitHub github = GitHub.connect("username","outh");
    	//return github.getMyOrganizations().toString();
    	//rsp.send(github.getMyOrganizations());
    	return "test";
    });
  }

  public static void main(final String[] args) throws Throwable {
    run(App::new, args);
  }

}
