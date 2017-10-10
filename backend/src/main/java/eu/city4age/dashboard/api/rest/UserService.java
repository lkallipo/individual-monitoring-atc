package eu.city4age.dashboard.api.rest;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import eu.city4age.dashboard.api.persist.UserInRoleRepository;
import eu.city4age.dashboard.api.persist.PilotRepository;
import eu.city4age.dashboard.api.pojo.domain.Pilot;
import eu.city4age.dashboard.api.pojo.domain.UserInRole;
import eu.city4age.dashboard.api.pojo.dto.C4ALoginResponse;
import eu.city4age.dashboard.api.security.JwtIssuer;

/**
 * @author EMantziou
 *
 */
@Component
@Transactional("transactionManager")
@Path(UserService.PATH)
public class UserService {
    
    public static final String PATH = "users";
    
    static protected Logger logger = LogManager.getLogger(UserService.class);
    
    @Autowired
    private UserInRoleRepository userInRoleRepository;
    
    @Autowired
    private PilotRepository pilotRepository;
    
    @Transactional("transactionManager")
    @GET
    @Path("login/username/{username}/password/{password}")
    @Produces("application/json")
    public Response login(@PathParam("username") String username, @PathParam("password") String password)
            throws IOException {
        
        C4ALoginResponse response = new C4ALoginResponse();
        Pilot userPilot;
        String displayName, pilotName, pilotCode;
        
        UserInRole user = userInRoleRepository.findBySystemUsernameAndPassword(username, password);

        // Wrong credentials
        if (user == null) {

            // build response
            response.setResponseCode(401);
            
            return Response.ok(response).build();
        }

        // get pilot name & code
        pilotCode = user.getPilotCode();
        userPilot = pilotRepository.findOne(pilotCode);
        pilotName = userPilot.getName();
        
        displayName = user.getUserInSystem().getDisplayName();

        // create and sign JWT 
        String token = JwtIssuer.INSTANCE.createAndSign(user.getUserInSystem().getUsername(), user.getRoleId(), pilotCode);

        // build response
        response.setResponseCode(200);
        response.setJwToken(token);
        response.setDisplayName(displayName);
        response.setPilotName(pilotName);
        
        return Response.ok(response).build();
//        try {
//            logger.info("Logging in...");
//            user = userInRoleRepository.findBySystemUsernameAndPassword(username, password);
//
//            if (user == null) {
//                response.setMessage("wrong credentials");
//                response.setResponseCode(0);
//                response.setDisplayName("");
//                return Response.ok(response).build();
//            } else {
//                if (user.getRoleId().equals(Short.valueOf("8"))) {
//                    response.setMessage("success");
//                    response.setResponseCode(10);
//                    if (user.getUserInSystem().getDisplayName() != null) {
//                        response.setDisplayName(user.getUserInSystem().getDisplayName());
//                        Long pil = Long.parseLong(user.getPilotId().toString());
//                        userPilot = pilotRepository.findOne(pil);
//
//                        response.setpilotName(userPilot.getName());
//                        response.setPilotId(user.getPilotId());
//                        response.setRoleId(user.getRoleId());
//                    } else {
//                        response.setDisplayName("");
//                    }
//
//                    return Response.ok(response).build();
//                } else {
//                    response.setMessage("you don't have the right permissions");
//                    response.setResponseCode(0);
//                    response.setDisplayName("");
//                    return Response.ok(response).build();
//                }
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            response.setMessage("something went terrible wrong: " + e.getMessage());
//            response.setResponseCode(2);
//            response.setDisplayName("");
//            return Response.ok(response).build();
//        }
    }
    
}
