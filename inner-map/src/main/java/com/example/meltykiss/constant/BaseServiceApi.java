package com.example.meltykiss.constant;

import io.swagger.annotations.ApiModel;

@ApiModel(discriminator = "高德地图的基础的API服务")
public class BaseServiceApi {
    //地理编码
    final public static String GEO_CODE = "https://restapi.amap.com/v3/geocode/geo?";

    //逆地理编码
    final public static String UN_GEO_CODE = "https://restapi.amap.com/v3/geocode/regeo?";

    //驾车路径规划
    final public static String DRIVING_ROUTING_PLAN = "https://restapi.amap.com/v3/direction/driving?";

    //步行路径规划
    final public static String WALKING_ROUTING_PLAN = "https://restapi.amap.com/v3/direction/walking?";

    //距离测量
    final public static String DISTANCE_CELIANG = "https://restapi.amap.com/v3/distance?";

    //行政区域查询
    final public static String DISTRICT_CHECK = "https://restapi.amap.com/v3/config/district?" ;

    //IP定位
    final public static String IP_CHECK = "https://restapi.amap.com/v3/ip?";

    //坐标的转换
    final public static String POSITION_CONVERT = "https://restapi.amap.com/v3/assistant/coordinate/convert?";

    //轨迹的修正
    final public static String GUIJI_XIUZHENG = "https://restapi.amap.com/v4/grasproad/driving";

}
