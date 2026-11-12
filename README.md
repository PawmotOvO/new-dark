# New Dark

基于 JetBrains 官方 New Dark 主题的暗色编辑器配色方案插件。

## 简介

New Dark 是 JetBrains 官方随 New UI 推出的暗色编辑器配色方案：在默认配色基础上重新审视并优化语法高亮，启用 New UI 时自动生效。

由于 **2026.3 及之后的 IDE 版本不再支持官方 New Dark 插件**，本插件将其重新打包为独立配色方案，供 2026.3 及之后版本使用。

## 特性

- 基于 Darcula，参考官方 New Dark 配色。
- 语法高亮覆盖关键字、字符串、数字、函数、类、参数、字段、注解、注释等。
- 统一编辑器界面细节配色：行号、折叠、缩进线、插入符、搜索结果、VCS 差异、inlay 提示等。
- 适用于所有 IntelliJ 平台 IDE（IntelliJ IDEA、PyCharm、WebStorm、GoLand 等）。

## 配色一览

| 元素 | 颜色 |
| --- | --- |
| 关键字 | `#749ded` |
| 字符串 | `#7ec482` |
| 数字 | `#d981de` |
| 函数 / 方法 | `#debc7e` |
| 常量 / 字段 | `#72cfd6` |
| 参数 / 注解 | `#b189f5` |
| 注释 | `#6f737a` |
| 类名 / 标识符 | `#ced0d6` |
| 编辑器背景 | `#1e1f22` |

## 兼容性

- IntelliJ IDEA 2026.3 及之后版本
- 其他基于 IntelliJ 平台的 IDE

## 安装

1. 安装插件包后，打开 `Settings / Preferences → Editor → Color Scheme`。
2. 在方案列表中选择 **New Dark**。

## 构建

在 IntelliJ IDEA 中打开本项目，运行 Gradle 任务 `buildPlugin`，产物位于 `build/distributions/`。

## 更新日志

见 [CHANGELOG.md](CHANGELOG.md)。
