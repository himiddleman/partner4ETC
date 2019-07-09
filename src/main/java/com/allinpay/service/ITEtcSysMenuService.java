package com.allinpay.service;

import com.allinpay.core.common.ResponseData;
import com.allinpay.entity.TEtcSysMenu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.HashMap;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author wuchao
 * @since 2019-07-05
 */
public interface ITEtcSysMenuService extends IService<TEtcSysMenu> {
    ResponseData queryPage(Integer pageNo, Integer pageSize, HashMap map);
}