package com.crud.CRUD;

import jakarta.persistence.*;

@Entity
@Table(name="Site")
public class Site {
    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public Integer getGlobalSiteId() {
        return globalSiteId;
    }

    public void setGlobalSiteId(Integer globalSiteId) {
        globalSiteId = globalSiteId;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        siteName = siteName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        location = location;
    }

    @Id
    @Column(name="site_id")
    private Integer siteId;

    @Column(name="global_site_id")
    private Integer globalSiteId;

    @Column(name="site_name")
    private String siteName;

    @Column(name="location", columnDefinition = "jsonb")
    private String location;


}
