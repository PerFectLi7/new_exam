package com.mindskip.xzs.controller.admin;


import com.mindskip.xzs.base.BaseApiController;
import com.mindskip.xzs.base.RestResponse;
import com.mindskip.xzs.domain.LevelEnum;
import com.mindskip.xzs.service.LevelEnumService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("AdminLevelEnumController")
@RequestMapping(value = "/api/admin/levelEnum")
@AllArgsConstructor
public class LevelEnumController extends BaseApiController {

    private final LevelEnumService levelEnumService;

    @RequestMapping(value = "/getAll", method = RequestMethod.POST)
    public RestResponse<List<LevelEnum>> pageList() {
        List<LevelEnum> lists  = levelEnumService.getAllLevelEnum();
        return RestResponse.ok(lists);
    }

}
