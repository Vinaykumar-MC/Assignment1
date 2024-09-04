package com.example.assignment1.common.model;

public class TranslatedContent {

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(TranslatedContent.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }
}
