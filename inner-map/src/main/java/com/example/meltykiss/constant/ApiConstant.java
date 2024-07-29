package com.example.meltykiss.constant;

import io.swagger.annotations.ApiModel;

@ApiModel(description = " ")
public class ApiConstant {
    //开通轨迹服务
    final public static String GUIJI_SERVICE_ADD =  "https://tsapi.amap.com/v1/track/service/add";
    //需要key和sid为必填参数
    final public static String GUIJI_SERVICE_DEL =  "https://tsapi.amap.com/v1/track/service/delete";
    //需要key和sid为必填参数
    final public static String GUIJI_SERVICE_UPDATE =  "https://tsapi.amap.com/v1/track/service/update";
    //需要key和sid为必填参数
    final public static String GUIJI_SERVICE_GET =  "https://tsapi.amap.com/v1/track/service/list";


    /**
     * 终端管理的接口地址:terminal 的创建、更新、删除、查询。例如：添加一辆车、删除一辆车、更新车辆属性等。
     */
    final public static String TERMINAL_SERVICE_ADD =  "https://tsapi.amap.com/v1/track/terminal/add";

    final public static String TERMINAL_SERVICE_DEL =  "https://tsapi.amap.com/v1/track/terminal/delete";

    final public static String TERMINAL_SERVICE_UPDATE =  "https://tsapi.amap.com/v1/track/terminal/update";

    final public static String TERMINAL_SERVICE_GET =  "https://tsapi.amap.com/v1/track/terminal/list";


    /**
     * 终端搜索
     */

    //关键字搜索终端
    final public static String TERMINAL_SEARCH =  "https://tsapi.amap.com/v1/track/terminal/search";
    //周边搜索终端
    final public static String TERMINAL_ROUND =  "https://tsapi.amap.com/v1/track/terminal/aroundsearch";

    //多边形区域搜索终端
    final public static String TERMINAL_DUOBIANXING = "https://tsapi.amap.com/v1/track/terminal/polygonsearch";
    //行政区域搜索终端
    final public static String TERMINAL_XINGZHEN = "https://tsapi.amap.com/v1/track/terminal/districtsearch";
    //查询终端位置
    final public static String CHECK_TIMINAL_POSITION = "https://tsapi.amap.com/v1/track/terminal/lastpoint";

    //轨迹服务

    final public static String TRACK_SERVICE_CREATE =  "https://tsapi.amap.com/v1/track/trace/add";

    final public static String TRACK_SERVICE_DEL = "https://tsapi.amap.com/v1/track/trace/delete";

    final public static String TRACK_SERVICE_UPLOAD = "https://tsapi.amap.com/v1/track/point/upload";

    //轨迹的查询和纠正
    //轨迹的查询

    final public static String TRACK_SERVICE_GET = "https://tsapi.amap.com/v1/track/terminal/trsearch";

    //查询轨迹道路属性
    final public static String TRACK_SERVICE_ROAD_INTO = "https://tsapi.amap.com/v1/track/terminal/roaddata";

    //轨迹计费管理
    final public static String TRACK_JIFEI = "https://tsapi.amap.com/v1/track/terminal/etc";

    //车辆行驶分析
    final public static String TRACK_ANALYSIS = "https://tsapi.amap.com/v1/track/analysis/drivingbehavior";

    //停留点分析
    final public static String BUS_STOP_POINT_ANANISIS = "https://tsapi.amap.com/v1/track/analysis/staypoint";
}
