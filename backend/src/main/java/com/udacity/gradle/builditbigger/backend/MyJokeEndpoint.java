package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyJokeEndpoint {

//    /** A simple endpoint method that takes a name and says Hi back */
//    @ApiMethod(name = "sayHi")
//    public MyJokeBean sayHi(@Named("name") String name) {
//        MyJokeBean response = new MyJokeBean();
//        response.setData("Hi, " + name);
//        return response;
//    }

    /**
     * A simple endpoint method that tell a joke
     */
    @ApiMethod(name = "getJoke")
    public MyJokeBean getJoke(MyJokeBean jokeBean) {
        return jokeBean;
    }

}
