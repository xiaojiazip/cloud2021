package com.jqp.springCloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName CommontResult
 * @Author jiangqingpeng
 * @Date 2021/1/5 19:11
 * @Version 2.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommontResult<T> {

    private Integer code;

    private String massage;

    private T       data;

    public CommontResult(Integer code, String massage) {
        this(code, massage, null);
    }
}
