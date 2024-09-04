package com.example.assignment1.common.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class FeeDetails {
    @SerializedName("V3")
    @Expose
    private List<Object> v3 = new ArrayList<Object>();

    public List<Object> getV3() {
        return v3;
    }

    public void setV3(List<Object> v3) {
        this.v3 = v3;
    }

    public FeeDetails withV3(List<Object> v3) {
        this.v3 = v3;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(FeeDetails.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("v3");
        sb.append('=');
        sb.append(((this.v3 == null)?"<null>":this.v3));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }
}
