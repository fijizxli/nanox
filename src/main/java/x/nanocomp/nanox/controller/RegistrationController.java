package x.nanocomp.nanox.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import x.nanocomp.nanox.requests.RegistrationRequest;
import x.nanocomp.nanox.services.RegistrationService;

@RestController
@RequestMapping(path = "api/register")
@AllArgsConstructor
public class RegistrationController {
    private RegistrationService registrationService;

    @PostMapping
    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }
    @GetMapping
    public String register(){
        return "x";
    }
}
