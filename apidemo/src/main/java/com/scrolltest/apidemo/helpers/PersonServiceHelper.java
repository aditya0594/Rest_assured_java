//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
package com.scrolltest.apidemo.helpers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.scrolltest.apidemo.constants.Endpoints;
import com.scrolltest.apidemo.model.Person;
import com.scrolltest.apidemo.utils.ConfigManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;

import java.lang.reflect.Type;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PersonServiceHelper {

    // We need to read the config variables
    // Rest Assured about the URL, Port
    // Make a Get REQUEST on this url and send the data to TestGETPerson



}
