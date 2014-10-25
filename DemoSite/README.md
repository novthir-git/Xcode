## The New Broadleaf Commerce Demo Site

This Maven project is meant to be used as a solid started project for any [Broadleaf Commerce](http://www.broadleafcommerce.org) application. It has many sensible defaults set up along with examples of how a fully functioning eCommerce site based on Broadleaf might work.

One typical way of using this project would be to follow the [Getting Started Guide](http://docs.broadleafcommerce.org/current/Getting-Started.html), which would walk you through using our pre-bundled Eclipse workspace.

However, if you would like to utilize your own workspace or IDE configuration, you may prefer to fork this project. This would give you the added benefit of being able to pull in upstream changes as we work to improve the DemoSite.

> Note: If you are going to fork this project, we recommend basing your work on the `master` branch, and not the develop branch. develop is our ongoing development branch and there are no guarantees of stability on it.
3、添加搜索功能 

 如果启动时时报org.apache.solr.common.SolrException: Error opening new searcher错误，会造成搜索结果为空
解决如下：
window 7环境下 下删除以下目录下的所有文件，平重启项目即可使用搜索功能
C:\Users\{你的计算机名称}\AppData\Local\Temp\{你的计算机名称}\solrhome\

2、在线demo

http://www.broadleafcommerce.com/demo-landing?demoId=demo84dt5t&token=20602

1、免费公开课堂
