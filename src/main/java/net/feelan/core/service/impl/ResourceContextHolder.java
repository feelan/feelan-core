package net.feelan.core.service.impl;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Service
public class ResourceContextHolder {
    @Value("${resource.uploadPath}")
    private String uploadPath = "files";
    @Value("${host.image}")
    private String downloadPath = "/download/";

    /** 
     * 上传文件根目录 
    * @return
    */
    public String getUploadPath() {
        return StringUtils.isBlank(uploadPath) ? "files" : uploadPath;
    }

    /** 
     * 下载文件路径 
    * @return
    */
    public String getDownloadUrl() {
        String root = downloadPath;
        if (StringUtils.isBlank(downloadPath)) {
            RequestAttributes attr = RequestContextHolder.getRequestAttributes();
            if (attr instanceof ServletRequestAttributes) {
                HttpServletRequest request = ((ServletRequestAttributes) attr).getRequest();
                root = request.getContextPath() + "/download/";
            } else {
                root = "/download/";
            }
        }
        return root;
    }

}
