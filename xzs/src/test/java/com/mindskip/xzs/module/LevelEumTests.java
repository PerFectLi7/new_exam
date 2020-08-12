package com.mindskip.xzs.module;

import com.github.pagehelper.PageInfo;
import com.mindskip.xzs.XzsApplicationTests;
import com.mindskip.xzs.domain.LevelEnum;
import com.mindskip.xzs.domain.User;
import com.mindskip.xzs.service.LevelEnumService;
import com.mindskip.xzs.service.UserService;
import com.mindskip.xzs.viewmodel.admin.user.UserPageRequestVM;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = XzsApplicationTests.class)
public class LevelEumTests {

    @Autowired
    private LevelEnumService levelEnumService;

    @Test
    public void userPageListTest() {
        List<LevelEnum> eums = levelEnumService.getAllLevelEnum();
        System.out.println(eums);
    }


}
