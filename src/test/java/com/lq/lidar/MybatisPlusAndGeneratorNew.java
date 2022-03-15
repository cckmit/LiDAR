package com.lq.lidar;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;

import java.util.Collections;

public class MybatisPlusAndGeneratorNew {
    static String url = "jdbc:postgresql://localhost:5432/cms?currentSchema=ry-vue";
    static String username = "postgres";
    static String password = "123456";

    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");

        FastAutoGenerator.create(url, username, password).globalConfig(builder -> {
                    builder.author("LQ") // 设置作者
//                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir(projectPath + "/src/test/java") // 指定输出目录
                            .disableOpenDir();// 禁止打开输出目录
                }).packageConfig(builder -> {
                    builder.parent("com.lq.lidar") // 设置父包名
                            .moduleName("system") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, projectPath + "/src/test/java")); // 设置mapperXml生成路径
                }).strategyConfig(builder -> {
                    builder.addInclude("cbay_sys_dict_type") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_")// 设置过滤表前缀
                            .entityBuilder()// Entity 策略配置
                            .enableTableFieldAnnotation() // 开启生成实体时生成字段注解
                            .controllerBuilder().enableRestStyle();

                })
//                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
