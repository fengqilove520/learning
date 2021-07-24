package com.example.fastdfs;

import java.io.Serializable;

/**
 * 描述
 *
 * @author fitch
 * @date 2021/7/19 17:30
 */
public interface FileManagerConfig extends Serializable {

    public static final String FILE_DEFAULT_AUTHOR = "WangLiang";

    public static final String PROTOCOL = "http://";

    public static final String SEPARATOR = "/";

    public static final String TRACKER_NGNIX_ADDR = "172.16.218.158";

    public static final String TRACKER_NGNIX_PORT = "";

    public static final String CLIENT_CONFIG_FILE = "fdfs_client.conf";
}
