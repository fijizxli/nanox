package x.nanocomp.nanox.services;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import x.nanocomp.nanox.models.User;
import x.nanocomp.nanox.repositories.UserRepository;
import x.nanocomp.nanox.requests.RegistrationRequest;

@Service
@AllArgsConstructor
public class RegistrationService {
    private final UserRepository ur;
    private final PasswordEncoder pe;

    public String register(RegistrationRequest request){


        User u = new User(request.getUsername(),
                pe.encode(request.getPassword()),
                "","", request.getGender());

        ur.save(u);
        return "done.";
    }
}
