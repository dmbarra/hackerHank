package com.example.demo;


//Create a simple class, with at least one attribute and one method.
//        E.g - Car class, attribute: color, method: make_noise - that just displays some noise, like 'brrrr' / 'vrrr-um' or other, at your choice.
//        Create an object of the above class and configure the attribute when the object is instantiated.
//        Display the attribute.
//        Call the object method.
//        Create a derived class: e.g. DaciaCar.
//        Change the make noise in the derived class to display: 'DaciaCar' noise (whatever the noise sound was chosen for the base class.

public class Car {

    private String color;

    public String makeNoise(){
        return "brrrr";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}


device = open("com.androidstudy");



//    Open a URL of any choice
//    Get all the links in the webpage
//        click on the third link
//        This link will take you to a new window
//        switch to the new window
//        do some text assertions
//        closes the window
//        and return back to main window

//        API for below request
//        https://reqres.in/api/users
//        {
//        "name": "Daniel",
//        "job": "QA"
//        }
//
//
//        post request
//        Json
//        log request and response
//        simple assertion

//public void testAPI(){
//    Request request = "{}";
//    Response response = restAssured.post("URL").headers("...").body(request).answer();
//
//    assertThat(response.id).equalTo("....")
//    assertThat(response.status).equalTo("...")
//}