package br.com.tony.marvelapi.resource.wrapper;

import java.util.UUID;

public class DataWrapper<T> {
    private final int code;
    private final String status;
    private final String copyright = "© 2021 Tony Augusto";
    private final String attributionText = "Data provided by Tony Augusto. © 2021 Github: tonyals";
    private final String attributionHTML = "<a href=\"https://github.com/TonyALS\">Data provided by Tony Augusto. © 2021 Github: tonyals</a>";
    private final String etag = UUID.randomUUID().toString();
    private final T data;

    public DataWrapper(int code, String status, T data) {
        this.code = code;
        this.status = status;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public String getCopyright() {
        return copyright;
    }

    public String getAttributionText() {
        return attributionText;
    }

    public String getAttributionHTML() {
        return attributionHTML;
    }

    public T getData() {
        return data;
    }

    public String getEtag() {
        return etag;
    }
}
