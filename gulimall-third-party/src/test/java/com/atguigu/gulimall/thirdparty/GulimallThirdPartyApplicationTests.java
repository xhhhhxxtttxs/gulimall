package com.atguigu.gulimall.thirdparty;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.OSSClientBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class GulimallThirdPartyApplicationTests {
    @Autowired
    OSSClient ossClient;
    @Test
    public void testUpload() throws FileNotFoundException {
        FileInputStream inputStream = new FileInputStream("C:\\Users\\小仙女\\Desktop\\123.jpg");
        // 参数1位bucket  参数2位最终名字
        ossClient.putObject("gulimall-hello1234567890","321.jpg",inputStream);
        ossClient.shutdown();
    }

}
