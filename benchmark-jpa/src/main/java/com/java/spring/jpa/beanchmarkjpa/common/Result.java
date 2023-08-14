package com.java.spring.jpa.beanchmarkjpa.common;

import lombok.Data;

import java.util.Objects;

/**
 * @author kscs
 */
@Data
public class Result<T> {

    private T data;
    private int code;
    private String message;
    private TableDataInfo pageInfo;

    private Result(Builder<T> builder) {
        Objects.requireNonNull(builder.code);
        Objects.requireNonNull(builder.message);
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
    }

    public Result() {
    }

    private Result(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private Result(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private Result(int code, String message, T data, TableDataInfo pageInfo) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.pageInfo = pageInfo;
    }

    public static Result success() {
        return new Result(0, "成功");
    }

    public static <T> Result<T> success(T data) {
        return new Result(0, "成功", data, new TableDataInfo());
    }

    public static <T> Result<T> success(T data, TableDataInfo pageInfo) {
        return new Result(0, "成功", data, pageInfo);
    }

    public static <T> Result<T> success(String successMsg) {
        return new Result(0, successMsg, (Object)null, new TableDataInfo());
    }

    public static <T> Result<T> success(int successCode, String successMsg) {
        return new Result(successCode, successMsg, (Object)null, new TableDataInfo());
    }

    public static <T> Result<T> success(String successMsg, T data) {
        return new Result(0, successMsg, data, new TableDataInfo());
    }

    public static <T> Result<T> failed() {
        return new Result(400, "操作失败", (Object)null);
    }

    public static <T> Result<T> failed(int errorCode, String errorMsg) {
        return new Result(errorCode, errorMsg, (Object)null);
    }

    public static <T> Result<T> failed(int errorCode, String errorMsg, T data) {
        return new Result(errorCode, errorMsg, data);
    }

    /** @deprecated  */
    @Deprecated
    public static <T> Builder<T> builder() {
        return new Builder();
    }

    public T getData() {
        return this.data;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public TableDataInfo getPageInfo() {
        return this.pageInfo;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPageInfo(TableDataInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof Result)) {
            return false;
        } else {
            Result<?> other = (Result)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getCode() != other.getCode()) {
                return false;
            } else {
                label49:
                {
                    Object this$data = this.getData();
                    Object other$data = other.getData();
                    if (this$data == null) {
                        if (other$data == null) {
                            break label49;
                        }
                    } else if (this$data.equals(other$data)) {
                        break label49;
                    }

                    return false;
                }

                Object this$message = this.getMessage();
                Object other$message = other.getMessage();
                if (this$message == null) {
                    if (other$message != null) {
                        return false;
                    }
                } else if (!this$message.equals(other$message)) {
                    return false;
                }

                Object this$pageInfo = this.getPageInfo();
                Object other$pageInfo = other.getPageInfo();
                if (this$pageInfo == null) {
                    if (other$pageInfo != null) {
                        return false;
                    }
                } else if (!this$pageInfo.equals(other$pageInfo)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof Result;
    }


    public String toString() {
        return "Result(data=" + this.getData() + ", code=" + this.getCode() + ", message=" + this.getMessage() + ", pageInfo=" + this.getPageInfo() + ")";
    }

    /** @deprecated  */
    @Deprecated
    public static class Builder<T> {
        private T data;
        private int code;
        private String message;
        private TableDataInfo pageInfo;

        public Builder() {
        }

        public Builder<T> data(T data) {
            this.data = data;
            this.pageInfo = this.pageInfo;
            return this;
        }

        public Builder<T> data(T data, TableDataInfo pageInfo) {
            this.data = data;
            this.pageInfo = pageInfo;
            return this;
        }

        public Builder<T> failed(Integer errorCode, String message) {
            this.code = errorCode;
            this.message = message;
            return this;
        }

        public Builder<T> failed() {
            this.code = 400;
            this.message = "操作失败";
            return this;
        }

        public Builder<T> failed(String message) {
            this.code = 400;
            this.message = message;
            return this;
        }

        public Builder<T> success() {
            this.code = 0;
            this.message = "成功";
            return this;
        }

        public Builder<T> success(String message) {
            this.code = 0;
            this.message = message;
            return this;
        }

        public Result<T> build() {
            return new Result(this);
        }
    }
}
