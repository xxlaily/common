package cn.dm.common;

public class Constants {

    //异常码定义
    public static class ErrorCode{
        //通用状态码 00**
        public static class CommonCode {
            public static String SUCCESS = "0000";
            public static String USER_NO_LOGIN = "0001";
            public static String EXCEPTION = "0002";
        }
    }

    public static class Image{
        //0:无类型 1:轮播图 2:海报图
        public static class ImageType{
            //无类型
            public static Integer normal=0;
            //轮播图
            public static Integer carousel=1;
            //海报图
            public static Integer poster=2;
        }
        //图片分类
        public static class ImageCategory{
            public static Integer user=0; //用户模块
            public static Integer item=1; //商品模块
        }
    }

    public static class Redis_Expire {
        public static final long DEFAULT_EXPIRE = 60;//80s 有慢sql，超时时间设置长一点
        public final static int SESSION_TIMEOUT = 2 * 60 * 60;//默认2h
        public final static int REPLACEABLE_TIME_RANGE = 32 * 60;
        public final static int REPLACEMENT_PROTECTION_TIMEOUT = SESSION_TIMEOUT - REPLACEABLE_TIME_RANGE;//默认1.5h
        public final static int REPLACEMENT_DELAY = 2 * 60;//默认2min
    }

    public static class OrderStatus {
        public final static Integer TOPAY = 0;//待支付
        public static final Integer SUCCESS = 1;//支付成功
        public final static Integer FAIL = 2;//支付失败
    }

    public static class QueueName {
        public final static String TO_QG_QUEUE = "toQgQueue";
        public final static String TO_CREATE_ORDER = "toCreateOrder";

        public final static String TO_UPDATED_ORDER_QUEUE = "toUpdateOrderQueue";

        public final static String TO_UPDATED_GOODS_QUQUE = "toUpdateGoodsQueue";
    }

    public static class RabbitQueueName {
        public final static String TO_QG_QUEUE = "toQgQueue";
        public final static String TO_CREATE_ORDER = "toCreateOrder";

        public final static String TO_UPDATED_ORDER_QUEUE = "toUpdateOrderQueue";

        public final static String TO_UPDATED_GOODS_QUQUE = "toUpdateGoodsQueue";
    }

    public static class QgStatus {
        public final static String fail = "-1";//拿到商品
        public final static String getGoods = "1";//拿到商品
        public final static String getOrder = "2";//生成订单
        public final static String paySuccess = "3"; //支付成功
    }

    public static class WxpayStatus {
        public final static String DDZTYC = "4001";
        public final static String DDZFYC = "4002";
        public final static String DDYXYC = "4003";
    }

    //状态(0:锁定库存,1:成功支付,2:支付超时)

    public static class StockStatus {
        public final static Integer lock = 0;//锁定库存
        public final static Integer success = 1;//支付成功
        public final static Integer cancel = 2;//支付超时
    }
}
