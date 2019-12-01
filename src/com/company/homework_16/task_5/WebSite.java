package com.company.homework_16.task_5;

class WebSite {
    private String url;
    private WebsiteType type;

    public WebSite(String url) {
        this(url, WebsiteType.NEWS);
    }

    public WebSite(String url, WebsiteType type) {
        this.url = url;
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public WebsiteType getType() {
        return type;
    }
}
