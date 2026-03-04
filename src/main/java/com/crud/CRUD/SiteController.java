package com.crud.CRUD;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/sites")
public class SiteController {

    @Autowired
    private SiteRepository siteRepository;

    //CREATE
    @PostMapping
    public Site createSite(@RequestBody Site site) {

        return siteRepository.save(site);
    }

    //VIEW ALL
    @GetMapping
    public List<Site> getAllSites() {
        return siteRepository.findAll();
    }

    //VIEW BY ID
    @GetMapping("/{id}")
    public Site getSiteById(@PathVariable Integer id) {
        // findById looks for the Primary Key you defined as @Id in Site.java
        return siteRepository.findById(id).orElse(null);
    }
}