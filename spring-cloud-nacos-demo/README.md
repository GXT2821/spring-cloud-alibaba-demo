Sentinel 控制台 下载路径： https://github.com/alibaba/Sentinel/releases

由于Sentinel在sppringCloud中的配置只提供了一个端口号，当有外部访问api的时候，sentinel将跟我们的程序交互，但是访问的地址是一个内网ip，这意味着只能将程序与sentinel部署在同一台机器

sentinel 是懒加载应用的，所以之后在接口被访问的时候，才能在控制台看到应用客户端。