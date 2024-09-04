package com.example.assignment1.common.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Creative {
    @SerializedName("file")
    @Expose
    private String file;
    @SerializedName("thumb_url")
    @Expose
    private String thumbUrl;
    @SerializedName("creative_type")
    @Expose
    private long creativeType;

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Creative withFile(String file) {
        this.file = file;
        return this;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public Creative withThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
        return this;
    }

    public long getCreativeType() {
        return creativeType;
    }

    public void setCreativeType(long creativeType) {
        this.creativeType = creativeType;
    }

    public Creative withCreativeType(long creativeType) {
        this.creativeType = creativeType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Creative.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("file");
        sb.append('=');
        sb.append(((this.file == null)?"<null>":this.file));
        sb.append(',');
        sb.append("thumbUrl");
        sb.append('=');
        sb.append(((this.thumbUrl == null)?"<null>":this.thumbUrl));
        sb.append(',');
        sb.append("creativeType");
        sb.append('=');
        sb.append(this.creativeType);
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }
}
