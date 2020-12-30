package main;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        //调用逆向生成的方法。
        try {
            DemoApplication.startGenerator();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMLParserException e) {
            e.printStackTrace();
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    /**
     * 加入的方法，开始逆向生成
     * */
    public  static void startGenerator() throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
        List<String> warnings=new ArrayList<String>();
        boolean overWriter=true;//指向配置文件　　
        //指定配置文件路径
        File configFile=new File(DemoApplication.class.getResource("/generatorConfig.xml").getFile());

        ConfigurationParser cp=new ConfigurationParser(warnings);
        Configuration config=cp.parseConfiguration(configFile);
        DefaultShellCallback callback=new DefaultShellCallback(overWriter);
        MyBatisGenerator myBatisGenerator=new MyBatisGenerator(config,callback,warnings);
        myBatisGenerator.generate(null);
    }

}
