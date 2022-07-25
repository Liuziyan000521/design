package com.rjxy.pattern.simplefactory;

import java.util.Map;

/**
 * @Description ICommodity
 * @Author 蜻蜓队长
 * @Date 2022/7/25 20:52
 * @Version 0.1
 */
public interface ICommodity {
    void sendCommodity(String uid, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
