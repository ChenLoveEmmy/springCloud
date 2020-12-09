package ch.cloud.common.common.tool;

/*
 *  作者 Alan.chen
 *  时间 2020/1/17-14:18
 */

import java.util.UUID;

public class Tool {

    public static String uuid() {
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
