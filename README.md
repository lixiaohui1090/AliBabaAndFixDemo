# AliBabaAndFixDemo

 1..每次生成之后要进行测试。
 2.尽量不要分包，不要分多个Dex
 3.混淆时候涉及到NDK AndFix.java 不要混淆
 4.生成差分包一般会加固，这个时候生成的差分包，一定要在之前去完成。
 5.修复的主要是方法，第一个不能增加成员变量，不能增加方法。
 
 具体实现可以根据阿里的官网
 https://github.com/alibaba/AndFix
