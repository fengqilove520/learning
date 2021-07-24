package com.example.fastdfs.web;

import com.example.fastdfs.FastDFSFile;
import com.example.fastdfs.FileManager;
import org.csource.common.NameValuePair;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 描述
 *
 * @author fitch
 * @date 2021/7/13 16:33
 */
@RestController
public class TestController {

//    @Autowired
//    private FastFileStorageClient storageClient;
//
//    @Autowired
//    private TrackerClient trackerClient;

    /**
     *
     * @param myFile  从浏览器提交过来
     * @return
     */
    @PostMapping("/up")
    public String upload(@RequestParam("myFile") MultipartFile myFile) throws IOException {
        // 获取文件后缀名
        //String ext = myFile.getOriginalFilename().substring(".".lastIndexOf(myFile.getOriginalFilename()));
        InputStream fileReader = myFile.getInputStream();
        byte[] bytes = new byte[10000000];//10M
        int length = fileReader.read(bytes);
        FastDFSFile file = new FastDFSFile(bytes,"txt");
        NameValuePair[] meta_list = new NameValuePair[4];
        meta_list[0] = new NameValuePair("fileName", "abc");
        meta_list[1] = new NameValuePair("fileLength", String.valueOf(length));
        meta_list[2] = new NameValuePair("fileExt", "txt");
        meta_list[3] = new NameValuePair("fileAuthor", "WangLiang");
        String filePath = FileManager.upload(file,meta_list);
        System.out.println(filePath);
        return "";
    }

    @GetMapping("/dows/{id}")
    public void download(@PathVariable String id, HttpServletResponse re) throws IOException {
//        String fileName= URLEncoder.encode(map.get("filename").toString(),"UTF-8");
//        String groupName=map.get("groupname").toString();
//        String pathName=map.get("filepath").toString();
//        //告诉浏览器下载的文件名
//        re.setHeader("Content-Disposition","attachment; filename="+fileName+"");
//        //去linux下载对应的文件
//        byte[] bytes = storageClient.downloadFile(groupName, pathName);
//        re.getOutputStream().write(bytes);
    }

}
