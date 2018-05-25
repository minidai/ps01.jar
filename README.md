# ps01框架信息 #
## 文档创建信息 #
```
   创建人:吕林
   文档第一次创建时间:2018-4-27 19:14:29
```
## 版本说明 ##
```
  由于0.0.5以前的版本记不住了,从0.0.5版本开始说明
```

### 0.0.7 ###
```
修改sqlloader.yml中的sql文件夹路径key由path修改为dirPath-- 直接读取path有可能会将系统的path读取出来
添加功能:xml中配置的sql可以使用关键字${XX} 拼接SQL 
    sql: select ${field} from ${table} ${where}
	param:{
			"${field}":"*",
			"${table}":"dual",
			"${where}":"where field=#{fieldVal}",
			"fieldVal":"xxxx"
		}
```
---

### 0.0.6 ###
修改所有配置文件由原先的.properties修改为.yml文件,后期框架的配置文件也将统一为.yml格式的文件

---

### 0.0.5 ###
- 添加新类
>com.yekj.ps01.utils.DBUtils 用于处理DBOperactionI中多参数的处理
- DBOperactionI开启多参数功能
```
    dbi.update(
    "insert into spms_adjust(fid,fname) values(#{demo},#{fname})"
    ,"12355"
    ,"fname插入"
    ) ;
```
其他多参数方法使用方式相同

---
