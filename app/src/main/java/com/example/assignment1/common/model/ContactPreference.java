package com.example.assignment1.common.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContactPreference {
    @SerializedName("preference")
    @Expose
    private long preference;
    @SerializedName("whatsapp_link")
    @Expose
    private String whatsappLink;
    @SerializedName("preferred_call_start_time")
    @Expose
    private String preferredCallStartTime;
    @SerializedName("preferred_call_end_time")
    @Expose
    private String preferredCallEndTime;

    public long getPreference() {
        return preference;
    }

    public void setPreference(long preference) {
        this.preference = preference;
    }

    public ContactPreference withPreference(long preference) {
        this.preference = preference;
        return this;
    }

    public String getWhatsappLink() {
        return whatsappLink;
    }

    public void setWhatsappLink(String whatsappLink) {
        this.whatsappLink = whatsappLink;
    }

    public ContactPreference withWhatsappLink(String whatsappLink) {
        this.whatsappLink = whatsappLink;
        return this;
    }

    public String getPreferredCallStartTime() {
        return preferredCallStartTime;
    }

    public void setPreferredCallStartTime(String preferredCallStartTime) {
        this.preferredCallStartTime = preferredCallStartTime;
    }

    public ContactPreference withPreferredCallStartTime(String preferredCallStartTime) {
        this.preferredCallStartTime = preferredCallStartTime;
        return this;
    }

    public String getPreferredCallEndTime() {
        return preferredCallEndTime;
    }

    public void setPreferredCallEndTime(String preferredCallEndTime) {
        this.preferredCallEndTime = preferredCallEndTime;
    }

    public ContactPreference withPreferredCallEndTime(String preferredCallEndTime) {
        this.preferredCallEndTime = preferredCallEndTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContactPreference.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("preference");
        sb.append('=');
        sb.append(this.preference);
        sb.append(',');
        sb.append("whatsappLink");
        sb.append('=');
        sb.append(((this.whatsappLink == null)?"<null>":this.whatsappLink));
        sb.append(',');
        sb.append("preferredCallStartTime");
        sb.append('=');
        sb.append(((this.preferredCallStartTime == null)?"<null>":this.preferredCallStartTime));
        sb.append(',');
        sb.append("preferredCallEndTime");
        sb.append('=');
        sb.append(((this.preferredCallEndTime == null)?"<null>":this.preferredCallEndTime));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }
}
