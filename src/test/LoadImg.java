package test;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by Administrator on 13-8-25.
 */
public class LoadImg {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://tuan.jd.com/beijing-0-0-0-0-0-0-1-0-0.html");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String img_url;
            while((img_url = in.readLine())!= null)
            {
                if(img_url.indexOf("<img data-img=\"1\" data-lazyload=\"http")!=-1)
                {
//                    System.out.println(img_url);
                    img_url = img_url.substring(img_url.indexOf("http:"), img_url.indexOf("\" width="));
                    download(img_url, img_url.substring(img_url.lastIndexOf("/")), "images");
                }
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void download(String urlString, String filename,String savePath) throws Exception {
        // 构造URL
        URL url = new URL(urlString);
        // 打开连接
        URLConnection con = url.openConnection();
        //设置请求的路径
        con.setConnectTimeout(5*1000);
        // 输入流
        InputStream is = con.getInputStream();

        // 1K的数据缓冲
        byte[] bs = new byte[1024];
        // 读取到的数据长度
        int len;
        // 输出的文件流
        File sf=new File(savePath);
        if(!sf.exists()){
            sf.mkdirs();
        }
        OutputStream os = new FileOutputStream(sf.getPath()+"\\"+filename);
        // 开始读取
        while ((len = is.read(bs)) != -1) {
            os.write(bs, 0, len);
        }
        os.close();

        is.close();
    }
}
