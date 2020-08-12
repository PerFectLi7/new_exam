package com.mindskip.xzs.service;

import com.mindskip.xzs.domain.LevelEnum;
import com.mindskip.xzs.domain.User;

import java.util.List;

public interface LevelEnumService extends BaseService<LevelEnum>{
    /**
     *getAllLevelEnum
     *
     * @return List<LevelEnum>
     */
    List<LevelEnum> getAllLevelEnum();
}
