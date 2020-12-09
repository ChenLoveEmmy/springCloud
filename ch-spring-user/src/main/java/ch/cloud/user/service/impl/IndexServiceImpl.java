package ch.cloud.user.service.impl;

/*
 *  作者 Alan.chen
 *  时间 2020/1/17-15:06
 */

import ch.cloud.common.api.user.support.UserReq;
import ch.cloud.common.common.tool.Tool;
import ch.cloud.user.service.IndexService;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class IndexServiceImpl implements IndexService {
    private Logger logger = LoggerFactory.getLogger(IndexServiceImpl.class.getName());

    @Override
    public String helloAlan(UserReq userReq) {
        logger.info("IndexServiceImpl >>> 入参 >>> " + System.identityHashCode(userReq));
        userReq.setId(Tool.uuid());
        userReq.setName("name");
        userReq.setGender("123");
        return JSON.toJSONString(userReq);
    }
}
