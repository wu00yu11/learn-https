package com.learn.demo.https.model;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserInfo {
    private String loginName;
    private String passwd;
}
