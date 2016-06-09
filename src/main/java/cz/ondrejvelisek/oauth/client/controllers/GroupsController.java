package cz.ondrejvelisek.oauth.client.controllers;

import cz.ondrejvelisek.oauth.client.model.Group;
import cz.ondrejvelisek.oauth.client.model.Member;
import cz.ondrejvelisek.oauth.client.model.PerunException;
import cz.ondrejvelisek.oauth.client.model.User;
import cz.ondrejvelisek.oauth.client.model.Vo;
import cz.ondrejvelisek.oauth.client.perun.Perun;
import cz.ondrejvelisek.oauth.client.perun.Utils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/**")
public class GroupsController {

    @RequestMapping("/")
    public String group(ServletRequest req) {


        try {
            String token = (String) req.getAttribute(OauthFilter.TOKEN_ARG_NAME);
            Perun p = new Perun(token);

            req.setAttribute("perunPrincipal", p.authzResolver().getPerunPrincipal());

        } catch (PerunException e) {
            req.setAttribute("e", e);
            return "exception";
        }

        return "index";
    }






}
