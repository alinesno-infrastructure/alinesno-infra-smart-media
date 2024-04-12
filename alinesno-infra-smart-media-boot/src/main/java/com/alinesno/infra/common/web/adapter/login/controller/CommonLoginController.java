package com.alinesno.infra.common.web.adapter.login.controller;

import com.alinesno.infra.common.facade.response.AjaxResult;
import com.alinesno.infra.common.web.adapter.dto.LoginBodyDto;
import com.alinesno.infra.common.web.adapter.dto.menus.Menu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@RestController
public class CommonLoginController {

    /**
     * 令牌
     */
    public static final String TOKEN = "token";

    /**
     * 登录方法
     *
     * @param loginBody 登录信息
     * @return 结果
     */
    @PostMapping("/login")
    public AjaxResult login(@RequestBody LoginBodyDto loginBody)
    {
        AjaxResult ajax = AjaxResult.success();
        // 生成令牌
        String token = UUID.randomUUID().toString() ;
        ajax.put(TOKEN, token);
        return ajax;
    }

    /**
     * 获取用户信息
     *
     * @return 用户信息
     */
    @GetMapping("getInfo")
    public AjaxResult getInfo() {

        Map<String, Object> data = new HashMap<>();
        // 将数据填充到data中...
        data.put("permissions", new String[]{"*:*:*"});

        Map<String, Object> user = new HashMap<>();
        user.put("createBy", "admin");
        user.put("createTime", "2023-04-23 16:11:38");
        user.put("updateBy", null);
        user.put("updateTime", null);
        user.put("remark", "管理员");
        user.put("userId", 1);
        user.put("deptId", 103);
        user.put("userName", "admin");
        user.put("nickName", "AIP技术团队");
        user.put("email", "aip-team@163.com");
        user.put("phonenumber", "15888888888");
        user.put("sex", "1");
        user.put("avatar", "");
        user.put("password", "");
        user.put("status", "0");
        user.put("delFlag", "0");
        user.put("loginIp", "");
        user.put("loginDate", "2023-09-21T16:54:12.000+08:00");

        Map<String, Object> dept = new HashMap<>();
        dept.put("createBy", null);
        dept.put("createTime", null);
        dept.put("updateBy", null);
        dept.put("updateTime", null);
        dept.put("remark", null);
        dept.put("deptId", 103);
        dept.put("parentId", 101);
        dept.put("ancestors", "0,100,101");
        dept.put("deptName", "研发部门");
        dept.put("orderNum", 1);
        dept.put("leader", "AIP技术团队");
        dept.put("phone", null);
        dept.put("email", null);
        dept.put("status", "0");
        dept.put("delFlag", null);
        dept.put("parentName", null);
        dept.put("children", new Object[]{});

        user.put("dept", dept);

        Map<String, Object> role = new HashMap<>();
        role.put("createBy", null);
        role.put("createTime", null);
        role.put("updateBy", null);
        role.put("updateTime", null);
        role.put("remark", null);
        role.put("roleId", 1);
        role.put("roleName", "超级管理员");
        role.put("roleKey", "admin");
        role.put("roleSort", 1);
        role.put("dataScope", "1");
        role.put("menuCheckStrictly", false);
        role.put("deptCheckStrictly", false);
        role.put("status", "0");
        role.put("delFlag", null);
        role.put("flag", false);
        role.put("menuIds", null);
        role.put("deptIds", null);
        role.put("permissions", null);
        role.put("admin", true);

        user.put("roles", new Object[]{role});

        AjaxResult ajax = AjaxResult.success();
        ajax.put("user", user);
        ajax.put("roles", user.get("roles"));
        ajax.put("permissions", data.get("permissions"));

        return ajax;
    }

    /**
     * 获取路由信息
     *
     * @return 路由信息
     */
    @GetMapping("getRouters")
    public AjaxResult getRouters()
    {

        Menu dashboardMenu = new Menu("Dashboard", "/dashboard", false, "noRedirect", "Layout", true, new Menu.Meta("仪盘表", "dashboard", false, null), List.of(
                new Menu("Dashboard", "index", false, false , "dashboard", new Menu.Meta("概览", "dashboard", false, null))
        ));

        Menu systemMenu = new Menu("Analyse", "/analyse", false, "noRedirect", "Layout", true, new Menu.Meta("接口服务", "post", false, null),
                List.of(
                        new Menu("Video", "smart/media/analyse/video/index", false, false, "analyse/video/index", new Menu.Meta("视频分析", "tree", false, null)),
                        new Menu("Behavior", "smart/media/analyse/behavior/index", false, false, "analyse/behavior/index", new Menu.Meta("行为分析", "user", false, null)),
                        new Menu("Person", "smart/media/analyse/person/index", false, false, "analyse/person/index", new Menu.Meta("人流分析", "tree", false, null)),
                        new Menu("Content", "smart/media/analyse/content/index", false, false, "analyse/content/index", new Menu.Meta("内容分析", "peoples", false, null))
                ));

        Menu loggerMenu = new Menu("Media", "/media", false, "noRedirect", "Layout", true, new Menu.Meta("流媒体接入", "log", false, null),
                List.of(
                        new Menu("Channel", "smart/media/media/channel/index", false, false, "media/channel/index", new Menu.Meta("渠道配置", "form", false, null)),
                        new Menu("Algorithm", "smart/media/media/algorithm/index", false, false, "media/algorithm/index", new Menu.Meta("识别算法", "job", false, null)),
                        new Menu("Catalog", "smart/media/media/catalog/index", false, false, "media/catalog/index", new Menu.Meta("分类管理", "form", false, null))
                ));

        Menu monitorMenu = new Menu("Config", "/config", false, "noRedirect", "Layout", true, new Menu.Meta("系统配置", "monitor", false, null),
                List.of(
                        new Menu("Notice", "smart/media/config/notice/index", false, false, "config/notice/index", new Menu.Meta("监控通知", "online", false, null)),
                        new Menu("Storage", "smart/media/config/storage/index", false, false, "config/storage/index", new Menu.Meta("媒体存储", "server", false, null))
                ));

        List<Menu> menus = List.of(dashboardMenu , systemMenu , loggerMenu , monitorMenu);

        return AjaxResult.success(menus) ;
    }
}
