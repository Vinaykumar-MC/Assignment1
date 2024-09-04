package com.example.assignment1.common.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class V3 {
    @SerializedName("field_key")
    @Expose
    private String fieldKey;
    @SerializedName("field_name")
    @Expose
    private String fieldName;
    @SerializedName("field_value")
    @Expose
    private String fieldValue;

    public String getFieldKey() {
        return fieldKey;
    }

    public void setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
    }

    public V3 withFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
        return this;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public V3 withFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public V3 withFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V3 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fieldKey");
        sb.append('=');
        sb.append(((this.fieldKey == null)?"<null>":this.fieldKey));
        sb.append(',');
        sb.append("fieldName");
        sb.append('=');
        sb.append(((this.fieldName == null)?"<null>":this.fieldName));
        sb.append(',');
        sb.append("fieldValue");
        sb.append('=');
        sb.append(((this.fieldValue == null)?"<null>":this.fieldValue));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }
}
