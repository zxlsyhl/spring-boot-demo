使用apidoc扫描指定目录java文件生成接口文档。

1、安装nodejs，安装apidoc。
2、到根目录下执行命令，生成文档。
apidoc -i src/main/java/org/zxl/springbootdemo/apidoc/controller/ -o apidoc/

-i 指定源文件的目录，也就是项目的根目录。
-o 指定输出文档的目录，生成文档的地址。