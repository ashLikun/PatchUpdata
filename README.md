[![Release](https://jitpack.io/v/ashLikun/PatchUpdata.svg)](https://jitpack.io/#ashLikun/PatchUpdata)

PatchUpdata项目简介
   Android增量升级/增量更新框架
   默认支持全部的cpu架构，可在自己的gradle配置
## 使用方法

build.gradle文件中添加:
```gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```
并且:

```gradle
dependencies {
    compile 'com.github.ashLikun:PatchUpdata:{latest version}'
}
```

## 详细介绍
合并: 从差分包/升级包和老安装包合并升级到新安装包，新安装包放在newApkPath。
```java
/**
 * oldApkPath: 老安装包路径
 * newApkPath: 新安装包路径（输出）
 * patchPath: 升级/差分包路径
 * return: 成功返回true，否则为false。
 */
BigNews.make(oldApkPath, newApkPath, patchPath);
 ```

差分: 将新安装包和老安装包的差异打包为差分包/升级包，输出到patchPath。
```java
/**
 * oldApkPath: 老安装包路径
 * newApkPath: 新安装包路径
 * patchPath: 升级/差分包路径（输出）
 * return: 成功返回true，否则为false。
 */
BigNews.diff(oldApkPath, newApkPath, patchPath);
```

项目中一般使用合并功能。