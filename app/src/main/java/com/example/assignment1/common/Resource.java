package com.example.assignment1.common;

    import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

    public class Resource<T> {

        public static final String EMPTY_RESULT = "Empty Result";
        public static final String UNEXPECTED_ERROR = "Unexpected Error";
        @NonNull
        public final Status status;
        @Nullable
        public final T data;
        @Nullable public final String message;

        protected Resource(@NonNull Status status, @Nullable T data,
                           @Nullable String message) {
            this.status = status;
            this.data = data;
            this.message = message;
        }

        public static <T> Resource<T> success(@NonNull T data) {
            return new Resource<>(Status.SUCCESS, data, null);
        }

        public static <T> Resource<T> error(String msg, @Nullable T data) {
            return new Resource<>(Status.ERROR, data, msg);
        }

        public static <T> Resource<T> loading(@Nullable T data)
        {
            return new Resource<>(Status.LOADING, data, null);
        }

        public enum Status { SUCCESS, ERROR, LOADING }
    }

