package com.mahes.archit.restwebapp.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersioningPersonController {

    @GetMapping("/v1/person")
    public PersonV1 getFirstVersion() {
        return new PersonV1("Archit");
    }


    @GetMapping("/v2/person")
    public PersonV2 getSecondVersion() {
        return new PersonV2("archit", "mahes");
    }

}
