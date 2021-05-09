package restassured.configuration;

public enum Environment {
    PROD("https://api1.binance.com", "/api/v2"),
    QA("https://qa.api1.binance.com", "/api/v3");

    private String url;
    private String version;

    Environment(String url, String version) {
        this.url = url;
        this.version = version;
    }

    public String getUrl() {
        return url;
    }

    public String getVersion() {
        return version;
    }
}
