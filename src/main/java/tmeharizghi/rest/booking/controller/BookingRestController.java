package tmeharizghi.rest.booking.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingRestController {
	
	//Testing GET Restful Method
    @RequestMapping(value = "/branches/", method = RequestMethod.GET)
    public ResponseEntity<String> test() {
        String str = "This is my test message";
        return new ResponseEntity<String>(str, HttpStatus.OK);
    }


}
