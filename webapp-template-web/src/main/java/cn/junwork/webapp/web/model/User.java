package cn.junwork.webapp.web.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

/**
 * @author coderjunjun@gmail.com
 * @date 2020/8/30
 */
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    /**
     * 昵称
     */
    String nickName;
}
