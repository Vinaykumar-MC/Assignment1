package com.example.assignment1.common.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class JobTag {
    @SerializedName("value")
    @Expose
    private String value;
    @SerializedName("bg_color")
    @Expose
    private String bgColor;
    @SerializedName("text_color")
    @Expose
    private String textColor;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public JobTag withValue(String value) {
        this.value = value;
        return this;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public JobTag withBgColor(String bgColor) {
        this.bgColor = bgColor;
        return this;
    }

    public String getTextColor() {
        return textColor;
    }

    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    public JobTag withTextColor(String textColor) {
        this.textColor = textColor;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(JobTag.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("bgColor");
        sb.append('=');
        sb.append(((this.bgColor == null)?"<null>":this.bgColor));
        sb.append(',');
        sb.append("textColor");
        sb.append('=');
        sb.append(((this.textColor == null)?"<null>":this.textColor));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
